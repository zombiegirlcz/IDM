package blj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData;
import dej.v0;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData f16732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rlj.a f16733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wnj.a f16734c;
    public final dlj.b d;
    public final qhj.e e;

    public v(EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData inputData, rlj.a phoneNumberItemMapper, wnj.a descriptorApplier, dlj.b codeInputMapper, alj.a dynamicFormAttributesValidator, qhj.e phoneNumberFormatter, ugc.a giftRecipientNameResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneNumberItemMapper, "phoneNumberItemMapper");
        Intrinsics.checkNotNullParameter(descriptorApplier, "descriptorApplier");
        Intrinsics.checkNotNullParameter(codeInputMapper, "codeInputMapper");
        Intrinsics.checkNotNullParameter(dynamicFormAttributesValidator, "dynamicFormAttributesValidator");
        Intrinsics.checkNotNullParameter(phoneNumberFormatter, "phoneNumberFormatter");
        Intrinsics.checkNotNullParameter(giftRecipientNameResolver, "giftRecipientNameResolver");
        this.f16732a = inputData;
        this.f16733b = phoneNumberItemMapper;
        this.f16734c = descriptorApplier;
        this.d = codeInputMapper;
        this.e = phoneNumberFormatter;
    }

    public final m a() {
        EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData = this.f16732a;
        String str = esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData.f101289c.f100362c;
        f0 f0Var = f0.f322471a;
        v0 v0Var = v0.RECEIVER_NAME;
        List listC = zhm.u.c(v0Var);
        EsimGiftRecipient esimGiftRecipient = esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData.f;
        Map mapC = q0.c(new Pair(v0Var, ugc.a.f(esimGiftRecipient)));
        wnj.a aVar = this.f16734c;
        Clause clauseB = aVar.b(str, f0Var, listC, mapC, null);
        String strA = this.e.a(esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData.f101288b);
        EsimHyperText esimHyperText = esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData.f101289c.d;
        return new m(clauseB, aVar.b(esimHyperText.f100276a, esimHyperText.f100277b, d0.F0(v0Var, esimHyperText.f100278c), r0.k(new Pair(v0.PHONE_NUMBER, strA), new Pair(v0Var, ugc.a.f(esimGiftRecipient))), null));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (n) iii.c.f(domainState.f16709b, new bhl.g(this, 11), new bhi.c(this, 8), new b1c.p(this, domainState, 16));
    }
}
