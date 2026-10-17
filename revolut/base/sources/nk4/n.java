package nk4;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import jii.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ w u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w wVar, Continuation continuation) {
        super(2, continuation);
        this.u = wVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        w wVar = this.u;
        wVar.f174570b.setExpanded(false, true);
        TwinVerticalButton twinVerticalButton = wVar.d;
        Intrinsics.checkNotNullExpressionValue(twinVerticalButton, "screenRecyclerNavbarTwin…lButtonTwinVerticalButton");
        twinVerticalButton.setCollapsed(false, true);
        ScreenContentRecyclerView screenContentRecyclerView = wVar.f174571c;
        RecyclerView.LayoutManager layoutManager = screenContentRecyclerView.getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        screenContentRecyclerView.smoothScrollToPosition(((LinearLayoutManager) layoutManager).getItemCount() - 1);
        return Unit.f186387a;
    }
}
