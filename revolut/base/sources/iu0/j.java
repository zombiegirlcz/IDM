package iu0;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import com.revolut.core.ui_kit.internal.views.pincode.PlaceholderDotsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlaceholderDotsView f168446b;

    public /* synthetic */ j(PlaceholderDotsView placeholderDotsView, int i) {
        this.f168445a = i;
        this.f168446b = placeholderDotsView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f168445a;
        PlaceholderDotsView placeholderDotsView = this.f168446b;
        switch (i) {
            case 0:
                ValueAnimator animation = (ValueAnimator) obj2;
                int i2 = PlaceholderDotsView.o;
                Intrinsics.checkNotNullParameter(animation, "animation");
                q qVar = placeholderDotsView.f57455j;
                if (qVar instanceof n) {
                    Object animatedValue = animation.getAnimatedValue();
                    Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    ((n) qVar).f168451b = ((Float) animatedValue).floatValue();
                    placeholderDotsView.invalidate();
                }
                break;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                q qVar2 = placeholderDotsView.f57455j;
                if (qVar2 instanceof m) {
                    Paint paint = placeholderDotsView.d;
                    paint.setColor(iIntValue);
                    Intrinsics.checkNotNullParameter(paint, "<set-?>");
                    ((m) qVar2).f168449a = paint;
                    placeholderDotsView.invalidate();
                }
                break;
            default:
                ValueAnimator animator = (ValueAnimator) obj2;
                int i3 = PlaceholderDotsView.o;
                Intrinsics.checkNotNullParameter(animator, "animator");
                q qVar3 = placeholderDotsView.f57455j;
                if (qVar3 instanceof k) {
                    Object animatedValue2 = animator.getAnimatedValue();
                    Intrinsics.i(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                    ((k) qVar3).f168447a = ((Float) animatedValue2).floatValue();
                    placeholderDotsView.invalidate();
                }
                break;
        }
        return Unit.f186387a;
    }
}
