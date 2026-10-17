package er0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends EdgeTreatment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f128525a;

    public a(float f) {
        this.f128525a = f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public final void getEdgePath(float f, float f4, float f5, ShapePath shapePath) {
        Intrinsics.checkNotNullParameter(shapePath, "shapePath");
        float f6 = this.f128525a * f5;
        float f32 = -f6;
        float f35 = 2 * f6;
        shapePath.addArc(BitmapDescriptorFactory.HUE_RED, f32, f35, f6, 180.0f, -90.0f);
        shapePath.lineTo(f - f6, f6);
        shapePath.addArc(f - f35, f32, f, f6, 90.0f, -90.0f);
    }
}
