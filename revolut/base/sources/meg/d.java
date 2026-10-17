package meg;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zfi.b f204665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f204666b;

    public d(zfi.b filter, Set selectedOptionIds) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(selectedOptionIds, "selectedOptionIds");
        this.f204665a = filter;
        this.f204666b = selectedOptionIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f204665a, dVar.f204665a) && Intrinsics.f(this.f204666b, dVar.f204666b);
    }

    public final int hashCode() {
        return this.f204666b.hashCode() + (this.f204665a.hashCode() * 31);
    }
}
