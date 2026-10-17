package kcm;

import com.google.protobuf.m2;
import com.google.protobuf.w;
import com.google.protobuf.y;
import com.revolut.tracking.v3.RawEvent;
import ecm.q0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends InputStream implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RawEvent f182749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m2 f182750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteArrayInputStream f182751c;

    public a(RawEvent rawEvent, m2 m2Var) {
        this.f182749a = rawEvent;
        this.f182750b = m2Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        RawEvent rawEvent = this.f182749a;
        if (rawEvent != null) {
            return rawEvent.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.f182751c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f182749a != null) {
            this.f182751c = new ByteArrayInputStream(this.f182749a.toByteArray());
            this.f182749a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f182751c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        RawEvent rawEvent = this.f182749a;
        if (rawEvent != null) {
            int serializedSize = rawEvent.getSerializedSize();
            if (serializedSize == 0) {
                this.f182749a = null;
                this.f182751c = null;
                return -1;
            }
            if (i2 >= serializedSize) {
                Logger logger = y.d;
                w wVar = new w(bArr, i, serializedSize);
                this.f182749a.writeTo(wVar);
                if (wVar.L() == 0) {
                    this.f182749a = null;
                    this.f182751c = null;
                    return serializedSize;
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            this.f182751c = new ByteArrayInputStream(this.f182749a.toByteArray());
            this.f182749a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f182751c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
