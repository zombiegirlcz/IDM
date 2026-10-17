package h6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountWrapper f149655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x5i.d f149656b;

    public d(AccountWrapper oppositeAccount, x5i.d destinationType) {
        Intrinsics.checkNotNullParameter(oppositeAccount, "oppositeAccount");
        Intrinsics.checkNotNullParameter(destinationType, "destinationType");
        this.f149655a = oppositeAccount;
        this.f149656b = destinationType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f149655a, dVar.f149655a) && this.f149656b == dVar.f149656b;
    }

    public final int hashCode() {
        return (this.f149656b.hashCode() + (this.f149655a.hashCode() * 31)) * 31;
    }
}
