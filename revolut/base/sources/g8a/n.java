package g8a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f141326b;

    public n(String name, o oVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f141325a = name;
        this.f141326b = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f141325a, nVar.f141325a) && Intrinsics.f(this.f141326b, nVar.f141326b);
    }

    public final int hashCode() {
        int iHashCode = this.f141325a.hashCode() * 31;
        o oVar = this.f141326b;
        return iHashCode + (oVar == null ? 0 : oVar.hashCode());
    }
}
