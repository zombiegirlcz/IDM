package um9;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f281274b;

    public g(String id10, String firstName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f281273a = id10;
        this.f281274b = firstName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f281273a, gVar.f281273a) && Intrinsics.f(this.f281274b, gVar.f281274b);
    }

    public final int hashCode() {
        return this.f281274b.hashCode() + (this.f281273a.hashCode() * 31);
    }
}
