package ou3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f229811b;

    public p(String title, ArrayList steps) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f229810a = title;
        this.f229811b = steps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f229810a, pVar.f229810a) && this.f229811b.equals(pVar.f229811b);
    }

    public final int hashCode() {
        return this.f229811b.hashCode() + (this.f229810a.hashCode() * 31);
    }
}
