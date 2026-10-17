package ll6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f196586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yy0.l f196587b;

    public h(aim.e items, yy0.j jVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f196586a = items;
        this.f196587b = jVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f196586a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f196586a, hVar.f196586a) && Intrinsics.f(this.f196587b, hVar.f196587b);
    }

    public final int hashCode() {
        int iHashCode = this.f196586a.hashCode() * 31;
        yy0.l lVar = this.f196587b;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }
}
