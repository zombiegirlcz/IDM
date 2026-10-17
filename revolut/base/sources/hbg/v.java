package hbg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f150719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f150720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f150721c;

    public v(List items, boolean z, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f150719a = items;
        this.f150720b = menuItems;
        this.f150721c = z;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof v)) {
            return null;
        }
        return new u(!Intrinsics.f(r5.f150720b, this.f150720b), ((v) oldState).f150721c != this.f150721c);
    }

    @Override // cli.p
    public final List c() {
        return this.f150719a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f150719a, vVar.f150719a) && Intrinsics.f(this.f150720b, vVar.f150720b) && this.f150721c == vVar.f150721c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f150721c) + p.a.d(this.f150719a.hashCode() * 31, 31, this.f150720b);
    }
}
