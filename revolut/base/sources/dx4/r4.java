package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r4 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f120754c;

    public r4(String id10, String title, l action) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f120752a = id10;
        this.f120753b = title;
        this.f120754c = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj2;
        return Intrinsics.f(this.f120752a, r4Var.f120752a) && Intrinsics.f(this.f120753b, r4Var.f120753b) && Intrinsics.f(this.f120754c, r4Var.f120754c);
    }

    public final int hashCode() {
        return this.f120754c.hashCode() + p.a.c(this.f120752a.hashCode() * 31, 31, this.f120753b);
    }
}
