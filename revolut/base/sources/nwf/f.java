package nwf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f219863a;

    public f(List locations) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        this.f219863a = locations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f219863a, ((f) obj2).f219863a);
    }

    public final int hashCode() {
        return this.f219863a.hashCode();
    }
}
