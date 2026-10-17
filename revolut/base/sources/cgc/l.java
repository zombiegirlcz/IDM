package cgc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23920c;

    public l(String id10, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f23918a = id10;
        this.f23919b = str;
        this.f23920c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f23918a, lVar.f23918a) && Intrinsics.f(this.f23919b, lVar.f23919b) && Intrinsics.f(this.f23920c, lVar.f23920c);
    }

    public final int hashCode() {
        int iHashCode = this.f23918a.hashCode() * 31;
        String str = this.f23919b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23920c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
