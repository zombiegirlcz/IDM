package ps6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f239418b;

    public l(String type, double d) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f239417a = type;
        this.f239418b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f239417a, lVar.f239417a) && Double.compare(this.f239418b, lVar.f239418b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f239418b) + (this.f239417a.hashCode() * 31);
    }
}
