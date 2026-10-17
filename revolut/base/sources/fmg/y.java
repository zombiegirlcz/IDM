package fmg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f136452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f136454c;

    public y(double d, String text, x lineColor) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(lineColor, "lineColor");
        this.f136452a = d;
        this.f136453b = text;
        this.f136454c = lineColor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Double.compare(this.f136452a, yVar.f136452a) == 0 && Intrinsics.f(this.f136453b, yVar.f136453b) && this.f136454c == yVar.f136454c;
    }

    public final int hashCode() {
        return this.f136454c.hashCode() + p.a.c(Double.hashCode(this.f136452a) * 31, 31, this.f136453b);
    }
}
