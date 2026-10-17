package i2l;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class z implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f158053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f158054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f158055c;

    public z(List items, u headerState, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        this.f158053a = items;
        this.f158054b = headerState;
        this.f158055c = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f158053a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f158053a, zVar.f158053a) && Intrinsics.f(this.f158054b, zVar.f158054b) && Intrinsics.f(this.f158055c, zVar.f158055c);
    }

    public final int hashCode() {
        int iHashCode = (this.f158054b.hashCode() + (this.f158053a.hashCode() * 31)) * 31;
        aw0.i iVar = this.f158055c;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
