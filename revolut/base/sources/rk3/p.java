package rk3;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.z3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.confirmation_code.R$string;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreenContract$InputData;
import ip0.ab;
import ip0.bb;
import ip0.ck0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mx0.d8;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ESignOtpScreenContract$InputData f254746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z80.b f254747b;

    public p(ESignOtpScreenContract$InputData inputData, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f254746a = inputData;
        this.f254747b = phoneToolsProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.d;
        long j2 = domainState.f254731c;
        ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData = this.f254746a;
        Image image = (eSignOtpScreenContract$InputData.d || z) ? eSignOtpScreenContract$InputData.f65955h : null;
        Clause textLocalisedClause2 = eSignOtpScreenContract$InputData.f;
        if (textLocalisedClause2 == null) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.confirmation_otp_title, null, null, 14);
        }
        Clause clause = textLocalisedClause2;
        Clause textLocalisedClause3 = eSignOtpScreenContract$InputData.f65954g;
        if (textLocalisedClause3 == null) {
            textLocalisedClause3 = new TextLocalisedClause(R$string.confirmation_otp_subtitle, u.c(z80.b.b(this.f254747b, domainState.f254729a, null, null, 6)), null, 12);
        }
        Clause clause2 = textLocalisedClause3;
        z3 z3Var = new z3("input_otp_id", domainState.f254730b, ab.DIGITS_8, null, false, bb.START, false, false, 0, 0, R$attr.uikit_dp16, 0, 3032);
        if (j2 == 0) {
            textLocalisedClause = new TextLocalisedClause(R$string.confirmation_otp_resend_code_button, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        } else {
            long j3 = 60;
            textLocalisedClause = new TextLocalisedClause(R$string.confirmation_otp_code_timer, u.c((j2 / j3) + ":" + d0.b0(String.valueOf(j2 % j3), 2, '0')), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
        }
        List listK = v.k(z3Var, new TextDelegate.Model("timer_countdown_id", textLocalisedClause, j2 == 0, new ck0(0), null, null, 0, 0, 0, 0, 2032));
        String str = domainState.e;
        return new k(clause2, clause, image, listK, str == null ? f0.f322471a : u.c(new d8("code_from_messages_id", new TextLocalisedClause(R$string.confirmation_otp_suggestion_from_messages, u.c(str), null, 12), null, 60)));
    }
}
