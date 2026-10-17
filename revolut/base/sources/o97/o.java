package o97;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f223122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f223123b;

    public o(m itemType, List items) {
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f223122a = itemType;
        this.f223123b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f223122a == oVar.f223122a && Intrinsics.f(this.f223123b, oVar.f223123b);
    }

    public final int hashCode() {
        return this.f223123b.hashCode() + (this.f223122a.hashCode() * 31);
    }
}
