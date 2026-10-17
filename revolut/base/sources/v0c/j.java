package v0c;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f284788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.rev_points.impl.ui.trophy_room.details.b f284789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f284790c;

    public j(List items, com.revolut.feature.rev_points.impl.ui.trophy_room.details.b toolbarState, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        this.f284788a = items;
        this.f284789b = toolbarState;
        this.f284790c = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f284788a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f284788a, jVar.f284788a) && Intrinsics.f(this.f284789b, jVar.f284789b) && Intrinsics.f(this.f284790c, jVar.f284790c);
    }

    public final int hashCode() {
        int iHashCode = (this.f284789b.hashCode() + (this.f284788a.hashCode() * 31)) * 31;
        aw0.i iVar = this.f284790c;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
