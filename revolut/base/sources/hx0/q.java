package hx0;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q {
    private q() {
    }

    public static ObjectAnimator a(View view, long j2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat.setInterpolator(jq0.r.f177392a);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setStartDelay(j2);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "apply(...)");
        return objectAnimatorOfFloat;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.AnimatorSet b(android.view.View r22, android.view.View r23, java.lang.String r24, hx0.o r25) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hx0.q.b(android.view.View, android.view.View, java.lang.String, hx0.o):android.animation.AnimatorSet");
    }
}
