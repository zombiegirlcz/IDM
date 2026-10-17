package a2l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f934c;
    public final v d;

    public x(String title, String str, Double d, v vVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f932a = title;
        this.f933b = str;
        this.f934c = d;
        this.d = vVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f932a, xVar.f932a) && Intrinsics.f(this.f933b, xVar.f933b) && Intrinsics.f(this.f934c, xVar.f934c) && Intrinsics.f(this.d, xVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f932a.hashCode() * 31;
        String str = this.f933b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f934c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        v vVar = this.d;
        return iHashCode3 + (vVar != null ? vVar.hashCode() : 0);
    }
}
