package mm0;

import javax.crypto.Cipher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cipher f207102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wl0.o f207103b;

    public a(Cipher cipher, wl0.o type) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f207102a = cipher;
        this.f207103b = type;
    }

    @Override // mm0.c
    public final String a() {
        return "BIOMETRICS";
    }

    public final Cipher b() {
        return this.f207102a;
    }

    public final wl0.o c() {
        return this.f207103b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f207102a, aVar.f207102a) && this.f207103b == aVar.f207103b;
    }

    public final int hashCode() {
        return this.f207103b.hashCode() + (this.f207102a.hashCode() * 31);
    }

    public final String toString() {
        return "Biometrics(value='BIOMETRICS')";
    }
}
