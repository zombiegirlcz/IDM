package hb1;

import com.revolut.feature.acquiring.card_reader.order.api.model.PaymentMethod;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f150549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentMethod.Wallet f150550b;

    public c(ArrayList accounts, PaymentMethod.Wallet wallet) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        this.f150549a = accounts;
        this.f150550b = wallet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f150549a.equals(cVar.f150549a) && Intrinsics.f(this.f150550b, cVar.f150550b);
    }

    public final int hashCode() {
        int iHashCode = this.f150549a.hashCode() * 31;
        PaymentMethod.Wallet wallet = this.f150550b;
        return iHashCode + (wallet == null ? 0 : wallet.hashCode());
    }
}
