package se6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f262131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f262132b;

    public e(List popularInstitutions, List otherInstitutions) {
        Intrinsics.checkNotNullParameter(popularInstitutions, "popularInstitutions");
        Intrinsics.checkNotNullParameter(otherInstitutions, "otherInstitutions");
        this.f262131a = popularInstitutions;
        this.f262132b = otherInstitutions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f262131a, eVar.f262131a) && Intrinsics.f(this.f262132b, eVar.f262132b);
    }

    public final int hashCode() {
        return this.f262132b.hashCode() + (this.f262131a.hashCode() * 31);
    }
}
