package nve;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f219583a = y0.b("topup-paynow");

    public static final class a {
        private a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f219583a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, null, TopUpConfig.PreselectedTopUpMethod.PayNow.f90480a, null, null, 29));
    }
}
