package e10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f121837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f121838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f121839c;
    public final t d;
    public final t e;
    public final t f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f121840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f121841h;
    public final t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f121842j;
    public final t k;

    public s(t dark, t darkContour, t bright, t blur, t glare, t colorized, t fraud, t leftEye, t rightEye, t occluded, t sunglasses) {
        Intrinsics.checkNotNullParameter(dark, "dark");
        Intrinsics.checkNotNullParameter(darkContour, "darkContour");
        Intrinsics.checkNotNullParameter(bright, "bright");
        Intrinsics.checkNotNullParameter(blur, "blur");
        Intrinsics.checkNotNullParameter(glare, "glare");
        Intrinsics.checkNotNullParameter(colorized, "colorized");
        Intrinsics.checkNotNullParameter(fraud, "fraud");
        Intrinsics.checkNotNullParameter(leftEye, "leftEye");
        Intrinsics.checkNotNullParameter(rightEye, "rightEye");
        Intrinsics.checkNotNullParameter(occluded, "occluded");
        Intrinsics.checkNotNullParameter(sunglasses, "sunglasses");
        this.f121837a = dark;
        this.f121838b = darkContour;
        this.f121839c = bright;
        this.d = blur;
        this.e = glare;
        this.f = colorized;
        this.f121840g = fraud;
        this.f121841h = leftEye;
        this.i = rightEye;
        this.f121842j = occluded;
        this.k = sunglasses;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f121837a, sVar.f121837a) && Intrinsics.f(this.f121838b, sVar.f121838b) && Intrinsics.f(this.f121839c, sVar.f121839c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f) && Intrinsics.f(this.f121840g, sVar.f121840g) && Intrinsics.f(this.f121841h, sVar.f121841h) && Intrinsics.f(this.i, sVar.i) && Intrinsics.f(this.f121842j, sVar.f121842j) && Intrinsics.f(this.k, sVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.f121842j.hashCode() + ((this.i.hashCode() + ((this.f121841h.hashCode() + ((this.f121840g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f121839c.hashCode() + ((this.f121838b.hashCode() + (this.f121837a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
