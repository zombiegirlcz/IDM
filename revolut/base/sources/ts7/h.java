package ts7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f274050c;
    public final String d;
    public final g e;

    public h(String str, String title, String str2, String str3, g action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f274048a = str;
        this.f274049b = title;
        this.f274050c = str2;
        this.d = str3;
        this.e = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f274048a, hVar.f274048a) && Intrinsics.f(this.f274049b, hVar.f274049b) && Intrinsics.f(this.f274050c, hVar.f274050c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        String str = this.f274048a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f274049b);
        String str2 = this.f274050c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
