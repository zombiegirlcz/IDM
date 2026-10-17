package glj;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOwnerAccountType;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.phone_number_type_picker.EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData;
import dej.t0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData f144714a;

    public i(EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f144714a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        Clause textLocalisedClause;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = this.f144714a.f101323a;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            SingleChoiceDelegate.Model model = null;
            if (i < 0) {
                v.s();
                throw null;
            }
            EsimPhoneNumberPortingOwnerAccountType esimPhoneNumberPortingOwnerAccountType = (EsimPhoneNumberPortingOwnerAccountType) obj2;
            t0 t0Var = esimPhoneNumberPortingOwnerAccountType.f100367a;
            int[] iArr = h.f144713a;
            int i3 = iArr[t0Var.ordinal()];
            if (i3 == 1 || i3 == 2) {
                String strN = a0.d.n("ID_PHONE_NUMBER_TYPE_", i);
                int i5 = iArr[esimPhoneNumberPortingOwnerAccountType.f100367a.ordinal()];
                if (i5 == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_phone_number_type_picker_option_personal, null, null, 14);
                } else if (i5 == 2) {
                    textLocalisedClause = new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_phone_number_type_picker_option_business, null, null, 14);
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m70.a.c(kotlin.jvm.internal.t0.f186434a);
                    textLocalisedClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                model = new SingleChoiceDelegate.Model(strN, textLocalisedClause, esimPhoneNumberPortingOwnerAccountType.equals(domainState.f144710a), null, esimPhoneNumberPortingOwnerAccountType, YearClass.CLASS_2008);
            } else if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (model != null) {
                arrayList.add(model);
            }
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new f(arrayList);
    }
}
