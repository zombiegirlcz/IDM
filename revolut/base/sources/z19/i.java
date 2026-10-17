package z19;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318778b;

    public i(String text, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f318777a = text;
        this.f318778b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f318777a, iVar.f318777a) && Intrinsics.f(this.f318778b, iVar.f318778b);
    }

    public final int hashCode() {
        int iHashCode = this.f318777a.hashCode() * 31;
        String str = this.f318778b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
