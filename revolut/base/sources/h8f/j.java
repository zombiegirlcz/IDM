package h8f;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f150038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150039b;

    public j(aim.e items, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f150038a = items;
        this.f150039b = str;
    }

    @Override // cli.p
    public final List c() {
        return this.f150038a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f150038a, jVar.f150038a) && Intrinsics.f(this.f150039b, jVar.f150039b);
    }

    public final int hashCode() {
        int iHashCode = this.f150038a.hashCode() * 31;
        String str = this.f150039b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
