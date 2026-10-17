package zjh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f322856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f322857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f322858c;

    public u(t tVar, aw0.g gVar, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f322856a = tVar;
        this.f322857b = gVar;
        this.f322858c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f322858c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f322856a, uVar.f322856a) && Intrinsics.f(this.f322857b, uVar.f322857b) && this.f322858c.equals(uVar.f322858c);
    }

    public final int hashCode() {
        t tVar = this.f322856a;
        int iHashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
        aw0.i iVar = this.f322857b;
        return this.f322858c.hashCode() + ((iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }
}
