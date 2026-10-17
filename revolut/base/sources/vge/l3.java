package vge;

import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l3 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ProductAccountDescriptor$Value.Discover v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(ProductAccountDescriptor$Value.Discover discover, Continuation continuation) {
        super(2, continuation);
        this.v = discover;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l3 l3Var = new l3(this.v, continuation);
        l3Var.u = obj2;
        return l3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l3) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        List list2 = list;
        boolean z = true;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (Intrinsics.f(((SubSpaceAccountItem) it8.next()).f89560b.getF89504c(), this.v.f89726b)) {
                    z = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
