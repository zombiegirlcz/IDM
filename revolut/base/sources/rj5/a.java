package rj5;

import aii.e;
import com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionCryptoRemittanceAction f254612a;

    public a(TransactionCryptoRemittanceAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f254612a = action;
    }

    public final TransactionCryptoRemittanceAction b() {
        return this.f254612a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f254612a, ((a) obj2).f254612a);
    }

    public final int hashCode() {
        return this.f254612a.hashCode();
    }
}
