package ph7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f236231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f236232b;

    public a(b filterId, List filterValues) {
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        Intrinsics.checkNotNullParameter(filterValues, "filterValues");
        this.f236231a = filterId;
        this.f236232b = filterValues;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f236231a == aVar.f236231a && Intrinsics.f(this.f236232b, aVar.f236232b);
    }

    public final int hashCode() {
        return this.f236232b.hashCode() + (this.f236231a.hashCode() * 31);
    }
}
