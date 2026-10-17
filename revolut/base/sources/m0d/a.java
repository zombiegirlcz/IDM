package m0d;

import com.revolut.feature.semi_independent_activation.api.navigation.SemiIndependentActivationDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import lg0.g;
import org.jetbrains.annotations.NotNull;
import xii.b;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements b {

    @NotNull
    public static final C1142a Companion = new C1142a();

    /* JADX INFO: renamed from: m0d.a$a, reason: collision with other inner class name */
    public static final class C1142a {
        private C1142a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return y0.b("teen-guardian/sia-invitation/details");
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strA = g.a("teenUserId", deeplink.f195041c);
        if (strA != null) {
            return new SemiIndependentActivationDestination.InvitationDetails(strA);
        }
        return null;
    }
}
