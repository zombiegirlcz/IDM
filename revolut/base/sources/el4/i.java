package el4;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f127265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f127266b;

    public i(int i, ArrayList cardholders) {
        Intrinsics.checkNotNullParameter(cardholders, "cardholders");
        this.f127265a = i;
        this.f127266b = cardholders;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f127265a == iVar.f127265a && this.f127266b.equals(iVar.f127266b);
    }

    public final int hashCode() {
        return this.f127266b.hashCode() + (Integer.hashCode(this.f127265a) * 31);
    }
}
