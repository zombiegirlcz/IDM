package qe1;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f245052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f245053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f245054c;

    public g(List items, boolean z, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f245052a = items;
        this.f245053b = menuItems;
        this.f245054c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f245052a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f245052a, gVar.f245052a) && Intrinsics.f(this.f245053b, gVar.f245053b) && this.f245054c == gVar.f245054c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f245054c) + p.a.d(this.f245052a.hashCode() * 31, 31, this.f245053b);
    }
}
