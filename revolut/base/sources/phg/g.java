package phg;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f236302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f236304c;

    public g(String searchQuery, Set selected, boolean z) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f236302a = selected;
        this.f236303b = searchQuery;
        this.f236304c = z;
    }

    public static g a(g gVar, Set selected, String searchQuery, boolean z, int i) {
        if ((i & 1) != 0) {
            selected = gVar.f236302a;
        }
        if ((i & 2) != 0) {
            searchQuery = gVar.f236303b;
        }
        if ((i & 4) != 0) {
            z = gVar.f236304c;
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
        return Intrinsics.f(this.f236302a, gVar.f236302a) && Intrinsics.f(this.f236303b, gVar.f236303b) && this.f236304c == gVar.f236304c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f236304c) + p.a.c(this.f236302a.hashCode() * 31, 31, this.f236303b);
    }
}
