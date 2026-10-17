package rp9;

import com.revolut.feature.payments.bills_chooser.api.navigation.LimitedCurrenciesConfig;
import e7l.g;
import efm.d0;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import te0.w;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f256301b;

    public /* synthetic */ k(m mVar, int i) {
        this.f256300a = i;
        this.f256301b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f256300a) {
            case 0:
                String searchQuery = (String) obj2;
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                m mVar = this.f256301b;
                sp9.b bVar = mVar.f256303q;
                LimitedCurrenciesConfig limitedCurrenciesConfig = mVar.f256302p.d;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                Intrinsics.checkNotNullParameter(limitedCurrenciesConfig, "limitedCurrenciesConfig");
                r rVarF = ((njf.j) bVar.d).f();
                ik3.c cVar = (ik3.c) bVar.f264908b;
                d0 d0VarFirstOrError = nim.a.w(cVar.k(g.b.f123407a), new soi.a(1)).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                z zVarF = ue0.e.F(zi0.c.t(d0VarFirstOrError), h0.f322473a);
                d0 d0VarFirstOrError2 = cVar.m().firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
                r rVarOnErrorReturn = new sfm.b(w.H0(zVarF, ue0.e.F(zi0.c.t(d0VarFirstOrError2), r0.g())), new sp5.h(5, new sdi.k(bVar, limitedCurrenciesConfig, 17)), 2).onErrorReturn(new sp5.h(6, new soi.a(3)));
                Intrinsics.checkNotNullExpressionValue(rVarOnErrorReturn, "onErrorReturn(...)");
                r map = w.l(rVarF, rVarOnErrorReturn).map(new sp5.h(4, new sdi.k(bVar, searchQuery, 16)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            default:
                this.f256301b.x2(new rlh.d0(((bp9.d) obj2).f17565a, 20));
                return Unit.f186387a;
        }
    }
}
