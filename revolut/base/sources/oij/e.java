package oij;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f225699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f225700b;

    public e(Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f225699a = callback;
        this.f225700b = true;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        if (!this.f225700b) {
            this.f225699a.invoke(Integer.valueOf(i));
        }
        this.f225700b = false;
    }
}
