package kzj;

import cli.j;
import com.revolut.core.model.account.AccountId;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f191118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f191119b;

    public b(AccountId accountId, List items) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f191118a = accountId;
        this.f191119b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f191118a, bVar.f191118a) && Intrinsics.f(this.f191119b, bVar.f191119b);
    }

    public final int hashCode() {
        return this.f191119b.hashCode() + (this.f191118a.hashCode() * 31);
    }
}
