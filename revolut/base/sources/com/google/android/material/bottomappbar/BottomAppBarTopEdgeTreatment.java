package com.google.android.material.bottomappbar;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;
import j6.a;

/* JADX INFO: loaded from: classes16.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private static final float ROUNDED_CORNER_FAB_OFFSET = 1.75f;
    private float cradleVerticalOffset;
    private float fabCornerSize = -1.0f;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float f, float f4, float f5) {
        this.fabMargin = f;
        this.roundedCornerRadius = f4;
        setCradleVerticalOffset(f5);
        this.horizontalOffset = BitmapDescriptorFactory.HUE_RED;
    }

    public float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f4, float f5, @NonNull ShapePath shapePath) {
        float f6;
        float f32;
        float f35 = this.fabDiameter;
        if (f35 == BitmapDescriptorFactory.HUE_RED) {
            shapePath.lineTo(f, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float f36 = ((this.fabMargin * 2.0f) + f35) / 2.0f;
        float f37 = f5 * this.roundedCornerRadius;
        float f41 = f4 + this.horizontalOffset;
        float fA = a.a(1.0f, f5, f36, this.cradleVerticalOffset * f5);
        if (fA / f36 >= 1.0f) {
            shapePath.lineTo(f, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float f42 = this.fabCornerSize;
        float f57 = f42 * f5;
        boolean z = f42 == -1.0f || Math.abs((f42 * 2.0f) - f35) < 0.1f;
        if (z) {
            f6 = fA;
            f32 = 0.0f;
        } else {
            f32 = ROUNDED_CORNER_FAB_OFFSET;
            f6 = 0.0f;
        }
        float f69 = f36 + f37;
        float f75 = f6 + f37;
        float fSqrt = (float) Math.sqrt((f69 * f69) - (f75 * f75));
        float f77 = f41 - fSqrt;
        float f81 = f41 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f75));
        float f82 = (90.0f - degrees) + f32;
        shapePath.lineTo(f77, BitmapDescriptorFactory.HUE_RED);
        float f93 = f77 - f37;
        float f94 = f77 + f37;
        float f99 = f37 * 2.0f;
        shapePath.addArc(f93, BitmapDescriptorFactory.HUE_RED, f94, f99, 270.0f, degrees);
        if (z) {
            shapePath.addArc(f41 - f36, (-f36) - f6, f41 + f36, f36 - f6, 180.0f - f82, (f82 * 2.0f) - 180.0f);
        } else {
            float f100 = this.fabMargin;
            float f101 = f57 * 2.0f;
            float f102 = f100 + f101;
            float f103 = f41 - f36;
            shapePath.addArc(f103, -(f57 + f100), f102 + f103, f100 + f57, 180.0f - f82, ((f82 * 2.0f) - 180.0f) / 2.0f);
            float f104 = f41 + f36;
            float f105 = this.fabMargin;
            shapePath.lineTo(f104 - ((f105 / 2.0f) + f57), f105 + f57);
            float f106 = this.fabMargin;
            shapePath.addArc(f104 - (f101 + f106), -(f57 + f106), f104, f106 + f57, 90.0f, f82 - 90.0f);
        }
        shapePath.addArc(f81 - f37, BitmapDescriptorFactory.HUE_RED, f81 + f37, f99, 270.0f - degrees, degrees);
        shapePath.lineTo(f, BitmapDescriptorFactory.HUE_RED);
    }

    public float getFabCornerRadius() {
        return this.fabCornerSize;
    }

    public float getFabCradleMargin() {
        return this.fabMargin;
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    public float getFabDiameter() {
        return this.fabDiameter;
    }

    public float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    public void setCradleVerticalOffset(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.cradleVerticalOffset = f;
    }

    public void setFabCornerSize(float f) {
        this.fabCornerSize = f;
    }

    public void setFabCradleMargin(float f) {
        this.fabMargin = f;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        this.roundedCornerRadius = f;
    }

    public void setFabDiameter(float f) {
        this.fabDiameter = f;
    }

    public void setHorizontalOffset(float f) {
        this.horizontalOffset = f;
    }
}
