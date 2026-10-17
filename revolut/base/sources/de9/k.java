package de9;

import javax.crypto.Cipher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cipher f113327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wl0.o f113328b;

    public k(Cipher cipher, wl0.o biometricType) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        Intrinsics.checkNotNullParameter(biometricType, "biometricType");
        this.f113327a = cipher;
        this.f113328b = biometricType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f113327a, kVar.f113327a) && this.f113328b == kVar.f113328b;
    }

    public final int hashCode() {
        return this.f113328b.hashCode() + (this.f113327a.hashCode() * 31);
    }
}
