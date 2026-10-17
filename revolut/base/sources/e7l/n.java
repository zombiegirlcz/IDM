package e7l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123419b;

    public n(String umbrellaNameType, String statementNameType) {
        Intrinsics.checkNotNullParameter(umbrellaNameType, "umbrellaNameType");
        Intrinsics.checkNotNullParameter(statementNameType, "statementNameType");
        this.f123418a = umbrellaNameType;
        this.f123419b = statementNameType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f123418a, nVar.f123418a) && Intrinsics.f(this.f123419b, nVar.f123419b);
    }

    public final int hashCode() {
        return this.f123419b.hashCode() + (this.f123418a.hashCode() * 31);
    }
}
