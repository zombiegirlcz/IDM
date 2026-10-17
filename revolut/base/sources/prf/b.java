package prf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends qk.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239002c;

    public b(String senderPocketId, String str) {
        Intrinsics.checkNotNullParameter(senderPocketId, "senderPocketId");
        this.f239001b = senderPocketId;
        this.f239002c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f239001b, bVar.f239001b) && Intrinsics.f(this.f239002c, bVar.f239002c);
    }

    public final int hashCode() {
        int iHashCode = this.f239001b.hashCode() * 31;
        String str = this.f239002c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // qk.d
    public final String i() {
        return this.f239002c;
    }
}
