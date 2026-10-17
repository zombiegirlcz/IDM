package rp4;

import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfirmation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardAutopayConfirmation f256255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f256256b;

    public a(CreditCardAutopayConfirmation confirmation, boolean z) {
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        this.f256255a = confirmation;
        this.f256256b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f256255a, aVar.f256255a) && this.f256256b == aVar.f256256b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f256256b) + (this.f256255a.hashCode() * 31);
    }
}
