package kmm;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import mmm.h;
import mmm.n0;

/* JADX INFO: loaded from: classes14.dex */
public final class n implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mmm.j f185948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Random f185949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f185950c;
    public final boolean d;
    public final long e;
    public final mmm.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mmm.h f185951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f185952h;
    public a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f185953j;
    public final h.a k;

    public n(mmm.j sink, Random random, boolean z, boolean z3, long j2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f185948a = sink;
        this.f185949b = random;
        this.f185950c = z;
        this.d = z3;
        this.e = j2;
        this.f = new mmm.h();
        this.f185951g = sink.getBuffer();
        this.f185953j = new byte[4];
        this.k = new h.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar = this.i;
        if (aVar != null) {
            vlm.h.f(aVar);
        }
        vlm.h.f(this.f185948a);
    }

    public final void d(int i, mmm.m mVar) {
        if (this.f185952h) {
            throw new IOException("closed");
        }
        int iD = mVar.d();
        if (iD > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        mmm.h hVar = this.f185951g;
        hVar.w(i | 128);
        hVar.w(iD | 128);
        byte[] bArr = this.f185953j;
        Intrinsics.h(bArr);
        this.f185949b.nextBytes(bArr);
        hVar.m3801write(bArr);
        if (iD > 0) {
            long j2 = hVar.f207266b;
            hVar.v(mVar);
            h.a aVar = this.k;
            Intrinsics.h(aVar);
            hVar.n(aVar);
            aVar.f(j2);
            k.a(aVar, bArr);
            aVar.close();
        }
        this.f185948a.flush();
    }

    public final void f(int i, mmm.m data) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f185952h) {
            throw new IOException("closed");
        }
        mmm.h buffer = this.f;
        buffer.v(data);
        int i2 = i | 128;
        if (this.f185950c && data.f207285a.length >= this.e) {
            a aVar = this.i;
            if (aVar == null) {
                aVar = new a(this.d);
                this.i = aVar;
            }
            amm.h hVar = aVar.d;
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            mmm.h hVar2 = aVar.f185908b;
            if (hVar2.f207266b != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (aVar.f185907a) {
                aVar.f185909c.reset();
            }
            hVar.write(buffer, buffer.f207266b);
            hVar.flush();
            mmm.m mVar = b.f185910a;
            if (hVar2.y3(hVar2.f207266b - ((long) mVar.f207285a.length), mVar)) {
                long j2 = hVar2.f207266b - ((long) 4);
                h.a aVarN = hVar2.n(mmm.b.f207248a);
                try {
                    aVarN.d(j2);
                    aVarN.close();
                } finally {
                }
            } else {
                hVar2.w(0);
            }
            buffer.write(hVar2, hVar2.f207266b);
            i2 = i | 192;
        }
        long j3 = buffer.f207266b;
        mmm.h hVar3 = this.f185951g;
        hVar3.w(i2);
        if (j3 <= 125) {
            hVar3.w(((int) j3) | 128);
        } else if (j3 <= 65535) {
            hVar3.w(254);
            hVar3.A((int) j3);
        } else {
            hVar3.w(255);
            n0 n0VarU = hVar3.u(8);
            byte[] bArr = n0VarU.f207291a;
            int i3 = n0VarU.f207293c;
            bArr[i3] = (byte) ((j3 >>> 56) & 255);
            bArr[i3 + 1] = (byte) ((j3 >>> 48) & 255);
            bArr[i3 + 2] = (byte) ((j3 >>> 40) & 255);
            bArr[i3 + 3] = (byte) ((j3 >>> 32) & 255);
            bArr[i3 + 4] = (byte) ((j3 >>> 24) & 255);
            bArr[i3 + 5] = (byte) ((j3 >>> 16) & 255);
            bArr[i3 + 6] = (byte) ((j3 >>> 8) & 255);
            bArr[i3 + 7] = (byte) (j3 & 255);
            n0VarU.f207293c = i3 + 8;
            hVar3.f207266b += 8;
        }
        byte[] bArr2 = this.f185953j;
        Intrinsics.h(bArr2);
        this.f185949b.nextBytes(bArr2);
        hVar3.m3801write(bArr2);
        if (j3 > 0) {
            h.a aVar2 = this.k;
            Intrinsics.h(aVar2);
            buffer.n(aVar2);
            aVar2.f(0L);
            k.a(aVar2, bArr2);
            aVar2.close();
        }
        hVar3.write(buffer, j3);
        this.f185948a.flush();
    }
}
