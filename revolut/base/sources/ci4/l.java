package ci4;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24378c;
    public final String d;

    public l(String solicitorName, String email, String str, String str2) {
        Intrinsics.checkNotNullParameter(solicitorName, "solicitorName");
        Intrinsics.checkNotNullParameter(email, "email");
        this.f24376a = solicitorName;
        this.f24377b = email;
        this.f24378c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f24376a, lVar.f24376a) && Intrinsics.f(this.f24377b, lVar.f24377b) && Intrinsics.f(this.f24378c, lVar.f24378c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f24376a.hashCode() * 31, 31, this.f24377b);
        String str = this.f24378c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
