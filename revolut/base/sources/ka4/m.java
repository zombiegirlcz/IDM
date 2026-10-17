package ka4;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f182424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oy3.a f182425b;

    public m(ArrayList selectedIds, oy3.a aVar) {
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        this.f182424a = selectedIds;
        this.f182425b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f182424a.equals(mVar.f182424a) && Intrinsics.f(this.f182425b, mVar.f182425b);
    }

    public final int hashCode() {
        int iHashCode = this.f182424a.hashCode() * 31;
        oy3.a aVar = this.f182425b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
