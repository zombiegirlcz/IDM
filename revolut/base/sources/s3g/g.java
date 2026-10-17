package s3g;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f259670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f259671b;

    public g(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f259670a = items;
        this.f259671b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f259670a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f259670a.equals(gVar.f259670a) && this.f259671b == gVar.f259671b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259671b) + (this.f259670a.hashCode() * 31);
    }
}
