package gmj;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f144865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f144866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f144867c;

    public g(List items, boolean z, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f144865a = items;
        this.f144866b = z;
        this.f144867c = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f144865a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f144865a, gVar.f144865a) && this.f144866b == gVar.f144866b && Intrinsics.f(this.f144867c, gVar.f144867c);
    }

    public final int hashCode() {
        return this.f144867c.hashCode() + j6.a.c(this.f144865a.hashCode() * 31, 31, this.f144866b);
    }
}
