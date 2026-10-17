package bn4;

import com.revolut.feature.credit.card.api.navigation.descriptor.CreditCardOverdueExplainer$Descriptor;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f17066a = y0.b("credit-card/overdue-balance");

    public static final class a {
        private a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f17066a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new ControllerDestination.Modal(CreditCardOverdueExplainer$Descriptor.f68994a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }
}
