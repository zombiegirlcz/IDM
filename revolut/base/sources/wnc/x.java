package wnc;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.CryptoWithdrawToAddressReviewActivity;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistEntry;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.WaitlistInvitationScreen;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import ip0.pb0;
import ip0.s7;
import ip0.w40;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import le.u1;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298818a;

    public /* synthetic */ x(int i) {
        this.f298818a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3 = null;
        switch (this.f298818a) {
            case 0:
                l it8 = (l) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.a();
            case 1:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 1, 6, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRangeU, 10));
                vim.f it9 = intRangeU.iterator();
                while (it9.f289625c) {
                    arrayList.add(new s7(a0.d.n("ID_MULTI_CURRENCY_LOADING-", it9.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 2:
                EsimDescriptorValue it10 = (EsimDescriptorValue) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10;
            case 3:
                wo2.g update = (wo2.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return wo2.g.a(update, new Data(null, null, true, 3, null));
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = zhm.u.b();
                eVarB.add(kp2.a.b());
                ArrayList arrayList2 = new ArrayList(4);
                for (int i = 0; i < 4; i++) {
                    arrayList2.add(new w40(a0.d.n("ID_TRACKER_LOADING_", i)));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList2);
                ArrayList arrayList3 = new ArrayList(2);
                for (int i2 = 0; i2 < 2; i2++) {
                    arrayList3.add(t61.a.o("ID_LINK_LOADING_", i2, pb0.Companion, false, 6));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList3);
                return new wo2.i(zhm.u.a(eVarB));
            case 5:
                yoj.a cryptoFeatureState = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(cryptoFeatureState, "cryptoFeatureState");
                if (!yoj.b.l(cryptoFeatureState) && !yoj.b.k(cryptoFeatureState)) {
                    return new q06.i(new q06.b(ibb.c.f160140a, null));
                }
                return new q06.i(new q06.b(ibb.c.d, null));
            case 6:
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected deeplink passed to CryptoWithdrawDeeplinkActionPerformerImpl");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                return Unit.f186387a;
            case 7:
                Boolean enabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                return Boolean.valueOf(!enabled.booleanValue());
            case 8:
                Intrinsics.checkNotNullParameter((NaviCommand) obj2, "it");
                return Boolean.TRUE;
            case 9:
                Boolean enabled2 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled2, "enabled");
                return Boolean.valueOf(!enabled2.booleanValue());
            case 10:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : it11) {
                    if (obj4 instanceof WealthAccount.Robo) {
                        arrayList4.add(obj4);
                    }
                }
                WealthAccount.Robo robo = (WealthAccount.Robo) zhm.d0.d0(arrayList4);
                if (robo != null) {
                    return robo;
                }
                throw new IllegalStateException("Robo account not found");
            case 11:
                WealthAccount.Robo roboAccount = (WealthAccount.Robo) obj2;
                Intrinsics.checkNotNullParameter(roboAccount, "roboAccount");
                Iterator it12 = roboAccount.f95237c.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        Object next = it12.next();
                        if (zhm.v.k(com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE, com.revolut.shared.feature.wealth.models.trading_accounts.a.SUSPENDED, com.revolut.shared.feature.wealth.models.trading_accounts.a.OFFBOARDING).contains(((TradingAccount.Portfolio) next).f105211b)) {
                            obj3 = next;
                        }
                    }
                }
                if (obj3 != null) {
                    return (TradingAccount.Portfolio) obj3;
                }
                throw new IllegalStateException("No onboarded portfolio for Robo account");
            case 12:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                alc.j jVar = (alc.j) rVar.f314201a;
                dj0.d dVar = (dj0.d) rVar.f314202b;
                Pair pair = (Pair) rVar.f314203c;
                return new xoc.a(jVar, dVar, (dj0.d) pair.f186385a, (jlc.p) pair.f186386b);
            case 13:
                alc.n nVar = (alc.n) obj2;
                String str = nVar.e;
                if (str != null) {
                    return str;
                }
                throw new IllegalStateException(p.a.p("Robo portfolio ", nVar.f6207a, " has no assigned template").toString());
            case 14:
                return mif.a.Q(((del.b) obj2).f113708a);
            case 15:
                return mif.a.Q(((del.b) obj2).f113708a);
            case 16:
                return new Pair((dj0.d) obj2, jlc.p.SIMULATED);
            case 17:
                return new Pair((dj0.d) obj2, jlc.p.ACTUAL);
            case 18:
                Context ctx = (Context) obj2;
                KProperty[] kPropertyArr = WaitlistInvitationScreen.R;
                Intrinsics.checkNotNullParameter(ctx, "ctx");
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ctx);
                linearLayoutManager.setStackFromEnd(true);
                return linearLayoutManager;
            case 19:
                wok.e update2 = (wok.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return wok.e.a(update2, null, null, 7);
            case 20:
                return Boolean.valueOf(((PricingPlanWaitlistEntry) obj2).f103653b == gok.b.ELIGIBLE);
            case 21:
                return ((PricingPlanWaitlistEntry) obj2).f103652a;
            case 22:
                wol.m update3 = (wol.m) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                wol.h operationBanner = update3.f298970b;
                wol.k qrCodeState = wol.k.f298968a;
                Intrinsics.checkNotNullParameter(qrCodeState, "qrCodeState");
                Intrinsics.checkNotNullParameter(operationBanner, "operationBanner");
                return new wol.m(qrCodeState, operationBanner);
            case 23:
                wol.h operationBanner2 = ((wol.m) obj2).f298970b;
                wol.j qrCodeState2 = wol.j.f298967a;
                Intrinsics.checkNotNullParameter(qrCodeState2, "qrCodeState");
                Intrinsics.checkNotNullParameter(operationBanner2, "operationBanner");
                return new wol.m(qrCodeState2, operationBanner2);
            case 24:
                t61.g it13 = (t61.g) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return u1.a(it13);
            case 25:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 26:
                CellDetailsDelegate.Model it14 = (CellDetailsDelegate.Model) obj2;
                int i3 = CryptoWithdrawToAddressReviewActivity.A0;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f51832a;
            case 27:
                CellDetailsDelegate.Model it15 = (CellDetailsDelegate.Model) obj2;
                int i5 = CryptoWithdrawToAddressReviewActivity.A0;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f51832a;
            case 28:
                xi0.b it16 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return zi0.c.P(it16, false, null, 3);
            default:
                Boolean it17 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return zi0.c.P(it17, false, null, 3);
        }
    }
}
