package z2a;

import android.view.View;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.recycler.CenterScrollableLinearLayoutManager;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.style.TransferPersonalisationStyleSelector;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinearSnapHelper f319043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferPersonalisationStyleSelector f319044b;

    public g(LinearSnapHelper linearSnapHelper, TransferPersonalisationStyleSelector transferPersonalisationStyleSelector) {
        this.f319043a = linearSnapHelper;
        this.f319044b = transferPersonalisationStyleSelector;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        b bVar;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        TransferPersonalisationStyleSelector.Companion aVar = TransferPersonalisationStyleSelector.INSTANCE;
        TransferPersonalisationStyleSelector transferPersonalisationStyleSelector = this.f319044b;
        ?? r87 = transferPersonalisationStyleSelector.P;
        View viewFindSnapView = this.f319043a.findSnapView((CenterScrollableLinearLayoutManager) r87.getValue());
        if (viewFindSnapView == null) {
            return;
        }
        int position = ((CenterScrollableLinearLayoutManager) r87.getValue()).getPosition(viewFindSnapView);
        a aVar2 = transferPersonalisationStyleSelector.O;
        int width = recyclerView.getWidth();
        int left = viewFindSnapView.getLeft();
        int right = viewFindSnapView.getRight();
        aVar2.getClass();
        float f = right - left;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            bVar = new b(position, BitmapDescriptorFactory.HUE_RED);
        } else {
            float f5 = (-(((left + right) / 2.0f) - (width / 2.0f))) / f;
            if (f5 < BitmapDescriptorFactory.HUE_RED) {
                position--;
                f5 += 1.0f;
            }
            if (f5 >= 1.0f) {
                f5 = 0.9999f;
            }
            if (f5 > BitmapDescriptorFactory.HUE_RED) {
                f4 = f5;
            }
            bVar = new b(position, f4);
        }
        transferPersonalisationStyleSelector.d3().f191726b.K(bVar.f319037b, bVar.f319036a);
    }
}
