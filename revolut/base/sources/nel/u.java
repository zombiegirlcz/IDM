package nel;

import java.io.Serializable;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f214624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f214625b;

    public u(Instant listingDate, boolean z) {
        Intrinsics.checkNotNullParameter(listingDate, "listingDate");
        this.f214624a = z;
        this.f214625b = listingDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f214624a == uVar.f214624a && Intrinsics.f(this.f214625b, uVar.f214625b);
    }

    public final int hashCode() {
        return this.f214625b.hashCode() + (Boolean.hashCode(this.f214624a) * 31);
    }
}
