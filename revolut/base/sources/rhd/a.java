package rhd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f254400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f254401b;

    public a() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f254400a, aVar.f254400a) && Intrinsics.f(this.f254401b, aVar.f254401b);
    }

    public final int hashCode() {
        Double d = this.f254400a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d5 = this.f254401b;
        return iHashCode + (d5 != null ? d5.hashCode() : 0);
    }

    public a(Double d, Double d5) {
        this.f254400a = d;
        this.f254401b = d5;
    }
}
