package l6c;

import kotlin.jvm.internal.Intrinsics;
import l6c.b;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends b.c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192390b;

    public d(String acsUrl, String paymentToken) {
        Intrinsics.checkNotNullParameter(acsUrl, "acsUrl");
        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
        this.f192389a = acsUrl;
        this.f192390b = paymentToken;
    }

    @Override // l6c.a
    public final String a() {
        return this.f192390b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f192389a, dVar.f192389a) && Intrinsics.f(this.f192390b, dVar.f192390b);
    }

    public final int hashCode() {
        return this.f192390b.hashCode() + (this.f192389a.hashCode() * 31);
    }
}
