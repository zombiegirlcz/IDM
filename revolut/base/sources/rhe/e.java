package rhe;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductId f254413w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f254414x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, ProductId productId, List list, Continuation continuation) {
        super(1, continuation);
        this.v = mVar;
        this.f254413w = productId;
        this.f254414x = list;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f254413w, this.f254414x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            pfe.f fVar = (pfe.f) this.v.f254432a.get(this.f254413w);
            if (fVar == null) {
                return null;
            }
            List list = this.f254414x;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(((ProductAccountDescriptor$Value.Main) it8.next()).f89728b);
            }
            Set setI1 = d0.i1(arrayList);
            this.u = 1;
            obj2 = fVar.a(setI1, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return (Set) obj2;
    }
}
