package a83;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b93.e f2089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f2090c;
    public final String d;

    public v(String cardId, b93.e cardType, AccountId accountId, String str) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f2088a = cardId;
        this.f2089b = cardType;
        this.f2090c = accountId;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f2088a, vVar.f2088a) && this.f2089b == vVar.f2089b && Intrinsics.f(this.f2090c, vVar.f2090c) && Intrinsics.f(this.d, vVar.d);
    }

    public final int hashCode() {
        int iB = h30.l.b(this.f2090c, (this.f2089b.hashCode() + (this.f2088a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
