package qn1;

import com.revolut.feature.apm.bills.bpay.impl.screen.input.model.BPayBill;
import java.time.LocalDateTime;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import rd0.d;
import vn1.b;
import yhm.m;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final BPayBill.ServiceProvider a(b.C1608b c1608b) {
        Object objA;
        Intrinsics.checkNotNullParameter(c1608b, "<this>");
        String strB = c1608b.getId();
        String strD = c1608b.getName();
        String strC = c1608b.getLogoUrl();
        String strA = c1608b.getEdt();
        Object obj2 = null;
        if (strA != null) {
            try {
                m.Companion companion = m.INSTANCE;
                objA = LocalDateTime.parse(strA);
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            Throwable thA = m.a(objA);
            if (thA == null) {
                obj2 = objA;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Failed to parse Date for " + thA + " using LocalDateTime");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(c.ERROR, null, null, illegalStateException, h0Var);
            }
            obj2 = (LocalDateTime) obj2;
        }
        b.a aVarF = c1608b.getPaymentMethodDetails();
        Intrinsics.checkNotNullParameter(aVarF, "<this>");
        return new BPayBill.ServiceProvider(strB, strD, strC, obj2, new BPayBill.PaymentMethodDetails(aVarF.getBillerCode(), aVarF.getIcrn()), c1608b.getPaymentMethod());
    }
}
