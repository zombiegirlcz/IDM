package fl6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f135899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f135900b;

    public a(List popularInstitutions, List remainingInstitutions) {
        Intrinsics.checkNotNullParameter(popularInstitutions, "popularInstitutions");
        Intrinsics.checkNotNullParameter(remainingInstitutions, "remainingInstitutions");
        this.f135899a = popularInstitutions;
        this.f135900b = remainingInstitutions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f135899a, aVar.f135899a) && Intrinsics.f(this.f135900b, aVar.f135900b);
    }

    public final int hashCode() {
        return this.f135900b.hashCode() + (this.f135899a.hashCode() * 31);
    }
}
