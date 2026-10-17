package mg2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i80.a f205147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205148b;

    public k(i80.a qrCode, String str) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        this.f205147a = qrCode;
        this.f205148b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f205147a, kVar.f205147a) && Intrinsics.f(this.f205148b, kVar.f205148b);
    }

    public final int hashCode() {
        int iDeepHashCode = Arrays.deepHashCode(this.f205147a.f159408a) * 31;
        String str = this.f205148b;
        return iDeepHashCode + (str == null ? 0 : str.hashCode());
    }
}
