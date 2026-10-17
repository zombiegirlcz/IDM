package xkj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f306832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f306833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f306834c;

    public m(l navBarConfig, aim.e items, k footerState) {
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        this.f306832a = navBarConfig;
        this.f306833b = items;
        this.f306834c = footerState;
    }

    @Override // cli.p
    public final List c() {
        return this.f306833b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f306832a, mVar.f306832a) && Intrinsics.f(this.f306833b, mVar.f306833b) && Intrinsics.f(this.f306834c, mVar.f306834c);
    }

    public final int hashCode() {
        return this.f306834c.hashCode() + p.a.d(this.f306832a.hashCode() * 31, 31, this.f306833b);
    }
}
