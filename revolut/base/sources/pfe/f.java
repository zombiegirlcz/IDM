package pfe;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public interface f {
    default Object a(Set set, gim.c cVar) {
        return h0.f322473a;
    }

    Object b(Set set, gim.c cVar);

    default boolean c(ProductAccountId account) {
        Intrinsics.checkNotNullParameter(account, "account");
        return true;
    }
}
