package qa1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f243944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f243945b;

    public j(String hash, List data) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f243944a = hash;
        this.f243945b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f243944a, jVar.f243944a) && Intrinsics.f(this.f243945b, jVar.f243945b);
    }

    public final int hashCode() {
        return this.f243945b.hashCode() + (this.f243944a.hashCode() * 31);
    }
}
