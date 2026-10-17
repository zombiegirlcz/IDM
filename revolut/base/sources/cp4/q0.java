package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107851c;

    public q0(String facilityId, String transactionId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f107849a = facilityId;
        this.f107850b = transactionId;
        this.f107851c = a0.d.s("credit_card_transaction_details_", facilityId, "_", transactionId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<vo4.a>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$TransactionDetails$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f107849a, q0Var.f107849a) && Intrinsics.f(this.f107850b, q0Var.f107850b);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107851c;
    }

    public final int hashCode() {
        return this.f107850b.hashCode() + (this.f107849a.hashCode() * 31);
    }
}
