package ix0;

import android.animation.ValueAnimator;
import au0.b5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class g2 extends ValueAnimator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f169239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f169240b;

    public g2(h2 h2Var, boolean z, boolean z3) {
        this.f169239a = z;
        this.f169240b = z3;
        if (z) {
            setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
        } else {
            setFloatValues(1.0f, BitmapDescriptorFactory.HUE_RED);
        }
        addUpdateListener(new b5(h2Var, 20));
        addListener(new az0.o0(this, h2Var, 4));
    }

    public final boolean a() {
        return this.f169239a;
    }

    public final void b(boolean z) {
        this.f169240b = z;
    }
}
