package jxl;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f179256a;

    public e(d dVar) {
        this.f179256a = dVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        d dVar = this.f179256a;
        nxl.b bVar = dVar.f179251a;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str = ((nxl.a) bVar.f220581b.get(i)).f220577a;
        if (Intrinsics.f(str, "placeholder_group")) {
            return;
        }
        dVar.setCurrentDesign(str);
        dVar.setVideoBackground(str);
    }
}
