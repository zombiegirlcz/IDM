package a26;

import akl.r1;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Parcelable;
import az0.w1;
import cbh.e0;
import cbh.n0;
import com.revolut.core.ui_kit.delegates.ForecastDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.HexagonalTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.feature.crypto.remittance.models.domain.fees.CryptoWithdrawFeesBreakdownDetail;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawFeesBreakdown;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoFeesBreakdown;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoFeesBreakdownDetail;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.CryptoWithdrawToAddressReviewContract$BlockchainWithFee;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.junior_core.models.configuration.JuniorPlanConfiguration;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.retail.feature.impl.budgeting_cycle.network.AnalyticsCycleService;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.models.StockFinancialsStatementPeriodState;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import g1i.i0;
import ip0.mj;
import ip0.qj;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import jf7.j1;
import kkf.t2;
import knd.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlinx.coroutines.flow.Flow;
import le3.b0;
import lhk.a0;
import n09.j0;
import nii.n1;
import org.jmrtd.cbeff.ISO781611;
import rp0.k1;
import tof.a3;
import yhm.m;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f694c;

    public s(Data data, String str) {
        this.f692a = 16;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f693b = str;
        this.f694c = data;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a26.s.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v36 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Flow flowI;
        Object obj3;
        List list;
        JuniorPlanConfiguration juniorPlanConfiguration;
        Object obj4;
        Map map;
        FiatCryptoFeesBreakdown fiatCryptoFeesBreakdown;
        CryptoWithdrawFeesBreakdown cryptoWithdrawFeesBreakdown;
        ArrayList arrayList;
        Object next2;
        String str;
        Integer numValueOf;
        int i = 3;
        int i2 = 2;
        int i3 = 10;
        boolean z = false;
        z = false;
        int i5 = 1;
        ?? r72 = 0;
        num = null;
        num = null;
        Integer num = null;
        switch (this.f692a) {
            case 0:
                List midRates = (List) obj2;
                Intrinsics.checkNotNullParameter(midRates, "midRates");
                ArrayList<DeFiBalance> arrayList2 = ((e16.b) this.f693b).f121888c;
                xi0.b bVar = (xi0.b) this.f694c;
                Intrinsics.h(bVar);
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                for (DeFiBalance deFiBalance : arrayList2) {
                    ej0.b bVar2 = new ej0.b(deFiBalance.b(), deFiBalance.getCurrency());
                    Iterator it8 = midRates.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            qta.c cVar = (qta.c) next;
                            if (!Intrinsics.f(cVar.f249046a.f306286a, deFiBalance.getCurrency().f306286a) || !Intrinsics.f(cVar.f249047b, bVar)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    qta.c cVar2 = (qta.c) next;
                    ej0.b bVarT = cVar2 != null ? mif.a.t(bVar2, cVar2.f249048c, cVar2.f249047b) : null;
                    dj0.d dVarP = mif.a.P(bVar2, 0, 3);
                    dj0.d dVarP2 = bVarT != null ? mif.a.P(bVarT, 0, 3) : null;
                    rt5.f fVar = new rt5.f(dVarP, dVarP2, bVar, new rt5.d(deFiBalance.f71635a, dVarP, dVarP2, true, new ImageTransformations(null, HexagonalTransformation.f60062a, null, null, null, null, null, ISO781611.SMT_TAG)), null);
                    xi0.b currency = deFiBalance.getCurrency();
                    ej0.b bVar3 = deFiBalance.d;
                    if (bVar3 == null) {
                        BigDecimal ZERO = BigDecimal.ZERO;
                        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                        bVar3 = new ej0.b(ZERO, deFiBalance.getCurrency());
                    }
                    arrayList3.add(new Pair(fVar, new rt5.b(currency, bVar3)));
                }
                ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                Iterator it9 = arrayList3.iterator();
                while (it9.hasNext()) {
                    arrayList4.add((rt5.b) ((Pair) it9.next()).f186386b);
                }
                ArrayList arrayList5 = new ArrayList(w.t(arrayList3, 10));
                Iterator it10 = arrayList3.iterator();
                while (it10.hasNext()) {
                    arrayList5.add((rt5.f) ((Pair) it10.next()).f186385a);
                }
                List<qta.c> list2 = midRates;
                ArrayList arrayList6 = new ArrayList(w.t(list2, 10));
                for (qta.c cVar3 : list2) {
                    arrayList6.add(new rt5.g(cVar3.f249048c, cVar3.f249046a, cVar3.f249047b));
                }
                return new rt5.h(arrayList5, arrayList4, arrayList6);
            case 1:
                n1 it11 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                a5k.t.Z2((a5k.t) this.f693b, (skm.l) this.f694c, a5k.d.f1441a);
                return Unit.f186387a;
            case 2:
                hha.d pricingPlan = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                return hx2.c.c(((ag8.e) this.f693b).f, ((psg.a) this.f694c).f239484a, false, false, pricingPlan.f152287a, null, null, null, null, true, 7648);
            case 3:
                od0.i pocketOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(pocketOptional, "pocketOptional");
                return new akb.h((qib.i) this.f693b, ((pcd.s) this.f694c).f234885h.f234859a, (io3.d) pocketOptional.f224257a);
            case 4:
                qib.i challengeAccount = (qib.i) obj2;
                Intrinsics.checkNotNullParameter(challengeAccount, "challengeAccount");
                com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.a aVar = (com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.a) this.f693b;
                String str2 = challengeAccount.d.f;
                if (str2 != null) {
                    flowI = nim.a.v(aVar.f83193r.e(w4l.h.f294642c), new ak7.g(str2, 2));
                } else {
                    od0.i.Companion.getClass();
                    flowI = zi0.c.i(od0.i.f224256b);
                }
                return nim.a.v(flowI, new s(challengeAccount, (pcd.s) this.f694c, i));
            case 5:
                try {
                    ((ConnectivityManager) ((a61.a) this.f693b).f1531b).unregisterNetworkCallback((r1) this.f694c);
                    break;
                } catch (IllegalArgumentException unused) {
                }
                return Unit.f186387a;
            case 6:
                Context context = ((w1) this.f693b).f11372a;
                com.bumptech.glide.b.b(context).c(context).m((v8.j) this.f694c);
                return Unit.f186387a;
            case 7:
                vrc.j scaResult = (vrc.j) obj2;
                skm.l lVar = (skm.l) this.f694c;
                Intrinsics.checkNotNullParameter(scaResult, "scaResult");
                if (scaResult.f291576a) {
                    b9k.n nVar = (b9k.n) this.f693b;
                    ((k1) nVar.f13834n).d(nVar.f13835p.a());
                }
                if (lVar.d()) {
                    m.Companion companion = yhm.m.INSTANCE;
                    lVar.resumeWith(Unit.f186387a);
                }
                return Unit.f186387a;
            case 8:
                List results = (List) obj2;
                Intrinsics.checkNotNullParameter(results, "results");
                o97.m mVar = (o97.m) this.f693b;
                if (mVar != o97.m.INVEST) {
                    throw new IllegalStateException("provide handling for " + mVar);
                }
                Iterator it12 = results.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        Object next3 = it12.next();
                        if (((o97.o) next3).f223122a == mVar) {
                            obj3 = next3;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                o97.o oVar = (o97.o) obj3;
                if (oVar == null || (list = oVar.f223123b) == null) {
                    return f0.f322471a;
                }
                b4f.b bVar4 = (b4f.b) this.f694c;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : list) {
                    if (bVar4.b((String) obj5)) {
                        arrayList7.add(obj5);
                    }
                }
                return arrayList7;
            case 9:
                blm.b bVar5 = (blm.b) this.f693b;
                dom.b bVar6 = (dom.b) this.f694c;
                synchronized (bVar5) {
                    bVar6.cancel();
                    Unit unit = Unit.f186387a;
                }
                return Unit.f186387a;
            case 10:
                if (!((Boolean) obj2).booleanValue()) {
                    return zi0.c.i(Optional.empty());
                }
                btk.n nVar2 = (btk.n) this.f693b;
                nel.n nVar3 = (nel.n) this.f694c;
                Intrinsics.h(nVar3);
                return vkm.q.q(boh.f.e(vkm.q.q(ybl.q.a(nVar2.d, nVar3, TradingAccountType.Gia.f105270a)), new bnj.n(nVar2, nVar3, 22)));
            case 11:
                return a((Continuation) obj2);
            case 12:
                String walletId = (String) obj2;
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar2 = (com.revolut.feature.pockets.impl.details_v2.linked_account_details.a) this.f693b;
                uea.f fVar2 = aVar2.f80822x;
                w4l.h hVar = w4l.h.f294642c;
                io3.d dVar = (io3.d) this.f694c;
                return fVar2.b(hVar, walletId, z92.f.l(dVar), dVar.e, io3.i.EXTERNAL, aVar2.o.f80812a.f163145a, null);
            case 13:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                Object content = data.getContent();
                if (content != null) {
                    Iterator it13 = ((List) content).iterator();
                    while (true) {
                        if (it13.hasNext()) {
                            Object next4 = it13.next();
                            if (Intrinsics.f(((JuniorPlanConfiguration) next4).f76898a, ((hha.d) this.f694c).f152287a)) {
                                obj4 = next4;
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    juniorPlanConfiguration = (JuniorPlanConfiguration) obj4;
                } else {
                    juniorPlanConfiguration = null;
                }
                return new Data(juniorPlanConfiguration, (data.getLoading() || juniorPlanConfiguration != null) ? data.getError() : new IllegalStateException(p.a.p("junior wallets config for plan ", ((hha.d) this.f693b).f152287a, " has not found")), data.getLoading());
            case 14:
                ekm.e eVar = (ekm.e) this.f693b;
                DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) this.f694c;
                Name name = (Name) obj2;
                Intrinsics.checkNotNullParameter(name, "name");
                ProtoBuf.EnumEntry enumEntry = (ProtoBuf.EnumEntry) eVar.f127195a.get(name);
                if (enumEntry != null) {
                    return EnumEntrySyntheticClassDescriptor.create(deserializedClassDescriptor.getC().getStorageManager(), deserializedClassDescriptor, name, eVar.f127197c, new DeserializedAnnotations(deserializedClassDescriptor.getC().getStorageManager(), new ajm.e(deserializedClassDescriptor, enumEntry, 7)), SourceElement.NO_SOURCE);
                }
                return null;
            case 15:
                Map blockchainRoughFees = (Map) obj2;
                Intrinsics.checkNotNullParameter(blockchainRoughFees, "blockchainRoughFees");
                n9l.a exchangeRate = (n9l.a) d0.d0((List) this.f693b);
                List<wk5.a> list3 = (List) this.f694c;
                ArrayList arrayList8 = new ArrayList(w.t(list3, 10));
                for (wk5.a aVar3 : list3) {
                    if (exchangeRate == null || (cryptoWithdrawFeesBreakdown = (CryptoWithdrawFeesBreakdown) blockchainRoughFees.get(aVar3)) == null) {
                        map = blockchainRoughFees;
                        fiatCryptoFeesBreakdown = null;
                    } else {
                        Intrinsics.checkNotNullParameter(cryptoWithdrawFeesBreakdown, "<this>");
                        Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
                        dj0.d dVar2 = cryptoWithdrawFeesBreakdown.f71089a;
                        FiatCryptoMoney fiatCryptoMoneyI = dVar2 != null ? hx7.e.i(dVar2, exchangeRate) : null;
                        dj0.d dVar3 = cryptoWithdrawFeesBreakdown.f71090b;
                        FiatCryptoMoney fiatCryptoMoneyI2 = dVar3 != null ? hx7.e.i(dVar3, exchangeRate) : null;
                        dj0.d dVar4 = cryptoWithdrawFeesBreakdown.f71091c;
                        FiatCryptoMoney fiatCryptoMoneyI3 = dVar4 != null ? hx7.e.i(dVar4, exchangeRate) : null;
                        dj0.d dVar5 = cryptoWithdrawFeesBreakdown.d;
                        FiatCryptoMoney fiatCryptoMoneyI4 = dVar5 != null ? hx7.e.i(dVar5, exchangeRate) : null;
                        FiatCryptoMoney fiatCryptoMoneyI5 = hx7.e.i(cryptoWithdrawFeesBreakdown.e, exchangeRate);
                        List list4 = cryptoWithdrawFeesBreakdown.f;
                        if (list4 != null) {
                            List<CryptoWithdrawFeesBreakdownDetail> list5 = list4;
                            ArrayList arrayList9 = new ArrayList(w.t(list5, i3));
                            for (CryptoWithdrawFeesBreakdownDetail cryptoWithdrawFeesBreakdownDetail : list5) {
                                arrayList9.add(new FiatCryptoFeesBreakdownDetail(cryptoWithdrawFeesBreakdownDetail.f70990a, cryptoWithdrawFeesBreakdownDetail.f70991b, cryptoWithdrawFeesBreakdownDetail.f70992c, hx7.e.i(cryptoWithdrawFeesBreakdownDetail.d, exchangeRate), cryptoWithdrawFeesBreakdownDetail.e));
                                blockchainRoughFees = blockchainRoughFees;
                            }
                            arrayList = arrayList9;
                        } else {
                            arrayList = null;
                        }
                        map = blockchainRoughFees;
                        fiatCryptoFeesBreakdown = new FiatCryptoFeesBreakdown(fiatCryptoMoneyI, fiatCryptoMoneyI2, fiatCryptoMoneyI3, fiatCryptoMoneyI4, fiatCryptoMoneyI5, arrayList);
                    }
                    arrayList8.add(new CryptoWithdrawToAddressReviewContract$BlockchainWithFee(aVar3, fiatCryptoFeesBreakdown));
                    blockchainRoughFees = map;
                    i3 = 10;
                }
                return arrayList8;
            case 16:
                efm.r published = (efm.r) obj2;
                Intrinsics.checkNotNullParameter(published, "published");
                return published.ambWith(efm.r.fromCallable(new gqk.d((String) this.f693b, (Data) this.f694c, z ? 1 : 0)).delaySubscription(5L, TimeUnit.SECONDS).concatWith(published));
            case 17:
                whf.p transactionsContent = (whf.p) obj2;
                Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
                ht4.c cVar4 = (ht4.c) this.f693b;
                List list6 = (List) this.f694c;
                ArrayList<List> arrayList10 = new ArrayList(w.t(list6, 10));
                Iterator it14 = list6.iterator();
                while (it14.hasNext()) {
                    List<String> list7 = ((ql4.k) it14.next()).k;
                    ArrayList arrayList11 = new ArrayList();
                    for (String str3 : list7) {
                        Iterator it15 = transactionsContent.f297646a.iterator();
                        while (true) {
                            if (it15.hasNext()) {
                                next2 = it15.next();
                                if (Intrinsics.f(((a3) next2).f272581b, str3)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        a3 a3Var = (a3) next2;
                        if (a3Var != null) {
                            arrayList11.add(a3Var);
                        }
                    }
                    arrayList10.add(arrayList11);
                }
                ArrayList arrayList12 = new ArrayList();
                for (List list8 : arrayList10) {
                    k71.q qVar = transactionsContent.f297647b;
                    int size = list8.size();
                    Parcelable parcelableI = size != 0 ? size != i5 ? LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_documents_pair, R$attr.uikit_colorOnAccent, R$attr.uikit_colorAccent) : thf.d.a(cVar4.d, (a3) d0.b0(list8), qVar.d, qVar.e, qVar.f181799j, qVar.f181804q, qVar.f181794a, qVar.f181795b, qVar.f181806s, qVar.f181807t, qVar.u, null, 1024) : null;
                    if (parcelableI != null) {
                        arrayList12.add(parcelableI);
                    }
                    i5 = 1;
                }
                return arrayList12;
            case 18:
                lt0.c cVar5 = (lt0.c) obj2;
                qj qjVar = (qj) this.f693b;
                Iterator it16 = qjVar.d.f165521b.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        Object next5 = it16.next();
                        mj mjVar = (mj) next5;
                        if (cVar5 != null && mjVar.f165387a == cVar5.f199728a) {
                            r72 = next5;
                        }
                    }
                }
                ((ForecastDelegate) this.f694c).f52369c.onNext(new Pair(qjVar, (mj) r72));
                return Unit.f186387a;
            case 19:
                String str4 = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str4, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-it$0");
                lsj.f fVar3 = ((isj.c) this.f693b).f168306b;
                uzi.b budgetingCycle = (uzi.b) this.f694c;
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(str4, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
                AnalyticsCycleService analyticsCycleService = fVar3.f199693c;
                Intrinsics.checkNotNullParameter(budgetingCycle, "<this>");
                int i6 = ksj.a.f189466a[budgetingCycle.f284679a.ordinal()];
                if (i6 == 1) {
                    str = "MONTHLY";
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "WEEKLY";
                }
                pfm.a aVarE = analyticsCycleService.setAnalyticsCycle(str4, new ksj.c(str, budgetingCycle.f284680b)).e(fVar3.d.g(new WalletId(str4), true));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 20:
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                com.revolut.feature.retail.reverywhere.impl.web_app.d dVar6 = (com.revolut.feature.retail.reverywhere.impl.web_app.d) this.f693b;
                dVar6.f82943y = null;
                dVar6.z = true;
                skm.l lVar2 = (skm.l) this.f694c;
                m.Companion companion2 = yhm.m.INSTANCE;
                lVar2.resumeWith(bool);
                return Unit.f186387a;
            case 21:
                Function0 it17 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return kg7.f.b((kg7.f) this.f693b, (j1) this.f694c);
            case 22:
                k71.q extraData = (k71.q) obj2;
                Intrinsics.checkNotNullParameter(extraData, "extraData");
                t2 t2Var = (t2) this.f693b;
                a3 a3Var2 = (a3) this.f694c;
                t2Var.getClass();
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("ID_HEADER_RELATED_TRANSACTONS", (Image) null, (Clause) new TextLocalisedClause(R$string.transaction_linked_transaction, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                RowDelegate.Model modelP = ((anf.k) t2Var.o).p(a3Var2, extraData, new thf.f(false, 3));
                yp0.b.l(modelP, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
                return i2b.a.r(model, modelP);
            case 23:
                Throwable it18 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                Map mapG = r0.g();
                CategorisationFilter categorisationFilter = (CategorisationFilter) this.f693b;
                f0 f0Var = f0.f322471a;
                knd.k kVar = (knd.k) ((v) this.f694c).f186145j.getValue();
                return new knd.g(mapG, categorisationFilter, f0Var, kVar != null ? kVar.f186101a : null);
            case 24:
                String str5 = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str5, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-nonNullWalletId$0");
                g31.h hVar2 = ((b0) this.f693b).d;
                String id10 = (String) this.f694c;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(str5, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                ufm.i iVar = new ufm.i(new ufm.i(te0.w.i0(hVar2.f140179a.deleteCategoryOld(id10, str5)), new i0(9, new g1k.k(26)), 1), new i0(i3, new g31.e(hVar2, z ? 1 : 0, id10, str5)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 25:
                List collectionsPerformances = (List) obj2;
                Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f693b;
                if (((List) ref$ObjectRef.f186409a).isEmpty()) {
                    List listV0 = d0.V0(d0.P0(collectionsPerformances, new ly5.i()), 3);
                    ArrayList arrayList13 = new ArrayList(w.t(listV0, 10));
                    Iterator it19 = listV0.iterator();
                    while (it19.hasNext()) {
                        arrayList13.add(((xzg.g) it19.next()).f309989a);
                    }
                    ref$ObjectRef.f186409a = arrayList13;
                }
                return new yhm.r((List) this.f694c, collectionsPerformances, ref$ObjectRef.f186409a);
            case 26:
                nel.n instrument = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                if (instrument.f.d) {
                    mmh.n nVar4 = (mmh.n) this.f693b;
                    nmh.a aVar4 = (nmh.a) this.f694c;
                    nVar4.getClass();
                    if (mmh.l.f207235b[aVar4.ordinal()] != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (io3.h.o(instrument.f214597c)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 27:
                com.revolut.feature.rev_points.impl.ui.transactions.details.b bVar7 = (com.revolut.feature.rev_points.impl.ui.transactions.details.b) this.f694c;
                ((Ref$BooleanRef) this.f693b).f186407a = true;
                RevPointsTransaction revPointsTransaction = (RevPointsTransaction) obj2;
                String str6 = revPointsTransaction.e;
                if (str6 != null) {
                    yji.l.a1(bVar7, vkm.q.Q(vkm.q.Q(mo3.a.g(nim.a.v(zi0.c.w(bVar7.f83854p.b(w4l.h.f294642c)), new n0c.o(z ? 1 : 0)), null, new mv5.h(28), 1), new n0c.s(r72, bVar7, str6, z ? 1 : 0)), new n0c.s(r72, bVar7, str6, i5)), null, null, new a0(bVar7, revPointsTransaction, r72, 15), 3);
                } else {
                    bVar7.H2(bVar7.f83860x, new j0(revPointsTransaction, (Object) r72, i2));
                    Unit unit2 = Unit.f186387a;
                }
                return Unit.f186387a;
            case 28:
                vf0.k kVar2 = (vf0.k) obj2;
                Intrinsics.checkNotNullParameter(kVar2, "<destruct>");
                sf8.h hVar3 = (sf8.h) kVar2.f288454a;
                List list9 = (List) kVar2.f288455b;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) kVar2.f288456c;
                boolean zBooleanValue = ((Boolean) kVar2.d).booleanValue();
                List list10 = (List) kVar2.e;
                String str7 = (String) this.f693b;
                boolean zL = c8g.a.l(hVar3);
                String str8 = juniorBankingProfile.f77099b;
                psg.a aVar5 = (psg.a) this.f694c;
                return new n78.b(str7, list9, zL, str8, aVar5.f239484a, ta6.a.A(aVar5), zBooleanValue, list10);
            default:
                Pair pair = (Pair) obj2;
                uqk.e eVar2 = (uqk.e) this.f694c;
                com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a aVar6 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a) this.f693b;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list11 = (List) pair.f186385a;
                if (!((Boolean) pair.f186386b).booleanValue()) {
                    return new nvk.p(f0.f322471a, com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a.I2(aVar6, eVar2));
                }
                StockFinancialsStatementPeriodState stockFinancialsStatementPeriodStateI2 = com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a.I2(aVar6, eVar2);
                Integer num2 = stockFinancialsStatementPeriodStateI2.f103797a;
                if (num2 == null) {
                    Iterator it20 = list11.iterator();
                    if (it20.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(((uqk.f) it20.next()).f282212c);
                        while (it20.hasNext()) {
                            Integer numValueOf3 = Integer.valueOf(((uqk.f) it20.next()).f282212c);
                            if (numValueOf2.compareTo(numValueOf3) < 0) {
                                numValueOf2 = numValueOf3;
                            }
                        }
                        num2 = numValueOf2;
                    } else {
                        num2 = null;
                    }
                }
                Integer num3 = stockFinancialsStatementPeriodStateI2.f103798b;
                if (num3 == null) {
                    int i21 = nvk.q.f219729a[eVar2.ordinal()];
                    if (i21 != 1) {
                        if (i21 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ArrayList arrayList14 = new ArrayList();
                        for (Object obj6 : list11) {
                            int i22 = ((uqk.f) obj6).f282212c;
                            if (num2 != null && i22 == num2.intValue()) {
                                arrayList14.add(obj6);
                            }
                        }
                        Iterator it21 = arrayList14.iterator();
                        if (it21.hasNext()) {
                            Integer num4 = ((uqk.f) it21.next()).d;
                            numValueOf = Integer.valueOf(num4 != null ? num4.intValue() : 0);
                            while (it21.hasNext()) {
                                Integer num5 = ((uqk.f) it21.next()).d;
                                Integer numValueOf4 = Integer.valueOf(num5 != null ? num5.intValue() : 0);
                                if (numValueOf.compareTo(numValueOf4) < 0) {
                                    numValueOf = numValueOf4;
                                }
                            }
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null && numValueOf.intValue() != 0) {
                            num = numValueOf;
                        }
                    }
                    num3 = num;
                }
                List<uqk.f> list12 = list11;
                ArrayList arrayList15 = new ArrayList(w.t(list12, 10));
                for (uqk.f fVar4 : list12) {
                    int i32 = fVar4.f282212c;
                    Integer num6 = fVar4.d;
                    arrayList15.add(new esk.b(i32, num2 != null && i32 == num2.intValue() && Intrinsics.f(num6, num3), num6));
                }
                return new nvk.p(arrayList15, new StockFinancialsStatementPeriodState(num2, num3));
        }
    }

    public s(hd.r rVar, e16.b bVar, xi0.b bVar2) {
        this.f692a = 0;
        this.f693b = bVar;
        this.f694c = bVar2;
    }

    public /* synthetic */ s(Object obj2, Object obj3, int i) {
        this.f692a = i;
        this.f693b = obj2;
        this.f694c = obj3;
    }

    public s(n0 n0Var, e0 command) {
        this.f692a = 11;
        Intrinsics.checkNotNullParameter(command, "command");
        this.f694c = n0Var;
        this.f693b = command;
    }
}
