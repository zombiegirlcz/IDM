package ip0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class hc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f164532b;

    public hc0(String listId, List listItems) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        this.f164531a = listId;
        this.f164532b = listItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof hc0)) {
            return false;
        }
        hc0 hc0Var = (hc0) obj2;
        return Intrinsics.f(this.f164531a, hc0Var.f164531a) && Intrinsics.f(this.f164532b, hc0Var.f164532b);
    }

    public final int hashCode() {
        return this.f164532b.hashCode() + (this.f164531a.hashCode() * 31);
    }
}
