package tof;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f272939b;

    public n0(String key, List params) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f272938a = key;
        this.f272939b = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f272938a, n0Var.f272938a) && Intrinsics.f(this.f272939b, n0Var.f272939b);
    }

    public final int hashCode() {
        return this.f272939b.hashCode() + (this.f272938a.hashCode() * 31);
    }
}
