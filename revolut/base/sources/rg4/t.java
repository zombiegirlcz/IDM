package rg4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f254032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hx4.c f254033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f254034c;

    public t(List items, hx4.c cVar, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f254032a = items;
        this.f254033b = cVar;
        this.f254034c = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f254032a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f254032a, tVar.f254032a) && Intrinsics.f(this.f254033b, tVar.f254033b) && Intrinsics.f(this.f254034c, tVar.f254034c);
    }

    public final int hashCode() {
        int iHashCode = this.f254032a.hashCode() * 31;
        hx4.c cVar = this.f254033b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        aw0.i iVar = this.f254034c;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }
}
