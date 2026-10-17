package androidx.compose.animation.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0015B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005R\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/core/ArcSpline;", "", "arcModes", "", "timePoints", "", "y", "", "<init>", "([I[F[[F)V", "arcs", "Landroidx/compose/animation/core/ArcSpline$Arc;", "[[Landroidx/compose/animation/core/ArcSpline$Arc;", "isExtrapolate", "", "getPos", "", "time", "", "v", "getSlope", "Arc", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ArcSpline {

    @NotNull
    private final Arc[][] arcs;
    private final boolean isExtrapolate = true;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BA\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u000fJ\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u000fJ/\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001cR\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0014\u0010(\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001cR\u0014\u0010)\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u0014\u0010+\u001a\u00020*8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001cR\u0014\u0010.\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001c¨\u0006/"}, d2 = {"Landroidx/compose/animation/core/ArcSpline$Arc;", "", "", "mode", "", "time1", "time2", "x1", "y1", "x2", "y2", "<init>", "(IFFFFFF)V", "v", "lookup", "(F)F", "time", "", "setPoint", "(F)V", "calcDX", "()F", "calcDY", "getLinearX", "getLinearY", "buildTable$animation_core", "(FFFF)V", "buildTable", "F", "getTime1", "getTime2", "arcDistance", "tmpSinAngle", "tmpCosAngle", "", "lut", "[F", "oneOverDeltaTime", "arcVelocity", "vertical", "ellipseA", "ellipseB", "", "isLinear", "Z", "ellipseCenterX", "ellipseCenterY", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Arc {
        private float arcDistance;
        private final float arcVelocity;
        public final float ellipseA;
        public final float ellipseB;
        public final float ellipseCenterX;
        public final float ellipseCenterY;
        public final boolean isLinear;

        @NotNull
        private final float[] lut;
        private final float oneOverDeltaTime;
        private final float time1;
        private final float time2;
        private float tmpCosAngle;
        private float tmpSinAngle;
        private final float vertical;
        private final float x1;
        private final float x2;
        private final float y1;
        private final float y2;

        public Arc(int i, float f, float f4, float f5, float f6, float f32, float f35) {
            this.time1 = f;
            this.time2 = f4;
            this.x1 = f5;
            this.y1 = f6;
            this.x2 = f32;
            this.y2 = f35;
            float f36 = f32 - f5;
            float f37 = f35 - f6;
            boolean z = true;
            boolean z3 = i == 1 || (i == 4 ? f37 > BitmapDescriptorFactory.HUE_RED : !(i != 5 || f37 >= BitmapDescriptorFactory.HUE_RED));
            float f41 = z3 ? -1.0f : 1.0f;
            this.vertical = f41;
            float f42 = 1 / (f4 - f);
            this.oneOverDeltaTime = f42;
            this.lut = new float[101];
            boolean z4 = i == 3;
            if (z4 || Math.abs(f36) < 0.001f || Math.abs(f37) < 0.001f) {
                float fHypot = (float) Math.hypot(f37, f36);
                this.arcDistance = fHypot;
                this.arcVelocity = fHypot * f42;
                this.ellipseCenterX = f36 * f42;
                this.ellipseCenterY = f37 * f42;
                this.ellipseA = Float.NaN;
                this.ellipseB = Float.NaN;
            } else {
                this.ellipseA = f36 * f41;
                this.ellipseB = f37 * (-f41);
                this.ellipseCenterX = z3 ? f32 : f5;
                this.ellipseCenterY = z3 ? f6 : f35;
                buildTable$animation_core(f5, f6, f32, f35);
                this.arcVelocity = this.arcDistance * f42;
                z = z4;
            }
            this.isLinear = z;
        }

        private final float lookup(float v) {
            if (v <= BitmapDescriptorFactory.HUE_RED) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            if (v >= 1.0f) {
                return 1.0f;
            }
            float f = v * 100;
            int i = (int) f;
            float f4 = f - i;
            float[] fArr = this.lut;
            float f5 = fArr[i];
            return j6.a.a(fArr[i + 1], f5, f4, f5);
        }

        public final void buildTable$animation_core(float x110, float y110, float x210, float y2) {
            float f;
            float fHypot;
            float f4 = x210 - x110;
            float f5 = y110 - y2;
            float[] fArr = ArcSplineKt.OurPercentCache;
            int length = fArr.length - 1;
            float f6 = length;
            float[] fArr2 = this.lut;
            if (1 <= length) {
                float f32 = f5;
                int i = 1;
                fHypot = 0.0f;
                float f35 = 0.0f;
                while (true) {
                    f = f6;
                    double radians = (float) Math.toRadians((((double) i) * 90.0d) / ((double) length));
                    float fSin = ((float) Math.sin(radians)) * f4;
                    float fCos = ((float) Math.cos(radians)) * f5;
                    fHypot += (float) Math.hypot(fSin - f35, fCos - f32);
                    fArr[i] = fHypot;
                    if (i == length) {
                        break;
                    }
                    i++;
                    f6 = f;
                    f32 = fCos;
                    f35 = fSin;
                }
            } else {
                f = f6;
                fHypot = 0.0f;
            }
            this.arcDistance = fHypot;
            if (1 <= length) {
                int i2 = 1;
                while (true) {
                    fArr[i2] = fArr[i2] / fHypot;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            int length2 = fArr2.length;
            for (int i3 = 0; i3 < length2; i3++) {
                float f36 = i3 / 100.0f;
                int length3 = fArr.length;
                Intrinsics.checkNotNullParameter(fArr, "<this>");
                int iBinarySearch = Arrays.binarySearch(fArr, 0, length3, f36);
                if (iBinarySearch >= 0) {
                    fArr2[i3] = iBinarySearch / f;
                } else if (iBinarySearch == -1) {
                    fArr2[i3] = 0.0f;
                } else {
                    int i5 = -iBinarySearch;
                    int i6 = i5 - 2;
                    float f37 = i6;
                    float f41 = fArr[i6];
                    fArr2[i3] = (((f36 - f41) / (fArr[i5 - 1] - f41)) + f37) / f;
                }
            }
        }

        public final float calcDX() {
            float f = this.ellipseA * this.tmpCosAngle;
            return f * this.vertical * (this.arcVelocity / ((float) Math.hypot(f, (-this.ellipseB) * this.tmpSinAngle)));
        }

        public final float calcDY() {
            float f = this.ellipseA * this.tmpCosAngle;
            float f4 = (-this.ellipseB) * this.tmpSinAngle;
            return f4 * this.vertical * (this.arcVelocity / ((float) Math.hypot(f, f4)));
        }

        public final float getLinearX(float time) {
            float f = (time - this.time1) * this.oneOverDeltaTime;
            float f4 = this.x1;
            return j6.a.a(this.x2, f4, f, f4);
        }

        public final float getLinearY(float time) {
            float f = (time - this.time1) * this.oneOverDeltaTime;
            float f4 = this.y1;
            return j6.a.a(this.y2, f4, f, f4);
        }

        public final float getTime1() {
            return this.time1;
        }

        public final float getTime2() {
            return this.time2;
        }

        public final void setPoint(float time) {
            double dLookup = lookup((this.vertical == -1.0f ? this.time2 - time : time - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
            this.tmpSinAngle = (float) Math.sin(dLookup);
            this.tmpCosAngle = (float) Math.cos(dLookup);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[PHI: r10
      0x0028: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ArcSpline(@org.jetbrains.annotations.NotNull int[] r22, @org.jetbrains.annotations.NotNull float[] r23, @org.jetbrains.annotations.NotNull float[][] r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r0.<init>()
            r2 = 1
            r0.isExtrapolate = r2
            int r3 = r1.length
            int r3 = r3 - r2
            androidx.compose.animation.core.ArcSpline$Arc[][] r4 = new androidx.compose.animation.core.ArcSpline.Arc[r3][]
            r5 = 0
            r7 = r2
            r8 = r7
            r6 = r5
        L12:
            if (r6 >= r3) goto L69
            r9 = r22[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L28
            if (r9 == r2) goto L31
            if (r9 == r11) goto L2f
            if (r9 == r10) goto L2a
            r10 = 4
            if (r9 == r10) goto L28
            r10 = 5
            if (r9 == r10) goto L28
            r13 = r8
            goto L33
        L28:
            r13 = r10
            goto L33
        L2a:
            if (r7 != r2) goto L31
            goto L2f
        L2d:
            r13 = r7
            goto L33
        L2f:
            r7 = r11
            goto L2d
        L31:
            r7 = r2
            goto L2d
        L33:
            r8 = r24[r6]
            int r9 = r6 + 1
            r10 = r24[r9]
            r14 = r1[r6]
            r15 = r1[r9]
            int r12 = r8.length
            int r12 = r12 / r11
            int r2 = r8.length
            int r2 = r2 % r11
            int r2 = r2 + r12
            androidx.compose.animation.core.ArcSpline$Arc[] r11 = new androidx.compose.animation.core.ArcSpline.Arc[r2]
            r12 = r5
        L45:
            if (r12 >= r2) goto L63
            int r16 = r12 * 2
            r17 = r12
            androidx.compose.animation.core.ArcSpline$Arc r12 = new androidx.compose.animation.core.ArcSpline$Arc
            r18 = r16
            r16 = r8[r18]
            int r19 = r18 + 1
            r20 = r17
            r17 = r8[r19]
            r18 = r10[r18]
            r19 = r10[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r20] = r12
            int r12 = r20 + 1
            goto L45
        L63:
            r4[r6] = r11
            r6 = r9
            r8 = r13
            r2 = 1
            goto L12
        L69:
            r0.arcs = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.ArcSpline.<init>(int[], float[], float[][]):void");
    }

    public final void getPos(float time, @NotNull float[] v) {
        Arc[][] arcArr = this.arcs;
        int length = arcArr.length - 1;
        int i = 0;
        float time1 = arcArr[0][0].getTime1();
        float time2 = arcArr[length][0].getTime2();
        int length2 = v.length;
        if (!this.isExtrapolate) {
            time = Math.min(Math.max(time, time1), time2);
        } else if (time < time1 || time > time2) {
            if (time > time2) {
                time1 = time2;
            } else {
                length = 0;
            }
            float f = time - time1;
            int i2 = 0;
            while (i < length2 - 1) {
                Arc arc = arcArr[length][i2];
                if (arc.isLinear) {
                    v[i] = (arc.ellipseCenterX * f) + arc.getLinearX(time1);
                    v[i + 1] = (arc.ellipseCenterY * f) + arc.getLinearY(time1);
                } else {
                    arc.setPoint(time1);
                    v[i] = (arc.calcDX() * f) + (arc.tmpSinAngle * arc.ellipseA) + arc.ellipseCenterX;
                    v[i + 1] = (arc.calcDY() * f) + (arc.tmpCosAngle * arc.ellipseB) + arc.ellipseCenterY;
                }
                i += 2;
                i2++;
            }
            return;
        }
        boolean z = false;
        for (Arc[] arcArr2 : arcArr) {
            int i3 = 0;
            int i5 = 0;
            while (i3 < length2 - 1) {
                Arc arc2 = arcArr2[i5];
                if (time <= arc2.getTime2()) {
                    if (arc2.isLinear) {
                        v[i3] = arc2.getLinearX(time);
                        v[i3 + 1] = arc2.getLinearY(time);
                    } else {
                        arc2.setPoint(time);
                        v[i3] = (arc2.tmpSinAngle * arc2.ellipseA) + arc2.ellipseCenterX;
                        v[i3 + 1] = (arc2.tmpCosAngle * arc2.ellipseB) + arc2.ellipseCenterY;
                    }
                    z = true;
                }
                i3 += 2;
                i5++;
            }
            if (z) {
                return;
            }
        }
    }

    public final void getSlope(float time, @NotNull float[] v) {
        Arc[][] arcArr = this.arcs;
        float time1 = arcArr[0][0].getTime1();
        float time2 = arcArr[arcArr.length - 1][0].getTime2();
        if (time < time1) {
            time = time1;
        }
        if (time <= time2) {
            time2 = time;
        }
        int length = v.length;
        boolean z = false;
        for (Arc[] arcArr2 : arcArr) {
            int i = 0;
            int i2 = 0;
            while (i < length - 1) {
                Arc arc = arcArr2[i2];
                if (time2 <= arc.getTime2()) {
                    if (arc.isLinear) {
                        v[i] = arc.ellipseCenterX;
                        v[i + 1] = arc.ellipseCenterY;
                    } else {
                        arc.setPoint(time2);
                        v[i] = arc.calcDX();
                        v[i + 1] = arc.calcDY();
                    }
                    z = true;
                }
                i += 2;
                i2++;
            }
            if (z) {
                return;
            }
        }
    }
}
