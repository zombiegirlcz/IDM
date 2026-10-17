package gd8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143094b;

    public n(String juniorId, String code) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f143093a = juniorId;
        this.f143094b = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f143093a, nVar.f143093a) && Intrinsics.f(this.f143094b, nVar.f143094b);
    }

    public final int hashCode() {
        return this.f143094b.hashCode() + (this.f143093a.hashCode() * 31);
    }
}
