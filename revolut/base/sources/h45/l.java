package h45;

import android.text.InputFilter;
import aw0.o9;
import aw0.t0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.AddExternalAccountControllerContract$InputData;
import ip0.lr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddExternalAccountControllerContract$InputData f149322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i45.a f149323b;

    public l(AddExternalAccountControllerContract$InputData inputData, i45.a ibanValidator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(ibanValidator, "ibanValidator");
        this.f149322a = inputData;
        this.f149323b = ibanValidator;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_external_account_title, null, null, 14);
        AddExternalAccountControllerContract$InputData addExternalAccountControllerContract$InputData = this.f149322a;
        TextLocalisedClause textLocalisedClause2 = addExternalAccountControllerContract$InputData.f70293b ? new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_external_account_description, null, null, 14) : null;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_external_account_confirm_button, null, null, 14);
        x35.h hVar = domainState.f149316a;
        boolean z = hVar.f302658a.length() > 0 && this.f149323b.validate(hVar).f316033b.isEmpty();
        InputTextDelegate.Model model = new InputTextDelegate.Model("iban_number_input_list_id", new TextClause(hVar.a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_external_account_iban_label, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, new lr(4097), 0, null, null, false, false, null, null, true, u.c(new InputFilter.AllCaps()), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1612709912, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("external_account_user_name_list_id", new t0((Clause) new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_external_account_user_details_name, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), new TextClause(addExternalAccountControllerContract$InputData.f70292a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new j(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, v.k(model, model2), z);
    }
}
