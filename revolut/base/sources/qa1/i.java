package qa1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f243942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f243943b;

    public i(String hash, String data) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f243942a = hash;
        this.f243943b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f243942a, iVar.f243942a) && Intrinsics.f(this.f243943b, iVar.f243943b);
    }

    public final int hashCode() {
        return this.f243943b.hashCode() + (this.f243942a.hashCode() * 31);
    }
}
