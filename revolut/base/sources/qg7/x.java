package qg7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f245695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f245696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f245697c;
    public final int d;
    public final ug7.e e;

    public x(int i, int i2, int i3, int i5, ug7.e parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f245695a = i;
        this.f245696b = i2;
        this.f245697c = i3;
        this.d = i5;
        this.e = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f245695a == xVar.f245695a && this.f245696b == xVar.f245696b && this.f245697c == xVar.f245697c && this.d == xVar.d && Intrinsics.f(this.e, xVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.b(this.d, j6.a.b(this.f245697c, j6.a.b(this.f245696b, Integer.hashCode(this.f245695a) * 31, 31), 31), 31);
    }
}
