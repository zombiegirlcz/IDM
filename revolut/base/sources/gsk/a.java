package gsk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import uqk.f;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f146551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f146552b;

    public a(f fVar, Map expandedItems) {
        Intrinsics.checkNotNullParameter(expandedItems, "expandedItems");
        this.f146551a = fVar;
        this.f146552b = expandedItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f146551a, aVar.f146551a) && Intrinsics.f(this.f146552b, aVar.f146552b);
    }

    public final int hashCode() {
        f fVar = this.f146551a;
        return this.f146552b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31);
    }
}
