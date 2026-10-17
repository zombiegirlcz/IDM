package hyl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f156908a;

    public c(List countries) {
        Intrinsics.checkNotNullParameter(countries, "countries");
        this.f156908a = countries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f156908a, ((c) obj2).f156908a);
    }

    public final int hashCode() {
        return this.f156908a.hashCode();
    }
}
