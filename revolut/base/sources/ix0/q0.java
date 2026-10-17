package ix0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.R$dimen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q0 {
    private q0() {
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    public static void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if ((view instanceof ViewGroup ? (ViewGroup) view : null) == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(R$dimen.uikit_solid_bottom_bar);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 84.0f);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (((childAt instanceof RecyclerView) || (childAt instanceof ViewPager2)) && ((ViewGroup) childAt).getPaddingBottom() == dimensionPixelSize && ((Boolean) jo0.g.f176828j.getValue()).booleanValue()) {
                knm.b.v(iK, childAt);
            }
        }
    }
}
