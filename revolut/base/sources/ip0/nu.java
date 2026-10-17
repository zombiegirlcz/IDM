package ip0;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes19.dex */
public final class nu extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pu f165570a;

    public nu(pu puVar) {
        this.f165570a = puVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        pu puVar = this.f165570a;
        if (puVar.N == ju.PROGRESSIVE_BLUR) {
            puVar.I(i);
        }
    }
}
