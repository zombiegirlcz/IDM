package n91;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f213534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f213535c;
    public final String d;

    public c(String id10, String paymentId, String title, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f213533a = id10;
        this.f213534b = paymentId;
        this.f213535c = title;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f213533a, cVar.f213533a) && Intrinsics.f(this.f213534b, cVar.f213534b) && Intrinsics.f(this.f213535c, cVar.f213535c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f213533a.hashCode() * 31, 31, this.f213534b), 31, this.f213535c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
