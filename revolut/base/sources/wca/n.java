package wca;

import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.z3;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pix.api.model.TokenVerificationRequest;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.screens.token_verification.TokenVerificationScreenContract$InputData;
import grl.b4;
import ip0.bb;
import ip0.ck0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TokenVerificationScreenContract$InputData f296380a;

    public n(TokenVerificationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f296380a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        TextLocalisedClause textLocalisedClause;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TokenVerificationRequest tokenVerificationRequest = this.f296380a.f80763c;
        if (tokenVerificationRequest instanceof TokenVerificationRequest.Email) {
            i = R$string.pix_verify_ownership_email_subtitle;
        } else {
            if (!(tokenVerificationRequest instanceof TokenVerificationRequest.Phone)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.pix_verify_ownership_phone_subtitle;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, u.c(tokenVerificationRequest.getF80486a()), null, 12);
        String str = domainState.f296366a;
        long j2 = domainState.f296368c;
        List listL = v.l(str != null ? new TextDelegate.Model("debug_code", new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), true, new ck0(0), str, null, 0, 0, 0, 0, b4.EXPIRED_OR_INVALID_KEY_VALUE) : null);
        z3 z3Var = new z3("otp", domainState.f296367b, null, null, false, bb.START, false, false, 0, 0, R$attr.uikit_dp16, 0, 2972);
        b.Companion companion = kotlin.time.b.INSTANCE;
        companion.getClass();
        if (kotlin.time.b.d(j2, 0L)) {
            textLocalisedClause = new TextLocalisedClause(R$string.pix_verify_ownership_button_resend, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.pix_verify_ownership_resend_code, u.c(d0.b0(String.valueOf(kotlin.time.b.n(j2, pkm.e.MINUTES)), 2, '0') + ":" + d0.b0(String.valueOf(kotlin.time.b.n(j2, pkm.e.SECONDS) % ((long) 60)), 2, '0')), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
        }
        TextLocalisedClause textLocalisedClause3 = textLocalisedClause;
        ck0 ck0Var = new ck0(0);
        companion.getClass();
        return new g(textLocalisedClause2, zhm.d0.E0(v.k(z3Var, new TextDelegate.Model("countdown", textLocalisedClause3, kotlin.time.b.d(j2, 0L), ck0Var, null, null, 0, 0, 0, 0, 2032)), listL));
    }
}
