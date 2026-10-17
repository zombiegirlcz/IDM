package umd;

import com.revolut.core.model.account.AccountId;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f281295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lzi.m f281296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f281297c;

    public l(AccountId accountId, lzi.m budget, List categories) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(budget, "budget");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f281295a = accountId;
        this.f281296b = budget;
        this.f281297c = categories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f281295a, lVar.f281295a) && Intrinsics.f(this.f281296b, lVar.f281296b) && Intrinsics.f(this.f281297c, lVar.f281297c);
    }

    public final int hashCode() {
        return this.f281297c.hashCode() + ((this.f281296b.hashCode() + (this.f281295a.hashCode() * 31)) * 31);
    }
}
