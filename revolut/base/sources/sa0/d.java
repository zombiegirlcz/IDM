package sa0;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f261208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f261209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f261210c;

    public d(List items, c navbarState, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navbarState, "navbarState");
        this.f261208a = items;
        this.f261209b = navbarState;
        this.f261210c = iVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f261208a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f261208a, dVar.f261208a) && Intrinsics.f(this.f261209b, dVar.f261209b) && Intrinsics.f(this.f261210c, dVar.f261210c);
    }

    public final int hashCode() {
        int iHashCode = (this.f261209b.hashCode() + (this.f261208a.hashCode() * 31)) * 31;
        aw0.i iVar = this.f261210c;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
