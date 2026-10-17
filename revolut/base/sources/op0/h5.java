package op0;

import android.content.Context;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h5 implements ViewPager2.PageTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f227292a;

    public h5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f227292a = kli.a.k(context, 16.0f);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public final void transformPage(View page, float f) {
        Intrinsics.checkNotNullParameter(page, "page");
        Object tag2 = page.getTag();
        f5 f5Var = tag2 instanceof f5 ? (f5) tag2 : null;
        if (f5Var != null) {
            SmallActionButton smallActionButton = f5Var.f227259h;
            smallActionButton.setAlpha(1.0f - kotlin.ranges.f.f(Math.abs(f), BitmapDescriptorFactory.HUE_RED, 1.0f));
            float f4 = (-r0.getLeft()) * f;
            f5Var.i.setTranslationX(f4);
            smallActionButton.setTranslationX(f4);
        }
        page.setTranslationX((-f) * this.f227292a * 1.5f);
    }
}
