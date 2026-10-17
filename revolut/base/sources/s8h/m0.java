package s8h;

import com.revolut.feature.wealth.ui.api.navigation.DisclosuresDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f261024a = y0.b("trading/disclosure");

    public static final class a {
        private a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f261024a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new DisclosuresDestination(DisclosuresDestination.Configuration.Trading.f95906a);
    }
}
