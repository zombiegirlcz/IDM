package o97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l0 extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f223117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f223118b;

    public l0(x searchNaviCommand, k0 smartTileAction) {
        Intrinsics.checkNotNullParameter(searchNaviCommand, "searchNaviCommand");
        Intrinsics.checkNotNullParameter(smartTileAction, "smartTileAction");
        this.f223117a = searchNaviCommand;
        this.f223118b = smartTileAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f223117a, l0Var.f223117a) && this.f223118b == l0Var.f223118b;
    }

    public final int hashCode() {
        return this.f223118b.hashCode() + (this.f223117a.hashCode() * 31);
    }
}
