package aj6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5422b;

    public o(String str, List permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f5421a = str;
        this.f5422b = permissions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f5421a, oVar.f5421a) && Intrinsics.f(this.f5422b, oVar.f5422b);
    }

    public final int hashCode() {
        String str = this.f5421a;
        return this.f5422b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
