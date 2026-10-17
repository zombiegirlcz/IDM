package z48;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j38.a f319341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f319342b;

    public d(j38.a relationshipStatus, List accountPurposes) {
        Intrinsics.checkNotNullParameter(relationshipStatus, "relationshipStatus");
        Intrinsics.checkNotNullParameter(accountPurposes, "accountPurposes");
        this.f319341a = relationshipStatus;
        this.f319342b = accountPurposes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f319341a, dVar.f319341a) && Intrinsics.f(this.f319342b, dVar.f319342b);
    }

    public final int hashCode() {
        return this.f319342b.hashCode() + (this.f319341a.hashCode() * 31);
    }
}
