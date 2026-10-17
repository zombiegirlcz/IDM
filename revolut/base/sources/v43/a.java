package v43;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_payment_method.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import mae.o;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f285933a;

    public a(o subscriptionsItemMapper) {
        Intrinsics.checkNotNullParameter(subscriptionsItemMapper, "subscriptionsItemMapper");
        this.f285933a = subscriptionsItemMapper;
    }

    public static TextLocalisedClause a(wi0.b bVar, boolean z) {
        if (com.bumptech.glide.d.p(bVar)) {
            return new TextLocalisedClause(z ? R$string.card_payment_method_eea_all_accounts_crypto_confirm_description : R$string.card_payment_method_eea_crypto_pocket_confirm_description, v.k(new TextLocalisedClause(R$string.card_payment_method_crypto_terms_description, null, new Click(28, (Integer) null, (Object) bVar, "EEA_DESCRIPTION_CRYPTO_TERMS", false), 10), new TextLocalisedClause(R$string.card_payment_method_personal_terms_description, null, new Click(28, (Integer) null, (Object) bVar, "EEA_DESCRIPTION_PERSONAL_TERMS", false), 10)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
        }
        return new TextLocalisedClause(z ? R$string.card_payment_method_all_accounts_crypto_confirm_description : R$string.card_payment_method_crypto_pocket_confirm_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
    }
}
