package bvb;

import aw0.m6;
import aw0.n6;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.rev_points.buying.api.R$string;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.tracking.v3.RevPointsBuyingContext;
import java.util.Iterator;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19014a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f19015b;

    public /* synthetic */ u(e eVar, w wVar) {
        this.f19015b = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        RevPoints revPointsA;
        n6 n6Var;
        Object next;
        n6 n6VarA;
        switch (this.f19014a) {
            case 0:
                rub.m content = (rub.m) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                rub.i iVar = content.f257525c;
                e eVar = this.f19015b;
                if (iVar == null) {
                    return w.e(eVar.f18981b, content.f257524b, false);
                }
                double d = iVar.f257517a;
                rub.j jVar = eVar.f18981b;
                rub.i iVar2 = jVar instanceof rub.i ? (rub.i) jVar : null;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.points_buying_recurring_bottom_sheet_cta_deactivate, null, null, 14);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                RevPointsBuyingContext.a aVarNewBuilder = RevPointsBuyingContext.newBuilder();
                aVarNewBuilder.j(d);
                String str = iVar.e;
                aVarNewBuilder.c();
                ((RevPointsBuyingContext) aVarNewBuilder.f49761b).setStandingOrderId(str);
                Boolean bool = iVar.i;
                aVarNewBuilder.h(pd.b.j(bool));
                aVarNewBuilder.i(true);
                aVarNewBuilder.c();
                ((RevPointsBuyingContext) aVarNewBuilder.f49761b).setIsDeactivation(true);
                w0 w0VarA = aVarNewBuilder.a();
                companion.getClass();
                n6 n6Var2 = new n6(textLocalisedClause, defaultFilledButton, null, "DEACTIVATE_BUTTON_LOADING_ID", true, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA)), null, 908);
                if (iVar2 != null) {
                    revPointsA = qvb.a.a(iVar2.f257517a);
                } else {
                    RevPoints.INSTANCE.getClass();
                    revPointsA = RevPoints.Companion.a(0L);
                }
                RevPoints other = qvb.a.a(d);
                Intrinsics.checkNotNullParameter(other, "other");
                if (revPointsA.f83960a.f(other.f83960a)) {
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.points_buying_recurring_bottom_sheet_cta_pay, null, null, 14);
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58725a;
                    RevPointsBuyingContext.a aVarNewBuilder2 = RevPointsBuyingContext.newBuilder();
                    aVarNewBuilder2.j(iVar2 != null ? iVar2.f257517a : 0.0d);
                    aVarNewBuilder2.c();
                    ((RevPointsBuyingContext) aVarNewBuilder2.f49761b).setStandingOrderId(str);
                    aVarNewBuilder2.h(pd.b.j(bool));
                    aVarNewBuilder2.i(true);
                    aVarNewBuilder2.c();
                    ((RevPointsBuyingContext) aVarNewBuilder2.f49761b).setIncreasedAmount(true);
                    n6Var = new n6(textLocalisedClause2, defaultFilledButton2, null, "PAYMENT_BUTTON_LOADING_ID", true, new AnalyticsContext(AnalyticsContext.Companion.a(aVarNewBuilder2.a())), null, 908);
                } else {
                    double d5 = 0.0d;
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.points_buying_recurring_bottom_sheet_cta_save, null, null, 14);
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton3 = LargeActionButton.ButtonStyle.f58725a;
                    boolean zJ = pd.b.j(iVar2 != null ? Boolean.valueOf(!n14.e.s(iVar2, iVar)) : null);
                    RevPointsBuyingContext.a aVarNewBuilder3 = RevPointsBuyingContext.newBuilder();
                    if (iVar2 != null) {
                        d5 = iVar2.f257517a;
                    }
                    aVarNewBuilder3.j(d5);
                    aVarNewBuilder3.c();
                    ((RevPointsBuyingContext) aVarNewBuilder3.f49761b).setStandingOrderId(str);
                    aVarNewBuilder3.h(pd.b.j(bool));
                    aVarNewBuilder3.i(true);
                    aVarNewBuilder3.c();
                    ((RevPointsBuyingContext) aVarNewBuilder3.f49761b).setDecreasedAmount(true);
                    n6Var = new n6(textLocalisedClause3, defaultFilledButton3, null, "UPDATE_BUTTON_LOADING_ID", zJ, new AnalyticsContext(AnalyticsContext.Companion.a(aVarNewBuilder3.a())), null, 908);
                }
                return new aw0.g(n6Var2, n6Var, (Clause) null, (aw0.f) null, 25);
            default:
                rub.m content2 = (rub.m) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                e eVar2 = this.f19015b;
                boolean z = eVar2.d;
                rub.j jVar2 = eVar2.f18981b;
                if (z) {
                    return w.e(jVar2, content2.f257524b, true);
                }
                Iterator it8 = content2.f257523a.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        rub.f fVar = (rub.f) next;
                        if (jVar2 == null || qvb.a.a(jVar2.a()).T() != qvb.a.a(fVar.f257513a).T()) {
                        }
                    } else {
                        next = null;
                    }
                }
                rub.f fVar2 = (rub.f) next;
                if (fVar2 != null) {
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.points_buying_one_off_bottom_sheet_cta_label, zhm.u.c(new MoneyClause(fVar2.f257514b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton4 = LargeActionButton.ButtonStyle.f58725a;
                    AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
                    RevPointsBuyingContext.a aVarNewBuilder4 = RevPointsBuyingContext.newBuilder();
                    aVarNewBuilder4.j(fVar2.f257513a);
                    aVarNewBuilder4.i(false);
                    w0 w0VarA2 = aVarNewBuilder4.a();
                    companion2.getClass();
                    n6VarA = new n6(textLocalisedClause4, defaultFilledButton4, null, "PAYMENT_BUTTON_LOADING_ID", true, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA2)), null, 908);
                } else {
                    n6.Companion.getClass();
                    n6VarA = m6.a();
                }
                return new aw0.e(false, null, null, n6VarA, null, null, 55);
        }
    }

    public /* synthetic */ u(w wVar, e eVar) {
        this.f19015b = eVar;
    }
}
