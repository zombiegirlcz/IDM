package zx0;

import androidx.viewpager.widget.ViewPager;
import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardTabs;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;

/* JADX INFO: loaded from: classes20.dex */
public final class c0 extends ViewPager.SimpleOnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReactionsKeyboardView f325985a;

    public c0(ReactionsKeyboardView reactionsKeyboardView) {
        this.f325985a = reactionsKeyboardView;
    }

    @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
        ReactionsKeyboardView reactionsKeyboardView = this.f325985a;
        if (reactionsKeyboardView.getState() == j.SEMI_OPEN && i == 1) {
            reactionsKeyboardView.P(true, true);
            reactionsKeyboardView.O(true, true);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        ReactionsKeyboardView reactionsKeyboardView = this.f325985a;
        String str = (String) reactionsKeyboardView.f59630q.get(i);
        reactionsKeyboardView.f59632s = str;
        ReactionsKeyboardTabs categoriesTabs = reactionsKeyboardView.getCategoriesTabs();
        ReactionsKeyboardTabs.Companion companion = ReactionsKeyboardTabs.INSTANCE;
        categoriesTabs.m(str, true, true);
    }
}
