package o97;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e0 extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f223097a;

    public e0(List listItems) {
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        this.f223097a = listItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f223097a, ((e0) obj2).f223097a);
    }

    public final int hashCode() {
        return this.f223097a.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(koi.j item) {
        this(zhm.u.c(item));
        Intrinsics.checkNotNullParameter(item, "item");
    }
}
