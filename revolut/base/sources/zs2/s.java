package zs2;

import aw0.v4;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.business.referrals.shared.impl.R$string;
import com.revolut.tracking.v3.ReferralsContext;
import d9.t0;
import grl.a9;
import grl.b4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements cli.n {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vu.g f324803a;

    public s(vu.g resourceProvider) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.f324803a = resourceProvider;
    }

    public static w0 a(a9 a9Var) {
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        ReferralsContext.a aVarNewBuilder = ReferralsContext.newBuilder();
        aVarNewBuilder.c();
        ((ReferralsContext) aVarNewBuilder.f49761b).setShareOption(a9Var);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listC;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f324792a;
        vu.g gVar = this.f324803a;
        if (z) {
            listC = (List) iii.c.f(domainState.f324794c, new zr2.o(9), new znc.j(28), new zhl.l(domainState, this, 9));
        } else {
            n5j.b bVar = (n5j.b) gVar;
            ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("NO_PERMISSION_LIST_ID", new TextLocalisedClause(bVar.b(vu.f.business_referrals_invite_contacts_no_permission_widget_title), null, null, 14), new TextLocalisedClause(bVar.b(vu.f.business_referrals_invite_contacts_no_permission_widget_subtitle), null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D082", null, null, null, 30), null, new com.revolut.core.ui_kit.delegates.j(new TextLocalisedClause(bVar.b(vu.f.business_referrals_invite_contacts_no_permission_widget_action), null, null, 14), null, 14), null, null, null, b4.EXPIRED_OR_INVALID_KEY_VALUE);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            listC = u.c(model);
        }
        v4 v4Var = new v4(128.0f);
        gg.b bVar2 = new gg.b(false, 3);
        n5j.b bVar3 = (n5j.b) gVar;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(bVar3.b(vu.f.business_referrals_invite_contacts_copy_link), null, null, 14);
        vu.f fVar = vu.f.referrals_actions_share;
        TextLocalisedClause textLocalisedClauseG = t0.G(textLocalisedClause, bVar3.b(fVar));
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_link;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorAccentNeutral);
        int i2 = R$attr.uikit_colorActionBackgroundNeutral;
        Float fValueOf = Float.valueOf(24.0f);
        return new m(new TextLocalisedClause(R$string.business_referrals_invite_contacts_search_input_placeholder, null, null, 14), listC, u.c(new hg("SHARE_ACTIONS_LIST_ID", v.k(new ReferralContactDelegate.Model("COPY_LINK_LIST_ID", LayeredImage.Companion.b(companion, i, numValueOf, i2, 16.0f, fValueOf, null, 32), textLocalisedClauseG, null, null, null, null, null, null, null, new AnalyticsContext(a(a9.CopyLink)), 262136), new ReferralContactDelegate.Model("WHATS_APP_LIST_ID", LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_logo_whatsapp, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorActionBackgroundNeutral, 16.0f, fValueOf, null, 32), t0.G(new TextLocalisedClause(bVar3.b(vu.f.business_referrals_invite_contacts_whatsapp), null, null, 14), bVar3.b(fVar)), null, null, null, null, null, null, null, new AnalyticsContext(a(a9.WhatsApp)), 262136), new ReferralContactDelegate.Model("MESSENGER_LIST_ID", LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_logo_facebook_messenger, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorActionBackgroundNeutral, 16.0f, fValueOf, null, 32), t0.G(new TextLocalisedClause(bVar3.b(vu.f.business_referrals_invite_contacts_messenger), null, null, 14), bVar3.b(fVar)), null, null, null, null, null, null, null, new AnalyticsContext(a(a9.Messenger)), 262136), new ReferralContactDelegate.Model("MORE_LIST_ID", LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_share_ios, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorActionBackgroundNeutral, 16.0f, fValueOf, null, 32), t0.G(new TextLocalisedClause(bVar3.b(vu.f.business_referrals_invite_contacts_more), null, null, 14), bVar3.b(fVar)), null, null, null, null, null, null, null, new AnalyticsContext(a(a9.More)), 262136)), 4, v4Var, null, bVar2, false, false, null, null, 0, 0, 0, 0, 32720)));
    }
}
