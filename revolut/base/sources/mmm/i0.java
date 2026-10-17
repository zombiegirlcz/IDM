package mmm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class i0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f207275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f207276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n0 f207277c;
    public int d;
    public boolean e;
    public long f;

    public i0(k upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f207275a = upstream;
        h buffer = upstream.getBuffer();
        this.f207276b = buffer;
        n0 n0Var = buffer.f207265a;
        this.f207277c = n0Var;
        this.d = n0Var != null ? n0Var.f207292b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f207292b) goto L15;
     */
    @Override // mmm.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(mmm.h r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.e
            if (r3 != 0) goto L63
            mmm.n0 r3 = r8.f207277c
            mmm.h r4 = r8.f207276b
            if (r3 == 0) goto L2b
            mmm.n0 r5 = r4.f207265a
            if (r3 != r5) goto L23
            int r3 = r8.d
            kotlin.jvm.internal.Intrinsics.h(r5)
            int r5 = r5.f207292b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f
            r2 = 1
            long r0 = r0 + r2
            mmm.k r2 = r8.f207275a
            boolean r0 = r2.a(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            mmm.n0 r0 = r8.f207277c
            if (r0 != 0) goto L4c
            mmm.n0 r0 = r4.f207265a
            if (r0 == 0) goto L4c
            r8.f207277c = r0
            int r0 = r0.f207292b
            r8.d = r0
        L4c:
            long r0 = r4.f207266b
            long r2 = r8.f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            mmm.h r2 = r8.f207276b
            long r4 = r8.f
            r3 = r9
            r2.i(r3, r4, r6)
            long r9 = r8.f
            long r9 = r9 + r6
            r8.f = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = p.a.m(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mmm.i0.read(mmm.h, long):long");
    }

    @Override // mmm.s0
    public final v0 timeout() {
        return this.f207275a.timeout();
    }
}
