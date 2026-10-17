package j4j;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.beneficiary.impl.R$string;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreenContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n3j.p;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountFieldsScreenContract$InputData f171420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f171421b;

    public k(AccountFieldsScreenContract$InputData inputData, n4j.c beneficiaryCreationUtils, b accountFieldsMenuItemsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(beneficiaryCreationUtils, "beneficiaryCreationUtils");
        Intrinsics.checkNotNullParameter(accountFieldsMenuItemsMapper, "accountFieldsMenuItemsMapper");
        this.f171420a = inputData;
        this.f171421b = accountFieldsMenuItemsMapper;
    }

    public static p a(k kVar, Clause clause, TextLocalisedClause textLocalisedClause, UrlImage urlImage, wi0.b bVar, int i) {
        List listA;
        TextLocalisedClause textLocalisedClause2 = (i & 2) != 0 ? null : textLocalisedClause;
        UrlImage urlImage2 = (i & 4) != 0 ? null : urlImage;
        wi0.b bVar2 = (i & 8) != 0 ? null : bVar;
        b bVar3 = kVar.f171421b;
        aim.e eVarB = u.b();
        if (bVar3.f171413a.f99673a.getF99649b().contains(BeneficiaryCreationKompotInputData.CreationConfiguration.AdditionalConfig.HideNavBarMenu.f99630a)) {
            listA = f0.f322471a;
        } else {
            n14.e.b(eVarB, bVar3.f171414b.a());
            eVarB.add(new IconNavBarMenuItem("ID_ACCOUNT_FIELDS_NAVBAR_MENU_HELP", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.payments_beneficiary_creation_help_bottom_sheet_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
            listA = u.a(eVarB);
        }
        return new p(clause, textLocalisedClause2, urlImage2, bVar2, listA);
    }
}
