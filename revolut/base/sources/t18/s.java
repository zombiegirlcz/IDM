package t18;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f267228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f267229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f267230c;

    public s(ArrayList items, List menuItems, List filters) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f267228a = menuItems;
        this.f267229b = filters;
        this.f267230c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f267230c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f267228a, sVar.f267228a) && Intrinsics.f(this.f267229b, sVar.f267229b) && this.f267230c.equals(sVar.f267230c);
    }

    public final int hashCode() {
        return this.f267230c.hashCode() + p.a.d(this.f267228a.hashCode() * 31, 31, this.f267229b);
    }
}
