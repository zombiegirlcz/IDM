package iu0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import com.revolut.core.ui_kit.internal.views.pincode.DynamicDotsView;
import com.revolut.core.ui_kit.internal.views.pincode.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DynamicDotsView f168439b;

    public /* synthetic */ g(DynamicDotsView dynamicDotsView, int i) {
        this.f168438a = i;
        this.f168439b = dynamicDotsView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f168438a;
        DynamicDotsView dynamicDotsView = this.f168439b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                h hVar = dynamicDotsView.i;
                Paint paint = dynamicDotsView.d;
                paint.setColor(iIntValue);
                hVar.getClass();
                Intrinsics.checkNotNullParameter(paint, "<set-?>");
                hVar.f168442c = paint;
                dynamicDotsView.invalidate();
                break;
            case 1:
                Animator animator = (Animator) obj2;
                int i2 = DynamicDotsView.f57437n;
                Intrinsics.checkNotNullParameter(animator, "animator");
                int iMin = Math.min(dynamicDotsView.f57442h, dynamicDotsView.f57441g);
                com.revolut.core.ui_kit.internal.views.pincode.a aVar = dynamicDotsView.i.d;
                a.b bVar = aVar instanceof a.b ? (a.b) aVar : null;
                if (bVar != null) {
                    int i3 = bVar.f57460a;
                    if (i3 == iMin - 1) {
                        bVar.f57460a = 0;
                    } else {
                        bVar.f57460a = i3 + 1;
                    }
                    animator.start();
                }
                break;
            case 2:
                ValueAnimator animation = (ValueAnimator) obj2;
                int i5 = DynamicDotsView.f57437n;
                Intrinsics.checkNotNullParameter(animation, "animation");
                h hVar2 = dynamicDotsView.i;
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                hVar2.f168441b = ((Float) animatedValue).floatValue();
                dynamicDotsView.invalidate();
                break;
            case 3:
                ValueAnimator animation2 = (ValueAnimator) obj2;
                int i6 = DynamicDotsView.f57437n;
                Intrinsics.checkNotNullParameter(animation2, "animation");
                h hVar3 = dynamicDotsView.i;
                Object animatedValue2 = animation2.getAnimatedValue();
                Intrinsics.i(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                hVar3.f168441b = ((Float) animatedValue2).floatValue();
                dynamicDotsView.invalidate();
                break;
            default:
                ValueAnimator animation3 = (ValueAnimator) obj2;
                int i21 = DynamicDotsView.f57437n;
                Intrinsics.checkNotNullParameter(animation3, "animation");
                h hVar4 = dynamicDotsView.i;
                Object animatedValue3 = animation3.getAnimatedValue();
                Intrinsics.i(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                hVar4.f168441b = ((Float) animatedValue3).floatValue();
                dynamicDotsView.invalidate();
                break;
        }
        return Unit.f186387a;
    }
}
