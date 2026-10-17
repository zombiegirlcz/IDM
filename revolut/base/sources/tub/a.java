package tub;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274556b;

    public a(String token, String idempotencyKey) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f274555a = token;
        this.f274556b = idempotencyKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f274555a, aVar.f274555a) && Intrinsics.f(this.f274556b, aVar.f274556b);
    }

    public final int hashCode() {
        return this.f274556b.hashCode() + (this.f274555a.hashCode() * 31);
    }
}
