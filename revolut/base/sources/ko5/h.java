package ko5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f186228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f186229b;

    public h(dj0.d total, i fee2) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f186228a = total;
        this.f186229b = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f186228a, hVar.f186228a) && Intrinsics.f(this.f186229b, hVar.f186229b);
    }

    public final int hashCode() {
        return this.f186229b.hashCode() + (this.f186228a.hashCode() * 31);
    }
}
