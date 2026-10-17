package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f10533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r9 f10534c;
    public final q9 d;

    public s9(float f, Float f4, r9 segmentsCount, int i) {
        f4 = (i & 2) != 0 ? null : f4;
        segmentsCount = (i & 4) != 0 ? r9.THREE : segmentsCount;
        q9 neutralColor = q9.STATIC;
        Intrinsics.checkNotNullParameter(segmentsCount, "segmentsCount");
        Intrinsics.checkNotNullParameter(neutralColor, "neutralColor");
        this.f10532a = f;
        this.f10533b = f4;
        this.f10534c = segmentsCount;
        this.d = neutralColor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s9)) {
            return false;
        }
        s9 s9Var = (s9) obj2;
        return Float.compare(this.f10532a, s9Var.f10532a) == 0 && Intrinsics.f(this.f10533b, s9Var.f10533b) && this.f10534c == s9Var.f10534c && this.d == s9Var.d;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f10532a) * 31;
        Float f = this.f10533b;
        return this.d.hashCode() + ((this.f10534c.hashCode() + ((iHashCode + (f == null ? 0 : f.hashCode())) * 31)) * 31);
    }
}
