package yq0;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.internal.delegates.scroller.lm.WrapContentScrollerLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import xq0.m;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WrapContentScrollerLayoutManager f315967a;

    public g(WrapContentScrollerLayoutManager wrapContentScrollerLayoutManager) {
        this.f315967a = wrapContentScrollerLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i == 0) {
            this.f315967a.f55878g = null;
            recyclerView.post(new x.b(recyclerView, 13));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        WrapContentScrollerLayoutManager wrapContentScrollerLayoutManager = this.f315967a;
        if (Intrinsics.f(layoutManager, wrapContentScrollerLayoutManager)) {
            if (recyclerView.getScrollState() == 0) {
                wrapContentScrollerLayoutManager.f55878g = null;
                recyclerView.post(new x.b(recyclerView, 13));
                return;
            }
            a aVar = wrapContentScrollerLayoutManager.f55878g;
            int iFindFirstVisibleItemPosition = wrapContentScrollerLayoutManager.findFirstVisibleItemPosition();
            Integer numValueOf = iFindFirstVisibleItemPosition != -1 ? Integer.valueOf(iFindFirstVisibleItemPosition) : null;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                int i3 = iIntValue + 1;
                Float fA = m.a(wrapContentScrollerLayoutManager, adapter, wrapContentScrollerLayoutManager.f55875a, wrapContentScrollerLayoutManager.f55876b, wrapContentScrollerLayoutManager.findFirstVisibleItemPosition());
                if (fA != null) {
                    float fFloatValue = fA.floatValue();
                    if (aVar == null) {
                        int iM = wrapContentScrollerLayoutManager.m(iIntValue, recyclerView.getWidth(), wrapContentScrollerLayoutManager.getItemCount());
                        int iM2 = wrapContentScrollerLayoutManager.m(i3, recyclerView.getWidth(), wrapContentScrollerLayoutManager.getItemCount());
                        aVar = new a();
                        aVar.f315953a = iM;
                        aVar.f315954b = iM2;
                        aVar.f315955c = fFloatValue;
                        aVar.d = i3;
                    } else if (aVar.d != i3) {
                        aVar.f315953a = wrapContentScrollerLayoutManager.m(iIntValue, recyclerView.getWidth(), wrapContentScrollerLayoutManager.getItemCount());
                        aVar.f315954b = wrapContentScrollerLayoutManager.m(i3, recyclerView.getWidth(), wrapContentScrollerLayoutManager.getItemCount());
                        aVar.f315955c = fFloatValue;
                        aVar.d = i3;
                    } else if (aVar.f315955c != fFloatValue) {
                        aVar.f315955c = fFloatValue;
                    }
                    wrapContentScrollerLayoutManager.f55878g = aVar;
                    recyclerView.requestLayout();
                }
            }
        }
    }
}
