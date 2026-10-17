package cu3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f108804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f108805b;

    public b(ArrayList addresses, boolean z) {
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        this.f108804a = addresses;
        this.f108805b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f108804a.equals(bVar.f108804a) && this.f108805b == bVar.f108805b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f108805b) + (this.f108804a.hashCode() * 31);
    }
}
