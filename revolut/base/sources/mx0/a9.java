package mx0;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.LightboxGalleryView;

/* JADX INFO: loaded from: classes20.dex */
public final class a9 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LightboxGalleryView f209586a;

    public a9(LightboxGalleryView lightboxGalleryView) {
        this.f209586a = lightboxGalleryView;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        LightboxGalleryView lightboxGalleryView = this.f209586a;
        lightboxGalleryView.post(new com.google.android.material.sidesheet.b(lightboxGalleryView, i, 7));
    }
}
