package obg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f223949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f223950b;

    public o(List items, n toolbarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        this.f223949a = items;
        this.f223950b = toolbarState;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof o) {
            return new j(!Intrinsics.f(((o) oldState).f223950b, this.f223950b));
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f223949a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f223949a, oVar.f223949a) && Intrinsics.f(this.f223950b, oVar.f223950b);
    }

    public final int hashCode() {
        return this.f223950b.hashCode() + (this.f223949a.hashCode() * 31);
    }
}
