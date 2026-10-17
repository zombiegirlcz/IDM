package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272944b;

    public n3(String str, String str2) {
        this.f272943a = str;
        this.f272944b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj2;
        return Intrinsics.f(this.f272943a, n3Var.f272943a) && Intrinsics.f(this.f272944b, n3Var.f272944b);
    }

    public final String getId() {
        return this.f272944b;
    }

    public final int hashCode() {
        String str = this.f272943a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f272944b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
