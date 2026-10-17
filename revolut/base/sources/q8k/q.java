package q8k;

import com.revolut.feature.transfer.core.models.SourceAccount;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f243157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f243158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SourceAccount f243159c;
    public final p d;

    public q(zm3.a contact, dj0.d targetMoney, SourceAccount sourceAccount, p context) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f243157a = contact;
        this.f243158b = targetMoney;
        this.f243159c = sourceAccount;
        this.d = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f243157a, qVar.f243157a) && Intrinsics.f(this.f243158b, qVar.f243158b) && Intrinsics.f(this.f243159c, qVar.f243159c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f243157a.hashCode() * 31, 31, this.f243158b);
        SourceAccount sourceAccount = this.f243159c;
        return this.d.f243156a.hashCode() + ((iC + (sourceAccount == null ? 0 : sourceAccount.hashCode())) * 31);
    }
}
