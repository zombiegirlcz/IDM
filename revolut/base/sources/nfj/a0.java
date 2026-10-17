package nfj;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f214913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f214914c;

    public a0(String str, List installedSimProfiles) throws IOException {
        List listO0;
        Intrinsics.checkNotNullParameter(installedSimProfiles, "installedSimProfiles");
        this.f214912a = str;
        this.f214913b = installedSimProfiles;
        String strK0 = null;
        String strConcat = str != null ? "/id:".concat(str) : null;
        strConcat = strConcat == null ? "" : strConcat;
        List list = installedSimProfiles;
        List list2 = list.isEmpty() ? null : list;
        if (list2 != null && (listO0 = zhm.d0.O0(list2)) != null) {
            strK0 = zhm.d0.k0(listO0, ", ", "/installed:[", "]", 0, null, 56);
        }
        this.f214914c = p.a.p("HELP_ITEMS", strConcat, strK0 != null ? strK0 : "");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f214912a, a0Var.f214912a) && Intrinsics.f(this.f214913b, a0Var.f214913b);
    }

    public final int hashCode() {
        String str = this.f214912a;
        return this.f214913b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
