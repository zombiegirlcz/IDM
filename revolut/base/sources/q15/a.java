package q15;

import android.os.Parcelable;
import com.bumptech.glide.d;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.list.CreditBottomSheetListItemsController;
import com.revolut.feature.credit.help.api.dialog_factory.GetHelpDialogFactory$Result;
import grl.k9;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ux4.k;
import wi0.b;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements g15.a {

    @NotNull
    public static final C1332a Companion = new C1332a();

    /* JADX INFO: renamed from: q15.a$a, reason: collision with other inner class name */
    public static final class C1332a {
        private C1332a() {
        }
    }

    public static LayeredImage b(int i) {
        return LayeredImage.Companion.a(LayeredImage.INSTANCE, i, new Color.Solid(R$attr.uikit_colorAccentNeutral), new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorAccentNeutral), 0.1f), 8.0f, Float.valueOf(24.0f), 32);
    }

    @Override // g15.a
    public final CreditBottomSheetListItemsController a(k creditFacility, String str, b countryCode) {
        Intrinsics.checkNotNullParameter(creditFacility, "creditFacility");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.credit_card_details_dialog_help_title, null, null, 14), null, null, null, false, 30);
        List listK = v.k(new RowDelegate.Model("id-credit-help", new RowDelegate.Model.MainImage.Image40(b(R$drawable.uikit_icn_24_help_chat), null, null, false, null, false, 60), new TextLocalisedClause(R$string.credit_card_details_dialog_help_credit_help, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new GetHelpDialogFactory$Result.Faq(str), null, 0, 0, 0, 0, 532676600), new RowDelegate.Model("id-financial-difficulties", new RowDelegate.Model.MainImage.Image40(b(R$drawable.uikit_icn_24_coins), null, null, false, null, false, 60), d.o(countryCode) ? new TextLocalisedClause(R$string.credit_support_financial_difficulties_co_title, null, null, 14) : new TextLocalisedClause(R$string.credit_support_financial_difficulties_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new GetHelpDialogFactory$Result.FinancialDifficulties(creditFacility), null, 0, 0, 0, 0, 532676600));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("id-action-cancel", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_common_cancel, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, R$attr.uikit_dp16, 0, 0, 0, 14);
        ArrayList arrayListF0 = d0.F0(model, listK);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new CreditBottomSheetListItemsController(new cy4.a(aVar, arrayListF0, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
    }
}
