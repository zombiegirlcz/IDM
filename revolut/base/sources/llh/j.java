package llh;

import androidx.sqlite.SQLiteConnection;
import bs9.s;
import c12.k0;
import c12.n0;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.feature.apm.bills.postal_check.impl.ui.PostalCheckFlowContract$Step;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData;
import com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.CassAccountSwitchingFlowContract$Step;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.credit.card.impl.ui.repay.pse.flow.CreditCardPseRepayFlowContract$Step;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.FreelancerAcquiringOrderFiltersScreenContract$ModalStep;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.feature.payees.impl.ui.OwnerType;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import com.revolut.feature.payees.impl.ui.flow.PayeesFlowContract$Step;
import com.revolut.feature.payments.groups.impl.ui_chat.flow.GroupChatFlowContract$Step;
import com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.ReasonForTransferFlowContract$ReasonForTransferProcessState;
import com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.ReasonForTransferFlowContract$State;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.SpendingAnalyticsAccount;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import he3.m;
import he3.p;
import he3.t;
import ip0.ep0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.Sequence;
import l5i.q;
import lmb.n;
import lu5.r;
import nkm.y;
import org.jmrtd.cbeff.ISO781611;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import tof.ac;
import tof.cc;
import tof.fc;
import tof.i7;
import tof.na;
import tof.p8;
import tof.q7;
import tof.q8;
import tof.qb;
import tof.v6;
import tof.va;
import tof.w6;
import tof.xa;
import tof.y6;
import tof.za;
import zhm.a1;
import zhm.d0;
import zhm.q0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f196822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f196823c;

    public /* synthetic */ j(Object obj2, Object obj3, int i) {
        this.f196821a = i;
        this.f196823c = obj2;
        this.f196822b = obj3;
    }

    private final Object a(Object obj2) {
        na naVar;
        va vaVar;
        na naVarB;
        int i;
        r rVar = (r) this.f196823c;
        Lazy lazy = rVar.f200041c;
        Lazy lazy2 = rVar.d;
        ft5.a params = (ft5.a) this.f196822b;
        Sequence pockets = (Sequence) obj2;
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(params, "params");
        nkm.h hVarN = y.n(pockets, new lsl.b(9));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        nkm.g gVar = new nkm.g(hVarN);
        while (gVar.hasNext()) {
            Object next = gVar.next();
            if (((io3.d) next).e == io3.l.CRYPTO_EXCHANGE) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        ArrayList cryptoPockets = new ArrayList();
        ArrayList fiatPockets = new ArrayList();
        for (Object obj3 : arrayList) {
            if (r6.b.B(xi0.b.Companion, ((io3.d) obj3).f163147c)) {
                cryptoPockets.add(obj3);
            } else {
                fiatPockets.add(obj3);
            }
        }
        ArrayList stablecoinPockets = new ArrayList();
        for (Object obj4 : cryptoPockets) {
            xi0.a aVar = xi0.b.Companion;
            String str = ((io3.d) obj4).f163147c;
            aVar.getClass();
            if (cp5.d.D(xi0.a.a(str))) {
                stablecoinPockets.add(obj4);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj5 : arrayList2) {
            if (((io3.d) obj5).e == io3.l.STAKING) {
                arrayList3.add(obj5);
            } else {
                arrayList4.add(obj5);
            }
        }
        ArrayList pockets2 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj6 : arrayList4) {
            if (((io3.d) obj6).e == io3.l.REVX_FIAT) {
                pockets2.add(obj6);
            } else {
                arrayList5.add(obj6);
            }
        }
        ArrayList stablecoinPockets2 = new ArrayList();
        ArrayList cryptoNonStablecoinsNonStakingPockets = new ArrayList();
        for (Object obj7 : arrayList5) {
            xi0.a aVar2 = xi0.b.Companion;
            String str2 = ((io3.d) obj7).f163147c;
            aVar2.getClass();
            if (cp5.d.D(xi0.a.a(str2))) {
                stablecoinPockets2.add(obj7);
            } else {
                cryptoNonStablecoinsNonStakingPockets.add(obj7);
            }
        }
        i7.c cVar = i7.Companion;
        aim.e eVarB = u.b();
        Intrinsics.checkNotNullParameter(cryptoPockets, "cryptoPockets");
        Intrinsics.checkNotNullParameter(stablecoinPockets, "stablecoinPockets");
        Intrinsics.checkNotNullParameter(fiatPockets, "fiatPockets");
        ArrayList arrayList6 = new ArrayList(w.t(cryptoPockets, 10));
        Iterator it8 = cryptoPockets.iterator();
        while (it8.hasNext()) {
            arrayList6.add(((io3.d) it8.next()).f163145a);
        }
        Set setI1 = d0.i1(arrayList6);
        ArrayList arrayList7 = new ArrayList(w.t(stablecoinPockets, 10));
        Iterator it9 = stablecoinPockets.iterator();
        while (it9.hasNext()) {
            arrayList7.add(((io3.d) it9.next()).f163145a);
        }
        Set setI12 = d0.i1(arrayList7);
        Set setK = a1.k(setI1, setI12);
        ArrayList arrayList8 = new ArrayList(w.t(fiatPockets, 10));
        Iterator it10 = fiatPockets.iterator();
        while (it10.hasNext()) {
            arrayList8.add(((io3.d) it10.next()).f163145a);
        }
        Set setI13 = d0.i1(arrayList8);
        i7.c cVar2 = i7.Companion;
        xa xaVar = new xa(io3.l.CRYPTO_EXCHANGE);
        y6 y6Var = y6.EXCHANGE;
        cVar2.getClass();
        q7 q7VarA = i7.c.a(i7.c.d(y6Var), new va(setI1), new p8(setI13));
        cc ccVarD = i7.c.d(y6Var);
        va vaVar2 = new va(setK);
        p8 p8Var = new p8(setK);
        i7.f fVar = i7.f.f272812a;
        eVarB.add(i7.c.a(xaVar, i7.c.b(q7VarA, i7.c.a(ccVarD, vaVar2, i7.c.b(i7.c.a(p8Var, fVar), new p8(setI12))), i7.c.a(i7.c.d(y6Var), new va(setI12), new p8(setI12), fVar), i7.c.a(i7.c.d(y6.TOPUP, y6.TRANSFER), new va(a1.l(setI13, setI1))))));
        ArrayList arrayList9 = new ArrayList(w.t(arrayList5, 10));
        Iterator it11 = arrayList5.iterator();
        while (it11.hasNext()) {
            arrayList9.add(((io3.d) it11.next()).f163145a);
        }
        va vaVar3 = new va(d0.i1(arrayList9));
        i7.c cVar3 = i7.Companion;
        y6 y6Var2 = y6.EXCHANGE;
        cVar3.getClass();
        na naVarB2 = fc.b(i7.c.a(i7.o.f272821a, i7.c.d(y6Var2)));
        na naVarB3 = fc.b(i7.c.a(new q8(io3.l.STAKING), i7.c.d(y6Var2)));
        na naVarB4 = fc.b(new cc(u.c(y6.REWARD)));
        na naVarB5 = fc.b(i7.c.d(y6.REVX_TRANSFER, y6.REVX_EXCHANGE));
        if (((Boolean) lazy2.getValue()).booleanValue()) {
            naVar = naVarB2;
            vaVar = vaVar3;
            naVarB = fc.b(i7.c.a(i7.c.d(y6.TRANSFER), new q8(io3.l.LOCKED_GIFT)));
        } else {
            naVar = naVarB2;
            vaVar = vaVar3;
            naVarB = null;
        }
        cc ccVarD2 = i7.c.d(y6Var2);
        na naVar2 = naVarB;
        ArrayList arrayList10 = new ArrayList(w.t(arrayList5, 10));
        Iterator it12 = arrayList5.iterator();
        while (it12.hasNext()) {
            arrayList10.add(((io3.d) it12.next()).f163145a);
        }
        eVarB.add(i7.c.a(vaVar, naVar, naVarB3, naVarB4, naVarB5, naVar2, fc.b(i7.c.a(ccVarD2, new p8(d0.i1(arrayList10)), new q8(io3.l.CURRENT)))));
        if (((Boolean) lazy.getValue()).booleanValue()) {
            Intrinsics.checkNotNullParameter(stablecoinPockets2, "stablecoinPockets");
            Intrinsics.checkNotNullParameter(cryptoNonStablecoinsNonStakingPockets, "cryptoNonStablecoinsNonStakingPockets");
            i7.c cVar4 = i7.Companion;
            ArrayList arrayList11 = new ArrayList(w.t(cryptoNonStablecoinsNonStakingPockets, 10));
            Iterator it13 = cryptoNonStablecoinsNonStakingPockets.iterator();
            while (it13.hasNext()) {
                arrayList11.add(((io3.d) it13.next()).f163145a);
            }
            va vaVar4 = new va(d0.i1(arrayList11));
            i7.c cVar5 = i7.Companion;
            y6[] y6VarArr = {y6.EXCHANGE};
            cVar5.getClass();
            cc ccVarD3 = i7.c.d(y6VarArr);
            q8 q8Var = new q8(io3.l.CURRENT);
            ArrayList arrayList12 = new ArrayList(w.t(cryptoNonStablecoinsNonStakingPockets, 10));
            Iterator it14 = cryptoNonStablecoinsNonStakingPockets.iterator();
            while (it14.hasNext()) {
                arrayList12.add(((io3.d) it14.next()).f163145a);
            }
            q7 q7VarA2 = i7.c.a(new p8(d0.i1(arrayList12)), fVar);
            ArrayList arrayList13 = new ArrayList(w.t(stablecoinPockets2, 10));
            Iterator it15 = stablecoinPockets2.iterator();
            while (it15.hasNext()) {
                arrayList13.add(((io3.d) it15.next()).f163145a);
            }
            i7[] i7VarArr = {vaVar4, ccVarD3, q8Var, i7.c.b(q7VarA2, new p8(d0.i1(arrayList13)))};
            cVar4.getClass();
            q7 q7VarA3 = i7.c.a(i7VarArr);
            i7.c cVar6 = i7.Companion;
            ArrayList arrayList14 = new ArrayList(w.t(stablecoinPockets2, 10));
            Iterator it16 = stablecoinPockets2.iterator();
            while (it16.hasNext()) {
                arrayList14.add(((io3.d) it16.next()).f163145a);
            }
            va vaVar5 = new va(d0.i1(arrayList14));
            i7.c cVar7 = i7.Companion;
            y6[] y6VarArr2 = {y6.EXCHANGE};
            cVar7.getClass();
            cc ccVarD4 = i7.c.d(y6VarArr2);
            q8 q8Var2 = new q8(io3.l.CURRENT);
            ArrayList arrayList15 = new ArrayList(w.t(stablecoinPockets2, 10));
            Iterator it17 = stablecoinPockets2.iterator();
            while (it17.hasNext()) {
                arrayList15.add(((io3.d) it17.next()).f163145a);
            }
            i7[] i7VarArr2 = {vaVar5, ccVarD4, q8Var2, i7.c.b(i7.c.a(new p8(d0.i1(arrayList15)), fVar))};
            cVar6.getClass();
            eVarB.add(i7.c.b(q7VarA3, i7.c.a(i7VarArr2)));
        } else {
            i7.c cVar8 = i7.Companion;
            y6[] y6VarArr3 = {y6.EXCHANGE};
            cVar8.getClass();
            cc ccVarD5 = i7.c.d(y6VarArr3);
            ArrayList arrayList16 = new ArrayList(w.t(arrayList5, 10));
            Iterator it18 = arrayList5.iterator();
            while (it18.hasNext()) {
                arrayList16.add(((io3.d) it18.next()).f163145a);
            }
            va vaVar6 = new va(d0.i1(arrayList16));
            ArrayList arrayList17 = new ArrayList(w.t(arrayList5, 10));
            Iterator it19 = arrayList5.iterator();
            while (it19.hasNext()) {
                arrayList17.add(((io3.d) it19.next()).f163145a);
            }
            eVarB.add(i7.c.a(ccVarD5, vaVar6, new p8(d0.i1(arrayList17)), new q8(io3.l.CURRENT), fVar));
        }
        i7.c cVar9 = i7.Companion;
        ArrayList arrayList18 = new ArrayList(w.t(arrayList3, 10));
        Iterator it20 = arrayList3.iterator();
        while (it20.hasNext()) {
            arrayList18.add(((io3.d) it20.next()).f163145a);
        }
        va vaVar7 = new va(d0.i1(arrayList18));
        cc ccVar = new cc(u.c(y6.EXCHANGE));
        i7.c cVar10 = i7.Companion;
        y6[] y6VarArr4 = {y6.COLLECTION_EXCHANGE};
        cVar10.getClass();
        na naVarB6 = fc.b(i7.c.d(y6VarArr4));
        y6 y6Var3 = y6.REWARD;
        i7[] i7VarArr3 = {vaVar7, ccVar, naVarB6, fc.b(new cc(u.c(y6Var3)))};
        cVar9.getClass();
        eVarB.add(i7.c.a(i7VarArr3));
        List listD1 = d0.d1(arrayList2);
        cc ccVar2 = new cc(u.c(y6Var3));
        List list = listD1;
        ArrayList arrayList19 = new ArrayList(w.t(list, 10));
        Iterator it21 = list.iterator();
        while (it21.hasNext()) {
            arrayList19.add(((io3.d) it21.next()).f163145a);
        }
        eVarB.add(i7.c.a(ccVar2, new va(d0.i1(arrayList19)), fc.b(i7.d0.f272810a)));
        if (((Boolean) lazy2.getValue()).booleanValue() && params.f137937c) {
            i7.c cVar11 = i7.Companion;
            i7[] i7VarArr4 = {new cc(u.c(y6.REWARD)), new xa(io3.l.LOCKED_GIFT)};
            cVar11.getClass();
            eVarB.add(i7.c.a(i7VarArr4));
        }
        i7.c cVar12 = i7.Companion;
        cc ccVar3 = new cc(u.c(y6.TOPUP));
        ArrayList arrayList20 = new ArrayList(w.t(arrayList3, 10));
        Iterator it22 = arrayList3.iterator();
        while (it22.hasNext()) {
            arrayList20.add(((io3.d) it22.next()).f163145a);
        }
        i7[] i7VarArr5 = {ccVar3, new va(d0.i1(arrayList20)), fc.b(new za("revx_withdrawal"))};
        cVar12.getClass();
        eVarB.add(i7.c.a(i7VarArr5));
        i7.c cVar13 = i7.Companion;
        cc ccVar4 = new cc(u.c(y6.TOPUP));
        ArrayList arrayList21 = new ArrayList(w.t(pockets2, 10));
        Iterator it23 = pockets2.iterator();
        while (it23.hasNext()) {
            arrayList21.add(((io3.d) it23.next()).f163145a);
        }
        i7[] i7VarArr6 = {ccVar4, new va(d0.i1(arrayList21))};
        cVar13.getClass();
        eVarB.add(i7.c.a(i7VarArr6));
        i7.c cVar14 = i7.Companion;
        i7[] i7VarArr7 = {new cc(u.c(y6.TOPUP)), new ac(w6.CRYPTO_WALLET)};
        cVar14.getClass();
        eVarB.add(i7.c.a(i7VarArr7));
        eVarB.add(i7.c.d(y6.COLLECTION_EXCHANGE));
        eVarB.add(i7.c.d(y6.CRYPTO_WITHDRAWAL));
        i7 i7Var = params.f137935a;
        if (i7Var != null) {
            eVarB.add(i7Var);
        }
        if (((Boolean) lazy.getValue()).booleanValue()) {
            Intrinsics.checkNotNullParameter(stablecoinPockets2, "stablecoinPockets");
            Intrinsics.checkNotNullParameter(cryptoNonStablecoinsNonStakingPockets, "cryptoNonStablecoinsNonStakingPockets");
            Intrinsics.checkNotNullParameter(pockets2, "revXFiatPockets");
            qb qbVarC = i7.c.c(v6.COMPLETED);
            ArrayList arrayList22 = new ArrayList(w.t(cryptoNonStablecoinsNonStakingPockets, 10));
            Iterator it24 = cryptoNonStablecoinsNonStakingPockets.iterator();
            while (it24.hasNext()) {
                arrayList22.add(((io3.d) it24.next()).f163145a);
            }
            va vaVar8 = new va(d0.i1(arrayList22));
            i7.c cVar15 = i7.Companion;
            y6[] y6VarArr5 = {y6.REVX_EXCHANGE};
            cVar15.getClass();
            cc ccVarD6 = i7.c.d(y6VarArr5);
            q8 q8Var3 = new q8(io3.l.CURRENT);
            ArrayList arrayList23 = new ArrayList(w.t(cryptoNonStablecoinsNonStakingPockets, 10));
            Iterator it25 = cryptoNonStablecoinsNonStakingPockets.iterator();
            while (it25.hasNext()) {
                arrayList23.add(((io3.d) it25.next()).f163145a);
            }
            q7 q7VarA4 = i7.c.a(new p8(d0.i1(arrayList23)), fVar);
            ArrayList arrayList24 = new ArrayList(w.t(stablecoinPockets2, 10));
            Iterator it26 = stablecoinPockets2.iterator();
            while (it26.hasNext()) {
                arrayList24.add(((io3.d) it26.next()).f163145a);
            }
            q7 q7VarA5 = i7.c.a(qbVarC, vaVar8, ccVarD6, q8Var3, i7.c.b(q7VarA4, new p8(d0.i1(arrayList24))));
            i7.c cVar16 = i7.Companion;
            v6[] v6VarArr = {v6.COMPLETED};
            cVar16.getClass();
            qb qbVarC2 = i7.c.c(v6VarArr);
            ArrayList arrayList25 = new ArrayList(w.t(stablecoinPockets2, 10));
            Iterator it27 = stablecoinPockets2.iterator();
            while (it27.hasNext()) {
                arrayList25.add(((io3.d) it27.next()).f163145a);
            }
            va vaVar9 = new va(d0.i1(arrayList25));
            i7.c cVar17 = i7.Companion;
            y6[] y6VarArr6 = {y6.REVX_EXCHANGE};
            cVar17.getClass();
            cc ccVarD7 = i7.c.d(y6VarArr6);
            q8 q8Var4 = new q8(io3.l.CURRENT);
            ArrayList arrayList26 = new ArrayList(w.t(stablecoinPockets2, 10));
            Iterator it28 = stablecoinPockets2.iterator();
            while (it28.hasNext()) {
                arrayList26.add(((io3.d) it28.next()).f163145a);
            }
            q7 q7VarA6 = i7.c.a(qbVarC2, vaVar9, ccVarD7, q8Var4, i7.c.a(new p8(d0.i1(arrayList26)), fVar));
            i7.c cVar18 = i7.Companion;
            v6[] v6VarArr2 = {v6.COMPLETED};
            cVar18.getClass();
            qb qbVarC3 = i7.c.c(v6VarArr2);
            ArrayList arrayListE0 = d0.E0(stablecoinPockets2, cryptoNonStablecoinsNonStakingPockets);
            ArrayList arrayList27 = new ArrayList(w.t(arrayListE0, 10));
            Iterator it29 = arrayListE0.iterator();
            while (it29.hasNext()) {
                arrayList27.add(((io3.d) it29.next()).f163145a);
            }
            va vaVar10 = new va(d0.i1(arrayList27));
            i7.c cVar19 = i7.Companion;
            y6[] y6VarArr7 = {y6.REVX_EXCHANGE};
            cVar19.getClass();
            cc ccVarD8 = i7.c.d(y6VarArr7);
            ArrayList arrayList28 = new ArrayList(w.t(pockets2, 10));
            Iterator it30 = pockets2.iterator();
            while (it30.hasNext()) {
                arrayList28.add(((io3.d) it30.next()).f163145a);
            }
            eVarB.add(i7.c.b(q7VarA5, q7VarA6, i7.c.a(qbVarC3, vaVar10, ccVarD8, new p8(d0.i1(arrayList28)))));
            Intrinsics.checkNotNullParameter(pockets2, "revXFiatPockets");
            i7.c cVar20 = i7.Companion;
            ArrayList arrayList29 = new ArrayList(w.t(pockets2, 10));
            Iterator it31 = pockets2.iterator();
            while (it31.hasNext()) {
                arrayList29.add(((io3.d) it31.next()).f163145a);
            }
            va vaVar11 = new va(d0.i1(arrayList29));
            i7.c cVar21 = i7.Companion;
            y6[] y6VarArr8 = {y6.REVX_TRANSFER};
            cVar21.getClass();
            i7[] i7VarArr8 = {vaVar11, i7.c.b(i7.c.a(i7.c.d(y6VarArr8), i7.c.c(v6.COMPLETED)), i7.c.d(y6.TRANSFER))};
            cVar20.getClass();
            eVarB.add(i7.c.a(i7VarArr8));
            ArrayList cryptoPockets2 = d0.E0(arrayList3, arrayList5);
            Intrinsics.checkNotNullParameter(pockets2, "revXFiatPockets");
            Intrinsics.checkNotNullParameter(cryptoPockets2, "cryptoPockets");
            ArrayList arrayList30 = new ArrayList(w.t(pockets2, 10));
            Iterator it32 = pockets2.iterator();
            while (it32.hasNext()) {
                arrayList30.add(((io3.d) it32.next()).f163145a);
            }
            va vaVar12 = new va(d0.i1(arrayList30));
            i7.c cVar22 = i7.Companion;
            y6[] y6VarArr9 = {y6.EXCHANGE};
            cVar22.getClass();
            cc ccVarD9 = i7.c.d(y6VarArr9);
            qb qbVarC4 = i7.c.c(v6.COMPLETED);
            na naVarB7 = fc.b(i7.c.a(new q8(io3.l.REVX_FIAT), fc.b(fVar)));
            ArrayList arrayList31 = new ArrayList(w.t(cryptoPockets2, 10));
            Iterator it33 = cryptoPockets2.iterator();
            while (it33.hasNext()) {
                arrayList31.add(((io3.d) it33.next()).f163145a);
            }
            eVarB.add(i7.c.a(vaVar12, ccVarD9, qbVarC4, naVarB7, fc.b(new p8(d0.i1(arrayList31)))));
            ArrayList excludedPockets = d0.E0(arrayList5, arrayList3);
            Intrinsics.checkNotNullParameter(excludedPockets, "excludedPockets");
            i7.c cVar23 = i7.Companion;
            ArrayList arrayList32 = new ArrayList(w.t(excludedPockets, 10));
            Iterator it34 = excludedPockets.iterator();
            while (it34.hasNext()) {
                arrayList32.add(((io3.d) it34.next()).f163145a);
            }
            na naVarB8 = fc.b(new va(d0.i1(arrayList32)));
            i7.c cVar24 = i7.Companion;
            y6[] y6VarArr10 = {y6.TRANSFER};
            cVar24.getClass();
            i7[] i7VarArr9 = {naVarB8, i7.c.d(y6VarArr10), new za("revx_topup")};
            cVar23.getClass();
            eVarB.add(i7.c.a(i7VarArr9));
            Intrinsics.checkNotNullParameter(pockets2, "pockets");
            ArrayList arrayList33 = new ArrayList(w.t(pockets2, 10));
            Iterator it35 = pockets2.iterator();
            while (it35.hasNext()) {
                arrayList33.add(((io3.d) it35.next()).f163145a);
            }
            va vaVar13 = new va(d0.i1(arrayList33));
            i7.c cVar25 = i7.Companion;
            y6[] y6VarArr11 = {y6.TOPUP};
            cVar25.getClass();
            eVarB.add(i7.c.a(vaVar13, i7.c.d(y6VarArr11), new za("revx_withdrawal")));
            i = 0;
        } else {
            ArrayList arrayList34 = new ArrayList(w.t(arrayList5, 10));
            Iterator it36 = arrayList5.iterator();
            while (it36.hasNext()) {
                arrayList34.add(((io3.d) it36.next()).f163145a);
            }
            i7[] i7VarArr10 = (i7[]) r.b(arrayList5, u.c(fc.b(i7.c.a(new p8(d0.i1(arrayList34)), new q8(io3.l.CURRENT))))).toArray(new i7[0]);
            q7 q7VarA7 = i7.c.a((i7[]) Arrays.copyOf(i7VarArr10, i7VarArr10.length));
            i7.c cVar26 = i7.Companion;
            ArrayList arrayList35 = new ArrayList(w.t(arrayList5, 10));
            Iterator it37 = arrayList5.iterator();
            while (it37.hasNext()) {
                arrayList35.add(((io3.d) it37.next()).f163145a);
            }
            i7[] i7VarArr11 = (i7[]) r.b(arrayList5, v.k(new p8(d0.i1(arrayList35)), new q8(io3.l.CURRENT), fVar)).toArray(new i7[0]);
            i7[] i7VarArr12 = (i7[]) Arrays.copyOf(i7VarArr11, i7VarArr11.length);
            cVar26.getClass();
            eVarB.addAll(v.k(q7VarA7, i7.c.a(i7VarArr12)));
            i7.c cVar27 = i7.Companion;
            ArrayList arrayList36 = new ArrayList(w.t(pockets2, 10));
            Iterator it38 = pockets2.iterator();
            while (it38.hasNext()) {
                arrayList36.add(((io3.d) it38.next()).f163145a);
            }
            va vaVar14 = new va(d0.i1(arrayList36));
            i7.c cVar28 = i7.Companion;
            y6[] y6VarArr12 = {y6.REVX_TRANSFER};
            cVar28.getClass();
            i7[] i7VarArr13 = {vaVar14, i7.c.b(i7.c.a(i7.c.d(y6VarArr12), i7.c.c(v6.COMPLETED)), i7.c.d(y6.TRANSFER))};
            cVar27.getClass();
            eVarB.add(i7.c.a(i7VarArr13));
            ArrayList arrayListE02 = d0.E0(arrayList3, arrayList5);
            ArrayList arrayList37 = new ArrayList(w.t(pockets2, 10));
            Iterator it39 = pockets2.iterator();
            while (it39.hasNext()) {
                arrayList37.add(((io3.d) it39.next()).f163145a);
            }
            va vaVar15 = new va(d0.i1(arrayList37));
            i7.c cVar29 = i7.Companion;
            y6[] y6VarArr13 = {y6.EXCHANGE};
            cVar29.getClass();
            cc ccVarD10 = i7.c.d(y6VarArr13);
            qb qbVarC5 = i7.c.c(v6.COMPLETED);
            na naVarB9 = fc.b(i7.c.a(new q8(io3.l.REVX_FIAT), fc.b(fVar)));
            ArrayList arrayList38 = new ArrayList(w.t(arrayListE02, 10));
            Iterator it40 = arrayListE02.iterator();
            while (it40.hasNext()) {
                arrayList38.add(((io3.d) it40.next()).f163145a);
            }
            i = 0;
            eVarB.add(i7.c.a(vaVar15, ccVarD10, qbVarC5, naVarB9, fc.b(new p8(d0.i1(arrayList38)))));
        }
        i7[] i7VarArr14 = (i7[]) u.a(eVarB).toArray(new i7[i]);
        i7[] i7VarArr15 = (i7[]) Arrays.copyOf(i7VarArr14, i7VarArr14.length);
        cVar.getClass();
        return i7.c.b(i7VarArr15);
    }

    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.r map;
        efm.r rVarX;
        lzi.f fVar;
        trk.a aVar;
        Data layout;
        ts7.c cVar;
        switch (this.f196821a) {
            case 0:
                l lVar = (l) this.f196822b;
                NaviCommand targetCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(targetCommand, "targetCommand");
                return ((wxk.g) lVar.f196826b).d(targetCommand);
            case 1:
                TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard = (TradingAccountAvailableToOnboard) this.f196823c;
                l lVar2 = (l) this.f196822b;
                NaviCommand targetCommand2 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(targetCommand2, "targetCommand");
                if (com.revolut.shared.feature.wealth.models.trading_accounts.b.f(tradingAccountAvailableToOnboard)) {
                    return ((wxk.g) lVar2.f196826b).c(targetCommand2);
                }
                if (com.revolut.shared.feature.wealth.models.trading_accounts.b.a(tradingAccountAvailableToOnboard)) {
                    return ((wxk.g) lVar2.f196826b).a(targetCommand2);
                }
                if (com.revolut.shared.feature.wealth.models.trading_accounts.b.h(tradingAccountAvailableToOnboard)) {
                    return ((wxk.g) lVar2.f196826b).d(targetCommand2);
                }
                throw new IllegalArgumentException("when trying to launch onboarding for TAA, this " + tradingAccountAvailableToOnboard + " is not TAA account");
            case 2:
                return lm3.a.a((lm3.a) obj2, null, (vm3.c) this.f196823c, (String) this.f196822b, null, null, false, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
            case 3:
                com.revolut.feature.payees.impl.ui.flow.a aVar2 = (com.revolut.feature.payees.impl.ui.flow.a) this.f196823c;
                yki.l lVar3 = (yki.l) this.f196822b;
                rm9.e output = (rm9.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof rm9.d;
                PayeesFlowType.RequireAuthentication requireAuthentication = PayeesFlowType.RequireAuthentication.f78996a;
                if (z) {
                    oki.h.t2(aVar2, lVar3, new PayeesFlowContract$Step.PayeesList(requireAuthentication), true, null, false, 12);
                } else if (output instanceof rm9.c) {
                    oki.h.t2(aVar2, lVar3, new PayeesFlowContract$Step.PayeesList(new PayeesFlowType.Blocked(OwnerType.CurrentUser.f78992a)), true, null, false, 12);
                } else if (output instanceof rm9.b) {
                    oki.h.t2(aVar2, lVar3, new PayeesFlowContract$Step.PayeesAddNew(requireAuthentication), true, null, false, 12);
                } else {
                    if (!(output instanceof rm9.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(aVar2, lVar3, new PayeesFlowContract$Step.PayeesAddNew(new PayeesFlowType.Blocked(((rm9.a) output).f255211a)), true, null, false, 12);
                }
                return Unit.f186387a;
            case 4:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f196823c;
                Function0 function0 = (Function0) this.f196822b;
                til.r it8 = (til.r) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ref$ObjectRef.f186409a = it8;
                function0.invoke();
                return Unit.f186387a;
            case 5:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.f196823c;
                n nVar = (n) this.f196822b;
                d67.u it9 = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                ref$ObjectRef2.f186409a = it9;
                nVar.invoke();
                return Unit.f186387a;
            case 6:
                lmd.g gVar = (lmd.g) this.f196823c;
                wsg.n nVar2 = gVar.d;
                AnalyticsAccount analyticsAccount = (AnalyticsAccount) this.f196822b;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                p periodPreferences = (p) pair.f186385a;
                Set pocketsIds = (Set) pair.f186386b;
                Interval intervalB = ee3.a.b(periodPreferences, jli.b.i(((l80.f) gVar.f196965j).e()));
                Intrinsics.checkNotNullParameter(intervalB, "<this>");
                LocalDate localDateMinusDays = new LocalDate(intervalB.getStartMillis()).minusDays(1);
                Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
                Interval intervalB2 = ee3.a.b(periodPreferences, localDateMinusDays);
                if (analyticsAccount instanceof AnalyticsAccount.Joint) {
                    map = te0.w.h(((AnalyticsAccount.Joint) analyticsAccount).getF99182a().f51412a);
                } else if (analyticsAccount instanceof AnalyticsAccount.Savings.JointAll) {
                    map = te0.w.h(((AnalyticsAccount.Savings.JointAll) analyticsAccount).f99198a.f51412a);
                } else if (analyticsAccount instanceof AnalyticsAccount.Savings.JointIndividual) {
                    map = te0.w.h(((AnalyticsAccount.Savings.JointIndividual) analyticsAccount).f99199a.f51412a);
                } else if ((analyticsAccount instanceof AnalyticsAccount.Personal) || (analyticsAccount instanceof AnalyticsAccount.Linked) || (analyticsAccount instanceof AnalyticsAccount.Pro) || (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalAll) || (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalIndividual)) {
                    map = gVar.e.d.c().n().map(new g(10, new llb.e(9)));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                } else if (analyticsAccount instanceof AnalyticsAccount.Junior) {
                    map = te0.w.h(((AnalyticsAccount.Junior) analyticsAccount).getF99186a());
                } else {
                    if (!(analyticsAccount instanceof AnalyticsAccount.Savings.JuniorSaving)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    map = te0.w.h(((AnalyticsAccount.Savings.JuniorSaving) analyticsAccount).f99202b);
                }
                efm.r rVarSwitchMap = map.switchMap(new g(8, new kwg.e(gVar, pocketsIds, intervalB2, intervalB, analyticsAccount, 1)));
                Intrinsics.h(rVarSwitchMap);
                xld.f fVar2 = gVar.f196960a;
                AccountId accountId = com.revolut.retail.feature.api.a.a(analyticsAccount);
                lmd.j jVar = (lmd.j) fVar2;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(pocketsIds, "pocketsIds");
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                Intrinsics.checkNotNullParameter(periodPreferences, "periodPreferences");
                DateTime dateTimeNow = DateTime.now();
                LocalDate localDate = dateTimeNow.toLocalDate();
                Interval interval = new Interval(dateTimeNow.minusDays(91), dateTimeNow);
                m mVar = new m(1, t.SAME_DAY);
                SpendingAnalyticsAccount spendingAnalyticsAccountB = com.revolut.retail.feature.api.a.b(accountId);
                q qVar = jVar.d;
                CategorisationFilter categorisationFilter = new CategorisationFilter(he3.d.SPENDINGS, new CategorisationFilter.Scope.PocketsIdSet(pocketsIds), interval, null, null, null, null, null, null, null, 1016);
                AnalyticsAccountsSelection.INSTANCE.getClass();
                akg.n nVarA = qVar.a(new ge3.c(categorisationFilter, AnalyticsAccountsSelection.Companion.a(spendingAnalyticsAccountB), (Priority.HIGH) null, 12));
                kotlin.coroutines.g gVar2 = kotlin.coroutines.g.f186406a;
                efm.r map2 = rd0.e.c(nVarA, gVar2).map(new g(21, new llb.e(14)));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                efm.r rVarDistinctUntilChanged = m70.a.g(map2, null, new lk7.m(25), 1).map(new g(16, new j(jVar, localDate, 7))).switchMap(new g(17, new ja3.d(mVar, localDate, jVar, pocketsIds, 17))).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                efm.r rVarSwitchMap2 = m70.a.g(rd0.e.c(jVar.e.a(), gVar2), null, new lk7.m(22), 1).switchMap(new g(19, new li8.n(jVar, 5, periodPreferences, accountId)));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
                efm.r map3 = te0.w.l(rVarSwitchMap2, rVarDistinctUntilChanged).map(new g(20, new llb.e(13)));
                Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
                if ((analyticsAccount instanceof AnalyticsAccount.Joint) || (analyticsAccount instanceof AnalyticsAccount.Linked) || (analyticsAccount instanceof AnalyticsAccount.Personal) || (analyticsAccount instanceof AnalyticsAccount.Pro) || (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalAll) || (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalIndividual) || (analyticsAccount instanceof AnalyticsAccount.Savings.JointAll) || (analyticsAccount instanceof AnalyticsAccount.Savings.JointIndividual)) {
                    rVarX = nVar2.x(com.revolut.retail.feature.api.a.a(analyticsAccount)).x();
                    Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                } else {
                    boolean z3 = analyticsAccount instanceof AnalyticsAccount.Junior;
                    w4l.h hVar = w4l.h.f294642c;
                    if (z3) {
                        rVarX = m70.a.g(nim.a.w(nVar2.Z(((AnalyticsAccount.Junior) analyticsAccount).getF99186a(), hVar), new llb.e(11)), null, new lk7.m(18), 1);
                    } else {
                        if (!(analyticsAccount instanceof AnalyticsAccount.Savings.JuniorSaving)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rVarX = m70.a.g(nim.a.w(nVar2.Z(((AnalyticsAccount.Savings.JuniorSaving) analyticsAccount).f99202b, hVar), new llb.e(11)), null, new lk7.m(18), 1);
                    }
                }
                return te0.w.m(rVarSwitchMap, map3, rVarX).map(new g(9, new li8.n(gVar, intervalB, intervalB2, periodPreferences, 4)));
            case 7:
                lmd.j jVar2 = (lmd.j) this.f196823c;
                LocalDate localDate2 = (LocalDate) this.f196822b;
                he3.a dailySpending = (he3.a) obj2;
                Intrinsics.checkNotNullParameter(dailySpending, "dailySpending");
                Intrinsics.h(localDate2);
                jVar2.getClass();
                kotlin.ranges.c cVarL = kotlin.ranges.f.l(90, 0);
                ArrayList arrayList = new ArrayList(w.t(cVarL, 10));
                vim.f it10 = cVarL.iterator();
                while (it10.f289625c) {
                    Long l2 = (Long) dailySpending.f151555b.get(localDate2.minusDays(it10.nextInt()));
                    arrayList.add(Long.valueOf(l2 != null ? l2.longValue() : 0L));
                }
                return arrayList;
            case 8:
                CassAccountSwitchingFlowContract$Step.TargetAccountSelection targetAccountSelection = (CassAccountSwitchingFlowContract$Step.TargetAccountSelection) this.f196823c;
                com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar = (com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b) this.f196822b;
                eq2.f outputData = (eq2.f) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                oki.h.t2(bVar, bVar.f64010t, new CassAccountSwitchingFlowContract$Step.SourceAccountForm(targetAccountSelection.f64004a, outputData.f128228a), true, null, false, 12);
                return Unit.f186387a;
            case 9:
                com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar2 = (com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b) this.f196823c;
                CassAccountSwitchingFlowContract$Step.SwitchPreferenceSelection switchPreferenceSelection = (CassAccountSwitchingFlowContract$Step.SwitchPreferenceSelection) this.f196822b;
                com.revolut.feature.full_screen_prompt.c result = (com.revolut.feature.full_screen_prompt.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                Continuation continuation = null;
                if (result instanceof c.C0497c) {
                    bVar2.l2(new ll6.i(bVar2, wn2.d.FULL, continuation, 15), new yi5.b(26));
                } else if (result instanceof c.d) {
                    bVar2.l2(new ll6.i(bVar2, wn2.d.PARTIAL, continuation, 15), new yi5.b(26));
                } else if (result instanceof c.a) {
                    if (switchPreferenceSelection.f64003a || (bVar2.o instanceof BankAccountSwitchingFlowInputData.NewRequest)) {
                        oki.h.D2(bVar2.f64010t);
                    } else {
                        oki.h.t2(bVar2, bVar2.f64010t, CassAccountSwitchingFlowContract$Step.Entry.f63992a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                    }
                } else if (!(result instanceof d67.h) && !(result instanceof c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 10:
                CassAccountSwitchingFlowContract$Step.SwitchDateSelection switchDateSelection = (CassAccountSwitchingFlowContract$Step.SwitchDateSelection) this.f196823c;
                com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar3 = (com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b) this.f196822b;
                hp2.g outputData2 = (hp2.g) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                oki.h.t2(bVar3, bVar3.f64010t, new CassAccountSwitchingFlowContract$Step.Review(switchDateSelection.f64000a, switchDateSelection.f64001b, switchDateSelection.f64002c, switchDateSelection.d, outputData2.f154389a), true, null, false, 12);
                return Unit.f186387a;
            case 11:
                com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar4 = (com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b) this.f196823c;
                CassAccountSwitchingFlowContract$Step.SourceAccountForm sourceAccountForm = (CassAccountSwitchingFlowContract$Step.SourceAccountForm) this.f196822b;
                do2.h outputData3 = (do2.h) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                oki.h.t2(bVar4, bVar4.f64010t, new CassAccountSwitchingFlowContract$Step.CardDigitsInput(sourceAccountForm.f63998a, outputData3.f116377a, outputData3.f116378b, sourceAccountForm.f63999b), true, null, false, 12);
                return Unit.f186387a;
            case 12:
                CassAccountSwitchingFlowContract$Step.CardDigitsInput cardDigitsInput = (CassAccountSwitchingFlowContract$Step.CardDigitsInput) this.f196823c;
                com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar5 = (com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b) this.f196822b;
                bo2.e outputData4 = (bo2.e) obj2;
                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                int i = lp2.e.f198922b[cardDigitsInput.f63989a.ordinal()];
                if (i == 1) {
                    oki.h.t2(bVar5, bVar5.f64010t, new CassAccountSwitchingFlowContract$Step.Review(cardDigitsInput.f63989a, cardDigitsInput.f63990b, cardDigitsInput.d, outputData4.f17275a, null), true, null, false, 12);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(bVar5, bVar5.f64010t, new CassAccountSwitchingFlowContract$Step.SwitchDateSelection(cardDigitsInput.f63989a, cardDigitsInput.f63990b, cardDigitsInput.d, outputData4.f17275a), true, null, false, 12);
                }
                return Unit.f186387a;
            case 13:
                lp8.e eVar = (lp8.e) this.f196823c;
                String str = (String) this.f196822b;
                Data tasksData = (Data) obj2;
                Intrinsics.checkNotNullParameter(tasksData, "tasksData");
                Map map4 = (Map) tasksData.getContent();
                pfm.m mVar2 = pfm.m.f235744a;
                if (map4 == null) {
                    Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                } else {
                    w4l.f fVar3 = eVar.e;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map4.entrySet()) {
                        if (Intrinsics.f((String) entry.getKey(), str)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    fVar3.j(str, linkedHashMap);
                    Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                }
                return mVar2;
            case 14:
                lpd.j jVar3 = (lpd.j) this.f196823c;
                ep0 ep0Var = (ep0) this.f196822b;
                lpd.l updateState = (lpd.l) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                switch (lpd.q.f198985c[ep0Var.ordinal()]) {
                    case 1:
                        fVar = lzi.f.MONDAY;
                        break;
                    case 2:
                        fVar = lzi.f.TUESDAY;
                        break;
                    case 3:
                        fVar = lzi.f.WEDNESDAY;
                        break;
                    case 4:
                        fVar = lzi.f.THURSDAY;
                        break;
                    case 5:
                        fVar = lzi.f.FRIDAY;
                        break;
                    case 6:
                        fVar = lzi.f.SATURDAY;
                        break;
                    case 7:
                        fVar = lzi.f.SUNDAY;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                lzi.g cycle = jVar3.f198975a;
                Intrinsics.checkNotNullParameter(cycle, "cycle");
                return lpd.l.a(updateState, new lpd.j(cycle, fVar));
            case 15:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f196823c;
                pp5.d dVar = (pp5.d) this.f196822b;
                dii.g result2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                ref$BooleanRef.f186407a = true;
                dVar.invoke(result2);
                return Unit.f186387a;
            case 16:
                com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.a aVar3 = (com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.a) this.f196823c;
                krf.c cVar2 = (krf.c) this.f196822b;
                dsf.d output2 = (dsf.d) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof dsf.c) {
                    ReasonForTransferFlowContract$State reasonForTransferFlowContract$State = (ReasonForTransferFlowContract$State) aVar3.A2().f98429a;
                    ((ReasonForTransferFlowContract$State) aVar3.A2().f98429a).f92203a.getClass();
                    ReasonForTransferFlowContract$ReasonForTransferProcessState processState = new ReasonForTransferFlowContract$ReasonForTransferProcessState(true);
                    reasonForTransferFlowContract$State.getClass();
                    Intrinsics.checkNotNullParameter(processState, "processState");
                    aVar3.L2(new ReasonForTransferFlowContract$State(processState));
                    aVar3.l2(new ll6.i(aVar3, cVar2, null, 19), new yi5.b(26));
                } else if (!(output2 instanceof dsf.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 17:
                ((lqj.c) this.f196823c).f199319b.insert((SQLiteConnection) obj2, (Iterable) this.f196822b);
                return null;
            case 18:
                com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar6 = (com.revolut.feature.apm.bills.postal_check.impl.ui.b) this.f196823c;
                PostalCheckFlowContract$Step.Form form = (PostalCheckFlowContract$Step.Form) this.f196822b;
                mr1.f result3 = (mr1.f) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                bVar6.L2(form.f61515a, result3.f208042a);
                return Unit.f186387a;
            case 19:
                com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar7 = (com.revolut.feature.apm.bills.postal_check.impl.ui.b) this.f196823c;
                PostalCheckFlowContract$Step.TermsAndConditions termsAndConditions = (PostalCheckFlowContract$Step.TermsAndConditions) this.f196822b;
                n0 result4 = (n0) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (result4 instanceof k0) {
                    bVar7.l2(new com.revolut.feature.apm.bills.postal_check.impl.ui.a(bVar7, termsAndConditions, null), new yi5.b(26));
                } else {
                    oki.h.D2(bVar7.u);
                }
                return Unit.f186387a;
            case 20:
                lr9.j jVar4 = (lr9.j) this.f196823c;
                String str2 = (String) this.f196822b;
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                String str3 = user.f116414l;
                if (str3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                mv9.k kVar = jVar4.f199453c;
                dv9.k conversation = new dv9.k(str3, str2);
                kVar.getClass();
                Intrinsics.checkNotNullParameter(conversation, "conversation");
                efm.b bVarIgnoreElements = kVar.c(ev9.a.REMOTE_SINGLE_FETCH, conversation).ignoreElements();
                Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                return bVarIgnoreElements;
            case 21:
                lr9.p pVar = (lr9.p) this.f196823c;
                ar9.r rVar = (ar9.r) this.f196822b;
                List groupMembers = (List) obj2;
                Intrinsics.checkNotNullParameter(groupMembers, "groupMembers");
                r10.f fVar4 = pVar.f199469h;
                Intrinsics.h(rVar);
                return fVar4.r0(z92.f.w(rVar, groupMembers));
            case 22:
                lrk.e eVar2 = (lrk.e) this.f196823c;
                trk.a assetType = (trk.a) this.f196822b;
                List<String> keys = (List) obj2;
                Intrinsics.checkNotNullParameter(keys, "keys");
                ArrayList arrayList2 = new ArrayList();
                for (String key : keys) {
                    grk.b bVar8 = eVar2.f199527b;
                    Intrinsics.checkNotNullParameter(assetType, "assetType");
                    Intrinsics.checkNotNullParameter(key, "key");
                    Set<Map.Entry> setEntrySet = bVar8.f146054a.entrySet();
                    int iB = q0.b(w.t(setEntrySet, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
                    for (Map.Entry entry2 : setEntrySet) {
                        AssetStatsId assetStatsId = (AssetStatsId) entry2.getKey();
                        String str4 = (String) entry2.getValue();
                        if (assetStatsId instanceof AssetStatsId.Stocks) {
                            aVar = trk.a.STOCKS;
                        } else if (assetStatsId instanceof AssetStatsId.Etf) {
                            aVar = trk.a.ETF;
                        } else {
                            if (!(assetStatsId instanceof AssetStatsId.Bonds)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = trk.a.BONDS;
                        }
                        linkedHashMap2.put(new Pair(aVar, str4), assetStatsId);
                    }
                    AssetStatsId assetStatsId2 = (AssetStatsId) linkedHashMap2.get(new Pair(assetType, key));
                    if (assetStatsId2 == null) {
                        hx7.e.n(new IllegalArgumentException(j6.a.q("No mapping found for ", key)));
                    }
                    if (assetStatsId2 != null) {
                        arrayList2.add(assetStatsId2);
                    }
                }
                return arrayList2;
            case 23:
                yki.b bVar9 = (yki.b) this.f196823c;
                GroupChatFlowContract$Step groupChatFlowContract$Step = (GroupChatFlowContract$Step) this.f196822b;
                bs9.t output3 = (bs9.t) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (Intrinsics.f(output3, s.f18128a)) {
                    oki.h.D2(bVar9);
                } else {
                    if (!(output3 instanceof bs9.r)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    NavBarWithContainerBackground navBarWithContainerBackground = ((bs9.r) output3).f18127a;
                    ((GroupChatFlowContract$Step.Chat) groupChatFlowContract$Step).getClass();
                    oki.h.s2(bVar9, new GroupChatFlowContract$Step.Chat(navBarWithContainerBackground), false, TransitionAnimation.REPLACE.f98394a, true);
                }
                return Unit.f186387a;
            case 24:
                Data data = (Data) this.f196823c;
                lt7.m mVar3 = (lt7.m) this.f196822b;
                lt7.i iVar = (lt7.i) obj2;
                try {
                    Object content = data.getContent();
                    if (content != null) {
                        os7.a aVar4 = (os7.a) content;
                        int i2 = lt7.l.f199834a[mVar3.o.f75822b.ordinal()];
                        if (i2 == 1) {
                            rs7.b bVar10 = aVar4.e;
                            Intrinsics.i(bVar10, "null cannot be cast to non-null type com.revolut.feature.insurance_credit.impl.data.model.claims.ClaimsLayout.ClaimsEmbedded");
                            cVar = ((rs7.a) bVar10).f257038a;
                        } else {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar = aVar4.d;
                        }
                    } else {
                        cVar = null;
                    }
                    layout = new Data(cVar, data.getError(), data.getLoading());
                } catch (Throwable th10) {
                    layout = new Data(null, th10, data.getLoading());
                }
                iVar.getClass();
                Intrinsics.checkNotNullParameter(layout, "layout");
                return new lt7.i(layout);
            case 25:
                com.revolut.feature.credit.card.impl.ui.repay.pse.flow.a aVar5 = (com.revolut.feature.credit.card.impl.ui.repay.pse.flow.a) this.f196823c;
                yki.l lVar4 = (yki.l) this.f196822b;
                ju4.e result5 = (ju4.e) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                if (result5 instanceof ju4.c) {
                    ju4.c cVar3 = (ju4.c) result5;
                    oki.h.t2(aVar5, lVar4, new CreditCardPseRepayFlowContract$Step.Pse(cVar3.f178578a, cVar3.f178579b), false, null, false, 14);
                } else {
                    if (!(result5 instanceof ju4.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(aVar5, lVar4, new CreditCardPseRepayFlowContract$Step.InstalmentHub(((ju4.d) result5).f178580a), false, null, false, 14);
                }
                return Unit.f186387a;
            case 26:
                return a(obj2);
            case 27:
                com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a aVar6 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a) this.f196823c;
                FreelancerAcquiringOrderFiltersScreenContract$ModalStep.EndDateRangePicker endDateRangePicker = (FreelancerAcquiringOrderFiltersScreenContract$ModalStep.EndDateRangePicker) this.f196822b;
                kw6.b result6 = (kw6.b) obj2;
                Intrinsics.checkNotNullParameter(result6, "result");
                if (result6 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar6.H2(aVar6.f73688t, new j(aVar6, endDateRangePicker, result6, 28));
                return Unit.f186387a;
            case 28:
                FreelancerAcquiringOrderFiltersScreenContract$ModalStep.EndDateRangePicker endDateRangePicker2 = (FreelancerAcquiringOrderFiltersScreenContract$ModalStep.EndDateRangePicker) this.f196823c;
                kw6.b bVar11 = (kw6.b) this.f196822b;
                lu6.l update = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return lu6.l.a(update, null, com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a.J2(update.f200048b, new AcquiringOrderFilter.DateRange(new FilteringDateRange.Custom(endDateRangePicker2.f73682a, bVar11.f190295a))), 5);
            default:
                com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a aVar7 = (com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a) this.f196823c;
                File file = (File) this.f196822b;
                dii.g result7 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result7, "result");
                if (result7 instanceof dii.f) {
                    aVar7.l2(new ll6.i(aVar7, file, null, 23), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ j(oki.h hVar, Object obj2, Object obj3, int i) {
        this.f196821a = i;
        this.f196823c = obj2;
        this.f196822b = obj3;
    }
}
