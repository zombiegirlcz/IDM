package lnj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f197276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f197277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f197278c;
    public final boolean d;
    public final g e;

    public i(List items, boolean z, boolean z3, boolean z4, g navBarConfig) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f197276a = items;
        this.f197277b = z;
        this.f197278c = z3;
        this.d = z4;
        this.e = navBarConfig;
    }

    @Override // cli.p
    public final List c() {
        return this.f197276a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f197276a, iVar.f197276a) && this.f197277b == iVar.f197277b && this.f197278c == iVar.f197278c && this.d == iVar.d && this.e.equals(iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(j6.a.c(j6.a.c(this.f197276a.hashCode() * 31, 31, this.f197277b), 31, this.f197278c), 961, this.d);
    }
}
