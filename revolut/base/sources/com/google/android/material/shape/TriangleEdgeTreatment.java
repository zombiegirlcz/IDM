package com.google.android.material.shape;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes16.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float f, boolean z) {
        this.size = f;
        this.inside = z;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f4, float f5, @NonNull ShapePath shapePath) {
        if (!this.inside) {
            float f6 = this.size;
            shapePath.lineTo(f4 - (f6 * f5), BitmapDescriptorFactory.HUE_RED, f4, (-f6) * f5);
            shapePath.lineTo((this.size * f5) + f4, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED);
        } else {
            shapePath.lineTo(f4 - (this.size * f5), BitmapDescriptorFactory.HUE_RED);
            float f32 = this.size;
            shapePath.lineTo(f4, f32 * f5, (f32 * f5) + f4, BitmapDescriptorFactory.HUE_RED);
            shapePath.lineTo(f, BitmapDescriptorFactory.HUE_RED);
        }
    }
}
