package le3;

import com.revolut.feature.core.model.domain.wallet.WalletId;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f194507a = new z();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String id10 = (String) obj2;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(id10, "id");
        if (id10 != null) {
            return new WalletId(id10);
        }
        return null;
    }
}
