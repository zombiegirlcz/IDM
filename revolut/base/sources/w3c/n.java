package w3c;

import ael.y;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBorrower;
import com.revolut.feature.revolut_shop.api.domain.provider.RevolutShopAddressFlowProvider$OutputData;
import com.revolut.feature_travel_hotels_models.property.room.BedOptionSelection;
import com.revolut.kompot.common.flow.permissions.a;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.crypto.disclaimer.api.CryptoDisclaimerApi$Toggles$CryptoBrazilExpansion;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import com.revolut.retail.feature.crypto_deposits.api.interactors.CryptoDepositsInteractor$Companion;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import ip0.s7;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.n1;
import nii.y0;
import nii.z;
import tof.a3;
import vx9.v;
import w6h.g;
import wbg.g0;
import ywc.a;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f294286b;

    public /* synthetic */ n(Object obj2, int i) {
        this.f294285a = i;
        this.f294286b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List listJ;
        Data data;
        afi.a aVarA;
        int i = this.f294285a;
        int i2 = 3;
        int i3 = 26;
        w4l.h hVar = w4l.h.f294642c;
        int i5 = 2;
        TradingAccount.Portfolio portfolio = 0;
        Object obj3 = null;
        portfolio = 0;
        Object obj4 = this.f294286b;
        switch (i) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e.a(update, null, null, null, zi0.c.P(((RevolutShopAddressFlowProvider$OutputData) obj4).f84206a, false, null, 3), null, null, 55);
            case 1:
                del.b portfolioBalance = (del.b) obj2;
                Intrinsics.checkNotNullParameter(portfolioBalance, "portfolioBalance");
                return new d3f.a((wel.e) obj4, portfolioBalance);
            case 2:
                return (w4i.m) obj4;
            case 3:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                z4i.f fVar = (z4i.f) ((bof.r) obj4).f17429b;
                List listC = u.c(new s7("LOADING_TRANSACTION_BREAKDOWN_ITEM", 0, 0, 0, 0, false, null, 126));
                Clause clause = fVar.f319388a.f97175a.f97054h;
                return new cii.b(null, listC, clause != null ? new lw0.a(clause, null, null, null, false, 30) : null);
            case 4:
                n1 it9 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                ((a5k.p) obj4).invoke();
                return Unit.f186387a;
            case 5:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ((pfm.g) obj4).a(it10);
                return Unit.f186387a;
            case 6:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                ((w5k.d) obj4).f295347a.c(command);
                return Boolean.TRUE;
            case 7:
                com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b) obj4;
                x64.m it11 = (x64.m) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                if (!Intrinsics.f(it11, x64.k.f303042a) && !Intrinsics.f(it11, x64.l.f303043a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.l2(new vmf.k(bVar, portfolio, 27), new yi5.b(i3));
                return Unit.f186387a;
            case 8:
                w6h.e eVar = (w6h.e) obj4;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return ((Boolean) pair.f186385a).booleanValue() ? new v0b.b(vzg.a.c(eVar.f295440m, eVar.f295439l.f295271a, n9l.b.SEC_30, (xi0.b) pair.f186386b, 2), eVar, 18) : new go.g(w5h.g.f295274a, 2);
            case 9:
                Function0 it12 = (Function0) obj2;
                g.a aVar = w6h.g.Companion;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (List) ((w6h.g) obj4).f295444a.getValue();
            case 10:
                v6i.g gVar = (v6i.g) obj4;
                List exchangeRates = (List) obj2;
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                qta.a aVar2 = (qta.a) d0.d0(exchangeRates);
                if (aVar2 == null) {
                    return null;
                }
                int i6 = w6i.a.f295447a[gVar.ordinal()];
                if (i6 == 1) {
                    return aVar2.f249041c;
                }
                if (i6 == 2) {
                    return aVar2.d;
                }
                throw new NoWhenBranchMatchedException();
            case 11:
                w72.j jVar = (w72.j) obj4;
                Throwable it13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                yji.l.a1(jVar, jVar.X().d(new y0("ID_ENROLLMENT_SEARCH_ERROR", new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, null, new w65.c(jVar, portfolio, i5), 3);
                return Boolean.TRUE;
            case 12:
                w75.e update2 = (w75.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return w75.e.a(update2, null, null, ((LoanBorrower) obj4).f70138a, 7);
            case 13:
                return (w85.d) obj4;
            case 14:
                del.b it14 = (del.b) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new w88.a((u98.a) obj4, mif.a.Q(it14.f113709b));
            case 15:
                Unit it15 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, ((w96.b) obj4).f295693m);
                return Unit.f186387a;
            case 16:
                w9j.e eVar2 = (w9j.e) obj4;
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new DisclaimerParams((UserCompanyRegion) rVar.f314201a, (wi0.b) rVar.f314202b, ((ec5.b) rVar.f314203c).f124429a == ec5.g.RDAEL, ((jte.d) eVar2.d).c(CryptoDisclaimerApi$Toggles$CryptoBrazilExpansion.f100018c));
            case 17:
                wa4.e eVar3 = (wa4.e) obj4;
                ywc.a result = (ywc.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof ywc.b) {
                    eVar3.l2(new w3k.i(eVar3, ((ywc.b) result).f317414a, portfolio, 16), new yi5.b(i3));
                } else {
                    if (!(result instanceof a.C1767a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar3.n2(new w76.a(eVar3, portfolio, i2), new whi.b(6));
                }
                return Unit.f186387a;
            case 18:
                List raised = (List) obj2;
                Intrinsics.checkNotNullParameter(raised, "raised");
                return ((wae.e) obj4).a(null, raised);
            case 19:
                Unit it16 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (List) ((waj.a) obj4).f295945b.get("CRYPTO_PRE_LAUNCH_MEMORY_KEY");
            case 20:
                wb3.m mVar = (wb3.m) obj4;
                com.revolut.kompot.common.flow.permissions.a outputData = (com.revolut.kompot.common.flow.permissions.a) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof a.C0596a) {
                    mVar.v2(aii.q.f5292a);
                }
                return Unit.f186387a;
            case 21:
                lbf.f fVar2 = (lbf.f) obj4;
                List list = (List) obj2;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z = false;
                } else {
                    Iterator it17 = list.iterator();
                    while (it17.hasNext()) {
                        if (((lbf.m) it17.next()).f193681b == fVar2) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                lbf.p addOn = (lbf.p) obj2;
                Intrinsics.checkNotNullParameter(addOn, "addOn");
                rbf.d dVar = ((wbf.c) obj4).f296145b;
                String addOnId = addOn.f193684a.f193680a;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(addOnId, "addOnId");
                return dVar.f253048j.e(addOnId, w4l.i.f294643c);
            case 23:
                wbf.g gVar2 = (wbf.g) obj4;
                Optional tradingAccount = (Optional) obj2;
                Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
                TradingAccount tradingAccount2 = (TradingAccount) gj7.b.m(tradingAccount);
                if (tradingAccount2 != null && (listJ = tradingAccount2.J()) != null) {
                    Iterator it18 = listJ.iterator();
                    while (true) {
                        if (it18.hasNext()) {
                            Object next = it18.next();
                            if (((TradingAccount.Portfolio) next).f105211b == com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE) {
                                obj3 = next;
                            }
                        }
                    }
                    portfolio = (TradingAccount.Portfolio) obj3;
                }
                if (portfolio == 0) {
                    return zi0.c.i(wbf.d.NONE);
                }
                ybl.d dVar2 = gVar2.f296148b;
                String string = portfolio.f105210a.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return nim.a.v(((y) dVar2).e(string, hVar), new w6h.f(21));
            case 24:
                BedOptionSelection bedOptionSelection = (BedOptionSelection) obj4;
                g0 update3 = (g0) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Data data2 = update3.f296168a;
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        afi.a aVar3 = (afi.a) content;
                        List list2 = aVar3.f;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (Object obj5 : list2) {
                            if (Intrinsics.f(((BedOptionSelection) obj5).f98090a, bedOptionSelection.f98090a)) {
                                obj5 = bedOptionSelection;
                            }
                            arrayList.add(obj5);
                        }
                        aVarA = afi.a.a(aVar3, arrayList, null, null, null, null, null, YearClass.CLASS_2015);
                    } else {
                        aVarA = null;
                    }
                    data = new Data(aVarA, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return g0.a(update3, data, null, null, null, null, false, false, null, null, null, null, null, null, 8190);
            case 25:
                a3 transaction = (a3) obj2;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                fbj.a aVar4 = ((wbj.f) obj4).f296236q;
                CryptoDepositsInteractor$Companion cryptoDepositsInteractor$Companion = fbj.a.Companion;
                return nim.a.v(aVar4.f(transaction, hVar), new aqd.g(transaction, 15));
            case 26:
                String receiverUsername = (String) obj2;
                Intrinsics.checkNotNullParameter(receiverUsername, "receiverUsername");
                return (kbk.i) v1.c.s("PREFIX_PLAN_GIFTING_ELIGIBILITY_KEY_", receiverUsername, ((wbk.b) obj4).f296241b);
            case 27:
                String giftId = (String) obj2;
                Intrinsics.checkNotNullParameter(giftId, "giftId");
                return (kbk.j) v1.c.s("KEY_RECEIVER_INTRO_", giftId, ((wbk.h) obj4).f296246b);
            case 28:
                jx1.g outputData2 = (jx1.g) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                ((v) obj4).invoke(outputData2);
                return Unit.f186387a;
            default:
                LocalDateTime it19 = (LocalDateTime) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.plus((TemporalAmount) obj4);
        }
    }
}
