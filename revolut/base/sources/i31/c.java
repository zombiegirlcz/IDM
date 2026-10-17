package i31;

import com.revolut.data.network.services.PeerToPeerTransferService;
import com.revolut.feature.junior_core.api.JuniorCoreApi$Toggles;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements y71.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerTransferService f158068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f158069b;

    public c(PeerToPeerTransferService service, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f158068a = service;
        this.f158069b = featureToggleInteractor;
    }

    public final String a() {
        if (((jte.d) this.f158069b).c(JuniorCoreApi$Toggles.PaymentsWithAllJunior.f76895c)) {
            return "PAYMENTS_WITH_ALL_JUNIOR_IN_RETAIL";
        }
        return null;
    }
}
