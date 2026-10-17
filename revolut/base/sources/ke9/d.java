package ke9;

import javax.crypto.Cipher;
import kotlin.jvm.internal.Intrinsics;
import wl0.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cipher f183052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f183053b;

    public d(Cipher cipher, o biometricType) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        Intrinsics.checkNotNullParameter(biometricType, "biometricType");
        this.f183052a = cipher;
        this.f183053b = biometricType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f183052a, dVar.f183052a) && this.f183053b == dVar.f183053b;
    }

    public final int hashCode() {
        return this.f183053b.hashCode() + (this.f183052a.hashCode() * 31);
    }
}
