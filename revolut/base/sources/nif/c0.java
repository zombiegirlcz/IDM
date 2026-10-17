package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215725b;

    public c0(String id10, String link) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f215724a = id10;
        this.f215725b = link;
    }

    public final String a() {
        return this.f215724a;
    }

    public final String b() {
        return this.f215725b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f215724a, c0Var.f215724a) && Intrinsics.f(this.f215725b, c0Var.f215725b);
    }

    public final int hashCode() {
        return this.f215725b.hashCode() + (this.f215724a.hashCode() * 31);
    }
}
