package pc3;

import java.util.ArrayList;
import java.util.List;
import jki.i;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f234812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f234813c;
    public final boolean d;

    public d() {
        this(0);
    }

    public static d a(d dVar, String searchQuery, List allLocations, ArrayList filteredLocations, int i) {
        if ((i & 1) != 0) {
            searchQuery = dVar.f234811a;
        }
        if ((i & 2) != 0) {
            allLocations = dVar.f234812b;
        }
        boolean z = (i & 8) != 0 ? dVar.d : false;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(allLocations, "allLocations");
        Intrinsics.checkNotNullParameter(filteredLocations, "filteredLocations");
        return new d(searchQuery, z, allLocations, filteredLocations);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f234811a, dVar.f234811a) && Intrinsics.f(this.f234812b, dVar.f234812b) && Intrinsics.f(this.f234813c, dVar.f234813c) && this.d == dVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.d(p.a.d(this.f234811a.hashCode() * 31, 31, this.f234812b), 31, this.f234813c);
    }

    public d(String searchQuery, boolean z, List allLocations, List filteredLocations) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(allLocations, "allLocations");
        Intrinsics.checkNotNullParameter(filteredLocations, "filteredLocations");
        this.f234811a = searchQuery;
        this.f234812b = allLocations;
        this.f234813c = filteredLocations;
        this.d = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(int i) {
        f0 f0Var = f0.f322471a;
        this("", true, f0Var, f0Var);
    }
}
