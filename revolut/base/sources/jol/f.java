package jol;

import javax.crypto.Cipher;
import kotlin.jvm.internal.Intrinsics;
import wl0.o;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends com.revolut.sso.impl.ui.password_flow.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cipher f177168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f177169b;

    public f(Cipher cipher, o biometricType) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        Intrinsics.checkNotNullParameter(biometricType, "biometricType");
        this.f177168a = cipher;
        this.f177169b = biometricType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f177168a, fVar.f177168a) && this.f177169b == fVar.f177169b;
    }

    public final int hashCode() {
        return this.f177169b.hashCode() + (this.f177168a.hashCode() * 31);
    }
}
