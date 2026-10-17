package tx0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q3 implements s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f275229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f275230b;

    public q3(List avatars) {
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        this.f275229a = avatars;
        this.f275230b = true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj2;
        return Intrinsics.f(this.f275229a, q3Var.f275229a) && this.f275230b == q3Var.f275230b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f275230b) + (this.f275229a.hashCode() * 31);
    }
}
