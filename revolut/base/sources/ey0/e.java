package ey0;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit.views.spinnerPicker.SpinnerPickerView;
import jq0.r;
import kotlin.jvm.internal.Intrinsics;
import pq0.k;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends RecyclerView.OnScrollListener {
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        int i3 = SpinnerPickerView.f59693p;
        float height = recyclerView.getHeight() / 2.0f;
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            float fAbs = Math.abs(height - ((childAt.getBottom() + childAt.getTop()) / 2.0f));
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
            k kVar = childViewHolder instanceof k ? (k) childViewHolder : null;
            if (kVar != null) {
                AvatarView avatarView = kVar.f;
                float f = 1.0f - kotlin.ranges.f.f(fAbs / height, BitmapDescriptorFactory.HUE_RED, 1.0f);
                float f4 = kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
                Interpolator interpolator = r.f177394c;
                float interpolation = (interpolator.getInterpolation(f4) * 0.19999999f) + 0.8f;
                float interpolation2 = (interpolator.getInterpolation(kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f)) * 0.7f) + 0.3f;
                avatarView.setScaleX(interpolation);
                avatarView.setScaleY(interpolation);
                avatarView.setAlpha(interpolation2);
                kVar.f238654g.setAlpha(interpolation2);
                kVar.f238655h.setAlpha(interpolation2);
            }
        }
    }
}
