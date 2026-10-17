package q3g;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f241968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f241969b;

    public f(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f241968a = items;
        this.f241969b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f241968a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f241968a.equals(fVar.f241968a) && this.f241969b == fVar.f241969b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f241969b) + (this.f241968a.hashCode() * 31);
    }
}
