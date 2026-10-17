package knk;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f186179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f186180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f186181c;

    public i(g gVar, List items, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f186179a = gVar;
        this.f186180b = items;
        this.f186181c = iVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f186180b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f186179a, iVar.f186179a) && Intrinsics.f(this.f186180b, iVar.f186180b) && Intrinsics.f(this.f186181c, iVar.f186181c);
    }

    public final int hashCode() {
        g gVar = this.f186179a;
        int iD = p.a.d((gVar == null ? 0 : gVar.hashCode()) * 31, 31, this.f186180b);
        aw0.i iVar = this.f186181c;
        return iD + (iVar != null ? iVar.hashCode() : 0);
    }
}
