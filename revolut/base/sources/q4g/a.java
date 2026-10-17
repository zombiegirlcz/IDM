package q4g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f242139b;

    public a(String code, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f242138a = code;
        this.f242139b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f242138a, aVar.f242138a) && Intrinsics.f(this.f242139b, aVar.f242139b);
    }

    public final int hashCode() {
        int iHashCode = this.f242138a.hashCode() * 31;
        String str = this.f242139b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
