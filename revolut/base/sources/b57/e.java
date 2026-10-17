package b57;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.dialog.assessment_period.FreelancerVatReminderAssessmentPeriodPickerScreenContract$InputData;
import grl.b4;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerVatReminderAssessmentPeriodPickerScreenContract$InputData f12440a;

    public e(d57.c assessmentPeriodClauseFactory, FreelancerVatReminderAssessmentPeriodPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(assessmentPeriodClauseFactory, "assessmentPeriodClauseFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f12440a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.freelancer_vat_reminder_setup_assessment_period_picker_header_title, null, null, 14), null, null, null, false, 30);
        FreelancerVatReminderAssessmentPeriodPickerScreenContract$InputData freelancerVatReminderAssessmentPeriodPickerScreenContract$InputData = this.f12440a;
        Set<fs6.b> set = freelancerVatReminderAssessmentPeriodPickerScreenContract$InputData.f74437a;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        for (fs6.b bVar : set) {
            String strName = bVar.name();
            Clause clauseA = d57.c.a(bVar);
            boolean z = false;
            SingleChoiceDelegate.b.a aVar2 = new SingleChoiceDelegate.b.a(0);
            if (freelancerVatReminderAssessmentPeriodPickerScreenContract$InputData.f74438b == bVar) {
                z = true;
            }
            arrayList.add(new SingleChoiceDelegate.Model(strName, clauseA, z, aVar2, bVar, b4.EXPIRED_OR_INVALID_KEY_VALUE));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList, aVar);
    }
}
