package tac;

import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayOrderDetails;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import xii.b;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements b {

    @NotNull
    private static final C1504a Companion = new C1504a();

    /* JADX INFO: renamed from: tac.a$a, reason: collision with other inner class name */
    public static final class C1504a {
        private C1504a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return y0.b("revolut-pay/order-details/{orderId}");
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Object obj2 = deeplink.f195040b.get("orderId");
        String str = (String) obj2;
        if (str == null || d0.W(str)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        if (str2 == null) {
            return null;
        }
        return new RevolutPayFeatureConfig$RevolutPayOrderDetails(str2);
    }
}
