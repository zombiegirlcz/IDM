package q0i;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f241279a;

    public a(BigInteger value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f241279a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f241279a, ((a) obj2).f241279a);
    }

    public final int hashCode() {
        return this.f241279a.hashCode();
    }
}
