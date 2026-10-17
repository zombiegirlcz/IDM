package slg;

import com.revolut.feature.us_send_checks.impl.service.SendChecksTransferService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendChecksTransferService f264203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rj0.a f264204b;

    public a(SendChecksTransferService sendChecksTransferService, rj0.a networkFeatureTogglesProvider) {
        Intrinsics.checkNotNullParameter(sendChecksTransferService, "sendChecksTransferService");
        Intrinsics.checkNotNullParameter(networkFeatureTogglesProvider, "networkFeatureTogglesProvider");
        this.f264203a = sendChecksTransferService;
        this.f264204b = networkFeatureTogglesProvider;
    }
}
