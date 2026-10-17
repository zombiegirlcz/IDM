package r0f;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f250793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f250794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.e f250795c;

    public j(List items, g gVar, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f250793a = items;
        this.f250794b = gVar;
        this.f250795c = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f250793a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f250793a.equals(jVar.f250793a) && Intrinsics.f(this.f250794b, jVar.f250794b) && this.f250795c.equals(jVar.f250795c);
    }

    public final int hashCode() {
        int iHashCode = this.f250793a.hashCode() * 31;
        g gVar = this.f250794b;
        return this.f250795c.hashCode() + ((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31);
    }
}
