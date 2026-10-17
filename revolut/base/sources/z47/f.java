package z47;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.dialog.accounting_period.FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData;
import grl.b4;
import java.time.Month;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d57.a f319337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData f319338b;

    public f(d57.a accountingPeriodClauseFactory, FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(accountingPeriodClauseFactory, "accountingPeriodClauseFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f319337a = accountingPeriodClauseFactory;
        this.f319338b = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.freelancer_vat_reminder_setup_closing_month_picker_header_title, null, null, 14), null, null, null, false, 30);
        him.a<Month> aVar2 = e.f319336a;
        ArrayList arrayList = new ArrayList(w.t(aVar2, 10));
        for (Month month : aVar2) {
            String strName = month.name();
            TimeClause timeClauseA = this.f319337a.a(month);
            boolean z = false;
            SingleChoiceDelegate.b.a aVar3 = new SingleChoiceDelegate.b.a(0);
            if (this.f319338b.f74436a == month) {
                z = true;
            }
            arrayList.add(new SingleChoiceDelegate.Model(strName, timeClauseA, z, aVar3, month, b4.EXPIRED_OR_INVALID_KEY_VALUE));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList, aVar);
    }
}
