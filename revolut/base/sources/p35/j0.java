package p35;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f232649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f232650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f232651c;

    public j0(String str, long j2, k0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f232649a = str;
        this.f232650b = j2;
        this.f232651c = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f232649a, j0Var.f232649a) && this.f232650b == j0Var.f232650b && this.f232651c == j0Var.f232651c;
    }

    public final int hashCode() {
        String str = this.f232649a;
        return this.f232651c.hashCode() + a0.d.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f232650b);
    }
}
