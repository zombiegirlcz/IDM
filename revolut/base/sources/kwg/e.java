package kwg;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.mainscreen.api.R$string;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.topup_screen.api.descriptor.GooglePayFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.api.model.CheckoutContext;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$Step;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.model.CheckoutCardPlan;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.balance.picker.api.models.JuniorInfo;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import efm.d0;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import jel.h1;
import k4l.e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.q;
import kyc.t;
import m1i.i1;
import nel.n;
import nvg.m0;
import nvg.r;
import ood.q0;
import ox5.t0;
import pcd.l0;
import q2j.x;
import r7i.s;
import ste.o;
import te0.w;
import yz5.a;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f190338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f190339c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f190337a = i;
        this.f190338b = obj2;
        this.f190339c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    private final Object a(Object obj2) {
        Optional optional = (Optional) this.f190338b;
        TradingAccount tradingAccount = (TradingAccount) this.f190339c;
        n nVar = (n) this.d;
        InstrumentTicker instrumentTicker = (InstrumentTicker) this.e;
        h1 h1Var = (h1) this.f;
        qrb.a availableToInvest = (qrb.a) obj2;
        Intrinsics.checkNotNullParameter(availableToInvest, "availableToInvest");
        return new qrb.i(tradingAccount, nVar, instrumentTicker, h1Var, (e0) gj7.b.m(optional), availableToInvest);
    }

    private final Object b(Object obj2) {
        oyc.c cVar = (oyc.c) this.f190338b;
        String str = (String) this.d;
        String str2 = (String) this.f190339c;
        String str3 = (String) this.e;
        String str4 = (String) this.f;
        okhttp3.c multiPartBody = (okhttp3.c) obj2;
        Intrinsics.checkNotNullParameter(multiPartBody, "multiPartBody");
        return cVar.f230938a.uploadEvidenceFiles(str, str2, str3, str4, multiPartBody);
    }

    private final Object c(Object obj2) {
        oyc.c cVar = (oyc.c) this.f190338b;
        IncomeSource incomeSource = (IncomeSource) this.f190339c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        String str3 = (String) this.f;
        t it8 = (t) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        d0<kyc.h> d0VarCreateEvidence = cVar.f230938a.createEvidence(new kyc.g(incomeSource.f85873a, it8.getAlertId(), new kyc.j(str), new kyc.b(str2, str3)));
        oy9.b bVar = new oy9.b(new t0(23), 19);
        d0VarCreateEvidence.getClass();
        ufm.i iVar = new ufm.i(d0VarCreateEvidence, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return w.i0(iVar);
    }

    private final Object d(Object obj2) {
        yji.l lVar = (yji.l) this.f190338b;
        dj0.d dVar = (dj0.d) this.f190339c;
        ArrayList arrayList = (ArrayList) this.e;
        String str = (String) this.d;
        Function1 function1 = (Function1) this.f;
        yz5.a outputData = (yz5.a) obj2;
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        if (outputData instanceof a.b) {
            pc1.a.a(lVar, dVar, null, arrayList, str, function1);
        } else if (outputData instanceof yz5.b) {
            pc1.a.a(lVar, dVar, ((yz5.b) outputData).f318039a, arrayList, str, function1);
        } else if (!Intrinsics.f(outputData, a.C1768a.f318037a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }

    private final Object e(Object obj2) {
        String country;
        x xVar = (x) this.f190338b;
        t70.g gVar = xVar.o;
        q2j.d dVar = (q2j.d) this.f190339c;
        String str = (String) this.d;
        wi0.b bVar = (wi0.b) this.e;
        String str2 = (String) this.f;
        Address address = ((do3.n) obj2).k;
        if (address == null || (country = address.getCountry()) == null) {
            xVar.X(dVar, str);
        } else {
            wi0.b.Companion.getClass();
            wi0.b bVarA = wi0.a.a(country);
            if (com.bumptech.glide.d.x(bVarA) && !com.bumptech.glide.d.x(bVar)) {
                xVar.W(uc0.b.g(R$string.currency_crypto_us_unavailable_alert_title, gVar), gVar.i(R$string.currency_crypto_us_unavailable_alert_subtitle_format, str));
            } else if (com.bumptech.glide.d.x(bVarA) || !com.bumptech.glide.d.x(bVar)) {
                xVar.X(dVar, str);
            } else {
                xVar.W(gVar.i(R$string.currency_crypto_us_unavailable_toreceivesend_alert_title, str2), gVar.i(R$string.currency_crypto_us_unavailable_toreceivesend_alert_subtitle, str, str2));
            }
        }
        return Unit.f186387a;
    }

    private final Object g(Object obj2) {
        dj0.d dVar = (dj0.d) this.f190338b;
        fb3.d dVar2 = (fb3.d) this.f190339c;
        com.revolut.feature.cash_topup.impl.ui.amount.c cVar = (com.revolut.feature.cash_topup.impl.ui.amount.c) this.d;
        dj0.d dVar3 = (dj0.d) this.e;
        xi0.b bVar = (xi0.b) this.f;
        Intrinsics.h(dVar);
        Intrinsics.h(dVar2);
        return new qb3.h(dVar, bVar, cVar.f65620s.e(dVar3), dVar3, dVar2, null);
    }

    private final Object h(Object obj2) {
        com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar = (com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) this.f190338b;
        GooglePayFlowDescriptor$InputData googlePayFlowDescriptor$InputData = (GooglePayFlowDescriptor$InputData) this.f190339c;
        CheckoutScreenContract$CheckoutContent$Order checkoutScreenContract$CheckoutContent$Order = (CheckoutScreenContract$CheckoutContent$Order) this.d;
        List list = (List) this.e;
        CheckoutCardPlan checkoutCardPlan = (CheckoutCardPlan) this.f;
        o outputData = (o) obj2;
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        TopUpTarget topUpTarget = googlePayFlowDescriptor$InputData.f90497b;
        dj0.d dVar = googlePayFlowDescriptor$InputData.f90496a;
        if (outputData instanceof ste.n) {
            eVar.n2(new qwe.l(eVar, outputData, dVar, checkoutScreenContract$CheckoutContent$Order, null), new whi.b(6));
        } else {
            if (outputData instanceof ste.l) {
                if (((ste.l) outputData).f265566a) {
                    oki.h.t2(eVar, eVar.M, new CheckoutFlowContract$Step.TopUpMethods(dVar.f115083b.f306286a, eVar.N, topUpTarget, list, new CheckoutContext(dVar, checkoutCardPlan != null ? checkoutCardPlan.f90756b : null, checkoutCardPlan != null ? checkoutCardPlan.f90755a : null)), true, null, false, 12);
                }
            } else {
                if (!(outputData instanceof ste.m)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar.N2(null, ((ste.m) outputData).f265567a, dVar.f115083b);
            }
        }
        return Unit.f186387a;
    }

    private final Object i(Object obj2) {
        io3.d dVar = (io3.d) this.f190338b;
        s sVar = (s) this.f190339c;
        JuniorInfo juniorInfo = (JuniorInfo) this.d;
        AccountWrapper accountWrapper = (AccountWrapper) this.e;
        x5i.d dVar2 = (x5i.d) this.f;
        Boolean toggleEnabled = (Boolean) obj2;
        Intrinsics.checkNotNullParameter(toggleEnabled, "toggleEnabled");
        boolean z = toggleEnabled.booleanValue() && dVar.f == io3.k.ACTIVE;
        sVar.getClass();
        boolean zB = s.b(juniorInfo, accountWrapper);
        boolean z3 = dVar2 == x5i.d.SOURCE ? juniorInfo.e : true;
        if (z && zB && z3) {
            return sVar.c(juniorInfo);
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    private final Object j(Object obj2) {
        pcd.s sVar = (pcd.s) this.f190338b;
        s sVar2 = (s) this.f190339c;
        JuniorInfo juniorInfo = (JuniorInfo) this.d;
        AccountWrapper accountWrapper = (AccountWrapper) this.e;
        x5i.d dVar = (x5i.d) this.f;
        Boolean toggleEnabled = (Boolean) obj2;
        Intrinsics.checkNotNullParameter(toggleEnabled, "toggleEnabled");
        if (toggleEnabled.booleanValue() && sVar.e == l0.REGULAR) {
            return new ufm.i(sVar2.c(juniorInfo), new r4j.b(new q2k.b(sVar2, juniorInfo, accountWrapper, dVar, 13), 11), 0);
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0918  */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 2824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kwg.e.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ e(Object obj2, String str, Object obj3, Object obj4, String str2, int i) {
        this.f190337a = i;
        this.f190338b = obj2;
        this.d = str;
        this.f190339c = obj3;
        this.e = obj4;
        this.f = str2;
    }

    public /* synthetic */ e(String str, oce.h hVar, String str2, String str3, Object obj2) {
        this.f190337a = 14;
        this.d = str;
        this.f190338b = hVar;
        this.f190339c = str2;
        this.e = str3;
        this.f = obj2;
    }

    public /* synthetic */ e(List list, AccountId accountId, String str, Set set, q0 q0Var, amd.i iVar) {
        this.f190337a = 17;
        this.f190338b = list;
        this.f190339c = accountId;
        this.d = str;
        this.e = set;
        this.f = iVar;
    }

    public /* synthetic */ e(lal.a aVar, ArrayList arrayList, Integer num, vl4.f fVar, String str) {
        this.f190337a = 16;
        this.f190338b = aVar;
        this.f190339c = arrayList;
        this.e = num;
        this.f = fVar;
        this.d = str;
    }

    public /* synthetic */ e(r rVar, String str, eel.c cVar, String str2, String str3) {
        this.f190337a = 10;
        this.f190338b = rVar;
        this.d = str;
        this.e = cVar;
        this.f190339c = str2;
        this.f = str3;
    }

    public /* synthetic */ e(m0 m0Var, iwg.a aVar, eel.c cVar, String str, String str2) {
        this.f190337a = 12;
        this.f190338b = m0Var;
        this.f190339c = aVar;
        this.e = cVar;
        this.d = str;
        this.f = str2;
    }

    public /* synthetic */ e(pc1.a aVar, yji.l lVar, dj0.d dVar, ArrayList arrayList, String str, Function1 function1) {
        this.f190337a = 22;
        this.f190338b = lVar;
        this.f190339c = dVar;
        this.e = arrayList;
        this.d = str;
        this.f = function1;
    }

    public /* synthetic */ e(q7c.x xVar, String str, Set set, String str2, String str3, String str4) {
        this.f190337a = 24;
        this.d = str;
        this.f190338b = set;
        this.f190339c = str2;
        this.e = str3;
        this.f = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e(r1i.h hVar, i1 i1Var, CharSequence charSequence, h0 h0Var, Function1 function1) {
        this.f190337a = 2;
        this.f190338b = hVar;
        this.f190339c = i1Var;
        this.d = charSequence;
        this.e = h0Var;
        this.f = (q) function1;
    }
}
