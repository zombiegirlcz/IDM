package o5l;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222469b;

    public k(String light, String str) {
        Intrinsics.checkNotNullParameter(light, "light");
        this.f222468a = light;
        this.f222469b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f222468a, kVar.f222468a) && Intrinsics.f(this.f222469b, kVar.f222469b);
    }

    public final int hashCode() {
        int iHashCode = this.f222468a.hashCode() * 31;
        String str = this.f222469b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
