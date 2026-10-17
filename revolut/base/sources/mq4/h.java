package mq4;

import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardSecurityDeposit f207860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f207861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f207862c;

    public h(CreditCardSecurityDeposit securityDeposit, io3.d currentTypePocket, boolean z) {
        Intrinsics.checkNotNullParameter(securityDeposit, "securityDeposit");
        Intrinsics.checkNotNullParameter(currentTypePocket, "currentTypePocket");
        this.f207860a = securityDeposit;
        this.f207861b = currentTypePocket;
        this.f207862c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f207860a, hVar.f207860a) && Intrinsics.f(this.f207861b, hVar.f207861b) && this.f207862c == hVar.f207862c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f207862c) + h30.l.g(this.f207861b, this.f207860a.hashCode() * 31, 31);
    }
}
