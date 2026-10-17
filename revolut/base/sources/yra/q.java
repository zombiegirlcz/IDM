package yra;

import aw0.j8;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f316185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8 f316186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f316187c;

    public q(List items, j8 navBarConfig, i iVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f316185a = items;
        this.f316186b = navBarConfig;
        this.f316187c = iVar;
    }

    @Override // jki.n
    public final List c() {
        return this.f316185a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f316185a, qVar.f316185a) && Intrinsics.f(this.f316186b, qVar.f316186b) && Intrinsics.f(this.f316187c, qVar.f316187c);
    }

    public final int hashCode() {
        int iHashCode = (this.f316186b.hashCode() + (this.f316185a.hashCode() * 31)) * 31;
        i iVar = this.f316187c;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
