package tw0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q0 implements RecyclerView.OnChildAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f274866a;

    public q0(l0 l0Var) {
        this.f274866a = l0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewAttachedToWindow(View view) {
        int childAdapterPosition;
        List listB;
        Intrinsics.checkNotNullParameter(view, "view");
        l0 l0Var = this.f274866a;
        RecyclerView recyclerView = l0Var.f274839m;
        if (recyclerView == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) == -1) {
            return;
        }
        koi.h hVar = l0Var.f274838l;
        if (l0.f((hVar == null || (listB = hVar.b()) == null) ? null : (koi.j) zhm.d0.e0(childAdapterPosition, listB)) && view.getAnimation() == null) {
            view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        } else {
            view.setAlpha(1.0f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
