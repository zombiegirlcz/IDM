package ryj;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.retail.feature.learn.impl.ui.glossary.GlossaryHomeScreen;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GlossaryHomeScreen f258397a;

    public g(GlossaryHomeScreen glossaryHomeScreen) {
        this.f258397a = glossaryHomeScreen;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        ((x) this.f258397a.R.getValue()).y2(new j(i));
    }
}
