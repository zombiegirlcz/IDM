package oyb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f230929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f230930b;

    public d(c acceptanceType, List termsToAccept) {
        Intrinsics.checkNotNullParameter(acceptanceType, "acceptanceType");
        Intrinsics.checkNotNullParameter(termsToAccept, "termsToAccept");
        this.f230929a = acceptanceType;
        this.f230930b = termsToAccept;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f230929a, dVar.f230929a) && Intrinsics.f(this.f230930b, dVar.f230930b);
    }

    public final int hashCode() {
        return this.f230930b.hashCode() + (this.f230929a.hashCode() * 31);
    }
}
