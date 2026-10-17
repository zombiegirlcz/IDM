package ol4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f226327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f226328c;

    public a(String accountName, String title, b bVar) {
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f226326a = accountName;
        this.f226327b = title;
        this.f226328c = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f226326a, aVar.f226326a) && Intrinsics.f(this.f226327b, aVar.f226327b) && Intrinsics.f(this.f226328c, aVar.f226328c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f226326a.hashCode() * 31, 31, this.f226327b);
        b bVar = this.f226328c;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }
}
