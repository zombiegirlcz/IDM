package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public class BEROctetStringGenerator extends BERGenerator {

    public class BufferedBEROctetStream extends OutputStream {
        private ASN1OutputStream _asn1Out;
        private byte[] _buf;
        private int _off = 0;

        public BufferedBEROctetStream(byte[] bArr) {
            this._buf = bArr;
            this._asn1Out = ASN1OutputStream.create(BEROctetStringGenerator.this._out);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            int i = this._off;
            if (i != 0) {
                DEROctetString.encode(this._asn1Out, true, this._buf, 0, i);
            }
            this._asn1Out.flushInternal();
            BEROctetStringGenerator.this.writeBEREnd();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            byte[] bArr = this._buf;
            int i2 = this._off;
            int i3 = i2 + 1;
            this._off = i3;
            bArr[i2] = (byte) i;
            if (i3 == bArr.length) {
                DEROctetString.encode(this._asn1Out, true, bArr, 0, bArr.length);
                this._off = 0;
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            byte[] bArr2 = this._buf;
            int length = bArr2.length;
            int i3 = this._off;
            int i5 = length - i3;
            if (i2 < i5) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this._off += i2;
                return;
            }
            if (i3 > 0) {
                System.arraycopy(bArr, i, bArr2, i3, i5);
                DEROctetString.encode(this._asn1Out, true, this._buf, 0, length);
            } else {
                i5 = 0;
            }
            while (true) {
                int i6 = i2 - i5;
                if (i6 < length) {
                    System.arraycopy(bArr, i + i5, this._buf, 0, i6);
                    this._off = i6;
                    return;
                } else {
                    DEROctetString.encode(this._asn1Out, true, bArr, i + i5, length);
                    i5 += length;
                }
            }
        }
    }

    public BEROctetStringGenerator(OutputStream outputStream) throws IOException {
        super(outputStream);
        writeBERHeader(36);
    }

    public OutputStream getOctetOutputStream() {
        return getOctetOutputStream(new byte[1000]);
    }

    public BEROctetStringGenerator(OutputStream outputStream, int i, boolean z) throws IOException {
        super(outputStream, i, z);
        writeBERHeader(36);
    }

    public OutputStream getOctetOutputStream(byte[] bArr) {
        return new BufferedBEROctetStream(bArr);
    }
}
