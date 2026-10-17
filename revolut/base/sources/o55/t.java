package o55;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o45.b2;
import o45.c2;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f222370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f222371c;

    public /* synthetic */ t(w wVar, String str, int i) {
        this.f222369a = i;
        this.f222370b = wVar;
        this.f222371c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Iterator it8;
        b2 b2Var;
        int i = this.f222369a;
        w wVar = this.f222370b;
        switch (i) {
            case 0:
                List repayments = (List) obj2;
                Intrinsics.checkNotNullParameter(repayments, "repayments");
                RoomDatabase roomDatabase = wVar.f222375b.f212298a;
                String str = this.f222371c;
                return wVar.b(str, (String) DBUtil.performBlocking(roomDatabase, true, false, new mll.h(str, 14)), repayments);
            default:
                List list = (List) obj2;
                n45.d dVar = wVar.f222375b;
                Intrinsics.h(list);
                Intrinsics.checkNotNullParameter(list, "<this>");
                String loanId = this.f222371c;
                String str2 = "loanId";
                Intrinsics.checkNotNullParameter(loanId, "loanId");
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    i55.d0 d0Var = (i55.d0) it9.next();
                    Intrinsics.checkNotNullParameter(d0Var, "<this>");
                    Intrinsics.checkNotNullParameter(loanId, str2);
                    String str3 = str2;
                    ArrayList arrayList2 = arrayList;
                    String id10 = d0Var.getId();
                    String transactionId = d0Var.getTransactionId();
                    String string = d0Var.getRepaymentDateTime().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    String currency = d0Var.getCurrency();
                    long amount = d0Var.getAmount();
                    String type = d0Var.getType();
                    String clientId = d0Var.getClientId();
                    String firstName = d0Var.getFirstName();
                    String lastName = d0Var.getLastName();
                    Long principal = d0Var.getPrincipal();
                    Long accruedInterest = d0Var.getAccruedInterest();
                    Long lateRepaymentInterest = d0Var.getLateRepaymentInterest();
                    String transferType = d0Var.getTransferType();
                    i55.a0 accountDetails = d0Var.getAccountDetails();
                    if (accountDetails != null) {
                        Object obj3 = d55.c.f111351a;
                        Intrinsics.checkNotNullParameter(accountDetails, "<this>");
                        it8 = it9;
                        b2Var = new b2(accountDetails.getAccountNumber(), accountDetails.getInternalPocketId());
                    } else {
                        it8 = it9;
                        b2Var = null;
                    }
                    arrayList2.add(new c2(loanId, id10, transactionId, string, currency, amount, type, clientId, firstName, lastName, principal, accruedInterest, lateRepaymentInterest, transferType, b2Var, d0Var.getInsuranceType()));
                    arrayList = arrayList2;
                    str2 = str3;
                    it9 = it8;
                }
                dVar.getClass();
                DBUtil.performBlocking(dVar.f212298a, false, true, new n45.b(dVar, arrayList, 2));
                return Unit.f186387a;
        }
    }
}
