package ot8;

import kotlin.jvm.internal.Intrinsics;
import my8.r;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f229571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f229572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f229573c;
    public final wi0.b d;

    public b(wi0.b bVar, r scope, String str, wi0.b bVar2) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f229571a = bVar;
        this.f229572b = scope;
        this.f229573c = str;
        this.d = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f229571a, bVar.f229571a) && this.f229572b == bVar.f229572b && Intrinsics.f(this.f229573c, bVar.f229573c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        wi0.b bVar = this.f229571a;
        int iHashCode = (this.f229572b.hashCode() + ((bVar == null ? 0 : bVar.f297794a.hashCode()) * 31)) * 31;
        String str = this.f229573c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        wi0.b bVar2 = this.d;
        return iHashCode2 + (bVar2 != null ? bVar2.f297794a.hashCode() : 0);
    }
}
