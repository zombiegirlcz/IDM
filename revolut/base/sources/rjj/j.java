package rjj;

import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelectionOptions;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_choose_number.EsimMobilePlanChooseNumberScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanChooseNumberScreenContract$InputData f254687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f254688b;

    public j(EsimMobilePlanChooseNumberScreenContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f254687a = inputData;
        this.f254688b = featureToggleInteractor;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        EsimMobilePlanChooseNumberScreenContract$InputData esimMobilePlanChooseNumberScreenContract$InputData = this.f254687a;
        EsimPhoneNumberSelections esimPhoneNumberSelections = esimMobilePlanChooseNumberScreenContract$InputData.f101183a;
        EsimGiftRecipient esimGiftRecipient = esimMobilePlanChooseNumberScreenContract$InputData.f101184b;
        EsimPhoneNumberSelectionOptions esimPhoneNumberSelectionOptions = esimPhoneNumberSelections.f100408b;
        EsimPhoneNumberSelectionOptions esimPhoneNumberSelectionOptions2 = esimPhoneNumberSelections.f100408b;
        TextLocalisedClause textLocalisedClause = null;
        qv0.i[] elements = {esimPhoneNumberSelectionOptions.f100404a != null ? new RowDelegate.Model("ID_NUMBER_PORTING", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_arrow_right_left, R$attr.uikit_colorForeground, R$attr.uikit_colorActionBackgroundNeutral), null, null, false, null, false, 62), new TextLocalisedClause(R$string.esim_mobile_plan_choose_number_item_transfer_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.esim_mobile_plan_choose_number_item_transfer_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872) : null, esimPhoneNumberSelectionOptions2.f100406c != null ? new RowDelegate.Model("ID_NUMBER_FEATURED", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_star_solid, R$attr.uikit_colorForeground, R$attr.uikit_colorActionBackgroundNeutral), null, null, false, null, false, 62), new TextLocalisedClause(R$string.esim_mobile_plans_add_number_vip_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.esim_mobile_plans_add_number_vip_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872) : null, esimPhoneNumberSelectionOptions2.f100405b != null ? new RowDelegate.Model("ID_NUMBER_RANDOM", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_arrow_shuffle, R$attr.uikit_colorForeground, R$attr.uikit_colorActionBackgroundNeutral), null, null, false, null, false, 62), new TextLocalisedClause(R$string.esim_mobile_plan_choose_number_item_random_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.esim_mobile_plan_choose_number_item_random_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        TextLocalisedClause textLocalisedClause2 = esimGiftRecipient != null ? new TextLocalisedClause(R$string.esim_mobile_plan_choose_number_header_title_for_recipient, u.c(esimGiftRecipient.d), null, 12) : new TextLocalisedClause(R$string.esim_mobile_plan_choose_number_header_title, null, null, 14);
        if (((jte.d) this.f254688b).c(EsimApi$Toggles.EsimMobilePlanSecondaryNumbers.f100178c) && esimGiftRecipient == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.esim_mobile_plan_choose_number_header_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10);
        }
        return new g(listL, new d(textLocalisedClause2, textLocalisedClause));
    }
}
