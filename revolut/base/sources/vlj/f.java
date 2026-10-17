package vlj;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.d5;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.specific_portability_date_picker.EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData f290479a;

    public f(EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData inputData, ugc.a giftRecipientNameResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(giftRecipientNameResolver, "giftRecipientNameResolver");
        this.f290479a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        Set setI1;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData = this.f290479a;
        LocalDate localDateNow = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.f101362c;
        if (localDateNow == null) {
            localDateNow = LocalDate.now();
        }
        LocalDate localDate = localDateNow;
        Intrinsics.h(localDate);
        LocalDate localDate2 = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.f101362c;
        LocalDate localDate3 = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.f101360a;
        Long l2 = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.f101361b;
        LocalDate localDatePlusDays = l2 != null ? LocalDate.now().plusDays(l2.longValue()) : null;
        List list = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.d;
        List listC = u.c(new g5("ID_PHONE_NUMBER_SPECIFIC_PORTABILITY_DATE_PICKER", localDate, localDate2, false, null, localDate3, localDatePlusDays, null, v.l((list == null || (setI1 = d0.i1(list)) == null) ? null : new d5(setI1)), null, 0, 0, 1047352));
        String strF = ugc.a.f(esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.e);
        return new d(listC, new lw0.a(new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_date_of_portability_picker_title, null, null, 14), strF.length() > 0 ? new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_date_of_portability_picker_subtitle_for_recipient, u.c(strF), null, 12) : new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_date_of_portability_picker_subtitle, null, null, 14), null, null, false, 28));
    }
}
