package evc;

import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import ip0.nb0;
import ip0.pb0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements cli.n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jla.h f129773a;

    public k(jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f129773a = productCatalogueInteractor;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        RowDelegate.Model model;
        qv0.i model2;
        RowDelegate.Model model3;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        qv0.i[] elements = new qv0.i[4];
        if (this.f129773a.d("security_hub.trusted_merchants", null) == bla.c.ENABLED) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.security_hub_manage_merchants_cell_trusted, null, null, 14);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_check_verification, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 62);
            tf tfVar = new tf(new yy0.h(new TextLocalisedClause(R$string.security_hub_manage_merchants_cell_trusted, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246)));
            int i = R$attr.uikit_dp8;
            model = new RowDelegate.Model("TRUSTED_MERCHANTS_CELL_ID", image40, textLocalisedClause, null, 0, null, null, null, 0, tfVar, false, null, false, null, null, null, null, null, null, null, null, i, i, 0, 0, 486538232);
        } else {
            model = null;
        }
        elements[0] = model;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.security_hub_manage_merchants_cell_blocked, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.profileHome_settings_item_blocked_merchants_subtitle, null, null, 14);
        RowDelegate.Model.MainImage.Image40 image402 = new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_reverted, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 62);
        tf tfVar2 = new tf(new yy0.h(new TextLocalisedClause(R$string.security_hub_manage_merchants_cell_blocked, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246)));
        int i2 = R$attr.uikit_dp8;
        elements[1] = new RowDelegate.Model("BLOCKED_PAYMENTS_CELL_ID", image402, textLocalisedClause2, null, 0, textLocalisedClause3, null, null, 0, tfVar2, false, null, false, null, null, null, null, null, null, null, null, i2, i2, 0, 0, 486538200);
        kuc.d dVar = domainState.f129766a;
        if (dVar instanceof kuc.a) {
            model2 = null;
        } else if (dVar instanceof kuc.b) {
            model2 = nb0.a(pb0.Companion, "GAMBLING_BLOCK_LOADING_CELL_ID", false, 6);
        } else {
            if (!(dVar instanceof kuc.c)) {
                throw new NoWhenBranchMatchedException();
            }
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.security_hub_home_gambling_title, null, null, 14);
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.security_hub_gambling_header_subtitle, null, null, 14);
            RowDelegate.Model.MainImage.Image40 image403 = new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_siren, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 60);
            vf vfVar = new vf(((kuc.c) dVar).f189768a, true);
            int i3 = R$attr.uikit_dp8;
            model2 = new RowDelegate.Model("GAMBLING_BLOCK_CELL_ID", image403, textLocalisedClause4, null, 0, textLocalisedClause5, null, null, 0, vfVar, false, null, false, null, null, null, null, null, null, null, null, i3, i3, 0, 0, 486538200);
        }
        elements[2] = model2;
        if (domainState.f129767b) {
            TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.security_hub_home_trusted_entities, null, null, 14);
            RowDelegate.Model.MainImage.Image40 image404 = new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_secure_seal, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 60);
            tf tfVar3 = new tf(new yy0.h(new TextLocalisedClause(R$string.security_hub_home_trusted_entities, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246)));
            int i5 = R$attr.uikit_dp8;
            model3 = new RowDelegate.Model("TRUSTED_ENTITIES_CELL_ID", image404, textLocalisedClause6, null, 0, null, null, null, 0, tfVar3, false, null, false, null, null, null, null, null, null, null, null, i5, i5, 0, 0, 486538232);
        } else {
            model3 = null;
        }
        elements[3] = model3;
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new i(new TextLocalisedClause(R$string.security_hub_home_payments, null, null, 14), listL);
    }
}
