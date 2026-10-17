package yua;

import com.revolut.feature.core.model.domain.wallet.WalletId;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f316956a = new n();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String id10 = (String) obj2;
        Intrinsics.checkNotNullParameter(id10, "it");
        Intrinsics.checkNotNullParameter(id10, "id");
        if (id10 != null) {
            return new WalletId(id10);
        }
        return null;
    }
}
