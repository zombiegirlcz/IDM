package ip0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class ic0 implements RecyclerView.RecyclerListener {
    @Override // androidx.recyclerview.widget.RecyclerView.RecyclerListener
    public final void onViewRecycled(RecyclerView.ViewHolder it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        View itemView = it8.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        itemView.setScaleX(1.0f);
        itemView.setScaleY(1.0f);
        itemView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
    }
}
