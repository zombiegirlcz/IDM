package nwj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f219956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f219957b;

    public m(g registeredIdentity, q token) {
        Intrinsics.checkNotNullParameter(registeredIdentity, "registeredIdentity");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f219956a = registeredIdentity;
        this.f219957b = token;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f219956a, mVar.f219956a) && Intrinsics.f(this.f219957b, mVar.f219957b);
    }

    @Override // nwj.n
    public final q getToken() {
        return this.f219957b;
    }

    public final int hashCode() {
        return this.f219957b.hashCode() + (this.f219956a.hashCode() * 31);
    }
}
