package fz2;

import android.os.Parcelable;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        int i = 6;
        List listK = v.k(new RowDelegate.Model("DONT_TRUST", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_merchant, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_unknown_retailers_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_unknown_retailers_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("PROTECT_FROM_FRAUD", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_card_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, 6), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_fraud_protection_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_fraud_protection_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("REFUNDS_WORRY", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, i), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_refunds_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_refunds_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listK, 0, R$attr.uikit_dp8, 0, 0, 29);
        return new fz2.a(d0.E0(yp0.b.g(v.k(new RowDelegate.Model("SINGLE_USE", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_cart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, i), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_single_use_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_single_use_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("RENTAL_OR_HOTEL", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_reverted, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, i), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_car_rentals_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_car_rentals_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("SAVE_AT_CHECKOUT", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_cards, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, i), new TextLocalisedClause(R$string.cards_home_widget_help_disposable_save_card_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cards_home_widget_help_disposable_save_card_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)), new ListSubheaderDelegate.Model("WHEN_TO_USE_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.cards_home_widget_help_disposable_when_to_use, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, R$attr.uikit_dp24, LDSFile.EF_DG4_TAG), listK));
    }
}
