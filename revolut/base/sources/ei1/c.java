package ei1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.address.common.impl.flow.field_search.search.FieldSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FieldSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FieldSearchScreen fieldSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = fieldSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVarE3 = this.v.d();
        String listId = model.f53228a;
        kVarE3.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ADD_MANUALLY_ID")) {
            kVarE3.C2(new f(((e) ((j2) kVarE3.f126352r.f22677a).getValue()).f126345b));
        } else {
            kVarE3.C2(new g(listId));
        }
        return Unit.f186387a;
    }
}
