package sl9;

import com.revolut.feature.pay_with_smile.api.declaration.PayWithSmileApi$Deeplink$Consent;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import lg0.g;
import org.jetbrains.annotations.NotNull;
import xii.b;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements b {

    @NotNull
    private static final C1469a Companion = new C1469a();

    /* JADX INFO: renamed from: sl9.a$a, reason: collision with other inner class name */
    public static final class C1469a {
        private C1469a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return y0.b("revolut-pay/biometric-payments/terms");
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new PayWithSmileApi$Deeplink$Consent(g.a("related", deeplink.f195041c));
    }
}
