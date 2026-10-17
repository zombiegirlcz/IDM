package jb0;

import com.revolut.core.backend_flow.impl.ui.entities_selection.EntitiesSelectionController;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zc0.l3;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EntitiesSelectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EntitiesSelectionController entitiesSelectionController, Continuation continuation) {
        super(2, continuation);
        this.v = entitiesSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVarK3 = this.v.R2();
        Intrinsics.h(model);
        i iVar = (i) eVarK3;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = ((RowDelegate.Model) model.f53305b).u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.core.backend_flow.ui.screen.EntitySelectionParcel");
        l3 l3Var = (l3) obj3;
        iVar.L2(iVar.f172544t.c(((d) ((j2) iVar.u.f22677a).getValue()).f172537a, l3Var.f321081a.getId(), l3Var.f321082b.getId()));
        return Unit.f186387a;
    }
}
