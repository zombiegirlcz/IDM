package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes15.dex */
class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {
    static String[] sNames = {"position", "x", "y", "width", "height", "pathRotate"};
    private float mHeight;
    private Easing mKeyFrameEasing;
    private float mPosition;
    int mVisibility;
    private float mWidth;
    private float mX;
    private float mY;
    public float rotationY = BitmapDescriptorFactory.HUE_RED;
    int mVisibilityMode = 0;
    LinkedHashMap<String, ConstraintAttribute> mAttributes = new LinkedHashMap<>();
    int mMode = 0;
    double[] mTempValue = new double[18];
    double[] mTempDelta = new double[18];
    private float mAlpha = 1.0f;
    private boolean mApplyElevation = false;
    private float mElevation = BitmapDescriptorFactory.HUE_RED;
    private float mRotation = BitmapDescriptorFactory.HUE_RED;
    private float mRotationX = BitmapDescriptorFactory.HUE_RED;
    private float mScaleX = 1.0f;
    private float mScaleY = 1.0f;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float mTranslationX = BitmapDescriptorFactory.HUE_RED;
    private float mTranslationY = BitmapDescriptorFactory.HUE_RED;
    private float mTranslationZ = BitmapDescriptorFactory.HUE_RED;
    private int mDrawPath = 0;
    private float mPathRotate = Float.NaN;
    private float mProgress = Float.NaN;
    private int mAnimateRelativeTo = -1;

