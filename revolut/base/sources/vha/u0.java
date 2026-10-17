package vha;

import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289442a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f289443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProductAccountId f289444c;

    public /* synthetic */ u0(ProductAccountId productAccountId, v0 v0Var) {
        this.f289444c = productAccountId;
        this.f289443b = v0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ProductAccountId productAccountId;
        Object next;
        Pair pair = (Pair) obj2;
        switch (this.f289442a) {
            case 0:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                fo3.c cVar = (fo3.c) pair.f186386b;
                Iterator it8 = list.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    productAccountId = this.f289444c;
                    if (zHasNext) {
                        next = it8.next();
                        if (Intrinsics.f(((io3.d) next).f163145a, productAccountId.f89729a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                io3.d dVar = (io3.d) next;
                return new bia.c(dVar != null ? new nce.b(this.f289443b.f289449c.b(new h9e.e(dVar)), dVar.f163147c) : null, new RecurringPaymentAccount.Pro(productAccountId.f89729a, cVar.f136801a));
            default:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list2 = (List) pair.f186385a;
                fo3.c cVar2 = (fo3.c) pair.f186386b;
                return new bia.c(new nce.b(this.f289443b.f289449c.b(new h9e.f(list2)), cVar2.d.f306286a), new RecurringPaymentAccount.Pro(this.f289444c.f89729a, cVar2.f136801a));
        }
    }

    public /* synthetic */ u0(v0 v0Var, ProductAccountId productAccountId) {
        this.f289443b = v0Var;
        this.f289444c = productAccountId;
    }
}
