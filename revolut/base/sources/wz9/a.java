package wz9;

import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.shared.feature.suspicious_transaction.api.navigation.SuspiciousRecipientWarningDestination;
import ife.d;
import kotlin.jvm.internal.Intrinsics;
import yhi.b;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f301395l;

    public a(d suspiciousRecipientWarningDestinationProvider) {
        Intrinsics.checkNotNullParameter(suspiciousRecipientWarningDestinationProvider, "suspiciousRecipientWarningDestinationProvider");
        this.f301395l = suspiciousRecipientWarningDestinationProvider;
    }

    public final void Z2(String transactionGroupId) {
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
        this.f301395l.getClass();
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
        A2(u0.c(new KompotOverlayFeatureConfig(new SuspiciousRecipientWarningDestination(transactionGroupId), b.BOTTOM_DIALOG, (Integer) null, 12)));
    }
}
