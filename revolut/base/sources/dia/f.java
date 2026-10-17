package dia;

import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import gr6.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yfe.a2;
import yfe.b3;
import yfe.e2;
import yfe.o0;
import yfe.t;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.e f114962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f114963b;

    public f(gr6.e freelancerAvailabilityInteractor, h freelancerCashbackInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        this.f114962a = freelancerAvailabilityInteractor;
        this.f114963b = freelancerCashbackInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // yfe.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof dia.d
            if (r0 == 0) goto L13
            r0 = r8
            dia.d r0 = (dia.d) r0
            int r1 = r0.f114960w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114960w = r1
            goto L1a
        L13:
            dia.d r0 = new dia.d
            gim.c r8 = (gim.c) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114960w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            goto L80
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            yhm.o.b(r8)
            goto L4b
        L39:
            yhm.o.b(r8)
            r0.f114960w = r4
            gr6.e r8 = r7.f114962a
            et6.l0 r8 = (et6.l0) r8
            yoj.c r2 = yoj.c.FREELANCER_PHASE_1
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L4b
            goto L7f
        L4b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L54
            goto La1
        L54:
            gr6.h r8 = r7.f114963b
            et6.y0 r8 = (et6.y0) r8
            akg.n r8 = r8.b()
            dia.e r2 = dia.e.f114961a
            akg.n r8 = nim.a.v(r8, r2)
            dg3.d r2 = new dg3.d
            r6 = 7
            r2.<init>(r6)
            cxe.u r8 = nim.a.A(r8, r2)
            dee.a0 r2 = new dee.a0
            r6 = 17
            r2.<init>(r6)
            jhi.b r8 = mo3.a.g(r8, r5, r2, r4)
            r0.f114960w = r3
            java.lang.Object r8 = vkm.q.z(r8, r0)
            if (r8 != r1) goto L80
        L7f:
            return r1
        L80:
            od0.i r8 = (od0.i) r8
            if (r8 == 0) goto La1
            yfe.k0 r0 = new yfe.k0
            java.lang.Object r8 = r8.f224257a
            rr6.o r8 = (rr6.o) r8
            if (r8 == 0) goto L91
            java.math.BigDecimal r8 = r8.getValue()
            goto L92
        L91:
            r8 = r5
        L92:
            if (r8 == 0) goto L9d
            double r1 = r8.doubleValue()
            java.lang.Double r5 = new java.lang.Double
            r5.<init>(r1)
        L9d:
            r0.<init>(r5)
            return r0
        La1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dia.f.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // yfe.o0
    public final Object b(TotalWealthCategoryKey totalWealthCategoryKey, ArrayList arrayList, dj0.d dVar, Continuation continuation) {
        b3 a2Var;
        String str;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ProductAccount.ValueItem valueItem = (ProductAccount.ValueItem) it8.next();
            ProductAccountId.Payload payload = valueItem.getF89504c().f89730b;
            if (payload instanceof ExtendedSubaccountType) {
                a2Var = new e2((ExtendedSubaccountType) payload);
            } else {
                xi0.b currency = valueItem.getF89505g().getCurrency();
                a2Var = (currency == null || (str = currency.f306286a) == null) ? null : new a2(str);
            }
            if (a2Var != null) {
                arrayList2.add(a2Var);
            }
        }
        return new t(dVar, size, arrayList2);
    }
}
