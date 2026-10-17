package org.bouncycastle.pqc.crypto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class MessageSignerAdapter implements Signer {
    private final Buffer buffer = new Buffer();
    private final MessageSigner messageSigner;

    public static final class Buffer extends ByteArrayOutputStream {
        private Buffer() {
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
            ((ByteArrayOutputStream) this).count = 0;
        }
    }

    public MessageSignerAdapter(MessageSigner messageSigner) {
        if (messageSigner == null) {
            throw new NullPointerException("'messageSigner' cannot be null");
        }
        this.messageSigner = messageSigner;
    }

    private byte[] getMessage() {
        try {
            return this.buffer.toByteArray();
        } finally {
            reset();
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        return this.messageSigner.generateSignature(getMessage());
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        this.messageSigner.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.buffer.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b4) throws IOException {
        this.buffer.write(b4);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        return this.messageSigner.verifySignature(getMessage(), bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) throws IOException {
        this.buffer.write(bArr, i, i2);
    }
}
