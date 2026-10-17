package fna;

import com.revolut.core.model.account.AccountId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    public static final String a(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "<this>");
        if (accountId instanceof AccountId.Personal) {
            return null;
        }
        if (!(accountId instanceof AccountId.Joint)) {
            throw new NoWhenBranchMatchedException();
        }
        String id10 = ((AccountId.Joint) accountId).f51413b;
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10;
    }
}
