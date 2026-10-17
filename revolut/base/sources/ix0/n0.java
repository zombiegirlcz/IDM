package ix0;

import android.animation.TypeEvaluator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class n0 implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f169263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f169264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f169265c;

    public n0(int i) {
        this.f169263a = i;
        this.f169265c = i;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj2, Object obj3) {
        int i;
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        if (f == BitmapDescriptorFactory.HUE_RED) {
            i = 0;
        } else if (f == 1.0f) {
            i = this.f169265c;
        } else {
            int iC = rim.d.c((f - this.f169264b) * this.f169263a);
            if (iC > 0) {
                this.f169264b = f;
                this.f169265c -= iC;
            }
            i = iC;
        }
        return Integer.valueOf(i);
    }
}
