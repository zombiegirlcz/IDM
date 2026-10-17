package o8i;

import bw0.l;
import bw0.m;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardPaymentDetails;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature_move_money.api.model.AccountSource;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n8i.a0;
import n8i.b0;
import n8i.c0;
import n8i.d0;
import n8i.e0;
import n8i.v;
import nrd.i;
import q6i.q;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm4.c f223036a;

    public f(e moveMoneyCreditCardLocalizationProvider, dm4.c creditCardRepayAmountItemsMapper) {
        Intrinsics.checkNotNullParameter(moveMoneyCreditCardLocalizationProvider, "moveMoneyCreditCardLocalizationProvider");
        Intrinsics.checkNotNullParameter(creditCardRepayAmountItemsMapper, "creditCardRepayAmountItemsMapper");
        this.f223036a = creditCardRepayAmountItemsMapper;
    }

    @Override // n8i.e0
    public final List a(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return (List) iii.c.f(data, new o3k.a(this, 20), new o4a.a(20), new i(this, 14));
    }

    @Override // n8i.e0
    public final Clause b(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        v vVar = (v) data.getContent();
        return (vVar == null || !vVar.d) ? new TextLocalisedClause(R$string.credit_card_topup_action_pay, null, null, 14) : new TextLocalisedClause(R$string.credit_card_topup_action_review_payment, null, null, 14);
    }

    @Override // n8i.e0
    public final Clause c(Data data) {
        Data data2;
        TextLocalisedClause textLocalisedClauseA;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Object content = data.getContent();
            if (content != null) {
                v vVar = (v) content;
                CreditCardPaymentDetails creditCardPaymentDetails = vVar.f213474a;
                dj0.d dVar = creditCardPaymentDetails.f68748t;
                dj0.d dVar2 = creditCardPaymentDetails.f68739h;
                if (!dVar.f(dj0.d.e)) {
                    return null;
                }
                dj0.d dVar3 = vVar.f213475b;
                textLocalisedClauseA = dVar3.f115082a <= 0 ? e.a(vVar.e, dVar2, dVar) : (dVar3.compareTo(dVar2) < 0 || !vVar.d) ? dVar3.compareTo(dVar2) >= 0 ? new TextLocalisedClause(R$string.credit_card_topup_info_interest_saved, u.c(sx4.f.b(3, null, null, dVar)), null, 12) : new TextLocalisedClause(R$string.credit_card_topup_info_estimated_interest, u.c(sx4.f.b(3, null, null, dVar)), null, 12) : new TextLocalisedClause(R$string.credit_card_topup_info_interest_saved_short, u.c(sx4.f.b(3, null, null, dVar)), null, 12);
            } else {
                textLocalisedClauseA = null;
            }
            data2 = new Data(textLocalisedClauseA, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            data2 = new Data(null, th10, data.getLoading());
        }
        return (Clause) data2.getContent();
    }

    @Override // n8i.e0
    public final Clause e(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new TextLocalisedClause(R$string.credit_card_topup_title, null, null, 14);
    }

    @Override // n8i.e0
    public final c0 f(d0 errorModel) {
        yqi.b bVar;
        Intrinsics.checkNotNullParameter(errorModel, "errorModel");
        x5i.a aVar = errorModel.f213415b;
        AccountSource accountSource = aVar.f302980b.d;
        AccountSource.CreditCardSource creditCardSource = accountSource instanceof AccountSource.CreditCardSource ? (AccountSource.CreditCardSource) accountSource : null;
        if (creditCardSource != null && (bVar = aVar.f302981c) != null) {
            TextLocalisedClause textLocalisedClause = bVar instanceof j6i.g ? new TextLocalisedClause(R$string.credit_card_topup_info_maximum_amount, u.c(sx4.f.b(3, null, null, creditCardSource.f97193b.f68742m)), null, 12) : null;
            if (textLocalisedClause != null) {
                return new a0(new m(textLocalisedClause, l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, new q(bVar)));
            }
        }
        return b0.f213405a;
    }
}
