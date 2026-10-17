package rnd;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value f255631a;

    public r(ProductAccountDescriptor$Value productAccountDescriptor$Value) {
        this.f255631a = productAccountDescriptor$Value;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        List linkedAccounts = (List) obj2;
        Intrinsics.checkNotNullParameter(linkedAccounts, "linkedAccounts");
        Iterator it8 = linkedAccounts.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((AnalyticsAccount.Linked) next).f99189a, this.f255631a.getF89728b().f89729a)) {
                break;
            }
        }
        return (AnalyticsAccount.Linked) next;
    }
}
