package svi;

import java.io.Serializable;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f265945b;

    public m(String description, Instant expirationDate) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.f265944a = description;
        this.f265945b = expirationDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f265944a, mVar.f265944a) && Intrinsics.f(this.f265945b, mVar.f265945b);
    }

    public final int hashCode() {
        return this.f265945b.hashCode() + (this.f265944a.hashCode() * 31);
    }
}
