package r55;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.core.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.youTransactor.uCube.rpc.Constants;
import ft3.w;
import go.g;
import grl.r2;
import jte.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mf1.c;
import of1.e;
import qf1.m;
import vkm.q;
import y45.h;
import y45.i;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f251530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f251531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f251532c;

    public b(h loanProductFeatureTogglesInteractor, i loanProductInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(loanProductFeatureTogglesInteractor, "loanProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f251530a = loanProductFeatureTogglesInteractor;
        this.f251531b = loanProductInteractor;
        this.f251532c = featureToggleInteractor;
    }

    @Override // mf1.c
    public final Flow a() {
        qf1.a aVar = new qf1.a(new CdnImage("loans", "mobile/cross_sell/products_for_you", null, null, null, null, Constants.TAG_FC_SPEED_MODE));
        return new g(((d) this.f251532c).c(AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c) ? zi0.c.P(new m(new TextLocalisedClause(R$string.p4u_product_loans_title, null, null, 14), new TextLocalisedClause(R$string.p4u_product_loans_description, null, null, 14), new TextLocalisedClause(R$string.p4u_product_loans_cta, null, null, 14), R$drawable.uikit_icn_24_deposit_protection, null, aVar, null, SyslogConstants.LOG_LOCAL6), false, null, 3) : zi0.c.P(new m(new TextLocalisedClause(R$string.loan_add_new_widget_title, null, null, 14), new TextLocalisedClause(R$string.loan_add_new_widget_description, null, null, 14), new TextLocalisedClause(R$string.loan_add_new_widget_action, null, null, 14), R$drawable.uikit_icn_24_credit_bag, null, aVar, null, SyslogConstants.LOG_LOCAL6), false, null, 3), 2);
    }

    @Override // mf1.c
    public final Object c(Continuation continuation) {
        return new e(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(r2.ADD_NEW_PRODUCT_WIDGET, w.INSTANCE, wp3.a.OPEN_EXISTING_APPLICATION, null, null, null, 16370)));
    }

    @Override // mf1.c
    public final Flow isAvailable() {
        return q.Q(this.f251530a.e(r2.ADD_NEW_PRODUCT_WIDGET), new r3k.c(null, this, 2));
    }
}
