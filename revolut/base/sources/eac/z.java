package eac;

import cie.l1;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.management.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class z implements cli.n {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gac.i f124186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gac.j f124187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gac.g f124188c;

    public z(gac.i revolutPayPreferencesSectionMapper, gac.j shopsWithRevolutPaySectionMapper, gac.g revPointsBannerSectionMapper, cm9.a payWithSmileSettingsItemsMapper) {
        Intrinsics.checkNotNullParameter(revolutPayPreferencesSectionMapper, "revolutPayPreferencesSectionMapper");
        Intrinsics.checkNotNullParameter(shopsWithRevolutPaySectionMapper, "shopsWithRevolutPaySectionMapper");
        Intrinsics.checkNotNullParameter(revPointsBannerSectionMapper, "revPointsBannerSectionMapper");
        Intrinsics.checkNotNullParameter(payWithSmileSettingsItemsMapper, "payWithSmileSettingsItemsMapper");
        this.f124186a = revolutPayPreferencesSectionMapper;
        this.f124187b = shopsWithRevolutPaySectionMapper;
        this.f124188c = revPointsBannerSectionMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f;
        Data biometricPaymentsSettings = domainState.e;
        p pVar = new p(z ? new TextLocalisedClause(R$string.revolut_pay_management_home_title_v2, null, null, 14) : new TextLocalisedClause(R$string.revolut_pay_management_home_title, null, null, 14), zhm.u.c(new IconNavBarMenuItem("INFO_ICON_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.revolut_pay_management_home_info_accessibility, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)));
        aim.e eVarB = zhm.u.b();
        Intrinsics.checkNotNullParameter(biometricPaymentsSettings, "settings");
        qv0.i iVar = (qv0.i) iii.c.f(biometricPaymentsSettings, new cjj.j(20), new clk.b(1), new l1(4));
        if (iVar != null) {
            eVarB.add(iVar);
        }
        Data selectedPaymentMethodData = domainState.f124167c;
        Data selectedShippingContactData = domainState.d;
        boolean z3 = domainState.f;
        Intrinsics.checkNotNullParameter(selectedPaymentMethodData, "selectedPaymentMethodData");
        Intrinsics.checkNotNullParameter(selectedShippingContactData, "selectedShippingContactData");
        Intrinsics.checkNotNullParameter(biometricPaymentsSettings, "biometricPaymentsSettings");
        Data dataT = t1.t(selectedPaymentMethodData, selectedShippingContactData);
        gac.i iVar2 = this.f124186a;
        eVarB.addAll((List) iii.c.f(dataT, new g64.c(iVar2, 28), new g5k.f(15), new a4b.i(iVar2, z3, biometricPaymentsSettings, 9)));
        Data promotedMerchants = domainState.f124165a;
        Intrinsics.checkNotNullParameter(promotedMerchants, "promotedMerchants");
        gac.j jVar2 = this.f124187b;
        eVarB.addAll((List) iii.c.f(promotedMerchants, new g64.c(jVar2, 29), new g5k.f(16), new fq7.k(jVar2, 16)));
        Data revPointsFeatureState = domainState.f124166b;
        Intrinsics.checkNotNullParameter(revPointsFeatureState, "revPointsFeatureState");
        eVarB.addAll((List) iii.c.f(revPointsFeatureState, new g64.c(27), new g5k.f(14), new fnk.o(this.f124188c, 23)));
        return new q(pVar, zhm.u.a(eVarB));
    }
}
