package zng;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.feature.user_declarations.shared.flows.name.screen.NameScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ NameScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NameScreen nameScreen, Continuation continuation) {
        super(2, continuation);
        this.u = nameScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        KProperty[] kPropertyArr = NameScreen.U;
        NameScreen nameScreen = this.u;
        lng.b bVarD3 = nameScreen.d3();
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = bVarD3.f197252a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        kli.c.c(controllerContainerCoordinatorLayout, true);
        CollapsingActionButton nameActionButtonView = bVarD3.f197253b;
        Intrinsics.checkNotNullExpressionValue(nameActionButtonView, "nameActionButtonView");
        nameActionButtonView.setCollapsed(false, true);
        RecyclerView.LayoutManager layoutManager = nameScreen.d3().d.getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        nameScreen.d3().d.smoothScrollToPosition(((LinearLayoutManager) layoutManager).getItemCount() - 1);
        return Unit.f186387a;
    }
}
