package m40;

import com.revolut.chat.ui.callcategory.CallCategoryScreen;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CallCategoryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CallCategoryScreen callCategoryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = callCategoryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.U.getValue();
        String itemId = model.f53228a;
        Object obj3 = model.u;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if ((obj3 instanceof w30.f ? (w30.f) obj3 : null) != null) {
            hVar.C2(new e(((w30.f) obj3).f294081a));
        }
        return Unit.f186387a;
    }
}
