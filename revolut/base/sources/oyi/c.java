package oyi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f231041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f231042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f231043c;
    public final String d;

    public c(String passId, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(passId, "passId");
        this.f231041a = passId;
        this.f231042b = z;
        this.f231043c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f231041a, cVar.f231041a) && this.f231042b == cVar.f231042b && Intrinsics.f(this.f231043c, cVar.f231043c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f231041a.hashCode() * 31, 31, this.f231042b);
        String str = this.f231043c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
