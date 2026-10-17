package e25;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import ft3.d1;
import ft3.j1;
import hy3.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import yfe.k;
import yfe.o0;
import yfe.o1;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f122040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f122041b;

    public h(j otherCreditProductsAvailabilityInteractor, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(otherCreditProductsAvailabilityInteractor, "otherCreditProductsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f122040a = otherCreditProductsAvailabilityInteractor;
        this.f122041b = uiKitResources;
    }

    public static final boolean c(Map map, j1 j1Var) {
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            d1 d1Var = (d1) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            if (d1Var.f137810a == j1Var && zBooleanValue) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // yfe.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof e25.g
            if (r0 == 0) goto L13
            r0 = r5
            e25.g r0 = (e25.g) r0
            int r1 = r0.f122039w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f122039w = r1
            goto L1a
        L13:
            e25.g r0 = new e25.g
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f122039w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            r0.f122039w = r3
            hy3.j r5 = r4.f122040a
            java.io.Serializable r5 = r5.d(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.util.Map r5 = (java.util.Map) r5
            java.util.Collection r0 = r5.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L55
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            goto La0
        L55:
            java.util.Iterator r0 = r0.iterator()
        L59:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La0
            java.lang.Object r1 = r0.next()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L59
            ft3.j1 r0 = ft3.j1.CREDIT_CARD
            boolean r0 = c(r5, r0)
            ft3.j1 r1 = ft3.j1.FIXED_TERM_CREDIT
            boolean r1 = c(r5, r1)
            ft3.j1 r2 = ft3.j1.MORTGAGE
            boolean r5 = c(r5, r2)
            if (r0 == 0) goto L86
            if (r1 == 0) goto L86
            if (r5 == 0) goto L86
            yfe.d0 r5 = yfe.d0.CC_LOAN_MORTGAGE
            goto L9a
        L86:
            if (r1 == 0) goto L8f
            if (r0 != 0) goto L8f
            if (r5 != 0) goto L8f
            yfe.d0 r5 = yfe.d0.LOAN
            goto L9a
        L8f:
            if (r0 == 0) goto L98
            if (r1 != 0) goto L98
            if (r5 != 0) goto L98
            yfe.d0 r5 = yfe.d0.CC
            goto L9a
        L98:
            yfe.d0 r5 = yfe.d0.DEFAULT
        L9a:
            yfe.e0 r0 = new yfe.e0
            r0.<init>(r5)
            return r0
        La0:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e25.h.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // yfe.o0
    public final Object b(TotalWealthCategoryKey totalWealthCategoryKey, ArrayList arrayList, dj0.d dVar, Continuation continuation) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                return new k(this.f122041b.b(new TextLocalisedClause(R$string.home_total_wealth_category_credit_title, null, null, 14)).toString(), dVar, arrayList2.size(), o1.INSTANCE);
            }
            Object next = it8.next();
            ProductAccountId productAccountId = ((ProductAccount.ValueItem.Main) next).f89504c;
            ProductAccountId.Payload payload = productAccountId.f89730b;
            if (!((payload instanceof CreditAccountType ? (CreditAccountType) payload : null) instanceof CreditAccountType.EmptyState) && !a0.H(productAccountId.f89729a, "Total-", false)) {
                arrayList2.add(next);
            }
        }
    }
}
