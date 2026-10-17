package gzd;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_categories.AllCategoriesScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AllCategoriesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AllCategoriesScreen allCategoriesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = allCategoriesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Q.getValue();
        String listId = model.f53304a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (a0.H(listId, "ID_TRANSACTION_CATEGORY_SELECTABLE_", false)) {
            hVar.o.h3(d0.e0(listId, "ID_TRANSACTION_CATEGORY_SELECTABLE_"));
        }
        return Unit.f186387a;
    }
}
