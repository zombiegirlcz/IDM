package w01;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class k {
    public static final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        e(view, false);
    }

    public static final void b(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        viewGroup.animate().alpha(BitmapDescriptorFactory.HUE_RED).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(viewGroup.getResources().getInteger(R.integer.config_shortAnimTime)).withEndAction(new bb6.b(viewGroup, 7)).start();
    }

    public static final void c(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), i);
    }

    public static final void d(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        e(view, true);
    }

    public static final void e(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z ? 0 : 8);
    }

    public static void f(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        viewGroup.animate().alpha(1.0f).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(viewGroup.getResources().getInteger(R.integer.config_shortAnimTime)).withStartAction(new bb6.b(viewGroup, 8)).start();
    }
}
