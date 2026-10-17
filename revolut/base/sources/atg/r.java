package atg;

import com.revolut.core.model.account.AccountId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class r {
    private r() {
    }

    public static final String a(r rVar, String str) {
        rVar.getClass();
        return a0.d.v(new Object[]{str}, 1, v.f9075m, "format(...)");
    }

    public static String b(AccountId accountId, String defaultStorageKey) {
        Intrinsics.checkNotNullParameter(accountId, "<this>");
        Intrinsics.checkNotNullParameter(defaultStorageKey, "defaultStorageKey");
        if (accountId instanceof AccountId.Personal) {
            return defaultStorageKey;
        }
        if (accountId instanceof AccountId.Joint) {
            return com.google.android.gms.internal.mlkit_vision_face.a.o(defaultStorageKey, "_", ((AccountId.Joint) accountId).f51412a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
