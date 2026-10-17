package ws7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f299676b;

    public b(String title, a aVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f299675a = title;
        this.f299676b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f299675a, bVar.f299675a) && Intrinsics.f(this.f299676b, bVar.f299676b);
    }

    public final int hashCode() {
        int iHashCode = this.f299675a.hashCode() * 31;
        a aVar = this.f299676b;
        return iHashCode + (aVar == null ? 0 : aVar.f299674a.hashCode());
    }
}
