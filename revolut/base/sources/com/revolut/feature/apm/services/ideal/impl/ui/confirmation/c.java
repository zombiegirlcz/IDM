package com.revolut.feature.apm.services.ideal.impl.ui.confirmation;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.ad;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.services.ideal.api.R$string;
import com.revolut.feature.apm.services.ideal.impl.ui.confirmation.IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint;
import id2.d;
import id2.f;
import id2.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IDealPaymentConfirmedScreenContract$InputData f62847a;

    public c(IDealPaymentConfirmedScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f62847a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint iDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint = this.f62847a.f62841a;
        if (iDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint instanceof IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint.Mobile) {
            textLocalisedClause = new TextLocalisedClause(R$string.ideal_payment_confirmation_success_mobile_subtitle, null, null, 14);
        } else {
            if (!Intrinsics.f(iDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint, IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint.Desktop.f62842a)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.ideal_payment_confirmation_success_desktop_subtitle, null, null, 14);
        }
        return new f(u.c(new PromptContentDelegate.Model("SUCCESS_PROMPT_ID", new TextLocalisedClause(R$string.ideal_payment_confirmation_title, null, null, 14), textLocalisedClause, null, new ad(zw1.a.a(), false), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, 536870344)));
    }
}
