package csl;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.trading_orders.api.investment_plan.projection.InvestmentProjectionsContract$Destination;
import com.revolut.feature.trading_orders.api.investment_plan.projection.InvestmentProjectionsContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceAccountSwitchingInformation;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import e4k.x;
import e4k.z;
import efm.c0;
import efm.d0;
import g4k.r;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import knd.m1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.n0;
import kotlinx.coroutines.channels.ProducerScope;
import lr9.p;
import pcd.s;
import qc0.j0;
import te0.v;
import te0.w;
import zdd.q;
import zh9.u0;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f108529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f108530c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(long j2, Object obj2, Object obj3, int i) {
        this.f108528a = i;
        this.f108529b = j2;
        this.f108530c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f108528a) {
            case 0:
                TradingAccount tradingAccount = (TradingAccount) this.f108530c;
                c cVar = (c) this.d;
                nel.n instrument = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                if (tradingAccount instanceof TradingAccount.GIA) {
                    return cVar.a(u0.f(new InvestmentProjectionsContract$Destination(new InvestmentProjectionsContract$InputData(Long.valueOf(this.f108529b), instrument, ((TradingAccount.GIA) tradingAccount).f105181a, null, 8))), instrument, tradingAccount);
                }
                if (!(tradingAccount instanceof TradingAccount.Margin) && !(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.Robo) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                return d0.l(new IllegalStateException("Account launching etf plan order is not acceptable: " + tradingAccount.W()));
            case 1:
                BigDecimal bigDecimal = (BigDecimal) this.f108530c;
                String str = (String) this.d;
                e3i.j update = (e3i.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Intrinsics.h(bigDecimal);
                return e3i.j.a(update, this.f108529b, bigDecimal, null, null, false, str.length() == 0, 1276);
            case 2:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f108530c;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.d;
                e3i.j update2 = (e3i.j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return e3i.j.a(update2, this.f108529b, (BigDecimal) ref$ObjectRef.f186409a, null, null, ref$BooleanRef.f186407a, false, 1788);
            case 3:
                BankTransferData bankTransferData = (BankTransferData) this.f108530c;
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) this.d;
                x updateState = (x) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                BankTransferData bankTransferDataA = BankTransferData.a(bankTransferData, this.f108529b, null, null, null, null, null, null, null, null, null, null, null, null, 1048574);
                z zVarF2 = aVar.F2();
                Data availableTypes = zVarF2.f122655a;
                long j2 = zVarF2.f122657c;
                List transferOptions = zVarF2.d;
                List referenceOptions = zVarF2.e;
                PaymentPocketInfo paymentPocketInfo = zVarF2.f;
                List suggestions = zVarF2.f122658g;
                hrf.h errorState = zVarF2.f122659h;
                Exception exc2 = zVarF2.i;
                RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation = zVarF2.f122660j;
                r validationData = zVarF2.k;
                f2k.h hVar = zVarF2.f122661l;
                Intrinsics.checkNotNullParameter(availableTypes, "availableTypes");
                Intrinsics.checkNotNullParameter(transferOptions, "transferOptions");
                Intrinsics.checkNotNullParameter(referenceOptions, "referenceOptions");
                Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                Intrinsics.checkNotNullParameter(errorState, "errorState");
                Intrinsics.checkNotNullParameter(validationData, "validationData");
                return x.a(updateState, null, bankTransferDataA, new z(availableTypes, null, j2, transferOptions, referenceOptions, paymentPocketInfo, suggestions, errorState, exc2, remittanceAccountSwitchingInformation, validationData, hVar), 0, null, null, null, false, 1011);
            case 4:
                eed.n nVar = (eed.n) this.f108530c;
                s sVar = (s) this.d;
                String pocketId = (String) obj2;
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                qdd.a aVar2 = nVar.f125201a;
                String vaultId = sVar.f234881a;
                aed.o oVar = (aed.o) aVar2;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(vaultId, "vaultId");
                return w.g0(oVar.f3546a.withdraw(vaultId, new q(this.f108529b, pocketId))).e(nVar.f125205h.a(sVar, nVar));
            case 5:
                List transferErrors = (List) this.f108530c;
                List balanceErrors = (List) this.d;
                fr8.l updateState2 = (fr8.l) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                yqi.b bVar = updateState2.i.f154819c;
                Intrinsics.checkNotNullParameter(transferErrors, "transferErrors");
                Intrinsics.checkNotNullParameter(balanceErrors, "balanceErrors");
                return fr8.l.a(updateState2, this.f108529b, null, null, null, null, null, null, null, new hrf.h(transferErrors, balanceErrors, bVar), 254);
            case 6:
                m1 m1Var = (m1) this.f108530c;
                lzi.i iVar = (lzi.i) this.d;
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new ind.d(m1Var.f186113a, iVar, this.f108529b);
            case 7:
                String str2 = (String) this.f108530c;
                long j3 = this.f108529b;
                List<String> list = (List) this.d;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(str2);
                try {
                    sQLiteStatementPrepare.bindLong(1, j3);
                    int i = 2;
                    for (String str3 : list) {
                        if (str3 == null) {
                            sQLiteStatementPrepare.bindNull(i);
                        } else {
                            sQLiteStatementPrepare.bindText(i, str3);
                        }
                        i++;
                    }
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new mqj.b(sQLiteStatementPrepare.getLong(0), sQLiteStatementPrepare.getLong(2), sQLiteStatementPrepare.isNull(1) ? null : sQLiteStatementPrepare.getText(1)));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 8:
                String str4 = (String) this.f108530c;
                long j5 = this.f108529b;
                ArrayList<String> arrayList2 = (ArrayList) this.d;
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare(str4);
                try {
                    sQLiteStatementPrepare2.bindLong(1, j5);
                    int i2 = 2;
                    for (String str5 : arrayList2) {
                        if (str5 == null) {
                            sQLiteStatementPrepare2.bindNull(i2);
                        } else {
                            sQLiteStatementPrepare2.bindText(i2, str5);
                        }
                        i2++;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        arrayList3.add(new mqj.c(sQLiteStatementPrepare2.getLong(0), sQLiteStatementPrepare2.getLong(1)));
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList3;
                } catch (Throwable th11) {
                    sQLiteStatementPrepare2.close();
                    throw th11;
                }
            case 9:
                lr9.j jVar = (lr9.j) this.f108530c;
                PaymentGroup paymentGroup = (PaymentGroup) this.d;
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                long jLongValue = ((Number) rVar.f314201a).longValue();
                long jLongValue2 = ((Number) rVar.f314202b).longValue();
                if (((jLongValue <= 0 || jLongValue2 <= 0) ? Math.max(jLongValue, jLongValue2) : Math.min(jLongValue, jLongValue2)) <= 0) {
                    return d0.m(Unit.f186387a);
                }
                lr9.r rVar2 = jVar.f199454g;
                String groupId = paymentGroup.f79285a;
                rVar2.getClass();
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                pfm.n nVar2 = new pfm.n(new g31.a(rVar2, groupId, this.f108529b, 1), 1);
                Intrinsics.checkNotNullExpressionValue(nVar2, "fromCallable(...)");
                return new ufm.i(w.g0(nVar2).f(jVar.f199451a.b(paymentGroup)), new lr9.b(17, new loc.a(14)), 1);
            case 10:
                p pVar = (p) this.f108530c;
                PaymentGroup paymentGroup2 = (PaymentGroup) this.d;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                long jLongValue3 = ((Number) pair.f186385a).longValue();
                long jLongValue4 = ((Number) pair.f186386b).longValue();
                if (((jLongValue3 <= 0 || jLongValue4 <= 0) ? Math.max(jLongValue3, jLongValue4) : Math.min(jLongValue3, jLongValue4)) <= 0) {
                    return d0.m(Unit.f186387a);
                }
                lr9.r rVar3 = pVar.f199468g;
                String groupId2 = paymentGroup2.f79285a;
                rVar3.getClass();
                Intrinsics.checkNotNullParameter(groupId2, "groupId");
                pfm.n nVar3 = new pfm.n(new g31.a(rVar3, groupId2, this.f108529b, 1), 1);
                Intrinsics.checkNotNullExpressionValue(nVar3, "fromCallable(...)");
                return new ufm.i(w.g0(nVar3).f(pVar.f199465a.b(paymentGroup2)), new lr9.b(26, new loc.a(18)), 1);
            case 11:
                return super/*mif.o*/.x(this.f108529b, (String) this.d);
            case 12:
                Data data = (Data) this.f108530c;
                String str6 = (String) this.d;
                n3e.d dVar = (n3e.d) obj2;
                long j16 = this.f108529b;
                return n3e.d.a(dVar, null, k3e.b.b(data, j16), str6 == null ? k3e.b.a(j16, data, dVar.f211995c) : false, 1);
            case 13:
                String str7 = (String) this.f108530c;
                np4.o oVar2 = (np4.o) this.d;
                np4.d update3 = (np4.d) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                dj0.d dVar2 = new dj0.d(this.f108529b, oVar2.f218142q.f);
                update3.getClass();
                return new np4.d(dVar2, str7);
            case 14:
                BackendFlow backendFlow = (BackendFlow) this.f108530c;
                j0 j0Var = (j0) this.d;
                qc0.k kVar = j0Var.f244440b;
                BackendFlow newBackendFlow = (BackendFlow) obj2;
                Intrinsics.checkNotNullParameter(newBackendFlow, "newBackendFlow");
                if (Intrinsics.f(newBackendFlow, backendFlow)) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    c0 c0Var = hhm.f.f152430b;
                    long j22 = this.f108529b;
                    return efm.b.A(j22, timeUnit, c0Var).l(new aua.d(j0Var, j22, 2));
                }
                String str8 = newBackendFlow.f;
                if (str8 != null) {
                    ((te0.r) kVar.g0()).set(r0.q((Map) ((te0.r) kVar.g0()).get(), new Pair(str8, backendFlow)));
                }
                v vVarK = kVar.k();
                od0.i.Companion.getClass();
                ((te0.r) vVarK).set(od0.h.a(newBackendFlow));
                j0Var.U.onNext(new qc0.g(backendFlow, newBackendFlow));
                return new pfm.h(new qc0.x(j0Var, 0), 2);
            case 15:
                jpf.a aVar3 = (jpf.a) this.f108530c;
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                w4l.f fVar = (w4l.f) aVar3.f177268b;
                w4l.i iVar2 = w4l.i.f294643c;
                Object obj3 = this.d;
                return fVar.e(obj3, iVar2).takeUntil(new qe0.g(0, new qc7.c(19))).map(new qe0.g(1, new qc7.c(16))).concatWith(((qe0.f) aVar3.f177269c).a(obj3, this.f108529b, false));
            case 16:
                return qra.h.f((qra.h) this.f108530c, (String) this.d, this.f108529b);
            case 17:
                n0 n0Var = (n0) this.f108530c;
                ProducerScope producerScope = (ProducerScope) this.d;
                long jLongValue5 = n0Var.f186428a + ((Long) obj2).longValue();
                n0Var.f186428a = jLongValue5;
                long j42 = this.f108529b;
                if (jLongValue5 > j42) {
                    n0Var.f186428a = j42;
                }
                producerScope.mo3647trySendJP2dKIU(new oe0.c(n0Var.f186428a / j42));
                return Unit.f186387a;
            default:
                return qvj.c.k((qvj.c) this.f108530c, (ArrayList) this.d, this.f108529b);
        }
    }

    public /* synthetic */ a(Object obj2, long j2, Object obj3, int i) {
        this.f108528a = i;
        this.f108530c = obj2;
        this.f108529b = j2;
        this.d = obj3;
    }

    public /* synthetic */ a(Object obj2, Object obj3, long j2, int i) {
        this.f108528a = i;
        this.f108530c = obj2;
        this.d = obj3;
        this.f108529b = j2;
    }
}
