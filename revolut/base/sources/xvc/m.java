package xvc;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f309237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f309238b;

    public m(List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f309237a = items;
        this.f309238b = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f309237a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f309237a, mVar.f309237a) && Intrinsics.f(this.f309238b, mVar.f309238b);
    }

    public final int hashCode() {
        return this.f309238b.hashCode() + (this.f309237a.hashCode() * 31);
    }
}
