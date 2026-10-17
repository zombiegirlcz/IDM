package jz6;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.onboarding.validation.OnboardingInputDataValidator$ValidationState;
import ip0.pr;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.models.Style, java.util.List] */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Object obj2;
        Clause clause;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextClause textClause = new TextClause(domainState.f179589a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_business_description_input_title, null, null, 14);
        OnboardingInputDataValidator$ValidationState onboardingInputDataValidator$ValidationState = domainState.f179590b;
        if ((onboardingInputDataValidator$ValidationState instanceof OnboardingInputDataValidator$ValidationState.Empty) || (onboardingInputDataValidator$ValidationState instanceof OnboardingInputDataValidator$ValidationState.Loading) || (onboardingInputDataValidator$ValidationState instanceof OnboardingInputDataValidator$ValidationState.Valid)) {
            obj2 = null;
            clause = null;
        } else {
            if (!(onboardingInputDataValidator$ValidationState instanceof OnboardingInputDataValidator$ValidationState.NotValid)) {
                throw new NoWhenBranchMatchedException();
            }
            clause = ((OnboardingInputDataValidator$ValidationState.NotValid) onboardingInputDataValidator$ValidationState).f74004b;
            obj2 = null;
        }
        ?? r72 = obj2;
        List listC = u.c(new InputTextDelegate.Model("ITEM_ID_DESCRIPTION_TEXT_INPUT", textClause, textLocalisedClause, null, false, null, false, clause, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, pr.f165860a, false, true, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -620757128, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        boolean z = onboardingInputDataValidator$ValidationState instanceof OnboardingInputDataValidator$ValidationState.Valid;
        boolean z3 = onboardingInputDataValidator$ValidationState instanceof OnboardingInputDataValidator$ValidationState.Loading;
        return new l(listC, new k(new TextLocalisedClause(R$string.freelancer_business_description_footer_caption, u.c(new TextLocalisedClause(R$string.freelancer_business_description_footer_revolut_business, r72, new Click(30, (Integer) null, (Object) null, "ITEM_ID_BUSINESS_LINK", false), 10)), r72, 12)), new j(z, !z3 ? new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, r72, r72, 14) : r72, z3 ? new AnimatedResourceImage(R$drawable.uikit_icn_48_loading_anim, 12, (Clause) r72, Integer.valueOf(R$attr.uikit_colorWhite)) : r72));
    }
}
