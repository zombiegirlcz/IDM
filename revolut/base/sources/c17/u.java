package c17;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.onboarding.validation.OnboardingInputDataValidator$ValidationState;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements cli.n {
    public u(a freelancerWebsiteMapper) {
        Intrinsics.checkNotNullParameter(freelancerWebsiteMapper, "freelancerWebsiteMapper");
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Clause clause;
        TextLocalisedClause textLocalisedClause;
        int i;
        int i2;
        int i3;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        OnboardingInputDataValidator$ValidationState onboardingInputDataValidator$ValidationState = domainState.d;
        o oVar = domainState.f20388a;
        if ((onboardingInputDataValidator$ValidationState instanceof OnboardingInputDataValidator$ValidationState.Empty) || (onboardingInputDataValidator$ValidationState instanceof OnboardingInputDataValidator$ValidationState.Valid) || (onboardingInputDataValidator$ValidationState instanceof OnboardingInputDataValidator$ValidationState.Loading)) {
            clause = null;
        } else {
            if (!(onboardingInputDataValidator$ValidationState instanceof OnboardingInputDataValidator$ValidationState.NotValid)) {
                throw new NoWhenBranchMatchedException();
            }
            clause = ((OnboardingInputDataValidator$ValidationState.NotValid) onboardingInputDataValidator$ValidationState).f74004b;
        }
        boolean z = onboardingInputDataValidator$ValidationState instanceof OnboardingInputDataValidator$ValidationState.Valid;
        boolean z3 = onboardingInputDataValidator$ValidationState instanceof OnboardingInputDataValidator$ValidationState.Loading;
        if (z3) {
            textLocalisedClause = null;
        } else {
            int i5 = t.f20411a[oVar.ordinal()];
            if (i5 == 1) {
                i3 = R$string.freelancer_business_website_action_submit;
            } else if (i5 == 2) {
                i3 = R$string.freelancer_common_action_continue;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R$string.freelancer_common_action_save;
            }
            textLocalisedClause = new TextLocalisedClause(i3, null, null, 14);
        }
        k kVar = new k(z, textLocalisedClause, z3 ? new AnimatedResourceImage(R$drawable.uikit_icn_48_loading_anim, 12, (Clause) null, Integer.valueOf(R$attr.uikit_colorWhite)) : null);
        boolean z4 = domainState.e;
        int[] iArr = t.f20411a;
        int i6 = iArr[oVar.ordinal()];
        if (i6 == 1) {
            i = R$string.freelancer_business_website_header_ecommerce_title;
        } else if (i6 == 2) {
            i = R$string.freelancer_business_website_header_title;
        } else {
            if (i6 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.freelancer_business_website_header_editing_title;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, null, null, 14);
        int i21 = iArr[oVar.ordinal()];
        if (i21 == 1) {
            i2 = R$string.freelancer_business_website_header_ecommerce_caption;
        } else {
            if (i21 != 2 && i21 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.freelancer_business_website_header_caption;
        }
        m mVar = new m(new CompositeClause(v.k(new TextLocalisedClause(i2, null, null, 14), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "ITEM_ID_SUBTITLE_LEARN_MORE", false), 10)), null, null, null, 14), textLocalisedClause2, v.l(z4 ? new TextNavBarMenuItem("ITEM_ID_MENU_SKIP", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_skip, null, null, 14), null, null, 12) : null));
        String str = domainState.f20389b;
        TextLocalisedClause textLocalisedClause3 = textLocalisedClause;
        List listC = zhm.u.c(new InputTextDelegate.Model("ITEM_ID_WEBSITE_INPUT", str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextLocalisedClause(R$string.freelancer_business_website_input_title, null, null, 14), null, clause, null, null, false, null, clause != null, false, 16, true, 0, false, true, true, null, false, false, 0, false, false, null, -1226965128, 131071));
        yp0.b.q(listC, 0, 0, 0, 0, 15);
        return new n(mVar, listC, kVar, new l(oVar == o.E_COMMERCE ? new TextLocalisedClause(R$string.freelancer_business_website_footer_ecommerce_caption, v.l(textLocalisedClause3), null, 12) : null));
    }
}
