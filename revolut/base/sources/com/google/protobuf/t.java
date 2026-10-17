package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49789b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f49790c;

    public static int c(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long d(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static q h(byte[] bArr, int i, int i2, boolean z) {
        q qVar = new q(bArr, i, i2, z);
        try {
            qVar.k(i2);
            return qVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static t i(InputStream inputStream) {
        if (inputStream != null) {
            return new r(inputStream);
        }
        byte[] bArr = j1.f49739b;
        return h(bArr, 0, bArr.length, false);
    }

    public static int x(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & CertificateBody.profileType;
        int i3 = 7;
        while (i3 < 32) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw InvalidProtocolBufferException.h();
            }
            i2 |= (i5 & CertificateBody.profileType) << i3;
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i6 = inputStream.read();
            if (i6 == -1) {
                throw InvalidProtocolBufferException.h();
            }
            if ((i6 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.d();
    }

    public abstract int A();

    public abstract long B();

    public abstract String C();

    public abstract String D();

    public abstract int E();

    public abstract int F();

    public abstract long G();

    public abstract boolean H(int i);

    public abstract void a(int i);

    public final void b() {
        if (this.f49788a >= this.f49789b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    public abstract int e();

    public abstract int f();

    public abstract boolean g();

    public abstract void j(int i);

    public abstract int k(int i);

    public abstract boolean l();

    public abstract n m();

    public abstract double n();

    public abstract int o();

    public abstract int p();

    public abstract long q();

    public abstract float r();

    public abstract void s(int i, c2 c2Var, d0 d0Var);

    public abstract int t();

    public abstract long u();

    public abstract void v(c2 c2Var, d0 d0Var);

    public abstract int w();

    public abstract int y();

    public abstract long z();
}
