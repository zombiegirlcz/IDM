package cj9;

import dj9.r;
import dj9.v;
import dj9.x;
import dj9.y;
import dj9.z;
import i26.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zh9.c1;
import zh9.k1;
import zh9.l1;
import zh9.m1;
import zh9.n1;
import zh9.o1;
import zh9.t1;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f24628a = r0.k(new Pair("NOT_AVAILABLE", t1.NotAvailable), new Pair("MAX_PURCHASE_LESS_THAN_MIN", t1.MaxPurchaseLessThanMin), new Pair("PURCHASE_LESS_THAN_MIN", t1.PurchaseLessThanMin), new Pair("PURCHASE_BIGGER_THAN_MAX", t1.PurchaseBiggerThanMax), new Pair("INSUFFICIENT_CURRENT_BALANCE", t1.InsufficientFundsCurrentBalance));

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.Map] */
    public static final o1 a(z zVar) {
        String str;
        Iterator it8;
        m1 k1Var;
        String str2 = "<this>";
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        xi0.a aVar = xi0.b.Companion;
        String currency = zVar.getCurrency();
        aVar.getClass();
        xi0.b currency2 = xi0.a.a(currency);
        List options = zVar.getOptions();
        ArrayList arrayList = new ArrayList(w.t(options, 10));
        Iterator it9 = options.iterator();
        while (it9.hasNext()) {
            y yVar = (y) it9.next();
            Intrinsics.checkNotNullParameter(yVar, str2);
            Intrinsics.checkNotNullParameter(currency2, "currency");
            if (yVar instanceof x) {
                k1Var = new l1(((x) yVar).getTerm());
                str = str2;
                it8 = it9;
            } else {
                if (!(yVar instanceof dj9.w)) {
                    throw new NoWhenBranchMatchedException();
                }
                dj9.w wVar = (dj9.w) yVar;
                int term = wVar.getTerm();
                String blockReason = wVar.getBlockReason();
                c1 c1Var = null;
                t1 t1Var = blockReason != null ? (t1) l.B(blockReason, f24628a, t1.NotAvailable) : null;
                v termDetails = wVar.getTermDetails();
                Intrinsics.checkNotNullParameter(termDetails, str2);
                Intrinsics.checkNotNullParameter(currency2, "currency");
                n1 n1Var = new n1(new dj0.d(termDetails.getMinPurchaseAmount(), currency2), new dj0.d(termDetails.getMaxPurchaseAmount(), currency2), termDetails.getHasUpfrontPayment());
                r purchaseSimulation = wVar.getPurchaseSimulation();
                if (purchaseSimulation != null) {
                    Intrinsics.checkNotNullParameter(purchaseSimulation, str2);
                    Intrinsics.checkNotNullParameter(currency2, "currency");
                    str = str2;
                    it8 = it9;
                    c1Var = new c1(new dj0.d(purchaseSimulation.getFirstRepaymentAmount(), currency2), new dj0.d(purchaseSimulation.getSecondRepaymentAmount(), currency2), purchaseSimulation.getFirstRepaymentDate(), new dj0.d(purchaseSimulation.getTotalFeeAmount(), currency2), new dj0.d(purchaseSimulation.getAmountToTopUp(), currency2));
                } else {
                    str = str2;
                    it8 = it9;
                }
                k1Var = new k1(term, t1Var, n1Var, c1Var);
            }
            arrayList.add(k1Var);
            it9 = it8;
            str2 = str;
        }
        return new o1(arrayList);
    }
}
