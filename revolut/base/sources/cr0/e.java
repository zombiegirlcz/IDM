package cr0;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomExpandableDialogView f108166a;

    public e(BottomExpandableDialogView bottomExpandableDialogView) {
        this.f108166a = bottomExpandableDialogView;
    }

    public final void b() {
        BottomExpandableDialogView bottomExpandableDialogView = this.f108166a;
        boolean needDrawToolbarShadow = bottomExpandableDialogView.getNeedDrawToolbarShadow();
        float f = BitmapDescriptorFactory.HUE_RED;
        if (!needDrawToolbarShadow) {
            bottomExpandableDialogView.Q = false;
            bottomExpandableDialogView.getShadowView().setAlpha(BitmapDescriptorFactory.HUE_RED);
            return;
        }
        boolean z = bottomExpandableDialogView.getRecyclerView().computeVerticalScrollOffset() != 0;
        if (z != bottomExpandableDialogView.Q) {
            bottomExpandableDialogView.Q = z;
            if (z) {
                f = 1.0f;
            }
            bottomExpandableDialogView.getShadowView().animate().alpha(f).setDuration(300L);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        b();
    }
}
