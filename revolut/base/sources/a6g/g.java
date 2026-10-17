package a6g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1688b;

    public g(List fareOptions, String str) {
        Intrinsics.checkNotNullParameter(fareOptions, "fareOptions");
        this.f1687a = fareOptions;
        this.f1688b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f1687a, gVar.f1687a) && Intrinsics.f(this.f1688b, gVar.f1688b);
    }

    public final int hashCode() {
        int iHashCode = this.f1687a.hashCode() * 31;
        String str = this.f1688b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
