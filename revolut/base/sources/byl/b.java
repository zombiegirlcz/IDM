package byl;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.gallery_picker.GalleryPickerView;
import com.revolut.ui_kit.payments.personalisation.AmountPersonalisationTransitionContainer;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19853a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AmountPersonalisationTransitionContainer f19854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f19855c;
    public final /* synthetic */ String d;
    public final /* synthetic */ View e;

    public b(View view, AmountPersonalisationTransitionContainer amountPersonalisationTransitionContainer, View view2, String str) {
        this.f19855c = view;
        this.f19854b = amountPersonalisationTransitionContainer;
        this.e = view2;
        this.d = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        long j2;
        char c2;
        char c3;
        ObjectAnimator objectAnimator3;
        ObjectAnimator objectAnimator4;
        int i33 = this.f19853a;
        String str = this.d;
        View view2 = this.f19855c;
        AmountPersonalisationTransitionContainer amountPersonalisationTransitionContainer = this.f19854b;
        View view3 = this.e;
        switch (i33) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                view2.setVisibility(0);
                view2.setAlpha(1.0f);
                GalleryPickerView galleryPickerViewD = AmountPersonalisationTransitionContainer.d(view2);
                View viewG = galleryPickerViewD != null ? AmountPersonalisationTransitionContainer.g(galleryPickerViewD, str) : null;
                if (galleryPickerViewD == null || viewG == null) {
                    AmountPersonalisationTransitionContainer.c(amountPersonalisationTransitionContainer, view3, view2);
                } else {
                    Pair pairA = AmountPersonalisationTransitionContainer.a(view3, viewG);
                    float width = view3.getWidth() / viewG.getWidth();
                    float height = view3.getHeight() / viewG.getHeight();
                    view2.setPivotX(view2.getWidth() / 2.0f);
                    view2.setPivotY(view2.getHeight() / 2.0f);
                    view3.setPivotX(view3.getWidth() / 2.0f);
                    view3.setPivotY(view3.getHeight() / 2.0f);
                    view2.setScaleX(width);
                    view2.setScaleY(height);
                    Property property = FrameLayout.SCALE_X;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 1.0f, 1.0f / width);
                    objectAnimatorOfFloat.setDuration(400L);
                    Property property2 = FrameLayout.SCALE_Y;
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) property2, 1.0f, 1.0f / height);
                    objectAnimatorOfFloat2.setDuration(400L);
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) FrameLayout.ALPHA, 1.0f, BitmapDescriptorFactory.HUE_RED);
                    objectAnimatorOfFloat3.setDuration(300L);
                    if (pairA != null) {
                        c2 = 0;
                        c3 = 1;
                        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat((RecyclerView) pairA.f186385a, (Property<RecyclerView, Float>) FrameLayout.TRANSLATION_Y, BitmapDescriptorFactory.HUE_RED, ((Number) pairA.f186386b).floatValue());
                        objectAnimator = objectAnimatorOfFloat2;
                        objectAnimator2 = objectAnimatorOfFloat;
                        j2 = 400;
                        objectAnimatorOfFloat4.setDuration(400L);
                        objectAnimator3 = objectAnimatorOfFloat4;
                    } else {
                        objectAnimator = objectAnimatorOfFloat2;
                        objectAnimator2 = objectAnimatorOfFloat;
                        j2 = 400;
                        c2 = 0;
                        c3 = 1;
                        objectAnimator3 = null;
                    }
                    float[] fArr = new float[2];
                    fArr[c2] = width;
                    fArr[c3] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr);
                    objectAnimatorOfFloat5.setDuration(j2);
                    float[] fArr2 = new float[2];
                    fArr2[c2] = height;
                    fArr2[c3] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property2, fArr2);
                    objectAnimatorOfFloat6.setDuration(j2);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator[] elements = {objectAnimator2, objectAnimator, objectAnimatorOfFloat3, objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimator3};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    animatorSet.playTogether(kotlin.collections.d.L(elements));
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                    animatorSet.addListener(new c(amountPersonalisationTransitionContainer, view3, pairA, 0));
                    animatorSet.start();
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                a aVarB = AmountPersonalisationTransitionContainer.b(amountPersonalisationTransitionContainer, view2, str);
                if (aVarB != null) {
                    PointF pointF = aVarB.f19851b;
                    PointF pointF2 = aVarB.f19852c;
                    float width2 = view3.getWidth() / aVarB.d;
                    float height2 = view3.getHeight() / aVarB.e;
                    float f = 1.0f / width2;
                    float f4 = 1.0f / height2;
                    Pair pairA2 = AmountPersonalisationTransitionContainer.a(view3, aVarB.f19850a);
                    view2.setPivotX(pointF.x);
                    view2.setPivotY(pointF.y);
                    view3.getLocationInWindow(new int[2]);
                    view3.setPivotX(pointF2.x - r2[0]);
                    view3.setPivotY(pointF2.y - r2[1]);
                    float width3 = ((view3.getWidth() / 2.0f) + r2[0]) - pointF2.x;
                    float height3 = ((view3.getHeight() / 2.0f) + r2[1]) - pointF2.y;
                    view3.setScaleX(f);
                    view3.setScaleY(f4);
                    view3.setTranslationX((view3.getPivotX() - (view3.getWidth() / 2.0f)) * f);
                    view3.setTranslationY((view3.getPivotY() - (view3.getHeight() / 2.0f)) * f4);
                    if (pairA2 != null) {
                        ((RecyclerView) pairA2.f186385a).setTranslationY(((Number) pairA2.f186386b).floatValue());
                    }
                    Property property3 = FrameLayout.SCALE_X;
                    ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property3, 1.0f, width2);
                    objectAnimatorOfFloat7.setDuration(400L);
                    Property property4 = FrameLayout.SCALE_Y;
                    ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property4, 1.0f, height2);
                    objectAnimatorOfFloat8.setDuration(400L);
                    Property property5 = FrameLayout.TRANSLATION_X;
                    ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property5, BitmapDescriptorFactory.HUE_RED, width3);
                    objectAnimatorOfFloat9.setDuration(400L);
                    Property property6 = FrameLayout.TRANSLATION_Y;
                    ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property6, BitmapDescriptorFactory.HUE_RED, height3);
                    objectAnimatorOfFloat10.setDuration(400L);
                    ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) property3, f, 1.0f);
                    objectAnimatorOfFloat11.setDuration(400L);
                    ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) property4, f4, 1.0f);
                    objectAnimatorOfFloat12.setDuration(400L);
                    ObjectAnimator objectAnimatorOfFloat13 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) property5, view3.getTranslationX(), BitmapDescriptorFactory.HUE_RED);
                    objectAnimatorOfFloat13.setDuration(400L);
                    ObjectAnimator objectAnimatorOfFloat14 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) property6, view3.getTranslationY(), BitmapDescriptorFactory.HUE_RED);
                    objectAnimatorOfFloat14.setDuration(400L);
                    if (pairA2 != null) {
                        ObjectAnimator objectAnimatorOfFloat15 = ObjectAnimator.ofFloat((RecyclerView) pairA2.f186385a, (Property<RecyclerView, Float>) property6, ((Number) pairA2.f186386b).floatValue(), BitmapDescriptorFactory.HUE_RED);
                        objectAnimatorOfFloat15.setDuration(400L);
                        objectAnimator4 = objectAnimatorOfFloat15;
                    } else {
                        objectAnimator4 = null;
                    }
                    ObjectAnimator objectAnimatorOfFloat16 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) FrameLayout.ALPHA, BitmapDescriptorFactory.HUE_RED, 1.0f);
                    objectAnimatorOfFloat16.setDuration(300L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ObjectAnimator[] elements2 = {objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat10, objectAnimatorOfFloat11, objectAnimatorOfFloat12, objectAnimatorOfFloat13, objectAnimatorOfFloat14, objectAnimator4, objectAnimatorOfFloat16};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    animatorSet2.playTogether(kotlin.collections.d.L(elements2));
                    animatorSet2.setInterpolator(new DecelerateInterpolator());
                    animatorSet2.addListener(new c(amountPersonalisationTransitionContainer, view2, pairA2, 1));
                    animatorSet2.start();
                } else {
                    AmountPersonalisationTransitionContainer.c(amountPersonalisationTransitionContainer, view2, view3);
                }
                break;
        }
    }

    public b(AmountPersonalisationTransitionContainer amountPersonalisationTransitionContainer, View view, String str, View view2) {
        this.f19854b = amountPersonalisationTransitionContainer;
        this.f19855c = view;
        this.d = str;
        this.e = view2;
    }
}
