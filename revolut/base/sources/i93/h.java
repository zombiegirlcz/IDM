package i93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f159560b;

    public h(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f159559a = id10;
        this.f159560b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f159559a, hVar.f159559a) && Intrinsics.f(this.f159560b, hVar.f159560b);
    }

    public final int hashCode() {
        int iHashCode = this.f159559a.hashCode() * 31;
        String str = this.f159560b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
