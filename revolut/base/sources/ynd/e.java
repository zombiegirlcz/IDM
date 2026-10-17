package ynd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Linked f315447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f315448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f315449c;

    public e(AnalyticsAccount.Linked account, String title, String str) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f315447a = account;
        this.f315448b = title;
        this.f315449c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f315447a, eVar.f315447a) && Intrinsics.f(this.f315448b, eVar.f315448b) && Intrinsics.f(this.f315449c, eVar.f315449c);
    }

    @Override // ynd.h
    public final AnalyticsAccount getAccount() {
        return this.f315447a;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f315447a.hashCode() * 31, 31, this.f315448b);
        String str = this.f315449c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
