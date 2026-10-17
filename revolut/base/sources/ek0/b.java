package ek0;

import kotlin.jvm.internal.Intrinsics;
import mmm.h;
import mmm.j;
import mmm.u;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends u {
    public final /* synthetic */ int d = 0;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f126918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f126919h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, j delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f126919h = cVar;
        this.f126918g = cVar.i.contentLength();
    }

    @Override // mmm.u, mmm.q0
    public final void write(h source, long j2) {
        switch (this.d) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                super.write(source, j2);
                long j3 = this.f + j2;
                this.f = j3;
                ((c) this.f126919h).f126920j.a(j3, this.f126918g);
                break;
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                super.write(source, j2);
                long j5 = this.f126918g + j2;
                this.f126918g = j5;
                ((z1.c) this.f126919h).invoke(Float.valueOf(j5 / this.f));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j delegate, long j2, z1.c onProgress) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        this.f = j2;
        this.f126919h = onProgress;
    }
}
