package com.revolut.ui_kit.payments.personalisation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import aq0.i;
import byl.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.gallery_picker.GalleryPickerView;
import com.revolut.core.ui_kit.internal.views.switcher_button.SwitcherButtonView;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.c;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.ui_kit.payments.personalisation.AmountPersonalisationTransition;
import java.util.Iterator;
import jji.k;
import koi.b;
import koi.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import lki.w;
import lki.x;
import lki.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/revolut/ui_kit/payments/personalisation/AmountPersonalisationTransitionContainer;", "Lcom/revolut/kompot/view/ControllerContainerFrameLayout;", "Lcom/revolut/kompot/navigable/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Llki/z;", "transitionListener", "", "setTransitionListener", "(Llki/z;)V", "byl/a", "ui_kit_payments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AmountPersonalisationTransitionContainer extends ControllerContainerFrameLayout implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f107117c;
    public boolean d;
    public boolean e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountPersonalisationTransitionContainer(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Pair a(android.view.View r7, android.view.View r8) {
        /*
            com.revolut.core.ui_kit.internal.views.switcher_button.SwitcherButtonView r0 = f(r8)
            r1 = 0
            if (r0 == 0) goto L96
            int r2 = r0.getHeight()
            if (r2 <= 0) goto Le
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 != 0) goto L13
            goto L96
        L13:
            int r2 = com.revolut.core.ui_kit.R$id.centeredAmountView_currencyPickerButton
            android.view.View r2 = r7.findViewById(r2)
            com.revolut.core.ui_kit.internal.views.switcher_button.SwitcherButtonView r2 = (com.revolut.core.ui_kit.internal.views.switcher_button.SwitcherButtonView) r2
            if (r2 == 0) goto L96
            int r3 = r2.getHeight()
            if (r3 <= 0) goto L24
            goto L25
        L24:
            r2 = r1
        L25:
            if (r2 == 0) goto L96
            android.view.ViewParent r3 = r2.getParent()
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L32
            android.view.View r3 = (android.view.View) r3
            goto L33
        L32:
            r3 = r1
        L33:
            if (r3 == 0) goto L49
            if (r3 == r7) goto L49
            boolean r4 = r3 instanceof androidx.recyclerview.widget.RecyclerView
            if (r4 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            goto L4a
        L3e:
            android.view.ViewParent r3 = r3.getParent()
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L32
            android.view.View r3 = (android.view.View) r3
            goto L33
        L49:
            r3 = r1
        L4a:
            if (r3 != 0) goto L4d
            goto L96
        L4d:
            r1 = 2
            int[] r4 = new int[r1]
            int[] r5 = new int[r1]
            r8.getLocationInWindow(r4)
            r0.getLocationInWindow(r5)
            r6 = 1
            r5 = r5[r6]
            r4 = r4[r6]
            int r5 = r5 - r4
            float r4 = (float) r5
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r5 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r5
            float r0 = r0 + r4
            int r8 = r8.getHeight()
            float r8 = (float) r8
            float r0 = r0 / r8
            int[] r8 = new int[r1]
            int[] r1 = new int[r1]
            r7.getLocationInWindow(r8)
            r2.getLocationInWindow(r1)
            r1 = r1[r6]
            r8 = r8[r6]
            int r1 = r1 - r8
            float r8 = (float) r1
            int r1 = r2.getHeight()
            float r1 = (float) r1
            float r1 = r1 / r5
            float r1 = r1 + r8
            int r7 = r7.getHeight()
            float r7 = (float) r7
            float r0 = r0 * r7
            float r0 = r0 - r1
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r3, r7)
            return r8
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.ui_kit.payments.personalisation.AmountPersonalisationTransitionContainer.a(android.view.View, android.view.View):kotlin.Pair");
    }

    public static final a b(AmountPersonalisationTransitionContainer amountPersonalisationTransitionContainer, View view, String str) {
        GalleryPickerView galleryPickerViewD;
        View viewG;
        if (view.getWidth() == 0 || view.getHeight() == 0 || (galleryPickerViewD = d(view)) == null || (viewG = g(galleryPickerViewD, str)) == null) {
            return null;
        }
        view.getLocationInWindow(new int[2]);
        i contentTransform = galleryPickerViewD.getContentTransform();
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, viewG.getWidth(), viewG.getHeight());
        viewG.getMatrix().mapRect(rectF);
        rectF.offset(viewG.getLeft(), viewG.getTop());
        contentTransform.f8225a.mapRect(rectF);
        galleryPickerViewD.getLocationInWindow(new int[2]);
        rectF.offset(r9[0], r9[1]);
        return new a(viewG, new PointF(rectF.centerX() - r0[0], rectF.centerY() - r0[1]), new PointF(rectF.centerX(), rectF.centerY()), rectF.width(), rectF.height(), contentTransform.f8226b);
    }

    public static final void c(AmountPersonalisationTransitionContainer amountPersonalisationTransitionContainer, View view, View view2) {
        amountPersonalisationTransitionContainer.d = false;
        amountPersonalisationTransitionContainer.e = false;
        amountPersonalisationTransitionContainer.invalidate();
        view2.setVisibility(0);
        view2.setAlpha(1.0f);
        h(view);
        z zVar = amountPersonalisationTransitionContainer.f107117c;
        if (zVar != null) {
            zVar.r();
        }
        z zVar2 = amountPersonalisationTransitionContainer.f107117c;
        if (zVar2 != null) {
            zVar2.q();
        }
    }

    public static GalleryPickerView d(View view) {
        if (view instanceof GalleryPickerView) {
            return (GalleryPickerView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            GalleryPickerView galleryPickerViewD = d(childAt);
            if (galleryPickerViewD != null) {
                return galleryPickerViewD;
            }
        }
        return null;
    }

    public static SwitcherButtonView f(View view) {
        if (view instanceof SwitcherButtonView) {
            return (SwitcherButtonView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            SwitcherButtonView switcherButtonViewF = f(childAt);
            if (switcherButtonViewF != null) {
                return switcherButtonViewF;
            }
        }
        return null;
    }

    public static View g(GalleryPickerView galleryPickerView, String str) {
        int itemCount;
        View view;
        Object next;
        j jVar;
        if (str != null) {
            Iterator it8 = ViewGroupKt.getChildren(galleryPickerView).iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                RecyclerView.ViewHolder childViewHolder = galleryPickerView.getChildViewHolder((View) next);
                b bVar = childViewHolder instanceof b ? (b) childViewHolder : null;
                if (Intrinsics.f((bVar == null || (jVar = bVar.e) == null) ? null : jVar.getF53544a(), str)) {
                    break;
                }
            }
            View view2 = (View) next;
            if (view2 != null && view2.getWidth() > 0 && view2.getHeight() > 0) {
                return view2;
            }
        } else {
            RecyclerView.Adapter adapter = galleryPickerView.getAdapter();
            if (adapter != null && (itemCount = adapter.getItemCount()) != 0) {
                int iSqrt = (int) Math.sqrt(itemCount);
                if (iSqrt < 1) {
                    iSqrt = 1;
                }
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = galleryPickerView.findViewHolderForAdapterPosition((iSqrt / 2) + (((((itemCount + iSqrt) - 1) / iSqrt) / 2) * iSqrt));
                if (viewHolderFindViewHolderForAdapterPosition != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null && view.getWidth() > 0 && view.getHeight() > 0) {
                    return view;
                }
            }
        }
        return null;
    }

    public static void h(View view) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
        view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.revolut.kompot.navigable.c
    public final void Y(boolean z, TransitionAnimation.ViewDelegated animation) {
        ObjectAnimator objectAnimator;
        int i;
        float f;
        long j2;
        ObjectAnimator objectAnimator2;
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (!(animation instanceof AmountPersonalisationTransition)) {
            throw new IllegalStateException("Animation should be AmountPersonalisationTransition");
        }
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        if (z) {
            x.Companion.getClass();
            k kVarA = w.a();
            z zVar = this.f107117c;
            if (zVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            kVarA.e(childAt2, childAt, z, zVar);
            return;
        }
        AmountPersonalisationTransition amountPersonalisationTransition = (AmountPersonalisationTransition) animation;
        boolean z3 = amountPersonalisationTransition instanceof AmountPersonalisationTransition.FromAmountToGallery;
        Property property = FrameLayout.TRANSLATION_Y;
        Property property2 = FrameLayout.ALPHA;
        Property property3 = FrameLayout.SCALE_Y;
        Property property4 = FrameLayout.SCALE_X;
        if (z3) {
            Intrinsics.h(childAt);
            Intrinsics.h(childAt2);
            String str = ((AmountPersonalisationTransition.FromAmountToGallery) animation).f107115a;
            z zVar2 = this.f107117c;
            if (zVar2 != null) {
                zVar2.o();
            }
            z zVar3 = this.f107117c;
            if (zVar3 != null) {
                zVar3.p();
            }
            this.d = true;
            this.e = true;
            invalidate();
            childAt2.setVisibility(4);
            if (!childAt2.isLaidOut() || childAt2.isLayoutRequested()) {
                childAt2.addOnLayoutChangeListener(new byl.b(childAt2, this, childAt, str));
                return;
            }
            childAt2.setVisibility(0);
            childAt2.setAlpha(1.0f);
            GalleryPickerView galleryPickerViewD = d(childAt2);
            View viewG = galleryPickerViewD != null ? g(galleryPickerViewD, str) : null;
            if (galleryPickerViewD == null || viewG == null) {
                c(this, childAt, childAt2);
                return;
            }
            Pair pairA = a(childAt, viewG);
            float width = childAt.getWidth() / viewG.getWidth();
            float height = childAt.getHeight() / viewG.getHeight();
            childAt2.setPivotX(childAt2.getWidth() / 2.0f);
            childAt2.setPivotY(childAt2.getHeight() / 2.0f);
            childAt.setPivotX(childAt.getWidth() / 2.0f);
            childAt.setPivotY(childAt.getHeight() / 2.0f);
            childAt2.setScaleX(width);
            childAt2.setScaleY(height);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property4, 1.0f, 1.0f / width);
            objectAnimatorOfFloat.setDuration(400L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property3, 1.0f, 1.0f / height);
            objectAnimatorOfFloat2.setDuration(400L);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, 1.0f, BitmapDescriptorFactory.HUE_RED);
            objectAnimatorOfFloat3.setDuration(300L);
            if (pairA != null) {
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat((RecyclerView) pairA.f186385a, (Property<RecyclerView, Float>) property, BitmapDescriptorFactory.HUE_RED, ((Number) pairA.f186386b).floatValue());
                i = 0;
                f = width;
                j2 = 400;
                objectAnimatorOfFloat4.setDuration(400L);
                objectAnimator2 = objectAnimatorOfFloat4;
            } else {
                i = 0;
                f = width;
                j2 = 400;
                objectAnimator2 = null;
            }
            float[] fArr = new float[2];
            fArr[i] = f;
            fArr[1] = 1.0f;
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property4, fArr);
            objectAnimatorOfFloat5.setDuration(j2);
            float[] fArr2 = new float[2];
            fArr2[i] = height;
            fArr2[1] = 1.0f;
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property3, fArr2);
            objectAnimatorOfFloat6.setDuration(j2);
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator[] elements = {objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimator2};
            Intrinsics.checkNotNullParameter(elements, "elements");
            animatorSet.playTogether(d.L(elements));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.addListener(new byl.c(this, childAt, pairA, i));
            animatorSet.start();
            return;
        }
        if (!(amountPersonalisationTransition instanceof AmountPersonalisationTransition.FromGalleryToAmount)) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.h(childAt);
        Intrinsics.h(childAt2);
        String str2 = ((AmountPersonalisationTransition.FromGalleryToAmount) animation).f107116a;
        z zVar4 = this.f107117c;
        if (zVar4 != null) {
            zVar4.o();
        }
        z zVar5 = this.f107117c;
        if (zVar5 != null) {
            zVar5.p();
        }
        this.e = true;
        invalidate();
        childAt2.setAlpha(BitmapDescriptorFactory.HUE_RED);
        if (!childAt2.isLaidOut() || childAt2.isLayoutRequested()) {
            childAt2.addOnLayoutChangeListener(new byl.b(this, childAt, str2, childAt2));
            return;
        }
        a aVarB = b(this, childAt, str2);
        if (aVarB == null) {
            c(this, childAt, childAt2);
            return;
        }
        PointF pointF = aVarB.f19851b;
        PointF pointF2 = aVarB.f19852c;
        float width2 = childAt2.getWidth() / aVarB.d;
        float height2 = childAt2.getHeight() / aVarB.e;
        float f4 = 1.0f / width2;
        float f5 = 1.0f / height2;
        Pair pairA2 = a(childAt2, aVarB.f19850a);
        childAt.setPivotX(pointF.x);
        childAt.setPivotY(pointF.y);
        childAt2.getLocationInWindow(new int[2]);
        childAt2.setPivotX(pointF2.x - r8[0]);
        childAt2.setPivotY(pointF2.y - r8[1]);
        float width3 = ((childAt2.getWidth() / 2.0f) + r8[0]) - pointF2.x;
        float height3 = ((childAt2.getHeight() / 2.0f) + r8[1]) - pointF2.y;
        childAt2.setScaleX(f4);
        childAt2.setScaleY(f5);
        childAt2.setTranslationX((childAt2.getPivotX() - (childAt2.getWidth() / 2.0f)) * f4);
        childAt2.setTranslationY((childAt2.getPivotY() - (childAt2.getHeight() / 2.0f)) * f5);
        if (pairA2 != null) {
            ((RecyclerView) pairA2.f186385a).setTranslationY(((Number) pairA2.f186386b).floatValue());
        }
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property4, 1.0f, width2);
        objectAnimatorOfFloat7.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property3, 1.0f, height2);
        objectAnimatorOfFloat8.setDuration(400L);
        float[] fArr3 = {BitmapDescriptorFactory.HUE_RED, width3};
        Property property5 = FrameLayout.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property5, fArr3);
        objectAnimatorOfFloat9.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, BitmapDescriptorFactory.HUE_RED, height3);
        objectAnimatorOfFloat10.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property4, f4, 1.0f);
        objectAnimatorOfFloat11.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property3, f5, 1.0f);
        objectAnimatorOfFloat12.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat13 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property5, childAt2.getTranslationX(), BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat13.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat14 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property, childAt2.getTranslationY(), BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat14.setDuration(400L);
        if (pairA2 != null) {
            ObjectAnimator objectAnimatorOfFloat15 = ObjectAnimator.ofFloat((RecyclerView) pairA2.f186385a, (Property<RecyclerView, Float>) property, ((Number) pairA2.f186386b).floatValue(), BitmapDescriptorFactory.HUE_RED);
            objectAnimatorOfFloat15.setDuration(400L);
            objectAnimator = objectAnimatorOfFloat15;
        } else {
            objectAnimator = null;
        }
        ObjectAnimator objectAnimatorOfFloat16 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property2, BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat16.setDuration(300L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator[] elements2 = {objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat10, objectAnimatorOfFloat11, objectAnimatorOfFloat12, objectAnimatorOfFloat13, objectAnimatorOfFloat14, objectAnimator, objectAnimatorOfFloat16};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        animatorSet2.playTogether(d.L(elements2));
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        animatorSet2.addListener(new byl.c(this, childAt, pairA2, 1));
        animatorSet2.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.e) {
            canvas.drawColor(-16777216);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return (!this.d || i < 2) ? super.getChildDrawingOrder(i, i2) : i2 == i - 1 ? 0 : 1;
    }

    @Override // com.revolut.kompot.navigable.c
    public void setTransitionListener(z transitionListener) {
        this.f107117c = transitionListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountPersonalisationTransitionContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountPersonalisationTransitionContainer(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setChildrenDrawingOrderEnabled(true);
    }

    public /* synthetic */ AmountPersonalisationTransitionContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
