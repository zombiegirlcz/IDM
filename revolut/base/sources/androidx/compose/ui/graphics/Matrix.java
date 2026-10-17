package androidx.compose.ui.graphics;

import a0.d;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import zsc.p;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u001f\b\u0087@\u0018\u0000 D2\u00020\u0001:\u0001DB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0011\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010#\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\"J\r\u0010%\u001a\u00020\u0017¢\u0006\u0004\b$\u0010\"J\u0015\u0010*\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J+\u00100\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020&2\b\b\u0002\u0010,\u001a\u00020&2\b\b\u0002\u0010-\u001a\u00020&¢\u0006\u0004\b.\u0010/J+\u00102\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020&2\b\b\u0002\u0010,\u001a\u00020&2\b\b\u0002\u0010-\u001a\u00020&¢\u0006\u0004\b1\u0010/J{\u0010@\u001a\u00020\u00172\b\b\u0002\u00103\u001a\u00020&2\b\b\u0002\u00104\u001a\u00020&2\b\b\u0002\u00105\u001a\u00020&2\b\b\u0002\u00106\u001a\u00020&2\b\b\u0002\u00107\u001a\u00020&2\b\b\u0002\u00108\u001a\u00020&2\b\b\u0002\u00109\u001a\u00020&2\b\b\u0002\u0010:\u001a\u00020&2\b\b\u0002\u0010;\u001a\u00020&2\b\b\u0002\u0010<\u001a\u00020&2\b\b\u0002\u0010=\u001a\u00020&¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010C\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006E"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "", "values", "constructor-impl", "([F)[F", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/geometry/Offset;", "point", "map-MK-Hz9U", "([FJ)J", "map", "Landroidx/compose/ui/geometry/Rect;", "rect", "map-impl", "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/MutableRect;", "", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "m", "timesAssign-58bKbWc", "([F[F)V", "timesAssign", "", "toString-impl", "([F)Ljava/lang/String;", "toString", "invert-impl", "([F)V", "invert", "reset-impl", "reset", "", "degrees", "rotateZ-impl", "([FF)V", "rotateZ", "x", "y", "z", "scale-impl", "([FFFF)V", "scale", "translate-impl", "translate", "pivotX", "pivotY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "scaleZ", "resetToPivotedTransform-impl", "([FFFFFFFFFFFF)V", "resetToPivotedTransform", "[F", "getValues", "()[F", "Companion", "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Matrix {

    @NotNull
    private final float[] values;

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Matrix m2048boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float[] m2049constructorimpl(@NotNull float[] fArr) {
        return fArr;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m2050constructorimpl$default(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};
        }
        return m2049constructorimpl(fArr);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2051equalsimpl(float[] fArr, Object obj2) {
        return (obj2 instanceof Matrix) && Intrinsics.f(fArr, ((Matrix) obj2).getValues());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2052equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.f(fArr, fArr2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2053hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* JADX INFO: renamed from: invert-impl, reason: not valid java name */
    public static final void m2054invertimpl(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f32 = fArr[4];
        float f35 = fArr[5];
        float f36 = fArr[6];
        float f37 = fArr[7];
        float f41 = fArr[8];
        float f42 = fArr[9];
        float f57 = fArr[10];
        float f69 = fArr[11];
        float f75 = fArr[12];
        float f77 = fArr[13];
        float f81 = fArr[14];
        float f82 = fArr[15];
        float f93 = (f * f35) - (f4 * f32);
        float f94 = (f * f36) - (f5 * f32);
        float f99 = (f * f37) - (f6 * f32);
        float f100 = (f4 * f36) - (f5 * f35);
        float f101 = (f4 * f37) - (f6 * f35);
        float f102 = (f5 * f37) - (f6 * f36);
        float f103 = (f41 * f77) - (f42 * f75);
        float f104 = (f41 * f81) - (f57 * f75);
        float f105 = (f41 * f82) - (f69 * f75);
        float f106 = (f42 * f81) - (f57 * f77);
        float f107 = (f42 * f82) - (f69 * f77);
        float f108 = (f57 * f82) - (f69 * f81);
        float f109 = (f102 * f103) + (((f100 * f105) + ((f99 * f106) + ((f93 * f108) - (f94 * f107)))) - (f101 * f104));
        if (f109 == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f110 = 1.0f / f109;
        fArr[0] = d.a(f37, f106, (f35 * f108) - (f36 * f107), f110);
        fArr[1] = e.a(f6, f106, (f5 * f107) + ((-f4) * f108), f110);
        fArr[2] = d.a(f82, f100, (f77 * f102) - (f81 * f101), f110);
        fArr[3] = e.a(f69, f100, (f57 * f101) + ((-f42) * f102), f110);
        float f111 = -f32;
        fArr[4] = e.a(f37, f104, (f36 * f105) + (f111 * f108), f110);
        fArr[5] = d.a(f6, f104, (f108 * f) - (f5 * f105), f110);
        float f112 = -f75;
        fArr[6] = e.a(f82, f94, (f81 * f99) + (f112 * f102), f110);
        fArr[7] = d.a(f69, f94, (f41 * f102) - (f57 * f99), f110);
        fArr[8] = d.a(f37, f103, (f32 * f107) - (f35 * f105), f110);
        fArr[9] = e.a(f6, f103, (f105 * f4) + ((-f) * f107), f110);
        fArr[10] = d.a(f82, f93, (f75 * f101) - (f77 * f99), f110);
        fArr[11] = e.a(f69, f93, (f99 * f42) + ((-f41) * f101), f110);
        fArr[12] = e.a(f36, f103, (f35 * f104) + (f111 * f106), f110);
        fArr[13] = d.a(f5, f103, (f * f106) - (f4 * f104), f110);
        fArr[14] = e.a(f81, f93, (f77 * f94) + (f112 * f100), f110);
        fArr[15] = d.a(f57, f93, (f41 * f100) - (f42 * f94), f110);
    }

    /* JADX INFO: renamed from: map-MK-Hz9U, reason: not valid java name */
    public static final long m2055mapMKHz9U(float[] fArr, long j2) {
        if (fArr.length < 16) {
            return j2;
        }
        float f = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f32 = fArr[5];
        float f35 = fArr[7];
        float f36 = fArr[12];
        float f37 = fArr[13];
        float f41 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax));
        float f42 = 1 / (((f35 * fIntBitsToFloat2) + (f5 * fIntBitsToFloat)) + f41);
        if ((Float.floatToRawIntBits(f42) & Integer.MAX_VALUE) >= 2139095040) {
            f42 = BitmapDescriptorFactory.HUE_RED;
        }
        return Offset.m1827constructorimpl((((long) Float.floatToRawIntBits((((f6 * fIntBitsToFloat2) + (f * fIntBitsToFloat)) + f36) * f42)) << 32) | (((long) Float.floatToRawIntBits(((f32 * fIntBitsToFloat2) + (f4 * fIntBitsToFloat) + f37) * f42)) & BodyPartID.bodyIdMax));
    }

    @NotNull
    /* JADX INFO: renamed from: map-impl, reason: not valid java name */
    public static final Rect m2056mapimpl(float[] fArr, @NotNull Rect rect) {
        if (fArr.length < 16) {
            return rect;
        }
        float f = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f32 = fArr[5];
        float f35 = fArr[7];
        float f36 = fArr[12];
        float f37 = fArr[13];
        float f41 = fArr[15];
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        float f42 = f5 * left;
        float f57 = f35 * top;
        float f69 = 1.0f / ((f42 + f57) + f41);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f69) & Integer.MAX_VALUE;
        float f75 = BitmapDescriptorFactory.HUE_RED;
        if (iFloatToRawIntBits >= 2139095040) {
            f69 = 0.0f;
        }
        float f77 = f * left;
        float f81 = f6 * top;
        float f82 = (f77 + f81 + f36) * f69;
        float f93 = left * f4;
        float f94 = top * f32;
        float f99 = f69 * (f93 + f94 + f37);
        float f100 = f35 * bottom;
        float f101 = 1.0f / ((f42 + f100) + f41);
        if ((Float.floatToRawIntBits(f101) & Integer.MAX_VALUE) >= 2139095040) {
            f101 = 0.0f;
        }
        float f102 = f6 * bottom;
        float f103 = (f77 + f102 + f36) * f101;
        float f104 = f32 * bottom;
        float f105 = (f93 + f104 + f37) * f101;
        float f106 = f5 * right;
        float f107 = 1.0f / ((f57 + f106) + f41);
        if ((Float.floatToRawIntBits(f107) & Integer.MAX_VALUE) >= 2139095040) {
            f107 = 0.0f;
        }
        float f108 = f * right;
        float f109 = (f108 + f81 + f36) * f107;
        float f110 = right * f4;
        float f111 = (f94 + f110 + f37) * f107;
        float f112 = 1.0f / ((f106 + f100) + f41);
        if ((Float.floatToRawIntBits(f112) & Integer.MAX_VALUE) < 2139095040) {
            f75 = f112;
        }
        float f113 = (f108 + f102 + f36) * f75;
        float f114 = (f110 + f104 + f37) * f75;
        return new Rect(Math.min(f82, Math.min(f103, Math.min(f109, f113))), Math.min(f99, Math.min(f105, Math.min(f111, f114))), Math.max(f82, Math.max(f103, Math.max(f109, f113))), Math.max(f99, Math.max(f105, Math.max(f111, f114))));
    }

    /* JADX INFO: renamed from: reset-impl, reason: not valid java name */
    public static final void m2058resetimpl(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    /* JADX INFO: renamed from: resetToPivotedTransform-impl, reason: not valid java name */
    public static final void m2059resetToPivotedTransformimpl(float[] fArr, float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41, float f42, float f57) {
        double d = ((double) f35) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d);
        float fCos = (float) Math.cos(d);
        float f69 = -fSin;
        float f75 = (f6 * fCos) - (f32 * fSin);
        float f77 = (f32 * fCos) + (f6 * fSin);
        double d5 = ((double) f36) * 0.017453292519943295d;
        float fSin2 = (float) Math.sin(d5);
        float fCos2 = (float) Math.cos(d5);
        float f81 = -fSin2;
        float f82 = fSin * fSin2;
        float f93 = fSin * fCos2;
        float f94 = fCos * fSin2;
        float f99 = fCos * fCos2;
        float f100 = (f77 * fSin2) + (f5 * fCos2);
        float f101 = (f77 * fCos2) + ((-f5) * fSin2);
        double d6 = ((double) f37) * 0.017453292519943295d;
        float fSin3 = (float) Math.sin(d6);
        float fCos3 = (float) Math.cos(d6);
        float f102 = -fSin3;
        float f103 = (fCos3 * f82) + (f102 * fCos2);
        float f104 = (f82 * fSin3) + (fCos2 * fCos3);
        float f105 = fSin3 * fCos;
        float f106 = f104 * f41;
        float f107 = f105 * f41;
        float f108 = ((fSin3 * f93) + (fCos3 * f81)) * f41;
        float f109 = f103 * f42;
        float f110 = fCos * fCos3 * f42;
        float f111 = ((fCos3 * f93) + (f102 * f81)) * f42;
        float f112 = f94 * f57;
        float f113 = f69 * f57;
        float f114 = f99 * f57;
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = f106;
        fArr[1] = f107;
        fArr[2] = f108;
        fArr[3] = 0.0f;
        fArr[4] = f109;
        fArr[5] = f110;
        fArr[6] = f111;
        fArr[7] = 0.0f;
        fArr[8] = f112;
        fArr[9] = f113;
        fArr[10] = f114;
        fArr[11] = 0.0f;
        float f115 = -f;
        fArr[12] = ((f106 * f115) - (f109 * f4)) + f100 + f;
        fArr[13] = ((f107 * f115) - (f110 * f4)) + f75 + f4;
        fArr[14] = ((f115 * f108) - (f4 * f111)) + f101;
        fArr[15] = 1.0f;
    }

    /* JADX INFO: renamed from: resetToPivotedTransform-impl$default, reason: not valid java name */
    public static /* synthetic */ void m2060resetToPivotedTransformimpl$default(float[] fArr, float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41, float f42, float f57, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f5 = 0.0f;
        }
        if ((i & 8) != 0) {
            f6 = 0.0f;
        }
        if ((i & 16) != 0) {
            f32 = 0.0f;
        }
        if ((i & 32) != 0) {
            f35 = 0.0f;
        }
        if ((i & 64) != 0) {
            f36 = 0.0f;
        }
        if ((i & 128) != 0) {
            f37 = 0.0f;
        }
        if ((i & 256) != 0) {
            f41 = 1.0f;
        }
        if ((i & 512) != 0) {
            f42 = 1.0f;
        }
        if ((i & 1024) != 0) {
            f57 = 1.0f;
        }
        m2059resetToPivotedTransformimpl(fArr, f, f4, f5, f6, f32, f35, f36, f37, f41, f42, f57);
    }

    /* JADX INFO: renamed from: rotateZ-impl, reason: not valid java name */
    public static final void m2061rotateZimpl(float[] fArr, float f) {
        if (fArr.length < 16) {
            return;
        }
        double d = ((double) f) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d);
        float fCos = (float) Math.cos(d);
        float f4 = fArr[0];
        float f5 = fArr[4];
        float f6 = (fSin * f5) + (fCos * f4);
        float f32 = -fSin;
        float f35 = (f5 * fCos) + (f4 * f32);
        float f36 = fArr[1];
        float f37 = fArr[5];
        float f41 = (fSin * f37) + (fCos * f36);
        float f42 = (f37 * fCos) + (f36 * f32);
        float f57 = fArr[2];
        float f69 = fArr[6];
        float f75 = (fSin * f69) + (fCos * f57);
        float f77 = (f69 * fCos) + (f57 * f32);
        float f81 = fArr[3];
        float f82 = fArr[7];
        float f93 = (fSin * f82) + (fCos * f81);
        fArr[0] = f6;
        fArr[1] = f41;
        fArr[2] = f75;
        fArr[3] = f93;
        fArr[4] = f35;
        fArr[5] = f42;
        fArr[6] = f77;
        fArr[7] = (fCos * f82) + (f32 * f81);
    }

    /* JADX INFO: renamed from: scale-impl, reason: not valid java name */
    public static final void m2062scaleimpl(float[] fArr, float f, float f4, float f5) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f4;
        fArr[5] = fArr[5] * f4;
        fArr[6] = fArr[6] * f4;
        fArr[7] = fArr[7] * f4;
        fArr[8] = fArr[8] * f5;
        fArr[9] = fArr[9] * f5;
        fArr[10] = fArr[10] * f5;
        fArr[11] = fArr[11] * f5;
    }

    /* JADX INFO: renamed from: scale-impl$default, reason: not valid java name */
    public static /* synthetic */ void m2063scaleimpl$default(float[] fArr, float f, float f4, float f5, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f4 = 1.0f;
        }
        if ((i & 4) != 0) {
            f5 = 1.0f;
        }
        m2062scaleimpl(fArr, f, f4, f5);
    }

    /* JADX INFO: renamed from: timesAssign-58bKbWc, reason: not valid java name */
    public static final void m2064timesAssign58bKbWc(float[] fArr, @NotNull float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f = fArr[0];
            float f4 = fArr2[0];
            float f5 = fArr[1];
            float f6 = fArr2[4];
            float f32 = fArr[2];
            float f35 = fArr2[8];
            float f36 = f32 * f35;
            float f37 = fArr[3];
            float f41 = fArr2[12];
            float f42 = f37 * f41;
            float f57 = f42 + f36 + (f5 * f6) + (f * f4);
            float f69 = fArr2[1];
            float f75 = fArr2[5];
            float f77 = fArr2[9];
            float f81 = f32 * f77;
            float f82 = fArr2[13];
            float f93 = f37 * f82;
            float f94 = f93 + f81 + (f5 * f75) + (f * f69);
            float f99 = fArr2[2];
            float f100 = fArr2[6];
            float f101 = fArr2[10];
            float f102 = f32 * f101;
            float f103 = fArr2[14];
            float f104 = f37 * f103;
            float f105 = f104 + f102 + (f5 * f100) + (f * f99);
            float f106 = fArr2[3];
            float f107 = fArr2[7];
            float f108 = fArr2[11];
            float f109 = f32 * f108;
            float f110 = fArr2[15];
            float f111 = f37 * f110;
            float f112 = f111 + f109 + (f5 * f107) + (f * f106);
            float f113 = fArr[4];
            float f114 = fArr[5];
            float f115 = fArr[6];
            float f116 = (f115 * f35) + (f114 * f6) + (f113 * f4);
            float f117 = fArr[7];
            float f118 = (f117 * f41) + f116;
            float f119 = (f117 * f82) + (f115 * f77) + (f114 * f75) + (f113 * f69);
            float f120 = (f117 * f103) + (f115 * f101) + (f114 * f100) + (f113 * f99);
            float f121 = f115 * f108;
            float f122 = f117 * f110;
            float f123 = f122 + f121 + (f114 * f107) + (f113 * f106);
            float f124 = fArr[8];
            float f125 = fArr[9];
            float f126 = fArr[10];
            float f127 = (f126 * f35) + (f125 * f6) + (f124 * f4);
            float f128 = fArr[11];
            float f129 = (f128 * f41) + f127;
            float f130 = (f128 * f82) + (f126 * f77) + (f125 * f75) + (f124 * f69);
            float f131 = (f128 * f103) + (f126 * f101) + (f125 * f100) + (f124 * f99);
            float f132 = f126 * f108;
            float f133 = f128 * f110;
            float f134 = f133 + f132 + (f125 * f107) + (f124 * f106);
            float f135 = fArr[12];
            float f136 = fArr[13];
            float f137 = (f6 * f136) + (f4 * f135);
            float f138 = fArr[14];
            float f139 = (f35 * f138) + f137;
            float f140 = fArr[15];
            float f141 = (f41 * f140) + f139;
            float f142 = f77 * f138;
            float f143 = f82 * f140;
            float f144 = f143 + f142 + (f75 * f136) + (f69 * f135);
            float f145 = f101 * f138;
            float f146 = f103 * f140;
            float f147 = f146 + f145 + (f100 * f136) + (f99 * f135);
            float f148 = f138 * f108;
            float f149 = f140 * f110;
            fArr[0] = f57;
            fArr[1] = f94;
            fArr[2] = f105;
            fArr[3] = f112;
            fArr[4] = f118;
            fArr[5] = f119;
            fArr[6] = f120;
            fArr[7] = f123;
            fArr[8] = f129;
            fArr[9] = f130;
            fArr[10] = f131;
            fArr[11] = f134;
            fArr[12] = f141;
            fArr[13] = f144;
            fArr[14] = f147;
            fArr[15] = f149 + f148 + (f136 * f107) + (f135 * f106);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2065toStringimpl(float[] fArr) {
        return t.e("\n            |" + fArr[0] + p.SPACE_CHAR + fArr[1] + p.SPACE_CHAR + fArr[2] + p.SPACE_CHAR + fArr[3] + "|\n            |" + fArr[4] + p.SPACE_CHAR + fArr[5] + p.SPACE_CHAR + fArr[6] + p.SPACE_CHAR + fArr[7] + "|\n            |" + fArr[8] + p.SPACE_CHAR + fArr[9] + p.SPACE_CHAR + fArr[10] + p.SPACE_CHAR + fArr[11] + "|\n            |" + fArr[12] + p.SPACE_CHAR + fArr[13] + p.SPACE_CHAR + fArr[14] + p.SPACE_CHAR + fArr[15] + "|\n        ");
    }

    /* JADX INFO: renamed from: translate-impl, reason: not valid java name */
    public static final void m2066translateimpl(float[] fArr, float f, float f4, float f5) {
        if (fArr.length < 16) {
            return;
        }
        float f6 = (fArr[8] * f5) + (fArr[4] * f4) + (fArr[0] * f) + fArr[12];
        float f32 = (fArr[9] * f5) + (fArr[5] * f4) + (fArr[1] * f) + fArr[13];
        float f35 = (fArr[10] * f5) + (fArr[6] * f4) + (fArr[2] * f) + fArr[14];
        float f36 = (fArr[11] * f5) + (fArr[7] * f4) + (fArr[3] * f) + fArr[15];
        fArr[12] = f6;
        fArr[13] = f32;
        fArr[14] = f35;
        fArr[15] = f36;
    }

    /* JADX INFO: renamed from: translate-impl$default, reason: not valid java name */
    public static /* synthetic */ void m2067translateimpl$default(float[] fArr, float f, float f4, float f5, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f5 = 0.0f;
        }
        m2066translateimpl(fArr, f, f4, f5);
    }

    public boolean equals(Object other) {
        return m2051equalsimpl(this.values, other);
    }

    public int hashCode() {
        return m2053hashCodeimpl(this.values);
    }

    @NotNull
    public String toString() {
        return m2065toStringimpl(this.values);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ float[] getValues() {
        return this.values;
    }

    /* JADX INFO: renamed from: map-impl, reason: not valid java name */
    public static final void m2057mapimpl(float[] fArr, @NotNull MutableRect mutableRect) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f32 = fArr[5];
        float f35 = fArr[7];
        float f36 = fArr[12];
        float f37 = fArr[13];
        float f41 = fArr[15];
        float left = mutableRect.getLeft();
        float top = mutableRect.getTop();
        float right = mutableRect.getRight();
        float bottom = mutableRect.getBottom();
        float f42 = f5 * left;
        float f57 = f35 * top;
        float f69 = 1.0f / ((f42 + f57) + f41);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f69) & Integer.MAX_VALUE;
        float f75 = BitmapDescriptorFactory.HUE_RED;
        if (iFloatToRawIntBits >= 2139095040) {
            f69 = 0.0f;
        }
        float f77 = f * left;
        float f81 = f6 * top;
        float f82 = (f77 + f81 + f36) * f69;
        float f93 = left * f4;
        float f94 = top * f32;
        float f99 = (f93 + f94 + f37) * f69;
        float f100 = f35 * bottom;
        float f101 = 1.0f / ((f42 + f100) + f41);
        if ((Float.floatToRawIntBits(f101) & Integer.MAX_VALUE) >= 2139095040) {
            f101 = 0.0f;
        }
        float f102 = f6 * bottom;
        float f103 = (f77 + f102 + f36) * f101;
        float f104 = f32 * bottom;
        float f105 = (f93 + f104 + f37) * f101;
        float f106 = f5 * right;
        float f107 = 1.0f / ((f57 + f106) + f41);
        if ((Float.floatToRawIntBits(f107) & Integer.MAX_VALUE) >= 2139095040) {
            f107 = 0.0f;
        }
        float f108 = f * right;
        float f109 = (f108 + f81 + f36) * f107;
        float f110 = right * f4;
        float f111 = (f94 + f110 + f37) * f107;
        float f112 = 1.0f / ((f106 + f100) + f41);
        if ((Float.floatToRawIntBits(f112) & Integer.MAX_VALUE) < 2139095040) {
            f75 = f112;
        }
        float f113 = (f108 + f102 + f36) * f75;
        float f114 = (f110 + f104 + f37) * f75;
        mutableRect.setLeft(Math.min(f82, Math.min(f103, Math.min(f109, f113))));
        mutableRect.setTop(Math.min(f99, Math.min(f105, Math.min(f111, f114))));
        mutableRect.setRight(Math.max(f82, Math.max(f103, Math.max(f109, f113))));
        mutableRect.setBottom(Math.max(f99, Math.max(f105, Math.max(f111, f114))));
    }
}
