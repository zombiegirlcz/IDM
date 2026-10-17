package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j6.a;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes15.dex */
class MotionPaths implements Comparable<MotionPaths> {
    static String[] sNames = {"position", "x", "y", "width", "height", "pathRotate"};
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo;
    LinkedHashMap<String, ConstraintAttribute> mAttributes;
    float mHeight;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPosition;
    float mRelativeAngle;
    MotionController mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float mTime;
    float mWidth;
    float mX;
    float mY;
    int mDrawPath = 0;
    float mPathRotate = Float.NaN;
    float mProgress = Float.NaN;

    public MotionPaths() {
        int i = Key.UNSET;
        this.mPathMotionArc = i;
        this.mAnimateRelativeTo = i;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mAttributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private boolean diff(float f, float f4) {
        return (Float.isNaN(f) || Float.isNaN(f4)) ? Float.isNaN(f) != Float.isNaN(f4) : Math.abs(f - f4) > 1.0E-6f;
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = constraint.propertySet.mProgress;
        this.mRelativeAngle = constraint.layout.circleAngle;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute != null && constraintAttribute.isContinuous()) {
                this.mAttributes.put(str, constraintAttribute);
            }
        }
    }

    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z) {
        boolean zDiff = diff(this.mX, motionPaths.mX);
        boolean zDiff2 = diff(this.mY, motionPaths.mY);
        zArr[0] = zArr[0] | diff(this.mPosition, motionPaths.mPosition);
        boolean z3 = zDiff | zDiff2 | z;
        zArr[1] = zArr[1] | z3;
        zArr[2] = z3 | zArr[2];
        zArr[3] = zArr[3] | diff(this.mWidth, motionPaths.mWidth);
        zArr[4] = diff(this.mHeight, motionPaths.mHeight) | zArr[4];
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.mPosition, this.mX, this.mY, this.mWidth, this.mHeight, this.mPathRotate};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[r1];
                i++;
            }
        }
    }

    public void getCenter(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float fSin = this.mX;
        float fCos = this.mY;
        float f = this.mWidth;
        float f4 = this.mHeight;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                fSin = f5;
            } else if (i3 == 2) {
                fCos = f5;
            } else if (i3 == 3) {
                f = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f32 = fArr2[1];
            double d5 = f6;
            double d6 = fSin;
            double d10 = fCos;
            fSin = (float) (((Math.sin(d10) * d6) + d5) - ((double) (f / 2.0f)));
            fCos = (float) ((((double) f32) - (Math.cos(d10) * d6)) - ((double) (f4 / 2.0f)));
        }
        fArr[i] = (f / 2.0f) + fSin + BitmapDescriptorFactory.HUE_RED;
        fArr[i + 1] = (f4 / 2.0f) + fCos + BitmapDescriptorFactory.HUE_RED;
    }

    public int getCustomData(String str, double[] dArr, int i) {
        ConstraintAttribute constraintAttribute = this.mAttributes.get(str);
        int i2 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[i] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        constraintAttribute.getValuesToInterpolate(new float[iNumberOfInterpolatedValues]);
        while (i2 < iNumberOfInterpolatedValues) {
            dArr[i] = r2[i2];
            i2++;
            i++;
        }
        return iNumberOfInterpolatedValues;
    }

    public int getCustomDataCount(String str) {
        ConstraintAttribute constraintAttribute = this.mAttributes.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.numberOfInterpolatedValues();
    }

    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.mX;
        float fCos = this.mY;
        float f4 = this.mWidth;
        float f5 = this.mHeight;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f6 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f6;
            } else if (i3 == 2) {
                fCos = f6;
            } else if (i3 == 3) {
                f4 = f6;
            } else if (i3 == 4) {
                f5 = f6;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d = f;
            double d5 = fCos;
            float fSin = (float) (((Math.sin(d5) * d) + ((double) centerX)) - ((double) (f4 / 2.0f)));
            fCos = (float) ((((double) centerY) - (Math.cos(d5) * d)) - ((double) (f5 / 2.0f)));
            f = fSin;
        }
        float f32 = f4 + f;
        float f35 = f5 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        float f36 = f + BitmapDescriptorFactory.HUE_RED;
        float f37 = fCos + BitmapDescriptorFactory.HUE_RED;
        float f41 = f32 + BitmapDescriptorFactory.HUE_RED;
        float f42 = fCos + BitmapDescriptorFactory.HUE_RED;
        float f57 = f32 + BitmapDescriptorFactory.HUE_RED;
        float f69 = f35 + BitmapDescriptorFactory.HUE_RED;
        float f75 = f + BitmapDescriptorFactory.HUE_RED;
        float f77 = f35 + BitmapDescriptorFactory.HUE_RED;
        fArr[i] = f36;
        fArr[i + 1] = f37;
        fArr[i + 2] = f41;
        fArr[i + 3] = f42;
        fArr[i + 4] = f57;
        fArr[i + 5] = f69;
        fArr[i + 6] = f75;
        fArr[i + 7] = f77;
    }

    public boolean hasCustomData(String str) {
        return this.mAttributes.containsKey(str);
    }

    public void initAxis(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f = keyPosition.mFramePosition / 100.0f;
        this.mTime = f;
        this.mDrawPath = keyPosition.mDrawPath;
        float f4 = Float.isNaN(keyPosition.mPercentWidth) ? f : keyPosition.mPercentWidth;
        float f5 = Float.isNaN(keyPosition.mPercentHeight) ? f : keyPosition.mPercentHeight;
        float f6 = motionPaths2.mWidth;
        float f32 = motionPaths.mWidth;
        float f35 = f6 - f32;
        float f36 = motionPaths2.mHeight;
        float f37 = motionPaths.mHeight;
        float f41 = f36 - f37;
        this.mPosition = this.mTime;
        float f42 = (f32 / 2.0f) + motionPaths.mX;
        float f57 = (f37 / 2.0f) + motionPaths.mY;
        float f69 = f;
        float f75 = (f6 / 2.0f) + motionPaths2.mX;
        float f77 = (f36 / 2.0f) + motionPaths2.mY;
        if (f42 > f75) {
            f42 = f75;
            f75 = f42;
        }
        if (f57 <= f77) {
            f57 = f77;
            f77 = f57;
        }
        float f81 = f75 - f42;
        float f82 = f57 - f77;
        float f93 = (f35 * f4) / 2.0f;
        this.mX = (int) (((f81 * f69) + r13) - f93);
        float f94 = (f41 * f5) / 2.0f;
        this.mY = (int) (((f82 * f69) + r14) - f94);
        this.mWidth = (int) (f32 + r9);
        this.mHeight = (int) (f37 + r12);
        float f99 = Float.isNaN(keyPosition.mPercentX) ? f69 : keyPosition.mPercentX;
        boolean zIsNaN = Float.isNaN(keyPosition.mAltPercentY);
        float f100 = BitmapDescriptorFactory.HUE_RED;
        float f101 = zIsNaN ? 0.0f : keyPosition.mAltPercentY;
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f69 = keyPosition.mPercentY;
        }
        if (!Float.isNaN(keyPosition.mAltPercentX)) {
            f100 = keyPosition.mAltPercentX;
        }
        this.mMode = 0;
        this.mX = (int) (((f100 * f82) + ((f99 * f81) + motionPaths.mX)) - f93);
        this.mY = (int) (((f82 * f69) + ((f81 * f101) + motionPaths.mY)) - f94);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initCartesian(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f = keyPosition.mFramePosition / 100.0f;
        this.mTime = f;
        this.mDrawPath = keyPosition.mDrawPath;
        float f4 = Float.isNaN(keyPosition.mPercentWidth) ? f : keyPosition.mPercentWidth;
        float f5 = Float.isNaN(keyPosition.mPercentHeight) ? f : keyPosition.mPercentHeight;
        float f6 = motionPaths2.mWidth;
        float f32 = motionPaths.mWidth;
        float f35 = f6 - f32;
        float f36 = motionPaths2.mHeight;
        float f37 = motionPaths.mHeight;
        float f41 = f36 - f37;
        this.mPosition = this.mTime;
        float f42 = motionPaths.mX;
        float f57 = motionPaths.mY;
        float f69 = f;
        float f75 = ((f6 / 2.0f) + motionPaths2.mX) - ((f32 / 2.0f) + f42);
        float f77 = ((f36 / 2.0f) + motionPaths2.mY) - ((f37 / 2.0f) + f57);
        float f81 = (f35 * f4) / 2.0f;
        this.mX = (int) (((f75 * f69) + f42) - f81);
        float f82 = (f41 * f5) / 2.0f;
        this.mY = (int) (((f77 * f69) + f57) - f82);
        this.mWidth = (int) (f32 + r9);
        this.mHeight = (int) (f37 + r12);
        float f93 = Float.isNaN(keyPosition.mPercentX) ? f69 : keyPosition.mPercentX;
        boolean zIsNaN = Float.isNaN(keyPosition.mAltPercentY);
        float f94 = BitmapDescriptorFactory.HUE_RED;
        float f99 = zIsNaN ? 0.0f : keyPosition.mAltPercentY;
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f69 = keyPosition.mPercentY;
        }
        if (!Float.isNaN(keyPosition.mAltPercentX)) {
            f94 = keyPosition.mAltPercentX;
        }
        this.mMode = 0;
        this.mX = (int) (((f94 * f77) + ((f93 * f75) + motionPaths.mX)) - f81);
        this.mY = (int) (((f77 * f69) + ((f75 * f99) + motionPaths.mY)) - f82);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initPath(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f = keyPosition.mFramePosition / 100.0f;
        this.mTime = f;
        this.mDrawPath = keyPosition.mDrawPath;
        float f4 = Float.isNaN(keyPosition.mPercentWidth) ? f : keyPosition.mPercentWidth;
        float f5 = Float.isNaN(keyPosition.mPercentHeight) ? f : keyPosition.mPercentHeight;
        float f6 = motionPaths2.mWidth - motionPaths.mWidth;
        float f32 = motionPaths2.mHeight - motionPaths.mHeight;
        this.mPosition = this.mTime;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            f = keyPosition.mPercentX;
        }
        float f35 = motionPaths.mX;
        float f36 = motionPaths.mWidth;
        float f37 = motionPaths.mY;
        float f41 = motionPaths.mHeight;
        float f42 = f;
        float f57 = ((motionPaths2.mWidth / 2.0f) + motionPaths2.mX) - ((f36 / 2.0f) + f35);
        float f69 = ((motionPaths2.mHeight / 2.0f) + motionPaths2.mY) - ((f41 / 2.0f) + f37);
        float f75 = f57 * f42;
        float f77 = (f6 * f4) / 2.0f;
        this.mX = (int) ((f35 + f75) - f77);
        float f81 = f69 * f42;
        float f82 = (f32 * f5) / 2.0f;
        this.mY = (int) ((f37 + f81) - f82);
        this.mWidth = (int) (f36 + r7);
        this.mHeight = (int) (f41 + r8);
        float f93 = Float.isNaN(keyPosition.mPercentY) ? BitmapDescriptorFactory.HUE_RED : keyPosition.mPercentY;
        this.mMode = 1;
        float f94 = (int) ((motionPaths.mX + f75) - f77);
        float f99 = (int) ((motionPaths.mY + f81) - f82);
        this.mX = f94 + ((-f69) * f93);
        this.mY = f99 + (f57 * f93);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initPolar(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float fMin;
        float fA;
        float f = keyPosition.mFramePosition / 100.0f;
        this.mTime = f;
        this.mDrawPath = keyPosition.mDrawPath;
        this.mMode = keyPosition.mPositionType;
        float f4 = Float.isNaN(keyPosition.mPercentWidth) ? f : keyPosition.mPercentWidth;
        float f5 = Float.isNaN(keyPosition.mPercentHeight) ? f : keyPosition.mPercentHeight;
        float f6 = motionPaths2.mWidth;
        float f32 = motionPaths.mWidth;
        float f35 = motionPaths2.mHeight;
        float f36 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        this.mWidth = (int) (((f6 - f32) * f4) + f32);
        this.mHeight = (int) (((f35 - f36) * f5) + f36);
        if (keyPosition.mPositionType != 2) {
            float f37 = Float.isNaN(keyPosition.mPercentX) ? f : keyPosition.mPercentX;
            float f41 = motionPaths2.mX;
            float f42 = motionPaths.mX;
            this.mX = a.a(f41, f42, f37, f42);
            if (!Float.isNaN(keyPosition.mPercentY)) {
                f = keyPosition.mPercentY;
            }
            float f57 = motionPaths2.mY;
            float f69 = motionPaths.mY;
            this.mY = a.a(f57, f69, f, f69);
        } else {
            if (Float.isNaN(keyPosition.mPercentX)) {
                float f75 = motionPaths2.mX;
                float f77 = motionPaths.mX;
                fMin = a.a(f75, f77, f, f77);
            } else {
                fMin = Math.min(f5, f4) * keyPosition.mPercentX;
            }
            this.mX = fMin;
            if (Float.isNaN(keyPosition.mPercentY)) {
                float f81 = motionPaths2.mY;
                float f82 = motionPaths.mY;
                fA = a.a(f81, f82, f, f82);
            } else {
                fA = keyPosition.mPercentY;
            }
            this.mY = fA;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initScreen(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f = keyPosition.mFramePosition / 100.0f;
        this.mTime = f;
        this.mDrawPath = keyPosition.mDrawPath;
        float f4 = Float.isNaN(keyPosition.mPercentWidth) ? f : keyPosition.mPercentWidth;
        float f5 = Float.isNaN(keyPosition.mPercentHeight) ? f : keyPosition.mPercentHeight;
        float f6 = motionPaths2.mWidth;
        float f32 = f6 - motionPaths.mWidth;
        float f35 = motionPaths2.mHeight;
        float f36 = f35 - motionPaths.mHeight;
        this.mPosition = this.mTime;
        float f37 = motionPaths.mX;
        float f41 = motionPaths.mY;
        float f42 = (f6 / 2.0f) + motionPaths2.mX;
        float f57 = (f35 / 2.0f) + motionPaths2.mY;
        float f69 = f32 * f4;
        this.mX = (int) ((((f42 - ((r8 / 2.0f) + f37)) * f) + f37) - (f69 / 2.0f));
        float f75 = f36 * f5;
        this.mY = (int) ((((f57 - ((r11 / 2.0f) + f41)) * f) + f41) - (f75 / 2.0f));
        this.mWidth = (int) (r8 + f69);
        this.mHeight = (int) (r11 + f75);
        this.mMode = 2;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            this.mX = (int) (keyPosition.mPercentX * (i - ((int) this.mWidth)));
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            this.mY = (int) (keyPosition.mPercentY * (i2 - ((int) this.mHeight)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void setBounds(float f, float f4, float f5, float f6) {
        this.mX = f;
        this.mY = f4;
        this.mWidth = f5;
        this.mHeight = f6;
    }

    public void setDpDt(float f, float f4, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f32 = 0.0f;
        float f35 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f36 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f5 = f36;
            } else if (i2 == 2) {
                f32 = f36;
            } else if (i2 == 3) {
                f6 = f36;
            } else if (i2 == 4) {
                f35 = f36;
            }
        }
        float f37 = f5 - ((BitmapDescriptorFactory.HUE_RED * f6) / 2.0f);
        float f41 = f32 - ((BitmapDescriptorFactory.HUE_RED * f35) / 2.0f);
        fArr[0] = (((f6 * 1.0f) + f37) * f) + ((1.0f - f) * f37) + BitmapDescriptorFactory.HUE_RED;
        fArr[1] = (((f35 * 1.0f) + f41) * f4) + ((1.0f - f4) * f41) + BitmapDescriptorFactory.HUE_RED;
    }

    public void setView(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f4;
        float f5 = this.mX;
        float f6 = this.mY;
        float f32 = this.mWidth;
        float f35 = this.mHeight;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i];
            this.mTempDelta = new double[i];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            double[] dArr4 = this.mTempValue;
            int i3 = iArr[i2];
            dArr4[i3] = dArr[i2];
            this.mTempDelta[i3] = dArr2[i2];
        }
        float f36 = Float.NaN;
        int i5 = 0;
        float f37 = BitmapDescriptorFactory.HUE_RED;
        float f41 = BitmapDescriptorFactory.HUE_RED;
        float f42 = BitmapDescriptorFactory.HUE_RED;
        float f57 = BitmapDescriptorFactory.HUE_RED;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i5 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i5]) && (dArr3 == null || dArr3[i5] == 0.0d)) {
                f4 = f36;
            } else {
                double d = dArr3 != null ? dArr3[i5] : 0.0d;
                if (!Double.isNaN(this.mTempValue[i5])) {
                    d = this.mTempValue[i5] + d;
                }
                f4 = f36;
                float f69 = (float) d;
                float f75 = (float) this.mTempDelta[i5];
                if (i5 == 1) {
                    f36 = f4;
                    f5 = f69;
                    f37 = f75;
                } else if (i5 == 2) {
                    f36 = f4;
                    f6 = f69;
                    f41 = f75;
                } else if (i5 == 3) {
                    f36 = f4;
                    f32 = f69;
                    f42 = f75;
                } else if (i5 == 4) {
                    f36 = f4;
                    f35 = f69;
                    f57 = f75;
                } else if (i5 == 5) {
                    f36 = f69;
                }
                i5++;
            }
            f36 = f4;
            i5++;
        }
        float f77 = f36;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter(f, fArr, fArr2);
            float f81 = fArr[0];
            float f82 = fArr[1];
            float f93 = fArr2[0];
            float f94 = fArr2[1];
            double d5 = f5;
            double d6 = f6;
            float fSin = (float) (((Math.sin(d6) * d5) + ((double) f81)) - ((double) (f32 / 2.0f)));
            float fCos = (float) ((((double) f82) - (Math.cos(d6) * d5)) - ((double) (f35 / 2.0f)));
            double d10 = f37;
            double d15 = f41;
            float fCos2 = (float) ((Math.cos(d6) * d5 * d15) + (Math.sin(d6) * d10) + ((double) f93));
            float fSin2 = (float) ((Math.sin(d6) * d5 * d15) + (((double) f94) - (Math.cos(d6) * d10)));
            if (dArr2.length >= 2) {
                dArr2[0] = fCos2;
                dArr2[1] = fSin2;
            }
            if (!Float.isNaN(f77)) {
                view.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + ((double) f77)));
            }
            f5 = fSin;
            f6 = fCos;
        } else if (!Float.isNaN(f77)) {
            view.setRotation(f77 + ((float) Math.toDegrees(Math.atan2((f57 / 2.0f) + f41, (f42 / 2.0f) + f37))) + BitmapDescriptorFactory.HUE_RED);
        }
        float f99 = f5 + 0.5f;
        int i6 = (int) f99;
        float f100 = f6 + 0.5f;
        int i21 = (int) f100;
        int i22 = (int) (f99 + f32);
        int i32 = (int) (f100 + f35);
        int i33 = i22 - i6;
        int i43 = i32 - i21;
        if (i33 != view.getMeasuredWidth() || i43 != view.getMeasuredHeight() || z) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i33, 1073741824), View.MeasureSpec.makeMeasureSpec(i43, 1073741824));
        }
        view.layout(i6, i21, i22, i32);
    }

    public void setupRelative(MotionController motionController, MotionPaths motionPaths) {
        double d = (((this.mWidth / 2.0f) + this.mX) - motionPaths.mX) - (motionPaths.mWidth / 2.0f);
        double d5 = (((this.mHeight / 2.0f) + this.mY) - motionPaths.mY) - (motionPaths.mHeight / 2.0f);
        this.mRelativeToController = motionController;
        this.mX = (float) Math.hypot(d5, d);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.mY = (float) (Math.atan2(d5, d) + 1.5707963267948966d);
        } else {
            this.mY = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull MotionPaths motionPaths) {
        return Float.compare(this.mPosition, motionPaths.mPosition);
    }

    public MotionPaths(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        int i3 = Key.UNSET;
        this.mPathMotionArc = i3;
        this.mAnimateRelativeTo = i3;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mAttributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != Key.UNSET) {
            initPolar(i, i2, keyPosition, motionPaths, motionPaths2);
            return;
        }
        int i5 = keyPosition.mPositionType;
        if (i5 == 1) {
            initPath(keyPosition, motionPaths, motionPaths2);
            return;
        }
        if (i5 == 2) {
            initScreen(i, i2, keyPosition, motionPaths, motionPaths2);
        } else if (i5 != 3) {
            initCartesian(keyPosition, motionPaths, motionPaths2);
        } else {
            initAxis(keyPosition, motionPaths, motionPaths2);
        }
    }

    public void getCenter(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        float fSin = this.mX;
        float fCos = this.mY;
        float f4 = this.mWidth;
        float f5 = this.mHeight;
        float f6 = BitmapDescriptorFactory.HUE_RED;
        float f32 = BitmapDescriptorFactory.HUE_RED;
        float f35 = BitmapDescriptorFactory.HUE_RED;
        float f36 = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < iArr.length; i++) {
            float f37 = (float) dArr[i];
            float f41 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                fSin = f37;
                f6 = f41;
            } else if (i2 == 2) {
                fCos = f37;
                f35 = f41;
            } else if (i2 == 3) {
                f4 = f37;
                f32 = f41;
            } else if (i2 == 4) {
                f5 = f37;
                f36 = f41;
            }
        }
        float f42 = (f32 / 2.0f) + f6;
        float fSin2 = (f36 / 2.0f) + f35;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.getCenter(d, fArr3, fArr4);
            float f57 = fArr3[0];
            float f69 = fArr3[1];
            float f75 = fArr4[0];
            float f77 = fArr4[1];
            f = 2.0f;
            double d5 = fSin;
            double d6 = fCos;
            fSin = (float) (((Math.sin(d6) * d5) + ((double) f57)) - ((double) (f4 / 2.0f)));
            fCos = (float) ((((double) f69) - (Math.cos(d6) * d5)) - ((double) (f5 / 2.0f)));
            double d10 = f6;
            double dSin = (Math.sin(d6) * d10) + ((double) f75);
            double d15 = f35;
            float fCos2 = (float) ((Math.cos(d6) * d15) + dSin);
            fSin2 = (float) ((Math.sin(d6) * d15) + (((double) f77) - (Math.cos(d6) * d10)));
            f42 = fCos2;
        } else {
            f = 2.0f;
        }
        fArr[0] = (f4 / f) + fSin + BitmapDescriptorFactory.HUE_RED;
        fArr[1] = (f5 / f) + fCos + BitmapDescriptorFactory.HUE_RED;
        fArr2[0] = f42;
        fArr2[1] = fSin2;
    }
}
