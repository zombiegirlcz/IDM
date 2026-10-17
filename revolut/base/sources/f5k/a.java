package f5k;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittanceBridgeFeatureConfig;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittanceInputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import cw9.d;
import go.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mf1.c;
import qf1.m;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f132360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f132361b;

    public a(gte.a featureToggleInteractor, d paymentsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f132360a = featureToggleInteractor;
        this.f132361b = paymentsProductFeatureChecker;
    }

    @Override // mf1.c
    public final Flow a() {
        return new g(zi0.c.P(new m(new TextLocalisedClause(R$string.remittance_p4u_title, null, null, 14), new TextLocalisedClause(R$string.remittance_p4u_subtitle, null, null, 14), new TextLocalisedClause(R$string.remittance_p4u_button, null, null, 14), R$drawable.uikit_icn_24_globe, null, new qf1.a(new ColorImage(new ColorImage.ColorInteger(-16777216), null)), null, SyslogConstants.LOG_LOCAL6), false, null, 3), 2);
    }

    @Override // mf1.c
    public final Object c(Continuation continuation) {
        TransferFlowType.Default r2 = TransferFlowType.Default.f92257b;
        return new of1.d(new RemittanceBridgeFeatureConfig.BridgeDestination(new RemittanceInputData(new TransferMoneyPocket(null, null, 3), 4)));
    }

    @Override // mf1.c
    public final Flow isAvailable() {
        return ((jte.d) this.f132360a).c(AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c) ? new g(Boolean.FALSE, 2) : this.f132361b.g();
    }
}
