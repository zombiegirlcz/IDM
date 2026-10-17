package yw0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public final class u extends ShapeDrawable.ShaderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f317301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f317302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float[] f317303c;

    public u(boolean z, float[] fArr, int[] iArr) {
        this.f317301a = z;
        this.f317302b = iArr;
        this.f317303c = fArr;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i, int i2) {
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        Pair pair = this.f317301a ? new Pair(fValueOf, Float.valueOf(i2)) : new Pair(Float.valueOf(i2), fValueOf);
        return new LinearGradient(BitmapDescriptorFactory.HUE_RED, ((Number) pair.f186385a).floatValue(), BitmapDescriptorFactory.HUE_RED, ((Number) pair.f186386b).floatValue(), this.f317302b, this.f317303c, Shader.TileMode.CLAMP);
    }
}
