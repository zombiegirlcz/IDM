package a07;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.impl.R$string;
import et6.l0;
import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements cli.n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.e f161a;

    public t(gr6.e freelancerAvailabilityInteractor, l07.a settingsItemFactory) {
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(settingsItemFactory, "settingsItemFactory");
        this.f161a = freelancerAvailabilityInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Clause textClause;
        AbstractList abstractListA;
        Clause textClause2;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f145h;
        if (data.getContent() == null && data.getLoading()) {
            abstractListA = iii.c.c(3);
        } else {
            aim.e eVarB = u.b();
            aim.e eVarB2 = u.b();
            RowDelegate.Model modelB = null;
            if (Intrinsics.f(data.getContent(), Boolean.TRUE)) {
                RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_company_filled, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_account_settings_items_trading_name_title, null, null, 14);
                String str = domainState.f144g;
                if (str != null) {
                    textClause2 = new TextLocalisedClause(R$string.freelancer_account_settings_items_trading_name_subtitle_status, u.c(str), null, 12);
                } else {
                    String str2 = domainState.f;
                    textClause2 = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                }
                eVarB2.add(new RowDelegate.Model("ITEM_ID_PRO_TRADING_NAME", image24, textLocalisedClause, null, 0, textClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
            }
            RowDelegate.Model.MainImage.Image24 image242 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_mail, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_account_settings_items_email_title, null, null, 14);
            String str3 = domainState.f141a;
            eVarB2.add(new RowDelegate.Model("ITEM_ID_PRO_EMAIL", image242, textLocalisedClause2, null, 0, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
            RowDelegate.Model.MainImage.Image24 image243 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_language, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.freelancer_account_settings_items_website_title, null, null, 14);
            String str4 = domainState.f143c;
            if (str4 != null) {
                textClause = new TextLocalisedClause(R$string.freelancer_account_settings_items_website_pending, u.c(str4), null, 12);
            } else {
                String str5 = domainState.f142b;
                textClause = str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            }
            eVarB2.add(new RowDelegate.Model("ITEM_ID_PRO_URL", image243, textLocalisedClause3, null, 0, textClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
            aim.e eVarA = u.a(eVarB2);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            eVarB.addAll(eVarA);
            l0 l0Var = (l0) this.f161a;
            if (!l0Var.k()) {
                RowDelegate.Model modelA = l07.a.a(domainState.d);
                if (l0Var.b("FREELANCER_POCKETS.vat_reminder")) {
                    FreelancerTaxProfile freelancerTaxProfile = domainState.e;
                    modelB = l07.a.b(freelancerTaxProfile != null ? Boolean.valueOf(freelancerTaxProfile.d) : null);
                }
                qv0.i[] elements = {modelA, modelB};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                eVarB.addAll(listL);
            }
            abstractListA = u.a(eVarB);
        }
        return new k(abstractListA);
    }
}
