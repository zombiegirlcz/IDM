package a2l;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f919c;
    public final boolean d;
    public final boolean e;
    public final List f;

    public n(q type, String title, String str, boolean z, boolean z3, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f917a = type;
        this.f918b = title;
        this.f919c = str;
        this.d = z;
        this.e = z3;
        this.f = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f917a == nVar.f917a && Intrinsics.f(this.f918b, nVar.f918b) && Intrinsics.f(this.f919c, nVar.f919c) && this.d == nVar.d && this.e == nVar.e && Intrinsics.f(this.f, nVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f917a.hashCode() * 31, 31, this.f918b);
        String str = this.f919c;
        int iC2 = j6.a.c(j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        List list = this.f;
        return iC2 + (list != null ? list.hashCode() : 0);
    }
}
