package n09;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f210952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f210953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f210954c;
    public final boolean d;

    public l(String str, List tabs, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f210952a = tabs;
        this.f210953b = z;
        this.f210954c = str;
        this.d = z3;
    }

    public static l a(l lVar, ArrayList arrayList, boolean z, String str, boolean z3, int i) {
        List tabs = arrayList;
        if ((i & 1) != 0) {
            tabs = lVar.f210952a;
        }
        if ((i & 2) != 0) {
            z = lVar.f210953b;
        }
        if ((i & 4) != 0) {
            str = lVar.f210954c;
        }
        if ((i & 8) != 0) {
            z3 = lVar.d;
        }
        lVar.getClass();
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new l(str, tabs, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f210952a, lVar.f210952a) && this.f210953b == lVar.f210953b && Intrinsics.f(this.f210954c, lVar.f210954c) && this.d == lVar.d;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f210952a.hashCode() * 31, 31, this.f210953b);
        String str = this.f210954c;
        return Boolean.hashCode(this.d) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
