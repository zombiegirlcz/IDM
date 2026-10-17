package mm0;

import javax.crypto.Cipher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cipher f207104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wl0.o f207105b;

    public b(Cipher cipher, wl0.o type) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f207104a = cipher;
        this.f207105b = type;
    }

    @Override // mm0.c
    public final String a() {
        return "SSO_SDK";
    }

    public final wl0.o b() {
        return this.f207105b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f207104a, bVar.f207104a) && this.f207105b == bVar.f207105b;
    }

    public final int hashCode() {
        return this.f207105b.hashCode() + (this.f207104a.hashCode() * 31);
    }

    public final String toString() {
        return "BiometricsSsoSdk(value='SSO_SDK')";
    }
}
