package znd;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import cfl.f0;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.CryptoSendFlowContract$Step;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.wealth.api.ui.providers.composite_add_money.CompositeAddMoneyPortfolioInfoProviderContract$Limits;
import com.revolut.sso.impl.ui.passcode.create_flow.CreatePasscodeFlowContract$State;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323796a;

    public /* synthetic */ u0(int i) {
        this.f323796a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f323796a) {
            case 0:
                return a.a((a) obj2, null, null, null, null, null, null, 0, false, false, false, !r3.k, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, false, 67107839);
            case 1:
                ((CreatePasscodeFlowContract$State) obj2).getClass();
                Intrinsics.checkNotNullParameter("", "passcodeOnCreate");
                return new CreatePasscodeFlowContract$State("");
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                hg hgVarB = kp2.a.b();
                pb0 pb0VarA = nb0.a(pb0.Companion, "ID_REQUEST_DETAILS_DESCRIPTION_LOADING", false, 6);
                yp0.b.l(pb0VarA, 0, 0, 0, 0, null, false, 63);
                return new zo2.g(zhm.v.k(hgVarB, pb0VarA), true, true);
            case 3:
                List recurringOrders = (List) obj2;
                Intrinsics.checkNotNullParameter(recurringOrders, "recurringOrders");
                return Boolean.valueOf(recurringOrders.isEmpty());
            case 4:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                alc.n nVar = (alc.n) pair.f186385a;
                f0.a aVar = (f0.a) pair.f186386b;
                return new CompositeAddMoneyPortfolioInfoProviderContract$Limits(nVar.k ? aVar.b().f23733b : aVar.b().f23732a, null, aVar.b().f23734c);
            case 5:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : pockets) {
                    if (h30.l.D(xi0.b.Companion, ((io3.d) obj3).f163147c)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 6:
                zp0.f it8 = (zp0.f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f324114a;
            case 7:
                String str = (String) obj2;
                Intrinsics.checkNotNullParameter(str, "str");
                if (str.length() != 1) {
                    throw new IllegalStateException("expect 1st symbol of day");
                }
                int i = Integer.parseInt(str);
                return Boolean.valueOf(i >= 0 && i < 4);
            case 8:
                String str2 = (String) obj2;
                Intrinsics.checkNotNullParameter(str2, "str");
                if (str2.length() != 2) {
                    throw new IllegalStateException("expect two symbols of day");
                }
                int numericValue = Character.getNumericValue(str2.charAt(0));
                int numericValue2 = Character.getNumericValue(str2.charAt(1));
                if (numericValue == 0 ? 1 > numericValue2 || numericValue2 >= 10 : numericValue == 1 || numericValue == 2 ? numericValue2 < 0 || numericValue2 >= 10 : numericValue != 3 || numericValue2 < 0 || numericValue2 >= 2) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                String str3 = (String) obj2;
                Intrinsics.checkNotNullParameter(str3, "str");
                if (str3.length() != 1) {
                    throw new IllegalStateException("expect 1st symbol of month");
                }
                int i2 = Integer.parseInt(str3);
                return Boolean.valueOf(i2 >= 0 && i2 < 2);
            case 10:
                String str4 = (String) obj2;
                Intrinsics.checkNotNullParameter(str4, "str");
                if (str4.length() != 2) {
                    throw new IllegalStateException("expect two symbols of month");
                }
                int numericValue3 = Character.getNumericValue(str4.charAt(0));
                int numericValue4 = Character.getNumericValue(str4.charAt(1));
                if (numericValue3 == 0 ? 1 > numericValue4 || numericValue4 >= 10 : numericValue3 != 1 || numericValue4 < 0 || numericValue4 >= 3) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                MatchResult result = (MatchResult) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                return p.a.p("{", result.getValue(), "}");
            case 12:
                return ht3.h.f155276a;
            case 13:
                CryptoSendFlowContract$Step step = (CryptoSendFlowContract$Step) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                return Boolean.valueOf(step instanceof CryptoSendFlowContract$Step.WalletsList);
            case 14:
                List tasks = (List) obj2;
                Intrinsics.checkNotNullParameter(tasks, "tasks");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : tasks) {
                    dp8.b bVar = (dp8.b) obj4;
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    if (bVar.e == dp8.h.COMPLETED) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 15:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new eq8.c0((List) pair2.f186385a, (List) pair2.f186386b);
            case 16:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM `biometric_verification_deffered_upload_token`");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "token");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList3.add(new ar.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow)));
                        break;
                    }
                    return arrayList3;
                } finally {
                }
            case 17:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM `biometric_verification_deffered_upload_token`").step();
                    return Unit.f186387a;
                } finally {
                }
            case 18:
                Data it9 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(it9.getContent() != null);
            case 19:
                zq5.u update = (zq5.u) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return zq5.u.a(update, null, false, null, null, null, 15);
            case 20:
                return zq5.u.a((zq5.u) obj2, null, false, null, null, null, 25);
            case 21:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 22:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return new zqf.e(null, (List) getDefaultLoadingItems2.invoke(), false);
            case 23:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                j61.c cVar = (j61.c) zhm.d0.d0(it10);
                if (cVar != null) {
                    return cVar.f171656a;
                }
                return null;
            case 24:
                zqf.d updateState = (zqf.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return zqf.d.a(updateState, new Data(null, null, true, 3, null));
            case 25:
                rp0.p it11 = (rp0.p) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11 == rp0.p.USER);
            case 26:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (a3) zhm.d0.b0(it12);
            case 27:
                Data it13 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) it13.getContent();
                return Boolean.valueOf(pricingPlanSubscription != null ? pricingPlanSubscription.o : false);
            case 28:
                return (a3) zhm.d0.b0((List) obj2);
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
        }
    }
}
