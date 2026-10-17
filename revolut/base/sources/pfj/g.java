package pfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f235612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f235614c;

    public g(h hVar, String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f235612a = hVar;
        this.f235613b = title;
        this.f235614c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f235612a == gVar.f235612a && Intrinsics.f(this.f235613b, gVar.f235613b) && Intrinsics.f(this.f235614c, gVar.f235614c);
    }

    public final int hashCode() {
        h hVar = this.f235612a;
        return this.f235614c.hashCode() + p.a.c((hVar == null ? 0 : hVar.hashCode()) * 31, 31, this.f235613b);
    }
}
