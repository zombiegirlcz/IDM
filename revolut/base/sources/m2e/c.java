package m2e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f201959a;

    public c(List countries) {
        Intrinsics.checkNotNullParameter(countries, "countries");
        this.f201959a = countries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f201959a, ((c) obj2).f201959a);
    }

    public final int hashCode() {
        return this.f201959a.hashCode();
    }
}
