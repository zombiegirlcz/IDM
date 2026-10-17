package s8h;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.model.Data;
import com.revolut.feature.donations.api.interactor.CharitiesCollectionsInteractor$CollectionNotFoundException;
import com.revolut.feature.donations.api.interactor.DonationsInteractor$CharityNotFoundException;
import com.revolut.feature.donations.impl.domain.model.CharityTransactionsParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.youTransactor.uCube.rpc.DeviceInfos;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.command.GetInfosCommand;
import fa1.z;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261005a;

    public /* synthetic */ h(int i) {
        this.f261005a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int iCode;
        Object next;
        HttpException httpException;
        int iCode2;
        int i = 0;
        qa1.d dVar = null;
        Long lValueOf = null;
        switch (this.f261005a) {
            case 0:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (InvestTransaction) zhm.d0.b0(it8);
            case 1:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 4:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM revolut_card_sca_counters");
                try {
                    sQLiteStatementPrepare.step();
                    return null;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 5:
                s9b.g update = (s9b.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data = Data.copy$default(update.f261154a, null, null, true, 3, null);
                Intrinsics.checkNotNullParameter(data, "data");
                return new s9b.g(data);
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                ArrayList arrayListC = iii.c.c(2);
                yp0.b.k(arrayListC, 0, 0, 0, 0, 31);
                return arrayListC;
            case 7:
                GetInfosCommand execute = (GetInfosCommand) obj2;
                Intrinsics.checkNotNullParameter(execute, "$this$execute");
                return execute.getResponseData();
            case 8:
                int iIntValue = ((Integer) obj2).intValue();
                Regex regex = jli.g.f175847a;
                String hexString = Integer.toHexString(iIntValue);
                Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
                return hexString;
            case 9:
                GetInfosCommand execute2 = (GetInfosCommand) obj2;
                Intrinsics.checkNotNullParameter(execute2, "$this$execute");
                DeviceInfos deviceInfos = new DeviceInfos(execute2.getResponseData());
                String serial = deviceInfos.getSerial();
                Intrinsics.checkNotNullExpressionValue(serial, "getSerial(...)");
                String svppFirmware = deviceInfos.getSvppFirmware();
                Intrinsics.checkNotNullExpressionValue(svppFirmware, "getSvppFirmware(...)");
                String bleFirmwareVersion = deviceInfos.getBleFirmwareVersion();
                Intrinsics.checkNotNullExpressionValue(bleFirmwareVersion, "getBleFirmwareVersion(...)");
                int autoPowerOffTimeout = deviceInfos.getAutoPowerOffTimeout();
                qa1.c cVar = qa1.d.Companion;
                String text = deviceInfos.getTerminalState();
                Intrinsics.checkNotNullExpressionValue(text, "getTerminalState(...)");
                cVar.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                qa1.d[] dVarArrValues = qa1.d.values();
                int length = dVarArrValues.length;
                while (true) {
                    if (i < length) {
                        qa1.d dVar2 = dVarArrValues[i];
                        if (kotlin.text.a0.z(dVar2.a(), text, true)) {
                            dVar = dVar2;
                        } else {
                            i++;
                        }
                    }
                }
                if (dVar == null) {
                    dVar = qa1.d.UNKNOWN;
                }
                return new qa1.b(serial, svppFirmware, bleFirmwareVersion, autoPowerOffTimeout, dVar);
            case 10:
                fa1.z result = (fa1.z) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                return result instanceof z.a.C0782a ? efm.r.just(result).delay(100L, TimeUnit.MILLISECONDS) : efm.r.just(result);
            case 11:
                return Unit.f186387a;
            case 12:
                Intrinsics.checkNotNullParameter((RPCCommand) obj2, "<this>");
                return Unit.f186387a;
            case 13:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                fa1.l lVar = (fa1.l) pair.f186385a;
                if (!((Boolean) pair.f186386b).booleanValue()) {
                    return lVar;
                }
                Intrinsics.h(lVar);
                fa1.n paymentState = fa1.n.CANCELLING;
                fa1.o paymentStatus = lVar.f133190a;
                fa1.j cardReaderInterface = lVar.f133191b;
                fa1.m mVar = lVar.d;
                fa1.y yVar = lVar.e;
                Intrinsics.checkNotNullParameter(paymentStatus, "paymentStatus");
                Intrinsics.checkNotNullParameter(cardReaderInterface, "cardReaderInterface");
                Intrinsics.checkNotNullParameter(paymentState, "paymentState");
                return new fa1.l(paymentStatus, cardReaderInterface, paymentState, mVar, yVar);
            case 14:
                sa2.d update2 = (sa2.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return sa2.d.a(update2, 0L, "", null, 11);
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                while (i < 5) {
                    eVarB.add(new s7(a0.d.n("CREDIT_POST_TERMINATION_PLAN_LOADING_", i), 0, 0, 0, 0, false, null, 126));
                    i++;
                }
                return new ja5.a(yp0.b.g(zhm.u.a(eVarB), sa5.c.b(), null, 0, 0, 126));
            case 16:
                Data data2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                Throwable error = data2.getError();
                ba6.f fVar = (ba6.f) data2.getContent();
                if (fVar != null && fVar.e.isEmpty()) {
                    return Data.copy$default(data2, null, new CharitiesCollectionsInteractor$CollectionNotFoundException(2), false, 4, null);
                }
                if (!(error instanceof HttpException) || 400 > (iCode = ((HttpException) error).code()) || iCode >= 500) {
                    return data2;
                }
                Intrinsics.checkNotNullParameter("Collection doesn't exist anymore or ID is incorrect", "message");
                return Data.copy$default(data2, null, new CharitiesCollectionsInteractor$CollectionNotFoundException("Collection doesn't exist anymore or ID is incorrect", error), false, 4, null);
            case 17:
                List charities = (List) obj2;
                Intrinsics.checkNotNullParameter(charities, "charities");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : charities) {
                    if (hx7.b.o((ba6.l) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 18:
                ba6.r unlockedCampaign = (ba6.r) obj2;
                Intrinsics.checkNotNullParameter(unlockedCampaign, "unlockedCampaign");
                od0.i.Companion.getClass();
                return od0.h.a(unlockedCampaign);
            case 19:
                ba6.l it9 = (ba6.l) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return zhm.u.c(it9);
            case 20:
                Intrinsics.checkNotNullParameter((lk0.e) obj2, "it");
                return null;
            case 21:
                lk0.e previousPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(previousPage, "previousPage");
                List list = previousPage.f196171a;
                if (list.isEmpty()) {
                    return null;
                }
                int size = ((qa6.d) zhm.d0.b0(list)).f243966a.size();
                CharityTransactionsParams charityTransactionsParams = (CharityTransactionsParams) previousPage.f196172b;
                if (size < charityTransactionsParams.f71990a) {
                    return null;
                }
                Long lValueOf2 = null;
                for (qa6.c cVar2 : ((qa6.d) zhm.d0.b0(list)).f243966a) {
                    long jA = cVar2.a();
                    if (cVar2 instanceof qa6.a) {
                        lValueOf = Long.valueOf(Math.min(lValueOf != null ? lValueOf.longValue() : jA, jA));
                    } else {
                        if (!(cVar2 instanceof qa6.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lValueOf2 = Long.valueOf(Math.min(lValueOf2 != null ? lValueOf2.longValue() : jA, jA));
                    }
                }
                if (lValueOf == null) {
                    lValueOf = charityTransactionsParams.f71992c;
                }
                if (lValueOf2 == null) {
                    lValueOf2 = charityTransactionsParams.d;
                }
                return new CharityTransactionsParams(charityTransactionsParams.f71991b, charityTransactionsParams.f71990a, lValueOf, lValueOf2);
            case 22:
                List availablePockets = (List) obj2;
                Intrinsics.checkNotNullParameter(availablePockets, "availablePockets");
                Iterator it10 = availablePockets.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next = it10.next();
                        if (((io3.d) next).i > 0) {
                        }
                    } else {
                        next = null;
                    }
                }
                io3.d dVar3 = (io3.d) next;
                if (dVar3 == null && (dVar3 = (io3.d) zhm.d0.d0(availablePockets)) == null) {
                    throw new RuntimeException() { // from class: com.revolut.feature.donations.api.interactor.DonationPocketsInteractor$NoAvailableCurrencyException
                    };
                }
                return new xi0.b(6, dVar3.f163147c, null);
            case 23:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                Set set = config.U;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(set, 10));
                Iterator it11 = set.iterator();
                while (it11.hasNext()) {
                    arrayList2.add(((xi0.b) it11.next()).f306286a);
                }
                return arrayList2;
            case 24:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list2 = (List) pair2.f186385a;
                List list3 = (List) pair2.f186386b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list2) {
                    io3.d dVar4 = (io3.d) obj4;
                    if (h30.l.D(xi0.b.Companion, dVar4.f163147c) && !list3.contains(dVar4.f163147c)) {
                        arrayList3.add(obj4);
                    }
                }
                return arrayList3;
            case 25:
                yvh.b autoInvest = (yvh.b) obj2;
                Intrinsics.checkNotNullParameter(autoInvest, "autoInvest");
                od0.h hVar = od0.i.Companion;
                yvh.b.Companion.getClass();
                yvh.b bVar = Intrinsics.f(autoInvest, yvh.b.f317175m) ? null : autoInvest;
                hVar.getClass();
                return od0.h.a(bVar);
            case 26:
                Data data3 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data3, "data");
                Throwable error2 = data3.getError();
                if (!(error2 instanceof HttpException) || 400 > (iCode2 = (httpException = (HttpException) error2).code()) || iCode2 >= 500) {
                    return data3;
                }
                Intrinsics.checkNotNullParameter("Charity doesn't exist anymore or ID is incorrect", "message");
                return Data.copy$default(data3, null, new DonationsInteractor$CharityNotFoundException("Charity doesn't exist anymore or ID is incorrect", httpException), false, 4, null);
            case 27:
                Boolean shouldAccept = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(shouldAccept, "shouldAccept");
                return Boolean.valueOf(!shouldAccept.booleanValue());
            case 28:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return (((Boolean) pair3.f186385a).booleanValue() && ((bla.c) pair3.f186386b) == bla.c.ENABLED) ? new b39.a(b39.d.DONATIONS) : b39.b.f12015a;
            default:
                od0.i paymentMethodOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(paymentMethodOptional, "paymentMethodOptional");
                od0.h hVar2 = od0.i.Companion;
                Object obj5 = paymentMethodOptional.f224257a;
                PaymentMethod.Pocket pocket = obj5 instanceof PaymentMethod.Pocket ? (PaymentMethod.Pocket) obj5 : null;
                hVar2.getClass();
                return od0.h.a(pocket);
        }
    }

    public /* synthetic */ h(Object obj2, int i) {
        this.f261005a = i;
    }
}
