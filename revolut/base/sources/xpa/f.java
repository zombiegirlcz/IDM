package xpa;

import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.transfer.core.models.SourceAccount;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwner f307922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f307923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SourceAccount f307924c;
    public final e d;

    public f(CardOwner recipient, dj0.d targetMoney, SourceAccount sourceAccount, e context) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f307922a = recipient;
        this.f307923b = targetMoney;
        this.f307924c = sourceAccount;
        this.d = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f307922a, fVar.f307922a) && Intrinsics.f(this.f307923b, fVar.f307923b) && Intrinsics.f(this.f307924c, fVar.f307924c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f307922a.hashCode() * 31, 31, this.f307923b);
        SourceAccount sourceAccount = this.f307924c;
        return this.d.f307921a.hashCode() + ((iC + (sourceAccount == null ? 0 : sourceAccount.hashCode())) * 31);
    }
}
