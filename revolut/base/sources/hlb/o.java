package hlb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f153437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f153438c;

    public o(List items, n header, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f153436a = items;
        this.f153437b = header;
        this.f153438c = iVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f153436a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f153436a, oVar.f153436a) && Intrinsics.f(this.f153437b, oVar.f153437b) && Intrinsics.f(this.f153438c, oVar.f153438c);
    }

    public final int hashCode() {
        int iHashCode = (this.f153437b.hashCode() + (this.f153436a.hashCode() * 31)) * 31;
        aw0.i iVar = this.f153438c;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
