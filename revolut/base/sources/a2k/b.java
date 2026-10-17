package a2k;

import com.revolut.feature.transfer.core.models.SourceAccount;
import dj0.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SourceAccount f891c;
    public final a d;

    public b(f5j.a beneficiary, d targetMoney, SourceAccount sourceAccount, a context) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f889a = beneficiary;
        this.f890b = targetMoney;
        this.f891c = sourceAccount;
        this.d = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f889a, bVar.f889a) && Intrinsics.f(this.f890b, bVar.f890b) && Intrinsics.f(this.f891c, bVar.f891c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f889a.hashCode() * 31, 31, this.f890b);
        SourceAccount sourceAccount = this.f891c;
        return this.d.f888a.hashCode() + ((iC + (sourceAccount == null ? 0 : sourceAccount.hashCode())) * 31);
    }
}
