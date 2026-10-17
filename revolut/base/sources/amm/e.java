package amm;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import ulm.x0;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends c {
    public long e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f6495g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, x0 url2) {
        super(jVar, url2);
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f6495g = jVar;
        this.e = -1L;
        this.f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6491c) {
            return;
        }
        if (this.f) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!vlm.j.f(this)) {
                this.f6495g.f6500b.b();
                d(j.f);
            }
        }
        this.f6491c = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        if (r11.f == false) goto L34;
     */
    @Override // amm.c, mmm.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(mmm.h r12, long r13) throws java.net.ProtocolException, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: amm.e.read(mmm.h, long):long");
    }
}
