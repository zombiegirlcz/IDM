package dih;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAccount f115058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f115059b;

    public a(WealthAccount account, Data content) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f115058a = account;
        this.f115059b = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f115058a, aVar.f115058a) && Intrinsics.f(this.f115059b, aVar.f115059b);
    }

    public final int hashCode() {
        return this.f115059b.hashCode() + (this.f115058a.hashCode() * 31);
    }
}
