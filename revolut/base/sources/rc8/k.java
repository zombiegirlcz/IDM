package rc8;

import efm.d0;
import jul.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final hj8.a f253230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f253231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f253232n;

    public k(hj8.a juniorProfileInteractor, o cancelAccountClosureInteractor, g confirmAccountClosureModelExtension) {
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(cancelAccountClosureInteractor, "cancelAccountClosureInteractor");
        Intrinsics.checkNotNullParameter(confirmAccountClosureModelExtension, "confirmAccountClosureModelExtension");
        this.f253230l = juniorProfileInteractor;
        this.f253231m = cancelAccountClosureInteractor;
        this.f253232n = confirmAccountClosureModelExtension;
    }

    public static final ufm.i b3(k kVar, String str) {
        d0 d0VarFirstOrError = m70.a.g(rd0.e.c(hj8.a.a(kVar.f253230l, str, w4l.h.f294642c), kotlin.coroutines.g.f186406a), null, new rbh.j(10), 1).firstOrError();
        rbf.c cVar = new rbf.c(new rbj.g(1), 14);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    @Override // rc8.h
    public final void Z2(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        V2(new j(this, juniorId, null), new yi5.b(29));
    }
}
