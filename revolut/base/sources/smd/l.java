package smd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f264427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f264428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f264429c;

    public l(List items, f buttonState, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f264427a = items;
        this.f264428b = buttonState;
        this.f264429c = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f264427a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f264427a, lVar.f264427a) && Intrinsics.f(this.f264428b, lVar.f264428b) && Intrinsics.f(this.f264429c, lVar.f264429c);
    }

    public final int hashCode() {
        return this.f264429c.hashCode() + ((this.f264428b.hashCode() + (this.f264427a.hashCode() * 31)) * 31);
    }
}
