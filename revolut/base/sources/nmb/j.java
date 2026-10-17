package nmb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f217247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f217248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f217249c;

    public j(List items, d footerUIState, h toolbarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerUIState, "footerUIState");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        this.f217247a = items;
        this.f217248b = footerUIState;
        this.f217249c = toolbarState;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        j jVar = (j) oldState;
        return new i(!jVar.f217248b.equals(this.f217248b), !jVar.f217249c.equals(this.f217249c));
    }

    @Override // cli.p
    public final List c() {
        return this.f217247a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f217247a, jVar.f217247a) && Intrinsics.f(this.f217248b, jVar.f217248b) && Intrinsics.f(this.f217249c, jVar.f217249c);
    }

    public final int hashCode() {
        return this.f217249c.hashCode() + ((this.f217248b.hashCode() + (this.f217247a.hashCode() * 31)) * 31);
    }
}
