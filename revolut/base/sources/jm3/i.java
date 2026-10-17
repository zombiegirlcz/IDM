package jm3;

import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.v3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.a0;
import com.revolut.core.ui_kit.models.h0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.contacts.impl.R$string;
import com.revolut.feature.contacts.impl.ui.profile_card.ContactProfileCardScreenContract$ContactProfileCardInputData;
import hx7.q;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zm3.l;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContactProfileCardScreenContract$ContactProfileCardInputData f175941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f175942b;

    public i(ContactProfileCardScreenContract$ContactProfileCardInputData inputData, c profileCardModelProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(profileCardModelProvider, "profileCardModelProvider");
        this.f175941a = inputData;
        this.f175942b = profileCardModelProvider;
    }

    @Override // cli.n
    public final o c(j jVar) {
        Integer numValueOf;
        AnimatedBackgroundType animatedBackgroundType;
        AnimatedBackgroundType animatedBackgroundType2;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        l contact = this.f175941a.f66015a;
        Intrinsics.checkNotNullParameter(contact, "contact");
        h0 h0Var = new h0(((xl3.d) this.f175942b.f175933a).d(contact, dl3.d.f115697a, true));
        TextClause textClause = new TextClause(q.v(contact), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(n14.e.c(contact.N0()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = R$drawable.uikit_icn_16_copy;
        Float fValueOf = Float.valueOf(16.0f);
        List listK = v.k(textClause2, new ImageClause(i, (Integer) null, fValueOf, fValueOf, 18));
        m70.a.t(t0.f186434a);
        com.revolut.core.ui_kit.models.q qVar = new com.revolut.core.ui_kit.models.q(textClause, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, 8);
        zm3.h hVarD = contact.d();
        switch (hVarD == null ? -1 : b.f175932a[hVarD.ordinal()]) {
            case -1:
            case 5:
            case 6:
            case 7:
                numValueOf = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                numValueOf = Integer.valueOf(R$string.payments_template_profile_card_plan_name_ultra);
                break;
            case 2:
                numValueOf = Integer.valueOf(R$string.payments_template_profile_card_plan_name_metal);
                break;
            case 3:
                numValueOf = Integer.valueOf(R$string.payments_template_profile_card_plan_name_premium);
                break;
            case 4:
                numValueOf = Integer.valueOf(R$string.payments_template_profile_card_plan_name_plus);
                break;
        }
        a0 a0Var = numValueOf != null ? new a0(new TextLocalisedClause(R$string.payments_template_profile_card_explore_plan, u.c(new TextLocalisedClause(numValueOf.intValue(), null, null, 14)), null, 12), null, null, 14) : null;
        zm3.h hVarD2 = contact.d();
        switch (hVarD2 != null ? b.f175932a[hVarD2.ordinal()] : -1) {
            case -1:
            case 5:
            case 6:
                animatedBackgroundType = null;
                return new fpa.g(new ProfileCardModel.Loaded(null, h0Var, qVar, a0Var, animatedBackgroundType, 81), u.c(new CircleActionButtonsBarDelegate.CircleActionButton("SHARE_CONTACT_BUTTON_ID", (Clause) new TextLocalisedClause(R$string.payments_template_profile_card_share_contact, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle) CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.WhiteButton.f52098a, (v3) null, (String) null, false, (Object) null, 496)), null, 4);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                animatedBackgroundType2 = AnimatedBackgroundType.PLAN_ULTRA.f51483a;
                animatedBackgroundType = animatedBackgroundType2;
                return new fpa.g(new ProfileCardModel.Loaded(null, h0Var, qVar, a0Var, animatedBackgroundType, 81), u.c(new CircleActionButtonsBarDelegate.CircleActionButton("SHARE_CONTACT_BUTTON_ID", (Clause) new TextLocalisedClause(R$string.payments_template_profile_card_share_contact, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle) CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.WhiteButton.f52098a, (v3) null, (String) null, false, (Object) null, 496)), null, 4);
            case 2:
                animatedBackgroundType2 = AnimatedBackgroundType.PLAN_METAL.f51479a;
                animatedBackgroundType = animatedBackgroundType2;
                return new fpa.g(new ProfileCardModel.Loaded(null, h0Var, qVar, a0Var, animatedBackgroundType, 81), u.c(new CircleActionButtonsBarDelegate.CircleActionButton("SHARE_CONTACT_BUTTON_ID", (Clause) new TextLocalisedClause(R$string.payments_template_profile_card_share_contact, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle) CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.WhiteButton.f52098a, (v3) null, (String) null, false, (Object) null, 496)), null, 4);
            case 3:
                animatedBackgroundType2 = AnimatedBackgroundType.PLAN_PREMIUM.f51481a;
                animatedBackgroundType = animatedBackgroundType2;
                return new fpa.g(new ProfileCardModel.Loaded(null, h0Var, qVar, a0Var, animatedBackgroundType, 81), u.c(new CircleActionButtonsBarDelegate.CircleActionButton("SHARE_CONTACT_BUTTON_ID", (Clause) new TextLocalisedClause(R$string.payments_template_profile_card_share_contact, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle) CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.WhiteButton.f52098a, (v3) null, (String) null, false, (Object) null, 496)), null, 4);
            case 4:
                animatedBackgroundType2 = AnimatedBackgroundType.PLAN_PLUS.f51480a;
                animatedBackgroundType = animatedBackgroundType2;
                return new fpa.g(new ProfileCardModel.Loaded(null, h0Var, qVar, a0Var, animatedBackgroundType, 81), u.c(new CircleActionButtonsBarDelegate.CircleActionButton("SHARE_CONTACT_BUTTON_ID", (Clause) new TextLocalisedClause(R$string.payments_template_profile_card_share_contact, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle) CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.WhiteButton.f52098a, (v3) null, (String) null, false, (Object) null, 496)), null, 4);
            case 7:
                animatedBackgroundType2 = AnimatedBackgroundType.PLAN_PRIVATE.f51482a;
                animatedBackgroundType = animatedBackgroundType2;
                return new fpa.g(new ProfileCardModel.Loaded(null, h0Var, qVar, a0Var, animatedBackgroundType, 81), u.c(new CircleActionButtonsBarDelegate.CircleActionButton("SHARE_CONTACT_BUTTON_ID", (Clause) new TextLocalisedClause(R$string.payments_template_profile_card_share_contact, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle) CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.WhiteButton.f52098a, (v3) null, (String) null, false, (Object) null, 496)), null, 4);
        }
    }
}
