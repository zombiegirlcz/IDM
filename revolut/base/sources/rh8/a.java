package rh8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f254317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f254318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kbb.c f254319c;

    public a(wsg.n walletsInteractor, hj8.a juniorProfileInteractor, kbb.c juniorConfigInteractor) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        this.f254317a = walletsInteractor;
        this.f254318b = juniorProfileInteractor;
        this.f254319c = juniorConfigInteractor;
    }

    public final efm.r a() {
        efm.r rVarQ = osg.b.q(this.f254317a, false);
        efm.r rVarW = nim.a.w(rd0.e.c(((nj8.n) this.f254318b).k(null, w4l.h.f294642c), kotlin.coroutines.g.f186406a), new rg3.d(8));
        kbb.c cVar = this.f254319c;
        return nim.a.w(mif.a.f(rVarQ, rVarW, cVar.L(), cVar.I()), new raf.o(this, 22));
    }
}
