package iv0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import au0.b5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends o {
    public final View d;
    public final g e;
    public ValueAnimator f;

    public f(View hostView) {
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.d = hostView;
        this.e = new g();
    }

    @Override // iv0.o
    public final View c() {
        return this.d;
    }

    @Override // iv0.o
    public final void f() {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // iv0.o
    public final void h(uw0.i animationRequest, View managerHost) {
        Intrinsics.checkNotNullParameter(animationRequest, "animationRequest");
        Intrinsics.checkNotNullParameter(managerHost, "managerHost");
        View view = this.d;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (jq0.a.a(context)) {
            ValueAnimator valueAnimator = this.f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat.setDuration(rim.d.d(850.0f));
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new b5(this, 18));
            valueAnimatorOfFloat.addListener(new e(this, animationRequest, managerHost, animationRequest, managerHost, 0));
            valueAnimatorOfFloat.start();
            this.f = valueAnimatorOfFloat;
            return;
        }
        ValueAnimator valueAnimator2 = this.f;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        vs0.a aVar = (vs0.a) view;
        if (aVar.getScaleAnimatorValue() == 1.0f && aVar.getHighlightAnimatorValue() == 1.0f) {
            return;
        }
        aVar.setScaleAnimatorValue(1.0f);
        aVar.setHighlightAnimatorValue(1.0f);
        view.invalidate();
    }
}
