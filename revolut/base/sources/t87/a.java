package t87;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f268840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.e f268841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268842c;
    public final int d;
    public final boolean e;

    public a(int i, eel.e chart, String chartName, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(chartName, "chartName");
        this.f268840a = i;
        this.f268841b = chart;
        this.f268842c = chartName;
        this.d = i2;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f268840a == aVar.f268840a && Intrinsics.f(this.f268841b, aVar.f268841b) && Intrinsics.f(this.f268842c, aVar.f268842c) && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.b(this.d, p.a.c((this.f268841b.hashCode() + (Integer.hashCode(this.f268840a) * 31)) * 31, 31, this.f268842c), 31);
    }
}
