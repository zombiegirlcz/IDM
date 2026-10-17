package um2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f281190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f281191b;

    public e(List customisableProducts, boolean z) {
        Intrinsics.checkNotNullParameter(customisableProducts, "customisableProducts");
        this.f281190a = customisableProducts;
        this.f281191b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f281190a, eVar.f281190a) && this.f281191b == eVar.f281191b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281191b) + (this.f281190a.hashCode() * 31);
    }
}
