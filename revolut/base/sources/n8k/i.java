package n8k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f213511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f213512b;

    public i(dj0.d money, String str) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f213511a = money;
        this.f213512b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f213511a, iVar.f213511a) && Intrinsics.f(this.f213512b, iVar.f213512b);
    }

    public final int hashCode() {
        int iHashCode = this.f213511a.hashCode() * 31;
        String str = this.f213512b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
