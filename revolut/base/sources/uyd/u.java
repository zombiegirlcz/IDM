package uyd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f284246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f284247b;

    public u(String str, Set productTypes) {
        Intrinsics.checkNotNullParameter(productTypes, "productTypes");
        this.f284246a = productTypes;
        this.f284247b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f284246a, uVar.f284246a) && Intrinsics.f(this.f284247b, uVar.f284247b);
    }

    public final int hashCode() {
        int iHashCode = this.f284246a.hashCode() * 31;
        String str = this.f284247b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
