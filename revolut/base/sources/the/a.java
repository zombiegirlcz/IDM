package the;

import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfe.c;
import sfe.s;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f271367a;

    public a(Map productEventHandlersMap) {
        Intrinsics.checkNotNullParameter(productEventHandlersMap, "productEventHandlersMap");
        this.f271367a = productEventHandlersMap;
    }

    public final Object a(ProductId productId, s sVar, Continuation continuation) {
        Object obj2 = this.f271367a.get(productId);
        if (obj2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object objB3 = ((c) obj2).b3(sVar, continuation);
        return objB3 == fim.a.COROUTINE_SUSPENDED ? objB3 : Unit.f186387a;
    }
}
