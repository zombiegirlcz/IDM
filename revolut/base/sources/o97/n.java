package o97;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f223119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f223120b;

    public n(List results, LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(results, "results");
        this.f223119a = results;
        this.f223120b = linkedHashSet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f223119a, nVar.f223119a) && Intrinsics.f(this.f223120b, nVar.f223120b);
    }

    public final int hashCode() {
        int iHashCode = this.f223119a.hashCode() * 31;
        LinkedHashSet linkedHashSet = this.f223120b;
        return iHashCode + (linkedHashSet == null ? 0 : linkedHashSet.hashCode());
    }
}
