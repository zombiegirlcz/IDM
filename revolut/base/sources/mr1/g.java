package mr1;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f208043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f208044b;

    public g(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f208043a = items;
        this.f208044b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f208043a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f208043a.equals(gVar.f208043a) && this.f208044b == gVar.f208044b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f208044b) + (this.f208043a.hashCode() * 31);
    }
}
