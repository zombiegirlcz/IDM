package rlj;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import com.revolut.retail.feature.esim.impl.R$string;
import java.util.List;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import yp0.r;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static InputTextDelegate.Model a(EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType) {
        String str;
        return r.a(new InputTextDelegate.Model("ID_NUMBER_TRANSFER_CONTRACT_TYPE_PICKER", (esimPhoneNumberPortingContractType == null || (str = esimPhoneNumberPortingContractType.f100346b) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_current_contract_type_hint, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
    }
}
