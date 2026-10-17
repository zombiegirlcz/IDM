package grd;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ AddEditAssetController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(AddEditAssetController addEditAssetController, Continuation continuation) {
        super(2, continuation);
        this.u = addEditAssetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((aw0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        KProperty[] kPropertyArr = AddEditAssetController.U;
        AddEditAssetController addEditAssetController = this.u;
        addEditAssetController.d3().f174534c.setExpanded(false, false);
        ScreenContentRecyclerView screenRecyclerNavbarActionFooterRecyclerView = addEditAssetController.d3().d;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterRecyclerView, "screenRecyclerNavbarActionFooterRecyclerView");
        RecyclerView.LayoutManager layoutManager = screenRecyclerNavbarActionFooterRecyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null) == null) {
            return Unit.f186387a;
        }
        screenRecyclerNavbarActionFooterRecyclerView.smoothScrollToPosition(r0.getItemCount() - 1);
        return Unit.f186387a;
    }
}
