package x2k;

import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.PaymentVendorsBeneCreationDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f302598a = y0.b("payments/new-transfer/more");

    public static final class a {
        private a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f302598a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new PaymentVendorsBeneCreationDestination(null);
    }
}
