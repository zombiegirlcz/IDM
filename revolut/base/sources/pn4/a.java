package pn4;

import io4.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ll4.a0;
import ll4.r;
import on4.c;
import rn4.d;
import yw4.q;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f237663a = r0.k(new Pair("ACTIVE", q.ACTIVE), new Pair("INACTIVE", q.INACTIVE), new Pair("LATE", q.LATE), new Pair("DEACTIVATING", q.DEACTIVATING), new Pair("TERMINATED", q.TERMINATED));

    public static final r a(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        double purchaseRate = cVar.getPurchaseRate();
        double withdrawalRate = cVar.getWithdrawalRate();
        Double apr = cVar.getApr();
        d promotionalPeriod = cVar.getPromotionalPeriod();
        ArrayList arrayList = null;
        a0 a0Var = promotionalPeriod != null ? new a0(promotionalPeriod.getInterestRate(), promotionalPeriod.getStartDate(), promotionalPeriod.getEndDate(), promotionalPeriod.getTermsUrl()) : null;
        c.a rates = cVar.getRates();
        ll4.q qVar = new ll4.q(rates.getWithdrawal(), rates.getTransfer(), rates.getApr(), rates.getPurchase());
        List detailsSection = cVar.getDetailsSection();
        if (detailsSection != null) {
            List list = detailsSection;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(jo4.a.a((f) it8.next()));
            }
        }
        return new r(purchaseRate, withdrawalRate, apr, a0Var, qVar, arrayList);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final ll4.y b(on4.h r28) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            ll4.y r1 = new ll4.y
            long r2 = r28.getRemainingBalance()
            long r4 = r28.getRepaymentDueDate()
            java.time.ZoneId r0 = g0m.a.f139502a
            java.time.LocalDate r4 = oc.c.H(r4, r0)
            long r5 = r28.getStatementDate()
            java.time.LocalDate r5 = oc.c.H(r5, r0)
            long r6 = r28.getMinimumRepayment()
            long r8 = r28.getInterest()
            long r10 = r28.getCurrentDate()
            java.time.LocalDate r10 = oc.c.H(r10, r0)
            boolean r11 = r28.getStatementsAvailable()
            long r12 = r28.getClearBalanceInterest()
            long r14 = r28.getStatementBalance()
            java.lang.Long r16 = r28.getPaymentOverdueAmount()
            java.lang.Long r17 = r28.getPaymentOverdueDate()
            r18 = 0
            r19 = r1
            r20 = r2
            if (r17 == 0) goto L56
            long r1 = r17.longValue()
            java.time.LocalDate r1 = oc.c.H(r1, r0)
            r17 = r1
            goto L58
        L56:
            r17 = r18
        L58:
            java.lang.Long r1 = r28.getPreviousStatementDate()
            if (r1 == 0) goto L69
            long r1 = r1.longValue()
            java.time.LocalDate r0 = oc.c.H(r1, r0)
        L66:
            r1 = r19
            goto L6c
        L69:
            r0 = r18
            goto L66
        L6c:
            java.lang.Long r19 = r28.getScheduledPaymentAmount()
            r2 = r20
            long r20 = r28.getNonRepayableBalance()
            on4.h$a r22 = r28.getPaymentOptionExtraAttributes()
            if (r22 == 0) goto Lb2
            r23 = r0
            ll4.v r0 = new ll4.v
            on4.h$b r22 = r22.getSpei()
            r24 = r1
            if (r22 == 0) goto L9e
            ll4.x r1 = new ll4.x
            r25 = r2
            java.lang.String r2 = r22.getBeneficiaryName()
            java.lang.String r3 = r22.getBank()
            r27 = r4
            java.lang.String r4 = r22.getClabe()
            r1.<init>(r2, r3, r4)
            goto La4
        L9e:
            r25 = r2
            r27 = r4
            r1 = r18
        La4:
            r0.<init>(r1)
            r22 = r0
            r18 = r23
            r1 = r24
            r2 = r25
            r4 = r27
            goto Lb6
        Lb2:
            r22 = r18
            r18 = r0
        Lb6:
            r1.<init>(r2, r4, r5, r6, r8, r10, r11, r12, r14, r16, r17, r18, r19, r20, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.a.b(on4.h):ll4.y");
    }
}
