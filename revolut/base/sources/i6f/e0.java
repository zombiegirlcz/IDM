package i6f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y6f.b f158922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f158923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f158924c;

    public e0(y6f.b bVar, List items, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f158922a = bVar;
        this.f158923b = items;
        this.f158924c = iVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f158923b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f158922a, e0Var.f158922a) && Intrinsics.f(this.f158923b, e0Var.f158923b) && Intrinsics.f(this.f158924c, e0Var.f158924c);
    }

    public final int hashCode() {
        y6f.b bVar = this.f158922a;
        int iD = p.a.d((bVar == null ? 0 : bVar.hashCode()) * 961, 31, this.f158923b);
        aw0.i iVar = this.f158924c;
        return iD + (iVar != null ? iVar.hashCode() : 0);
    }
}
