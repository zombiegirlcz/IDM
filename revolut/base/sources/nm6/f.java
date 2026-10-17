package nm6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f217185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f217186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f217187c;

    public f(dj0.d amount, Boolean bool, String str) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f217185a = amount;
        this.f217186b = bool;
        this.f217187c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f217185a, fVar.f217185a) && Intrinsics.f(this.f217186b, fVar.f217186b) && Intrinsics.f(this.f217187c, fVar.f217187c);
    }

    public final int hashCode() {
        int iHashCode = this.f217185a.hashCode() * 31;
        Boolean bool = this.f217186b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f217187c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