    private boolean diff(float f, float f4) {
        return (Float.isNaN(f) || Float.isNaN(f4)) ? Float.isNaN(f) != Float.isNaN(f4) : Math.abs(f - f4) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void addValues(HashMap<String, ViewSpline> map, int i) {
        for (String str : map.keySet()) {
            ViewSpline viewSpline = map.get(str);
            if (viewSpline != null) {
                str.getClass();
                byte b4 = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b4 = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b4 = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b4 = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b4 = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b4 = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b4 = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b4 = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b4 = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b4 = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b4 = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b4 = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b4 = 11;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b4 = 12;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b4 = 13;
                        }
                        break;
                }
                float f = BitmapDescriptorFactory.HUE_RED;
                switch (b4) {
                    case 0:
                        if (!Float.isNaN(this.mRotationX)) {
                            f = this.mRotationX;
                        }
                        viewSpline.setPoint(i, f);
                        break;
                    case 1:
                        if (!Float.isNaN(this.rotationY)) {
                            f = this.rotationY;
                        }
                        viewSpline.setPoint(i, f);
                        break;
                    case 2:
                        if (!Float.isNaN(this.mTranslationX)) {
                            f = this.mTranslationX;
                        }
                        viewSpline.setPoint(i, f);
                        break;
                    case 3:
                        if (!Float.isNaN(this.mTranslationY)) {
                            f = this.mTranslationY;
                        }
                        viewSpline.setPoint(i, f);
                        break;
                    case 4:
                        if (!Float.isNaN(this.mTranslationZ)) {
                            f = this.mTranslationZ;
                        }
                        viewSpline.setPoint(i, f);
                        break;
                    case 5:
                        if (!Float.isNaN(this.mProgress)) {
                            f = this.mProgress;
                        }
                        viewSpline.setPoint(i, f);
                        break;
                    case 6:
                        viewSpline.setPoint(i, Float.isNaN(this.mScaleX) ? 1.0f : this.mScaleX);
                        break;
                    case 7:
                        viewSpline.setPoint(i, Float.isNaN(this.mScaleY) ? 1.0f : this.mScaleY);
                        break;
                    case 8:
                        if (!Float.isNaN(this.mPivotX)) {
                            f = this.mPivotX;
                        }
                        viewSpline.setPoint(i, f);
                        break;
                    case 9:
                        if (!Float.isNaN(this.mPivotY)) {
                            f = this.mPivotY;
                        }
                        viewSpline.setPoint(i, f);
                        break;
                    case 10:
                        if (!Float.isNaN(this.mRotation)) {
                            f = this.mRotation;
                        }
                        viewSpline.setPoint(i, f);
                        break;
                    case 11:
                        if (!Float.isNaN(this.mElevation)) {
                            f = this.mElevation;
                        }
                        viewSpline.setPoint(i, f);
                        break;
                    case 12:
                        if (!Float.isNaN(this.mPathRotate)) {
                            f = this.mPathRotate;
                        }
                        viewSpline.setPoint(i, f);
                        break;
                    case 13:
                        viewSpline.setPoint(i, Float.isNaN(this.mAlpha) ? 1.0f : this.mAlpha);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            if (this.mAttributes.containsKey(str2)) {
                                ConstraintAttribute constraintAttribute = this.mAttributes.get(str2);
                                if (viewSpline instanceof ViewSpline.CustomSet) {
                                    ((ViewSpline.CustomSet) viewSpline).setPoint(i, constraintAttribute);
                                } else {
                                    String str3 = str + " ViewSpline not a CustomSet frame = " + i + ", value" + constraintAttribute.getValueToInterpolate() + viewSpline;
                                }
                            }
                        } else {
                            "UNKNOWN spline ".concat(str);
                        }
                        break;
                }
            }
        }
    }

    public void applyParameters(View view) {
        this.mVisibility = view.getVisibility();
        this.mAlpha = view.getVisibility() != 0 ? BitmapDescriptorFactory.HUE_RED : view.getAlpha();
        this.mApplyElevation = false;
        this.mElevation = view.getElevation();
        this.mRotation = view.getRotation();
        this.mRotationX = view.getRotationX();
        this.rotationY = view.getRotationY();
        this.mScaleX = view.getScaleX();
        this.mScaleY = view.getScaleY();
        this.mPivotX = view.getPivotX();
        this.mPivotY = view.getPivotY();
        this.mTranslationX = view.getTranslationX();
        this.mTranslationY = view.getTranslationY();
        this.mTranslationZ = view.getTranslationZ();
    }

    public void different(MotionConstrainedPoint motionConstrainedPoint, HashSet<String> hashSet) {
        if (diff(this.mAlpha, motionConstrainedPoint.mAlpha)) {
            hashSet.add("alpha");
        }
        if (diff(this.mElevation, motionConstrainedPoint.mElevation)) {
            hashSet.add("elevation");
        }
        int i = this.mVisibility;
        int i2 = motionConstrainedPoint.mVisibility;
        if (i != i2 && this.mVisibilityMode == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (diff(this.mRotation, motionConstrainedPoint.mRotation)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.mPathRotate) || !Float.isNaN(motionConstrainedPoint.mPathRotate)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.mProgress) || !Float.isNaN(motionConstrainedPoint.mProgress)) {
            hashSet.add("progress");
        }
        if (diff(this.mRotationX, motionConstrainedPoint.mRotationX)) {
            hashSet.add("rotationX");
        }
        if (diff(this.rotationY, motionConstrainedPoint.rotationY)) {
            hashSet.add("rotationY");
        }
        if (diff(this.mPivotX, motionConstrainedPoint.mPivotX)) {
            hashSet.add("transformPivotX");
        }
        if (diff(this.mPivotY, motionConstrainedPoint.mPivotY)) {
            hashSet.add("transformPivotY");
        }
        if (diff(this.mScaleX, motionConstrainedPoint.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (diff(this.mScaleY, motionConstrainedPoint.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (diff(this.mTranslationX, motionConstrainedPoint.mTranslationX)) {
            hashSet.add("translationX");
        }
        if (diff(this.mTranslationY, motionConstrainedPoint.mTranslationY)) {
            hashSet.add("translationY");
        }
        if (diff(this.mTranslationZ, motionConstrainedPoint.mTranslationZ)) {
            hashSet.add("translationZ");
        }
    }

    public void setBounds(float f, float f4, float f5, float f6) {
        this.mX = f;
        this.mY = f4;
        this.mWidth = f5;
        this.mHeight = f6;
    }

    public void setState(View view) {
        setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        applyParameters(view);
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        return Float.compare(this.mPosition, motionConstrainedPoint.mPosition);
    }

    public void setState(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        setBounds(rect.left, rect.top, rect.width(), rect.height());
        applyParameters(constraintSet.getParameters(i2));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.mRotation + 90.0f;
            this.mRotation = f;
            if (f > 180.0f) {
                this.mRotation = f - 360.0f;
                return;
            }
            return;
        }
        this.mRotation -= 90.0f;
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        ConstraintSet.PropertySet propertySet = constraint.propertySet;
        int i = propertySet.mVisibilityMode;
        this.mVisibilityMode = i;
        int i2 = propertySet.visibility;
        this.mVisibility = i2;
        this.mAlpha = (i2 == 0 || i != 0) ? propertySet.alpha : BitmapDescriptorFactory.HUE_RED;
        ConstraintSet.Transform transform = constraint.transform;
        this.mApplyElevation = transform.applyElevation;
        this.mElevation = transform.elevation;
        this.mRotation = transform.rotation;
        this.mRotationX = transform.rotationX;
        this.rotationY = transform.rotationY;
        this.mScaleX = transform.scaleX;
        this.mScaleY = transform.scaleY;
        this.mPivotX = transform.transformPivotX;
        this.mPivotY = transform.transformPivotY;
        this.mTranslationX = transform.translationX;
        this.mTranslationY = transform.translationY;
        this.mTranslationZ = transform.translationZ;
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mProgress = constraint.propertySet.mProgress;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute.isContinuous()) {
                this.mAttributes.put(str, constraintAttribute);
            }
        }
    }
}
