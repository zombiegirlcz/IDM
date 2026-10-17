package rei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f253613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f253615c;

    public i(h mode, String str, String str2) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f253613a = mode;
        this.f253614b = str;
        this.f253615c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f253613a == iVar.f253613a && Intrinsics.f(this.f253614b, iVar.f253614b) && Intrinsics.f(this.f253615c, iVar.f253615c);
    }

    public final int hashCode() {
        int iHashCode = this.f253613a.hashCode() * 31;
        String str = this.f253614b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f253615c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
