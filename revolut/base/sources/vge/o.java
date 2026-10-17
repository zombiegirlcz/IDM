package vge;

import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.api.exceptions.ProductAccountNotFoundException;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.i implements Function3 {
    public /* synthetic */ Data u;
    public /* synthetic */ List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductId f288962w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ProductId productId, Continuation continuation) {
        super(3, continuation);
        this.f288962w = productId;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        o oVar = new o(this.f288962w, (Continuation) obj4);
        oVar.u = (Data) obj2;
        oVar.v = (List) obj3;
        return oVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProductAccountId f89504c;
        ProductAccountId f89504c2;
        Data data = this.u;
        List list = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (data.getError() == null && data.getContent() != null && (data.getContent() instanceof ProductAccount.ValueItem.Discover)) {
            List<ProductAccountDescriptor$Value.Discover> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (ProductAccountDescriptor$Value.Discover discover : list2) {
                    String str = discover.f89726b.f89729a;
                    ProductAccount.ValueItem valueItem = (ProductAccount.ValueItem) data.getContent();
                    String str2 = null;
                    if (Intrinsics.f(str, (valueItem == null || (f89504c2 = valueItem.getF89504c()) == null) ? null : f89504c2.f89729a) && discover.f89725a == this.f288962w) {
                        ProductAccount.ValueItem valueItem2 = (ProductAccount.ValueItem) data.getContent();
                        if (valueItem2 != null && (f89504c = valueItem2.getF89504c()) != null) {
                            str2 = f89504c.f89729a;
                        }
                        return Data.copy$default(data, null, new ProductAccountNotFoundException(p.a.p("Discover item accountId=", str2, " is hidden")), false, 5, null);
                    }
                }
            }
        }
        return data;
    }
}
