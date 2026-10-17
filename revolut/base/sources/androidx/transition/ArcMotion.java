package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.core.content.res.TypedArrayUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes16.dex */
public class ArcMotion extends PathMotion {
    private static final float DEFAULT_MAX_TANGENT = (float) Math.tan(Math.toRadians(35.0d));
    private float mMaximumAngle;
    private float mMaximumTangent;
    private float mMinimumHorizontalAngle;
    private float mMinimumHorizontalTangent;
    private float mMinimumVerticalAngle;
    private float mMinimumVerticalTangent;

    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMinimumHorizontalAngle = BitmapDescriptorFactory.HUE_RED;
        this.mMinimumVerticalAngle = BitmapDescriptorFactory.HUE_RED;
        this.mMaximumAngle = 70.0f;
        this.mMinimumHorizontalTangent = BitmapDescriptorFactory.HUE_RED;
        this.mMinimumVerticalTangent = BitmapDescriptorFactory.HUE_RED;
        this.mMaximumTangent = DEFAULT_MAX_TANGENT;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.ARC_MOTION);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        setMinimumVerticalAngle(TypedArrayUtils.getNamedFloat(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, BitmapDescriptorFactory.HUE_RED));
        setMinimumHorizontalAngle(TypedArrayUtils.getNamedFloat(typedArrayObtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, BitmapDescriptorFactory.HUE_RED));
        setMaximumAngle(TypedArrayUtils.getNamedFloat(typedArrayObtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    private static float toTangent(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED || f > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f / 2.0f));
    }

    @Override // androidx.transition.PathMotion
    public Path getPath(float f, float f4, float f5, float f6) {
        float fA;
        float fA2;
        float f32;
        Path path = new Path();
        path.moveTo(f, f4);
        float f35 = f5 - f;
        float f36 = f6 - f4;
        float f37 = (f36 * f36) + (f35 * f35);
        float f41 = (f + f5) / 2.0f;
        float f42 = (f4 + f6) / 2.0f;
        float f57 = 0.25f * f37;
        boolean z = f4 > f6;
        if (Math.abs(f35) < Math.abs(f36)) {
            float fAbs = Math.abs(f37 / (f36 * 2.0f));
            if (z) {
                fA2 = fAbs + f6;
                fA = f5;
            } else {
                fA2 = fAbs + f4;
                fA = f;
            }
            f32 = this.mMinimumVerticalTangent;
        } else {
            float f69 = f37 / (f35 * 2.0f);
            if (z) {
                fA2 = f4;
                fA = f69 + f;
            } else {
                fA = f5 - f69;
                fA2 = f6;
            }
            f32 = this.mMinimumHorizontalTangent;
        }
        float f75 = f57 * f32 * f32;
        float f77 = f41 - fA;
        float f81 = f42 - fA2;
        float f82 = (f81 * f81) + (f77 * f77);
        float f93 = this.mMaximumTangent;
        float f94 = f57 * f93 * f93;
        if (f82 >= f75) {
            f75 = f82 > f94 ? f94 : 0.0f;
        }
        if (f75 != BitmapDescriptorFactory.HUE_RED) {
            float fSqrt = (float) Math.sqrt(f75 / f82);
            fA = j6.a.a(fA, f41, fSqrt, f41);
            fA2 = j6.a.a(fA2, f42, fSqrt, f42);
        }
        path.cubicTo((f + fA) / 2.0f, (f4 + fA2) / 2.0f, (fA + f5) / 2.0f, (fA2 + f6) / 2.0f, f5, f6);
        return path;
    }

    public void setMaximumAngle(float f) {
        this.mMaximumAngle = f;
        this.mMaximumTangent = toTangent(f);
    }

    public void setMinimumHorizontalAngle(float f) {
        this.mMinimumHorizontalAngle = f;
        this.mMinimumHorizontalTangent = toTangent(f);
    }

    public void setMinimumVerticalAngle(float f) {
        this.mMinimumVerticalAngle = f;
        this.mMinimumVerticalTangent = toTangent(f);
    }
}
