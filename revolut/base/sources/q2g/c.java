package q2g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f241643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f241644c;
    public final boolean d;

    public c(String title, boolean z, List availableLocations, List locations) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(availableLocations, "availableLocations");
        Intrinsics.checkNotNullParameter(locations, "locations");
        this.f241642a = title;
        this.f241643b = availableLocations;
        this.f241644c = locations;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f241642a, cVar.f241642a) && Intrinsics.f(this.f241643b, cVar.f241643b) && Intrinsics.f(this.f241644c, cVar.f241644c) && this.d == cVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.d(p.a.d(this.f241642a.hashCode() * 31, 31, this.f241643b), 31, this.f241644c);
    }
}
