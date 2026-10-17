package vc2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f287619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f287620b;

    public c(List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f287619a = items;
        this.f287620b = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f287619a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f287619a, cVar.f287619a) && Intrinsics.f(this.f287620b, cVar.f287620b);
    }

    public final int hashCode() {
        return this.f287620b.hashCode() + (this.f287619a.hashCode() * 31);
    }
}
