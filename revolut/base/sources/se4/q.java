package se4;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.o4;
import com.revolut.core.ui_kit.delegates.p4;
import com.revolut.core.ui_kit.delegates.v4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.otp.OtpScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yy3.x;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OtpScreenContract$InputData f262118a;

    public q(OtpScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f262118a = inputData;
    }

    public final koi.j a(int i, String str) {
        CounterTextDelegate.Model modelA = CounterTextDelegate.Model.Companion.a(CounterTextDelegate.Model.INSTANCE, "otp-item", b(), new TextLocalisedClause(R$string.credit_application_mortgage_signature_otp_signing_process_password, u.c(str), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new o4(new TextLocalisedClause(R$string.credit_application_mortgage_signature_otp_signing_process_restart, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_retry, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, 0, 0, 4064);
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        return modelA;
    }

    public final v4 b() {
        return new v4(new UrlImage(this.f262118a.e.f317775c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        koi.j jVarA;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        yy3.h hVar = this.f262118a.e;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_mortgage_signature_otp_title, u.c(hVar.f317773a), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_mortgage_signature_otp_description, u.c(hVar.f317774b), null, 12);
        x xVar = domainState.e;
        String str = domainState.f262101b;
        int i = p.f262117a[xVar.ordinal()];
        if (i == 1 || i == 2) {
            ChronoUnit chronoUnit = ChronoUnit.SECONDS;
            LocalDateTime localDateTime = domainState.f;
            LocalDateTime localDateTime2 = domainState.f262102c;
            int iBetween = (int) chronoUnit.between(localDateTime, localDateTime2);
            int iMax = (int) Math.max(0L, chronoUnit.between(domainState.d, localDateTime2));
            CounterTextDelegate.Model modelA = CounterTextDelegate.Model.Companion.a(CounterTextDelegate.Model.INSTANCE, "otp-item", b(), new TextLocalisedClause(R$string.credit_application_mortgage_signature_otp_signing_process_password, u.c(str), null, 12), new TextLocalisedClause(R$string.credit_application_mortgage_signature_otp_signing_process_status_active, null, null, 14), new p4(iMax, iBetween, new TextLocalisedClause(R$string.credit_application_mortgage_signature_otp_signing_process_expires_in, u.c(Integer.valueOf(iMax)), null, 12)), null, 0, 0, 4064);
            yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
            jVarA = modelA;
        } else if (i == 3) {
            jVarA = a(R$string.credit_application_mortgage_signature_otp_signing_process_status_expired, str);
        } else if (i == 4) {
            jVarA = a(R$string.credit_application_mortgage_signature_otp_signing_process_status_failed, str);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            jVarA = a(R$string.credit_application_mortgage_signature_otp_signing_process_status_cancelled, str);
        }
        return new j(textLocalisedClause, textLocalisedClause2, u.c(jVarA));
    }
}
