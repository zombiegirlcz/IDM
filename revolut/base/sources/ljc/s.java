package ljc;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import com.revolut.feature.rewards.impl.R$string;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.select_payment.RentAndBillsSelectPaymentScreenContract$InputData;
import java.util.List;
import koe.y;
import kotlin.jvm.internal.Intrinsics;
import lfg.z;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ojc.f f195647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final njc.b f195648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RentAndBillsSelectPaymentScreenContract$InputData f195649c;

    public s(ojc.f rentAndBillsSelectPaymentItemsMapper, njc.b rentAndBillsPaymentSearchFilterer, ojc.g rentAndBillsSubtitleMapper, RentAndBillsSelectPaymentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(rentAndBillsSelectPaymentItemsMapper, "rentAndBillsSelectPaymentItemsMapper");
        Intrinsics.checkNotNullParameter(rentAndBillsPaymentSearchFilterer, "rentAndBillsPaymentSearchFilterer");
        Intrinsics.checkNotNullParameter(rentAndBillsSubtitleMapper, "rentAndBillsSubtitleMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f195647a = rentAndBillsSelectPaymentItemsMapper;
        this.f195648b = rentAndBillsPaymentSearchFilterer;
        this.f195649c = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(t1.t(domainState.f195623b, domainState.d), new z(29), new l9j.j(27), new y(this, domainState, 15));
        boolean z = domainState.e != null;
        RentAndBillsSelectPaymentScreenContract$InputData rentAndBillsSelectPaymentScreenContract$InputData = this.f195649c;
        egc.a categoryType = rentAndBillsSelectPaymentScreenContract$InputData.f84983a;
        RentAndBillsConfigurations.Configuration perkConfiguration = rentAndBillsSelectPaymentScreenContract$InputData.f84984b;
        Intrinsics.checkNotNullParameter(categoryType, "categoryType");
        Intrinsics.checkNotNullParameter(perkConfiguration, "perkConfiguration");
        RentAndBillsConfigurations.Configuration.PaymentCriteria paymentCriteria = perkConfiguration.d;
        dj0.d dVar = paymentCriteria.f84782a;
        dj0.d dVar2 = paymentCriteria.f84783b;
        TextLocalisedClause textLocalisedClause = null;
        if (dVar != null && dVar2 != null) {
            textLocalisedClause = new TextLocalisedClause(mra.d.E(categoryType, R$string.rent_and_bills_select_payment_rent_subtitle_min_max, R$string.rent_and_bills_select_payment_bills_subtitle_min_max), v.k(sx4.f.b(3, null, null, dVar), sx4.f.b(3, null, null, dVar2)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
        } else if (dVar != null) {
            textLocalisedClause = new TextLocalisedClause(mra.d.E(categoryType, R$string.rent_and_bills_select_payment_rent_subtitle_min, R$string.rent_and_bills_select_payment_bills_subtitle_min), u.c(sx4.f.b(3, null, null, dVar)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
        } else if (dVar2 != null) {
            textLocalisedClause = new TextLocalisedClause(mra.d.E(categoryType, R$string.rent_and_bills_select_payment_rent_subtitle_max, R$string.rent_and_bills_select_payment_bills_subtitle_max), u.c(sx4.f.b(3, null, null, dVar2)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
        }
        return new l(textLocalisedClause, list, z);
    }
}
