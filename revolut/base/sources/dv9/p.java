package dv9;

import javax.crypto.SecretKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f118079a;

    public p(SecretKey secretKey) {
        this.f118079a = secretKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f118079a, ((p) obj2).f118079a);
    }

    public final int hashCode() {
        SecretKey secretKey = this.f118079a;
        if (secretKey == null) {
            return 0;
        }
        return secretKey.hashCode();
    }
}
