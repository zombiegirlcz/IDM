package fv6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f138364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f138365b;

    public l(boolean z, List menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f138364a = z;
        this.f138365b = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f138364a == lVar.f138364a && Intrinsics.f(this.f138365b, lVar.f138365b);
    }

    public final int hashCode() {
        return this.f138365b.hashCode() + (Boolean.hashCode(this.f138364a) * 31);
    }
}
