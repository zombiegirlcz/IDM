package rda;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pockets.api.ui.add_new.OpenNewPocketDestination;
import com.revolut.kompot.common.ParcelableDestination;
import io3.l;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements xii.b {
    @Override // xii.b
    public final Set a() {
        return y0.b(gda.a.OPEN_POCKET.a());
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new OpenNewPocketDestination(l.CURRENT, (AccountId) AccountId.Personal.f51414a, true);
    }
}
