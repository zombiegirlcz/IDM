package r4g;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f251452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f251453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f251454c;

    public g(String searchQuery, Set selected, boolean z) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f251452a = selected;
        this.f251453b = searchQuery;
        this.f251454c = z;
    }

    public static g a(g gVar, Set selected, String searchQuery, boolean z, int i) {
        if ((i & 1) != 0) {
            selected = gVar.f251452a;
        }
        if ((i & 2) != 0) {
            searchQuery = gVar.f251453b;
        }
        if ((i & 4) != 0) {
            z = gVar.f251454c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new g(searchQuery, selected, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f251452a, gVar.f251452a) && Intrinsics.f(this.f251453b, gVar.f251453b) && this.f251454c == gVar.f251454c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f251454c) + p.a.c(this.f251452a.hashCode() * 31, 31, this.f251453b);
    }
}
