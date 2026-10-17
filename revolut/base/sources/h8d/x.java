package h8d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f150017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f150018b;

    public x(Object obj2, int i) {
        this.f150017a = obj2;
        this.f150018b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f150017a, xVar.f150017a) && this.f150018b == xVar.f150018b;
    }

    public final int hashCode() {
        Object obj2 = this.f150017a;
        return Integer.hashCode(this.f150018b) + ((obj2 == null ? 0 : obj2.hashCode()) * 31);
    }
}
