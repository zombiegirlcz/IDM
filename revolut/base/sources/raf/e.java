package raf;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f252827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f252828b;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data accountEligibleForTransfer, Data tradingLegalEntityInformation, int i) {
        if ((i & 1) != 0) {
            accountEligibleForTransfer = eVar.f252827a;
        }
        if ((i & 2) != 0) {
            tradingLegalEntityInformation = eVar.f252828b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(accountEligibleForTransfer, "accountEligibleForTransfer");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        return new e(accountEligibleForTransfer, tradingLegalEntityInformation);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f252827a, eVar.f252827a) && Intrinsics.f(this.f252828b, eVar.f252828b);
    }

    public final int hashCode() {
        return this.f252828b.hashCode() + (this.f252827a.hashCode() * 31);
    }

    public e(Data accountEligibleForTransfer, Data tradingLegalEntityInformation) {
        Intrinsics.checkNotNullParameter(accountEligibleForTransfer, "accountEligibleForTransfer");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        this.f252827a = accountEligibleForTransfer;
        this.f252828b = tradingLegalEntityInformation;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null));
    }
}
