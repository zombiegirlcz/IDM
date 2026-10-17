package jlm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f175873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f175874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f175875c;
    public int d;
    public boolean e;
    public long f;

    public c(k upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f175873a = upstream;
        a buffer = upstream.getBuffer();
        this.f175874b = buffer;
        i iVar = buffer.f175869a;
        this.f175875c = iVar;
        this.d = iVar != null ? iVar.f175882b : -1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f175882b) goto L15;
     */
    @Override // jlm.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j2(jlm.a r12, long r13) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jlm.c.j2(jlm.a, long):long");
    }
}
