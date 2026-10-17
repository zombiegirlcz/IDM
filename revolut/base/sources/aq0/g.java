package aq0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.revolut.core.ui_kit.gallery_picker.GalleryPickerView;
import com.revolut.core.ui_kit.internal.gallery_picker.GalleryGridLayoutManager;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import et0.z;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.m0;
import z9h.n;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8220a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f8221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f8222c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ g(GalleryPickerView galleryPickerView, float f, float f4, m0 m0Var) {
        this.d = galleryPickerView;
        this.f8221b = f;
        this.f8222c = f4;
        this.e = m0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f8220a;
        int i2 = 0;
        float f = this.f8222c;
        float f4 = this.f8221b;
        Serializable serializable = this.e;
        ViewGroup viewGroup = this.d;
        switch (i) {
            case 0:
                GalleryPickerView galleryPickerView = (GalleryPickerView) viewGroup;
                m0 m0Var = (m0) serializable;
                GalleryPickerView.Companion companion = GalleryPickerView.INSTANCE;
                float fFloatValue = ((Float) n.g(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                galleryPickerView.o = fFloatValue;
                GalleryGridLayoutManager galleryGridLayoutManager = galleryPickerView.f55807c;
                if (galleryGridLayoutManager == null) {
                    Intrinsics.r("galleryLayoutManager");
                    throw null;
                }
                float f5 = m0Var.f186427a;
                int iP = GalleryGridLayoutManager.p(galleryGridLayoutManager.f56041b / 2.0f, (int) (galleryGridLayoutManager.getWidth() / f5));
                int iP2 = GalleryGridLayoutManager.p(galleryGridLayoutManager.f56042c / 2.0f, (int) (galleryGridLayoutManager.getHeight() / f5));
                float f6 = (f4 / f5) + (galleryGridLayoutManager.f56044h - iP);
                galleryGridLayoutManager.f = fFloatValue;
                galleryGridLayoutManager.n();
                galleryGridLayoutManager.f56044h = kotlin.ranges.f.g((int) ((galleryGridLayoutManager.f56046l + f6) - (f4 / fFloatValue)), 0, galleryGridLayoutManager.f56045j);
                galleryGridLayoutManager.i = kotlin.ranges.f.g((int) ((galleryGridLayoutManager.f56047m + ((f / f5) + (galleryGridLayoutManager.i - iP2))) - (f / fFloatValue)), 0, galleryGridLayoutManager.k);
                m0Var.f186427a = fFloatValue;
                galleryPickerView.postInvalidateOnAnimation();
                return;
            default:
                Ref$IntRef ref$IntRef = (Ref$IntRef) serializable;
                float fFloatValue2 = ((Float) n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                ScreenContentRecyclerView screenContentRecyclerView = ((z) viewGroup).f129151b;
                int childCount = screenContentRecyclerView.getChildCount();
                while (i2 < childCount) {
                    View childAt = screenContentRecyclerView.getChildAt(i2);
                    if (childAt != null) {
                        childAt.setTranslationY(i2 < ref$IntRef.f186408a ? (-f4) * fFloatValue2 : f * fFloatValue2);
                    }
                    i2++;
                }
                return;
        }
    }

    public /* synthetic */ g(z zVar, Ref$IntRef ref$IntRef, float f, float f4) {
        this.d = zVar;
        this.e = ref$IntRef;
        this.f8221b = f;
        this.f8222c = f4;
    }
}
