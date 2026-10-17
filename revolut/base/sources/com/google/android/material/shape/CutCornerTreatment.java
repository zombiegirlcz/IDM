package com.google.android.material.shape;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes16.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f, float f4, float f5) {
        shapePath.reset(BitmapDescriptorFactory.HUE_RED, f5 * f4, 180.0f, 180.0f - f);
        double d = f5;
        double d5 = f4;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(f)) * d * d5), (float) (Math.sin(Math.toRadians(90.0f - f)) * d * d5));
    }

    @Deprecated
    public CutCornerTreatment(float f) {
        this.size = f;
    }
}
