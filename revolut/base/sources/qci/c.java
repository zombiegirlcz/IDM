package qci;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f244791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f244792b;

    public c(String searchString, Set selectedDestinations) {
        Intrinsics.checkNotNullParameter(selectedDestinations, "selectedDestinations");
        Intrinsics.checkNotNullParameter(searchString, "searchString");
        this.f244791a = selectedDestinations;
        this.f244792b = searchString;
    }

    public static c a(c cVar, LinkedHashSet linkedHashSet, String searchString, int i) {
        Set selectedDestinations = linkedHashSet;
        if ((i & 1) != 0) {
            selectedDestinations = cVar.f244791a;
        }
        if ((i & 2) != 0) {
            searchString = cVar.f244792b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(selectedDestinations, "selectedDestinations");
        Intrinsics.checkNotNullParameter(searchString, "searchString");
        return new c(searchString, selectedDestinations);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f244791a, cVar.f244791a) && Intrinsics.f(this.f244792b, cVar.f244792b);
    }

    public final int hashCode() {
        return this.f244792b.hashCode() + (this.f244791a.hashCode() * 31);
    }
}
