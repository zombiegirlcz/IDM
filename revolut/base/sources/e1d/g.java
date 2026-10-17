package e1d;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f121968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f121969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f121970c;

    public g(f toolbar, aw0.e eVar, List items) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f121968a = toolbar;
        this.f121969b = eVar;
        this.f121970c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f121970c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f121968a, gVar.f121968a) && Intrinsics.f(this.f121969b, gVar.f121969b) && Intrinsics.f(this.f121970c, gVar.f121970c);
    }

    public final int hashCode() {
        int iHashCode = this.f121968a.hashCode() * 31;
        aw0.e eVar = this.f121969b;
        return this.f121970c.hashCode() + ((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31);
    }
}
