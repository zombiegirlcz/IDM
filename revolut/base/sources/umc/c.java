package umc;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$State;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoFeesBreakdown;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreen;
import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreenContract$DomainState;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$DashboardUserData;
import com.revolut.feature.transfer.core.models.FundingSource;
import dj0.d;
import do3.n;
import efm.d0;
import eq5.q;
import in8.g;
import ip0.cs;
import ip0.nb0;
import ip0.pb0;
import ip0.w60;
import ip0.x60;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import le.u1;
import lw0.i;
import rn8.e;
import rn8.f;
import unc.h;
import unc.t;
import up2.j;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281278a;

    public /* synthetic */ c(int i) {
        this.f281278a = i;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f281278a) {
            case 0:
                return w.u((List) obj2);
            case 1:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.FALSE;
            case 2:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return u.c(new x60("id_plan_offer_prompt", w60.BACKGROUND_ASSET, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
            case 3:
                f it10 = (f) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Intrinsics.checkNotNullParameter(it10, "<this>");
                return new g(it10.getReferralsEnabled());
            case 4:
                f it11 = (f) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Intrinsics.checkNotNullParameter(it11, "<this>");
                return new g(it11.getReferralsEnabled());
            case 5:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return d0.l(error);
            case 6:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj3 = qn8.a.f247876a;
                Intrinsics.checkNotNullParameter(it12, "<this>");
                List<e> list = it12;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (e eVar : list) {
                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                    String type = eVar.getType();
                    String currency = eVar.getCurrency();
                    Long price = eVar.getPrice();
                    Long limit = eVar.getLimit();
                    Double feePc = eVar.getFeePc();
                    Boolean free = eVar.getFree();
                    Long usage = eVar.getUsage();
                    Long endDate = eVar.getEndDate();
                    String limitUnit = eVar.getLimitUnit();
                    arrayList.add(new in8.e(type, currency, price, limit, feePc, free, usage, endDate, limitUnit != null ? (in8.f) u1.v(limitUnit, qn8.a.f247876a) : null));
                }
                return arrayList;
            case 7:
                LargeActionButtonDelegate.Model it13 = (LargeActionButtonDelegate.Model) obj2;
                KProperty[] kPropertyArr = PortfolioSpareChangeScreen.X;
                Intrinsics.checkNotNullParameter(it13, "it");
                Object obj4 = it13.i;
                if (obj4 instanceof h) {
                    return (h) obj4;
                }
                return null;
            case 8:
                Function0 it14 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return null;
            case 9:
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return t.a();
            case 10:
                PortfolioSpareChangeScreenContract$DomainState update = (PortfolioSpareChangeScreenContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return PortfolioSpareChangeScreenContract$DomainState.a(update, null, null, null, null, null, null, 31);
            case 11:
                Data it16 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (xnd.h) it16.getContent();
            case 12:
                n user = (n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                return new AnalyticsDashboardContract$DashboardUserData(te0.w.I(user));
            case 13:
                return p.a.p("- ", uo.b.g(((WeakReference) obj2).get()), "\n");
            case 14:
                Map.Entry it17 = (Map.Entry) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return j6.a.s("- ", uo.b.g(it17.getKey()), " above ", uo.b.g(((WeakReference) it17.getValue()).get()), "\n");
            case 15:
                Function0 it18 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                lw0.h hVar = new lw0.h(i.TITLE_SUBTITLE);
                cs csVar = new cs("LARGE_ACTION_BTN_LOADING_LIST_ID");
                yp0.b.r(csVar, 0, 0, 0, 0, 15);
                return new uob.i(u.c(csVar), hVar);
            case 16:
                up2.e update2 = (up2.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return up2.e.a(update2, new Data(null, null, true, 3, null));
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                hg hgVarB = kp2.a.b();
                pb0 pb0VarA = nb0.a(pb0.Companion, "ID_REQUEST_DETAILS_DESCRIPTION_LOADING", false, 6);
                yp0.b.l(pb0VarA, 0, 0, 0, 0, null, false, 63);
                return new j(null, v.k(hgVarB, pb0VarA), false);
            case 18:
                CreditCardSetupAutopayFlowContract$State.Content updateContent = (CreditCardSetupAutopayFlowContract$State.Content) obj2;
                Intrinsics.checkNotNullParameter(updateContent, "$this$updateContent");
                updateContent.getClass();
                CreditCardAutopayType.RevolutPocket revolutPocketB = updateContent.f69074a.b();
                if (revolutPocketB != null) {
                    return CreditCardSetupAutopayFlowContract$State.Content.a(updateContent, revolutPocketB, null, null, null, null, 2039);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 19:
                CreditCardSetupAutopayFlowContract$State.Content updateContent2 = (CreditCardSetupAutopayFlowContract$State.Content) obj2;
                Intrinsics.checkNotNullParameter(updateContent2, "$this$updateContent");
                updateContent2.getClass();
                CreditCardAutopayType.DirectDebit directDebitA = updateContent2.f69074a.a();
                if (directDebitA != null) {
                    return CreditCardSetupAutopayFlowContract$State.Content.a(updateContent2, directDebitA, null, null, null, null, 2039);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 20:
                CreditCardSetupAutopayFlowContract$State it19 = (CreditCardSetupAutopayFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                CreditCardSetupAutopayFlowContract$State.Content content = it19 instanceof CreditCardSetupAutopayFlowContract$State.Content ? (CreditCardSetupAutopayFlowContract$State.Content) it19 : null;
                if (content != null) {
                    return content.f69078h;
                }
                return null;
            case 21:
                vf0.h hVar2 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar2, "<destruct>");
                wp5.b bVar = (wp5.b) hVar2.f288433a;
                wp5.a aVar = (wp5.a) hVar2.f288434b;
                boolean zBooleanValue = ((Boolean) hVar2.f288435c).booleanValue();
                q qVar = (q) hVar2.d;
                return zjh.j.i(bVar, aVar, zBooleanValue, qVar.f128301a, qVar.d.f71113b);
            case 22:
                xi0.b it20 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return zi0.c.P(it20, false, null, 3);
            case 23:
                FiatCryptoMoney it21 = (FiatCryptoMoney) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.f71113b;
            case 24:
                FiatCryptoMoney it22 = (FiatCryptoMoney) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.f71113b;
            case 25:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                d dVar = (d) pair.f186385a;
                q qVar2 = (q) pair.f186386b;
                d.Companion.getClass();
                boolean zF = Intrinsics.f(dVar, d.d);
                d dVar2 = qVar2.d.f71113b;
                FiatCryptoMoney fiatCryptoMoney = qVar2.f128301a;
                xi0.b bVar2 = fiatCryptoMoney.f71113b.f115083b;
                d dVar3 = qVar2.e;
                xi0.b bVar3 = dVar3.f115083b;
                if (!Intrinsics.f(bVar2, bVar3) ? fiatCryptoMoney.f71112a.f115082a <= dVar3.f115082a : fiatCryptoMoney.f71113b.f115082a <= dVar2.f115082a) {
                    z = false;
                }
                if (Intrinsics.f(bVar2, bVar3) ? dVar2.k() : dVar3.k()) {
                    return wp5.a.ZeroBalance;
                }
                if (!zF && z) {
                    return wp5.a.ExceedsBalance;
                }
                return wp5.a.WithinBalance;
            case 26:
                od0.i fundingSourceOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(fundingSourceOptional, "fundingSourceOptional");
                FundingSource fundingSource = (FundingSource) fundingSourceOptional.f224257a;
                return zi0.c.P(fundingSource != null ? fundingSource.f92241b : null, false, null, 3);
            case 27:
                vf0.h hVar3 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar3, "<destruct>");
                FiatCryptoMoney fiatCryptoMoney2 = (FiatCryptoMoney) hVar3.f288433a;
                FiatCryptoFeesBreakdown fiatCryptoFeesBreakdown = (FiatCryptoFeesBreakdown) hVar3.f288434b;
                return Boolean.valueOf(Intrinsics.f(fiatCryptoMoney2.f71112a.f115083b, fiatCryptoFeesBreakdown.e.f71112a.f115083b) && Intrinsics.f(fiatCryptoMoney2.f71113b.f115083b, fiatCryptoFeesBreakdown.e.f71113b.f115083b));
            case 28:
                vf0.h hVar4 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar4, "<destruct>");
                FiatCryptoMoney fiatCryptoMoney3 = (FiatCryptoMoney) hVar4.f288433a;
                FiatCryptoFeesBreakdown fiatCryptoFeesBreakdown2 = (FiatCryptoFeesBreakdown) hVar4.f288434b;
                return new q(fiatCryptoMoney3, fiatCryptoFeesBreakdown2, new FiatCryptoMoney(pyd.c.O(fiatCryptoMoney3.f71112a, fiatCryptoFeesBreakdown2.e.f71112a.a()), pyd.c.O(fiatCryptoMoney3.f71113b, fiatCryptoFeesBreakdown2.e.f71113b.a())), (FiatCryptoMoney) hVar4.f288435c, (d) hVar4.d);
            default:
                nqi.c it23 = (nqi.c) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return zi0.c.P(it23, false, null, 3);
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f281278a = i;
    }
}
