package ya;

import com.feature.user.details.api.UserDetailsToggles$ConfirmButtonUserDetails;
import com.feature.user.details.api.navigation.UserDetailsDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements xii.b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f311882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f311883b;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f311882a = featureToggleInteractor;
        this.f311883b = y0.b("missing-info");
    }

    @Override // xii.b
    public final Set a() {
        return this.f311883b;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (((d) this.f311882a).c(UserDetailsToggles$ConfirmButtonUserDetails.f26225c)) {
            return UserDetailsDestination.f26226a;
        }
        return null;
    }
}
