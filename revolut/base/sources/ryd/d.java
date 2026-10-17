package ryd;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.statements.api.models.ProductStatementPeriods;
import com.revolut.feature.statements.api.models.StatementUrlState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f258331b;

    public /* synthetic */ d(w wVar, int i) {
        this.f258330a = i;
        this.f258331b = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f258330a) {
            case 0:
                c31.e eVar = this.f258331b.f258359c;
                o data = (o) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                boolean z = data.f258351b;
                c71.b info = data.f258350a;
                if (z) {
                    Intrinsics.checkNotNullParameter(info, "info");
                    return m70.a.g(eVar.f20863g.f(info, false), null, new l(0), 1).firstOrError();
                }
                Intrinsics.checkNotNullParameter(info, "info");
                return m70.a.g(mo3.a.n(eVar.f20863g.f(info, true)), null, new l(1), 1).lastOrError();
            case 1:
                StatementUrlState state = (StatementUrlState) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                if (state instanceof StatementUrlState.InPreparation) {
                    efm.r map = this.f258331b.d.f(false).x().map(new rxb.f(21, new rrd.l(state, 29)));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    return map;
                }
                efm.r rVarJust = efm.r.just(state);
                Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                return rVarJust;
            default:
                od0.i jointAccountOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(jointAccountOptional, "jointAccountOptional");
                return jointAccountOptional.d() ? nim.a.w(this.f258331b.f.K((AccountId) jointAccountOptional.c()), new rxb.b(26)) : zi0.c.j(new ProductStatementPeriods(w.i, f0.f322471a));
        }
    }
}
