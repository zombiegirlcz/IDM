package mn1;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f207339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableStateFlow f207340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f207341c;
    public final String d;
    public final xi0.b e;

    public i(j2 scheduleDataFlow, j2 decodeResultFlow, AccountId accountId, String str) {
        xi0.b.Companion.getClass();
        xi0.b pocketCurrency = xi0.b.D;
        Intrinsics.checkNotNullParameter(scheduleDataFlow, "scheduleDataFlow");
        Intrinsics.checkNotNullParameter(decodeResultFlow, "decodeResultFlow");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        this.f207339a = scheduleDataFlow;
        this.f207340b = decodeResultFlow;
        this.f207341c = accountId;
        this.d = str;
        this.e = pocketCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f207339a, iVar.f207339a) && Intrinsics.f(this.f207340b, iVar.f207340b) && Intrinsics.f(this.f207341c, iVar.f207341c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iB = h30.l.b(this.f207341c, (this.f207340b.hashCode() + (this.f207339a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        return this.e.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }
}
