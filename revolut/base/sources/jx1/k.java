package jx1;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.z3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.code.ui.ApmCodeControllerContract$InputData;
import ip0.bb;
import ip0.ck0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmCodeControllerContract$InputData f179050a;

    public k(ApmCodeControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f179050a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        char c2;
        String str;
        TextLocalisedClause textLocalisedClause;
        String str2;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ApmCodeControllerContract$InputData apmCodeControllerContract$InputData = this.f179050a;
        Clause textLocalisedClause2 = apmCodeControllerContract$InputData.d;
        TextDelegate.Model model = null;
        if (textLocalisedClause2 == null) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.apm_otp_title, u.c(Integer.valueOf(apmCodeControllerContract$InputData.f61834a.a())), null, 12);
        }
        od0.a aVar = od0.a.f224253a;
        Clause[] elements = {domainState.f179042a, (!od0.a.e() || (str2 = domainState.d) == null) ? null : new TextClause("Your OTP is ".concat(str2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        CompositeClause compositeClause = new CompositeClause(kotlin.collections.d.L(elements), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        long j2 = domainState.f179044c;
        boolean z = j2 == 0;
        if (apmCodeControllerContract$InputData.e) {
            if (z) {
                c2 = 1;
                str = "elements";
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.confirmation_code.R$string.confirmation_otp_resend_code_button, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
            } else {
                c2 = 1;
                str = "elements";
                long j3 = 60;
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.confirmation_code.R$string.confirmation_otp_code_timer, u.c((j2 / j3) + ":" + d0.b0(String.valueOf(j2 % j3), 2, '0')), new Custom(Integer.valueOf(R$attr.uikit_colorAccentControlNeutral), false, null, false, null, 254), 8);
            }
            model = new TextDelegate.Model("TIMER_COUNTDOWN_ID", textLocalisedClause, z, new ck0(0), null, null, 0, 0, 0, 0, 2032);
        } else {
            c2 = 1;
            str = "elements";
        }
        z3 z3Var = new z3("INPUT_OTP_ID", domainState.f179043b, apmCodeControllerContract$InputData.f61834a, null, false, bb.START, false, false, 0, 0, R$attr.uikit_dp16, 0, 3032);
        koi.j[] jVarArr = new koi.j[2];
        jVarArr[0] = z3Var;
        jVarArr[c2] = model;
        Intrinsics.checkNotNullParameter(jVarArr, str);
        return new i(textLocalisedClause2, compositeClause, kotlin.collections.d.L(jVarArr));
    }
}
