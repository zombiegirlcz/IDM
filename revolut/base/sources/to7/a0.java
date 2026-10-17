package to7;

import kl7.m2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f272514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272515b;

    public a0(m2 transmission, String displayName) {
        Intrinsics.checkNotNullParameter(transmission, "transmission");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.f272514a = transmission;
        this.f272515b = displayName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f272514a == a0Var.f272514a && Intrinsics.f(this.f272515b, a0Var.f272515b);
    }

    public final int hashCode() {
        return this.f272515b.hashCode() + (this.f272514a.hashCode() * 31);
    }
}
