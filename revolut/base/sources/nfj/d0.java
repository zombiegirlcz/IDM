package nfj;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214934a;

    public d0(String str) {
        String osLayout = Build.MANUFACTURER;
        String osVersion = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullParameter(osLayout, "osLayout");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        this.f214934a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        String str = Build.MANUFACTURER;
        if (!Intrinsics.f(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return Intrinsics.f(str2, str2) && Intrinsics.f(this.f214934a, d0Var.f214934a);
    }

    public final int hashCode() {
        int iC = p.a.c(Build.MANUFACTURER.hashCode() * 31, 31, Build.VERSION.RELEASE);
        String str = this.f214934a;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
