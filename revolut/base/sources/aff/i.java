package aff;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4041b;

    public i(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f4040a = z;
        this.f4041b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f4041b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f4040a == iVar.f4040a && this.f4041b.equals(iVar.f4041b);
    }

    public final int hashCode() {
        return this.f4041b.hashCode() + (Boolean.hashCode(this.f4040a) * 31);
    }
}
