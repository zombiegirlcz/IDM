package k5l;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f181573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f181574c;

    public f(String walletId, List pocketIds, String firstName) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f181572a = walletId;
        this.f181573b = pocketIds;
        this.f181574c = firstName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f181572a, fVar.f181572a) && Intrinsics.f(this.f181573b, fVar.f181573b) && Intrinsics.f(this.f181574c, fVar.f181574c);
    }

    public final int hashCode() {
        return this.f181574c.hashCode() + p.a.d(this.f181572a.hashCode() * 31, 31, this.f181573b);
    }
}
