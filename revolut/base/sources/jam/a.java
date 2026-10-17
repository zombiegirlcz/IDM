package jam;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import uam.b;
import uam.d;
import uam.f;
import uam.g;
import uam.i;
import uam.p;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f172529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f172530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f172531c;
    public final boolean d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IntRange f172532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IntRange f172533h;
    public final Set i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f172534j;
    public final Set k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f172535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f172536m;

    public a(p zoom, Set flashModes, Set focusModes, boolean z, int i, int i2, IntRange jpegQualityRange, IntRange exposureCompensationRange, Set previewFpsRanges, Set antiBandingModes, Set pictureResolutions, Set previewResolutions, Set sensorSensitivities) {
        Intrinsics.checkNotNullParameter(zoom, "zoom");
        Intrinsics.checkNotNullParameter(flashModes, "flashModes");
        Intrinsics.checkNotNullParameter(focusModes, "focusModes");
        Intrinsics.checkNotNullParameter(jpegQualityRange, "jpegQualityRange");
        Intrinsics.checkNotNullParameter(exposureCompensationRange, "exposureCompensationRange");
        Intrinsics.checkNotNullParameter(previewFpsRanges, "previewFpsRanges");
        Intrinsics.checkNotNullParameter(antiBandingModes, "antiBandingModes");
        Intrinsics.checkNotNullParameter(pictureResolutions, "pictureResolutions");
        Intrinsics.checkNotNullParameter(previewResolutions, "previewResolutions");
        Intrinsics.checkNotNullParameter(sensorSensitivities, "sensorSensitivities");
        this.f172529a = zoom;
        this.f172530b = flashModes;
        this.f172531c = focusModes;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.f172532g = jpegQualityRange;
        this.f172533h = exposureCompensationRange;
        this.i = previewFpsRanges;
        this.f172534j = antiBandingModes;
        this.k = pictureResolutions;
        this.f172535l = previewResolutions;
        this.f172536m = sensorSensitivities;
        if (flashModes.isEmpty()) {
            throw new IllegalArgumentException("Capabilities cannot have an empty Set<" + d.class.getSimpleName() + ">.");
        }
        if (focusModes.isEmpty()) {
            throw new IllegalArgumentException("Capabilities cannot have an empty Set<" + f.class.getSimpleName() + ">.");
        }
        if (antiBandingModes.isEmpty()) {
            throw new IllegalArgumentException("Capabilities cannot have an empty Set<" + b.class.getSimpleName() + ">.");
        }
        if (previewFpsRanges.isEmpty()) {
            throw new IllegalArgumentException("Capabilities cannot have an empty Set<" + g.class.getSimpleName() + ">.");
        }
        if (pictureResolutions.isEmpty()) {
            throw new IllegalArgumentException("Capabilities cannot have an empty Set<" + i.class.getSimpleName() + ">.");
        }
        if (previewResolutions.isEmpty()) {
            throw new IllegalArgumentException("Capabilities cannot have an empty Set<" + i.class.getSimpleName() + ">.");
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f172529a, aVar.f172529a) && Intrinsics.f(this.f172530b, aVar.f172530b) && Intrinsics.f(this.f172531c, aVar.f172531c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && Intrinsics.f(this.f172532g, aVar.f172532g) && Intrinsics.f(this.f172533h, aVar.f172533h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f172534j, aVar.f172534j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f172535l, aVar.f172535l) && Intrinsics.f(this.f172536m, aVar.f172536m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    public final int hashCode() {
        int iF = p.a.f(p.a.f(this.f172529a.hashCode() * 31, 31, this.f172530b), 31, this.f172531c);
        boolean z = this.d;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return this.f172536m.hashCode() + p.a.f(p.a.f(p.a.f(p.a.f((this.f172533h.hashCode() + ((this.f172532g.hashCode() + j6.a.b(this.f, j6.a.b(this.e, (iF + r2) * 31, 31), 31)) * 31)) * 31, 31, this.i), 31, this.f172534j), 31, this.k), 31, this.f172535l);
    }

    public final String toString() {
        return "Capabilities" + gbm.b.f142275a + "zoom:" + gbm.b.a(this.f172529a) + "flashModes:" + gbm.b.b(this.f172530b) + "focusModes:" + gbm.b.b(this.f172531c) + "canSmoothZoom:" + gbm.b.a(Boolean.valueOf(this.d)) + "maxFocusAreas:" + gbm.b.a(Integer.valueOf(this.e)) + "maxMeteringAreas:" + gbm.b.a(Integer.valueOf(this.f)) + "jpegQualityRange:" + gbm.b.a(this.f172532g) + "exposureCompensationRange:" + gbm.b.a(this.f172533h) + "antiBandingModes:" + gbm.b.b(this.f172534j) + "previewFpsRanges:" + gbm.b.b(this.i) + "pictureResolutions:" + gbm.b.b(this.k) + "previewResolutions:" + gbm.b.b(this.f172535l) + "sensorSensitivities:" + gbm.b.b(this.f172536m);
    }
}
