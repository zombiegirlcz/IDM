package d0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f110432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110433b;

    public s(t type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f110432a = type;
        this.f110433b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f110432a == sVar.f110432a && Intrinsics.f(this.f110433b, sVar.f110433b);
    }

    public final int hashCode() {
        int iHashCode = this.f110432a.hashCode() * 31;
        String str = this.f110433b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
