package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o6 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f272970b;

    public o6(dj0.d value, String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f272969a = title;
        this.f272970b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj2;
        return Intrinsics.f(this.f272969a, o6Var.f272969a) && Intrinsics.f(this.f272970b, o6Var.f272970b);
    }

    public final int hashCode() {
        return this.f272970b.hashCode() + (this.f272969a.hashCode() * 31);
    }
}
