package xze;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f309964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f309965c;

    public d(String lastFour, String cardBrand, String paymentToken) {
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
        this.f309963a = lastFour;
        this.f309964b = cardBrand;
        this.f309965c = paymentToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f309963a, dVar.f309963a) && Intrinsics.f(this.f309964b, dVar.f309964b) && Intrinsics.f(this.f309965c, dVar.f309965c);
    }

    public final int hashCode() {
        return this.f309965c.hashCode() + p.a.c(this.f309963a.hashCode() * 31, 31, this.f309964b);
    }
}
