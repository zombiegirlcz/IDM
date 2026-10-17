package v4j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f286119a;

    public m(List missingFields) {
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        this.f286119a = missingFields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f286119a, ((m) obj2).f286119a);
    }

    public final int hashCode() {
        return this.f286119a.hashCode();
    }
}
