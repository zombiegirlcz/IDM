package jxl;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements ViewPager2.PageTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f179250a;

    public c(int i) {
        this.f179250a = i;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public final void transformPage(View view, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTranslationX(f * (-this.f179250a));
    }
}
