package tpl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements o10.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f273425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f273426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f273427c;
    public final vpl.b d;

    public n(List navBarMenuItems, List items, List bottomSheetItems, vpl.b bVar) {
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(bottomSheetItems, "bottomSheetItems");
        this.f273425a = navBarMenuItems;
        this.f273426b = items;
        this.f273427c = bottomSheetItems;
        this.d = bVar;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof n) {
            return new m(!Intrinsics.f(((n) oldState).d, this.d));
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f273426b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f273425a, nVar.f273425a) && Intrinsics.f(this.f273426b, nVar.f273426b) && Intrinsics.f(this.f273427c, nVar.f273427c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.d(p.a.d(this.f273425a.hashCode() * 31, 31, this.f273426b), 31, this.f273427c), 31, false);
        vpl.b bVar = this.d;
        return iC + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // o10.b
    public final boolean k() {
        return false;
    }

    @Override // o10.b
    public final List l() {
        return this.f273427c;
    }
}
