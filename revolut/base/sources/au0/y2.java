package au0;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y2 implements AppBarLayout.OnOffsetChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f9440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9441b;

    public y2(com.revolut.core.ui_kit.internal.views.navbar.d dVar, RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f9440a = recyclerView;
        this.f9441b = 100;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        int iAbs = (int) ((1 - (appBarLayout.getTotalScrollRange() != 0 ? Math.abs(i) / appBarLayout.getTotalScrollRange() : BitmapDescriptorFactory.HUE_RED)) * 100);
        this.f9441b = iAbs;
        RecyclerView recyclerView = this.f9440a;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            Object childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i2));
            Intrinsics.checkNotNullExpressionValue(childViewHolder, "getChildViewHolder(...)");
            v3 v3Var = childViewHolder instanceof v3 ? (v3) childViewHolder : null;
            if (v3Var != null) {
                ((l3) v3Var).K(iAbs);
            }
        }
    }
}
