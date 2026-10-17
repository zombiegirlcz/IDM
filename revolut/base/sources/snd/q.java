package snd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f264552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f264553b;

    public q(List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f264552a = items;
        this.f264553b = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f264552a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f264552a, qVar.f264552a) && Intrinsics.f(this.f264553b, qVar.f264553b);
    }

    public final int hashCode() {
        return this.f264553b.hashCode() + (this.f264552a.hashCode() * 31);
    }
}
