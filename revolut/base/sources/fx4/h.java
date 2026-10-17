package fx4;

import dx4.d1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f138732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1 f138733c;
    public final List d;

    public h(String title, g gVar, d1 d1Var, List actions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f138731a = title;
        this.f138732b = gVar;
        this.f138733c = d1Var;
        this.d = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f138731a, hVar.f138731a) && Intrinsics.f(this.f138732b, hVar.f138732b) && Intrinsics.f(this.f138733c, hVar.f138733c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f138731a.hashCode() * 31;
        g gVar = this.f138732b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.f138730a.hashCode())) * 31;
        d1 d1Var = this.f138733c;
        return this.d.hashCode() + ((iHashCode2 + (d1Var != null ? d1Var.hashCode() : 0)) * 31);
    }
}
