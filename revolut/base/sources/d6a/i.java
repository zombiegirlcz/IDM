package d6a;

import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {
    public static g a(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_MERCHANT_NOT_FOUND")) {
            return e.f111470a;
        }
        if (!(obj2 instanceof Provider)) {
            return f.f111471a;
        }
        Provider provider = (Provider) obj2;
        int i = h.f111472a[provider.f.ordinal()];
        if (i == 1) {
            return new b(provider);
        }
        if (i == 2) {
            return new c(provider);
        }
        if (i == 3) {
            return new d(provider);
        }
        throw new NoWhenBranchMatchedException();
    }
}
