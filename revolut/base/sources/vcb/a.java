package vcb;

import com.revolut.feature.retail.private_banking.api.navigation.DepositAssetsDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lg0.e;
import lg0.g;
import org.jetbrains.annotations.NotNull;
import xii.b;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements b {

    @NotNull
    public static final C1590a Companion = new C1590a();

    /* JADX INFO: renamed from: vcb.a$a, reason: collision with other inner class name */
    public static final class C1590a {
        private C1590a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return y0.b("assets/deposit");
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strA = g.a("shouldGoToHomeAfterCardTopup", deeplink.f195041c);
        return new DepositAssetsDestination(strA != null ? Intrinsics.f(d0.E0(strA), Boolean.TRUE) : false);
    }
}
