package rlj;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingServiceProvider;
import com.revolut.retail.feature.esim.impl.R$string;
import java.util.List;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import yp0.r;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static InputTextDelegate.Model a(EsimPhoneNumberPortingServiceProvider esimPhoneNumberPortingServiceProvider) {
        String str;
        return r.a(new InputTextDelegate.Model("ID_NUMBER_TRANSFER_SERVICE_PROVIDER_PICKER", (esimPhoneNumberPortingServiceProvider == null || (str = esimPhoneNumberPortingServiceProvider.f100398b) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_service_provider_picker_title, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
    }
}
