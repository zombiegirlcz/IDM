package do8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f116457a;

    public l(List menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f116457a = menuItems;
    }

    @Override // do8.m
    public final List a() {
        return this.f116457a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f116457a, ((l) obj2).f116457a);
    }

    public final int hashCode() {
        return this.f116457a.hashCode();
    }
}
