package e93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123858b;

    public e0(String lightUrl, String str) {
        Intrinsics.checkNotNullParameter(lightUrl, "lightUrl");
        this.f123857a = lightUrl;
        this.f123858b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f123857a, e0Var.f123857a) && Intrinsics.f(this.f123858b, e0Var.f123858b);
    }

    public final int hashCode() {
        int iHashCode = this.f123857a.hashCode() * 31;
        String str = this.f123858b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
