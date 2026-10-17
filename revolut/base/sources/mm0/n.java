package mm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n extends o implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f207115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rl0.b f207116c;
    public final e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q token, rl0.b primaryAuthCredentials, e authorizationMethod) {
        super(0);
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(primaryAuthCredentials, "primaryAuthCredentials");
        Intrinsics.checkNotNullParameter(authorizationMethod, "authorizationMethod");
        this.f207115b = token;
        this.f207116c = primaryAuthCredentials;
        this.d = authorizationMethod;
    }

    @Override // mm0.o
    public final q a() {
        return this.f207115b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f207115b, nVar.f207115b) && Intrinsics.f(this.f207116c, nVar.f207116c) && this.d == nVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f207116c.hashCode() + (this.f207115b.hashCode() * 31)) * 31);
    }
}
