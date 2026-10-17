package ps6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f239412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239413c;
    public final Integer d;

    public j(Integer num, String id10, String assessmentPeriod, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(assessmentPeriod, "assessmentPeriod");
        this.f239411a = id10;
        this.f239412b = z;
        this.f239413c = assessmentPeriod;
        this.d = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f239411a, jVar.f239411a) && this.f239412b == jVar.f239412b && Intrinsics.f(this.f239413c, jVar.f239413c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(this.f239411a.hashCode() * 31, 31, this.f239412b), 31, this.f239413c);
        Integer num = this.d;
        return iC + (num == null ? 0 : num.hashCode());
    }
}
