package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e9 implements f9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f10297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d9 f10298c;
    public final q9 d;

    public e9(float f, Float f4, d9 segmentsCount, q9 neutralColor) {
        Intrinsics.checkNotNullParameter(segmentsCount, "segmentsCount");
        Intrinsics.checkNotNullParameter(neutralColor, "neutralColor");
        this.f10296a = f;
        this.f10297b = f4;
        this.f10298c = segmentsCount;
        this.d = neutralColor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e9)) {
            return false;
        }
        e9 e9Var = (e9) obj2;
        return Float.compare(this.f10296a, e9Var.f10296a) == 0 && Intrinsics.f(this.f10297b, e9Var.f10297b) && this.f10298c == e9Var.f10298c && this.d == e9Var.d;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f10296a) * 31;
        Float f = this.f10297b;
        return this.d.hashCode() + ((this.f10298c.hashCode() + ((iHashCode + (f == null ? 0 : f.hashCode())) * 31)) * 31);
    }
}
