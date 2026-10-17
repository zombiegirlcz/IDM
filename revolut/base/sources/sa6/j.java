package sa6;

import e7l.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements aa6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f261326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f261327b;

    public j(fk3.a configurationInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f261326a = walletInteractor;
        this.f261327b = configurationInteractor;
    }

    public final efm.r a() {
        io3.l lVar = io3.l.CURRENT;
        io3.i iVar = io3.i.INTERNAL;
        efm.r map = te0.w.l(m70.a.g(osg.b.e(this.f261326a, false, lVar, io3.k.ACTIVE, iVar, null, null, null, 112), null, null, 3), c()).map(new a(new s8h.h(24), 7));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r b() {
        efm.r rVarFlatMap = te0.w.l(m70.a.g(osg.b.d(this.f261326a), null, null, 3), c()).flatMap(new a(new s78.d(this, 14), 4));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }

    public final efm.r c() {
        efm.r map = m70.a.g(((ik3.c) this.f261327b).k(g.b.f123407a), null, null, 3).map(new a(new s8h.h(23), 6));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
