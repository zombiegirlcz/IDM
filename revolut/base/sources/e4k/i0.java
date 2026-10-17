package e4k;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f122604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f122605b;

    public i0(String str, Set suggestions) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f122604a = suggestions;
        this.f122605b = str;
    }

    public static i0 a(i0 i0Var, String str) {
        Set suggestions = i0Var.f122604a;
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        return new i0(str, suggestions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f122604a, i0Var.f122604a) && Intrinsics.f(this.f122605b, i0Var.f122605b);
    }

    public final int hashCode() {
        int iHashCode = this.f122604a.hashCode() * 31;
        String str = this.f122605b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
