package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272872b;

    public k0(String hash, String link) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f272871a = hash;
        this.f272872b = link;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f272871a, k0Var.f272871a) && Intrinsics.f(this.f272872b, k0Var.f272872b);
    }

    public final int hashCode() {
        return this.f272872b.hashCode() + (this.f272871a.hashCode() * 31);
    }
}
