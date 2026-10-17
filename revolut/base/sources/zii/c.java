package zii;

import alc.l;
import bka.a0;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConstants;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2Contract$FlowState;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted;
import com.revolut.shared.feature.wealth.models.config.Links;
import efm.d0;
import efm.r;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sk8.b;
import wp5.y;
import z0h.p1;
import z0h.t1;
import zhm.h0;
import zhm.u;
import zjh.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322568a;

    public /* synthetic */ c(int i) {
        this.f322568a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        long jFloor;
        String termsUrl = null;
        switch (this.f322568a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return r.error(h.i(error));
            case 1:
                return Unit.f186387a;
            case 2:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                return d0.l(h.i(error2));
            case 3:
                return Unit.f186387a;
            case 4:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.FALSE;
            case 5:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.FALSE;
            case 6:
                return Unit.f186387a;
            case 7:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.FALSE;
            case 8:
                ifm.c it11 = (ifm.c) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Unit.f186387a;
            case 9:
                Throwable it12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.FALSE;
            case 10:
                ifm.c it13 = (ifm.c) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Unit.f186387a;
            case 11:
                Throwable it14 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.FALSE;
            case 12:
                return ((Boolean) obj2).booleanValue() ? uj3.a.ENABLED_AND_ONBOARDED : uj3.a.ONBOARDING_REQUIRED;
            case 13:
                yoj.a aVar = (yoj.a) obj2;
                return y.s(aVar, "it", aVar);
            case 14:
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return iii.c.c(5);
            case 15:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 16:
                TabCryptoFlowV2Contract$FlowState it16 = (TabCryptoFlowV2Contract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f89811a;
            case 17:
                t1 disclaimersData = (t1) obj2;
                Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
                Links links = disclaimersData.f318563a;
                hel.b bVar = disclaimersData.f318564b;
                return new p1(u.c(new WealthDisclaimersContract$Disclaimer$Investment.CashBalance(links, bVar)), bVar);
            case 18:
                CombinedBuyingPowerConverted giaConvertedCombinedBuyingPower = (CombinedBuyingPowerConverted) obj2;
                Intrinsics.checkNotNullParameter(giaConvertedCombinedBuyingPower, "giaConvertedCombinedBuyingPower");
                return new dkh.b(giaConvertedCombinedBuyingPower);
            case 19:
                List convertedCashHoldings = (List) obj2;
                Intrinsics.checkNotNullParameter(convertedCashHoldings, "convertedCashHoldings");
                return new dkh.a(convertedCashHoldings);
            case 20:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "<unused var>", 3);
                for (int i = 0; i < 3; i++) {
                    arrayListP.add(nb0.b(pb0.Companion, a0.d.n("STOCKS_CASH_HOLDING_LOADING_ITEM_ID_", i), false, 0, false, 30));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return s.f322855a;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 23:
                MoneyClause it17 = (MoneyClause) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17;
            case 24:
                Function0 it18 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return iii.c.c(5);
            case 25:
                xk8.b it19 = (xk8.b) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                Intrinsics.checkNotNullParameter(it19, "<this>");
                if (it19.getCampaign() == null) {
                    return b.a.f263780a;
                }
                dj0.d dVarO = mo3.a.o(it19.getCampaign().getReferrerReward());
                if (it19.getCampaign().getTermsUrl() == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("BE returns empty termsUrl");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    termsUrl = "https://revolut.com/legal/u18referrals";
                }
                if (termsUrl == null) {
                    termsUrl = it19.getCampaign().getTermsUrl();
                }
                return new sk8.a(dVarO, termsUrl);
            case 26:
                a0 arg2 = (a0) obj2;
                Intrinsics.checkNotNullParameter(arg2, "arg");
                return new Click(28, (Integer) null, (Object) new xka.j(arg2.f16296b), arg2.f16295a, false);
            case 27:
                List it20 = (List) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                n9l.a aVar2 = (n9l.a) zhm.d0.d0(it20);
                double d = LivenessConstants.MAX_VIDEO_SIZE_BYTES * (aVar2 != null ? aVar2.f213663c : 1.0d);
                if (d <= 0.0d) {
                    jFloor = 0;
                } else {
                    double dPow = Math.pow(10.0d, Math.floor(Math.log10(d)));
                    jFloor = (long) (Math.floor(d / dPow) * dPow);
                }
                return Long.valueOf(jFloor);
            case 28:
                l it21 = (l) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.f6204a;
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return zhm.d0.E0((List) pair.f186386b, (List) pair.f186385a);
        }
    }
}
