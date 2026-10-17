package vs7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f291737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f291738c;
    public final c d;

    public d(String str, String title, String str2, c action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f291736a = str;
        this.f291737b = title;
        this.f291738c = str2;
        this.d = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f291736a, dVar.f291736a) && Intrinsics.f(this.f291737b, dVar.f291737b) && Intrinsics.f(this.f291738c, dVar.f291738c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        String str = this.f291736a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f291737b);
        String str2 = this.f291738c;
        return this.d.hashCode() + ((iC + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
