package o0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cdd.a f221214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f221215c;

    public a(String str, cdd.a loginToken, Boolean bool) {
        Intrinsics.checkNotNullParameter(loginToken, "loginToken");
        this.f221213a = str;
        this.f221214b = loginToken;
        this.f221215c = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f221213a, aVar.f221213a) && Intrinsics.f(this.f221214b, aVar.f221214b) && Intrinsics.f(this.f221215c, aVar.f221215c);
    }

    public final int hashCode() {
        String str = this.f221213a;
        int iHashCode = (this.f221214b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Boolean bool = this.f221215c;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
