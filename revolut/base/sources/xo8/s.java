package xo8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f307726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f307727b;

    public s(r toolbarState, List items) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f307726a = toolbarState;
        this.f307727b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f307727b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f307726a, sVar.f307726a) && Intrinsics.f(this.f307727b, sVar.f307727b);
    }

    public final int hashCode() {
        return this.f307727b.hashCode() + (this.f307726a.hashCode() * 31);
    }
}
