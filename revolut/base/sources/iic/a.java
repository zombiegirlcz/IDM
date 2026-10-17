package iic;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f161598a;

    public a(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f161598a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f161598a, ((a) obj2).f161598a);
    }

    public final int hashCode() {
        return this.f161598a.hashCode();
    }
}
