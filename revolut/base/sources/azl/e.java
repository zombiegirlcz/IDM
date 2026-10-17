package azl;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f11482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f11483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f11484c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final Animator a(View view, boolean z, k kVar) {
        int left;
        k kVar2 = k.LEFT_TO_RIGHT;
        if (kVar != kVar2 || z) {
            k kVar3 = k.RIGHT_TO_LEFT;
            left = (kVar == kVar3 && z) ? view.getLeft() : (kVar != kVar3 || z) ? (kVar == kVar2 && z) ? view.getRight() : (view.getRight() + view.getLeft()) / 2 : view.getRight();
        } else {
            left = view.getLeft();
        }
        int bottom = (view.getBottom() + view.getTop()) / 2;
        int iHypot = (int) Math.hypot(getWidth(), getHeight());
        Animator animatorCreateCircularReveal = z ? ViewAnimationUtils.createCircularReveal(this, left, bottom, iHypot, BitmapDescriptorFactory.HUE_RED) : ViewAnimationUtils.createCircularReveal(this, left, bottom, BitmapDescriptorFactory.HUE_RED, iHypot);
        animatorCreateCircularReveal.setDuration(200L);
        return animatorCreateCircularReveal;
    }

    @NotNull
    public final i getSwipeActionViewFactory() {
        i iVar = this.f11482a;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.r("swipeActionViewFactory");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        a aVar = getSwipeActionViewFactory().d;
        LinearLayout linearLayout = this.f11483b;
        if (linearLayout == null) {
            Intrinsics.r("leftActionView");
            throw null;
        }
        int i6 = aVar.f11477a;
        int i21 = aVar.f11478b;
        linearLayout.layout(0, 0, i6, i21);
        LinearLayout linearLayout2 = this.f11484c;
        if (linearLayout2 != null) {
            linearLayout2.layout(getWidth() - aVar.f11477a, 0, getWidth(), i21);
        } else {
            Intrinsics.r("rightActionView");
            throw null;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar = getSwipeActionViewFactory().d;
        LinearLayout linearLayout = this.f11483b;
        if (linearLayout == null) {
            Intrinsics.r("leftActionView");
            throw null;
        }
        int i3 = aVar.f11477a;
        int i5 = aVar.f11478b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        LinearLayout linearLayout2 = this.f11484c;
        if (linearLayout2 == null) {
            Intrinsics.r("rightActionView");
            throw null;
        }
        linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(aVar.f11477a, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public final void setSwipeActionViewFactory(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.f11482a = iVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ e(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
