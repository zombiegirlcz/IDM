package vge;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ w1 f289046a = new w1();

    private w1() {
    }

    public static Pair a(String value) {
        Object next;
        Intrinsics.checkNotNullParameter(value, "value");
        List listN0 = kotlin.text.d0.n0(value, new String[]{"_:_"}, 0, 6);
        if (listN0.size() == 2 && ((CharSequence) listN0.get(0)).length() != 0 && ((CharSequence) listN0.get(1)).length() != 0) {
            Iterator<E> it8 = ProductId.a().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((ProductId) next).getId(), listN0.get(0))) {
                    break;
                }
            }
            ProductId productId = (ProductId) next;
            if (productId != null) {
                return new Pair(productId, new ProductAccountId((String) listN0.get(1), null));
            }
        }
        return null;
    }
}
