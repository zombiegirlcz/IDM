package dv9;

import java.security.PublicKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PublicKey f118077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PublicKey f118078b;

    public o(PublicKey publicKey, PublicKey companionKey) {
        Intrinsics.checkNotNullParameter(companionKey, "companionKey");
        this.f118077a = publicKey;
        this.f118078b = companionKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f118077a, oVar.f118077a) && Intrinsics.f(this.f118078b, oVar.f118078b);
    }

    public final int hashCode() {
        PublicKey publicKey = this.f118077a;
        return this.f118078b.hashCode() + ((publicKey == null ? 0 : publicKey.hashCode()) * 31);
    }
}
