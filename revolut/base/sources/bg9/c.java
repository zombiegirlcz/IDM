package bg9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15144c;
    public final List d;
    public final Integer e;

    public c(List items, boolean z, boolean z3, List menuItems, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f15142a = items;
        this.f15143b = z;
        this.f15144c = z3;
        this.d = menuItems;
        this.e = num;
    }

    @Override // cli.p
    public final List c() {
        return this.f15142a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f15142a, cVar.f15142a) && this.f15143b == cVar.f15143b && this.f15144c == cVar.f15144c && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(j6.a.c(this.f15142a.hashCode() * 31, 31, this.f15143b), 31, this.f15144c), 31, this.d);
        Integer num = this.e;
        return iD + (num == null ? 0 : num.hashCode());
    }
}
