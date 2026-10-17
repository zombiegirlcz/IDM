package sa0;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.backend_flow.impl.ui.base_form_screen.BaseFormController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ BaseFormController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(BaseFormController baseFormController, Continuation continuation) {
        super(2, continuation);
        this.u = baseFormController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((aw0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        KProperty[] kPropertyArr = BaseFormController.U;
        BaseFormController baseFormController = this.u;
        baseFormController.j3().setExpanded(false, true);
        RecyclerView.LayoutManager layoutManager = baseFormController.h().getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        baseFormController.h().smoothScrollToPosition(((LinearLayoutManager) layoutManager).getItemCount());
        return Unit.f186387a;
    }
}
