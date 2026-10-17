package er4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelParcel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardSectionModel;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ll4.r;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements fr4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f128537a;

    public f(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f128537a = uiKitResources;
    }

    @Override // fr4.g
    public final List a(r rates, xw4.a paymentState, boolean z) {
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        if (paymentState == xw4.a.TERMINATED) {
            return f0.f322471a;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_details_section_title_rates_info, null, null, 14);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_percent, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62);
        tf tfVar = new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_details_section_title_rates, null, null, 14);
        f01.c cVar = this.f128537a;
        String string = cVar.b(textLocalisedClause2).toString();
        List list = rates.f;
        if (list == null) {
            list = f0.f322471a;
        }
        List listC = u.c(new RowDelegate.Model("id_credit_card_rates_details_section", image40, textLocalisedClause, null, 0, null, null, null, 0, tfVar, false, null, false, null, null, null, null, null, null, new CreditCardModelParcel.DialogParcel(new CreditCardDialogModel(string, null, cVar.b(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14)).toString(), u.c(new CreditCardSectionModel(list)), null)), null, 0, 0, 0, 0, 532675576));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }
}
