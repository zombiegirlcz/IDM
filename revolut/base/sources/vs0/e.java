package vs0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import au0.l5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import es0.k;
import jq0.r;
import kotlin.jvm.internal.Intrinsics;
import mx0.w5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f291709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueAnimator f291710b;

    public e(FrameLayout hostView) {
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.f291709a = hostView;
        hostView.addOnAttachStateChangeListener(new k(this, 10));
    }

    public final void a() {
        Context context = this.f291709a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!jq0.a.a(context)) {
            ValueAnimator valueAnimator = this.f291710b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f291710b = null;
            b(1.0f);
            return;
        }
        ValueAnimator valueAnimator2 = this.f291710b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setInterpolator(r.d);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new w5(this, 17));
        valueAnimatorOfFloat.addListener(new l5(this, 29));
        valueAnimatorOfFloat.start();
        this.f291710b = valueAnimatorOfFloat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(float f) {
        FrameLayout frameLayout = this.f291709a;
        c cVar = (c) frameLayout;
        if (cVar.getSelectionAnimatorValue() == f) {
            return;
        }
        cVar.setSelectionAnimatorValue(f);
        frameLayout.invalidate();
    }
}
