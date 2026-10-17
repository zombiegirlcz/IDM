package qpf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.R$string;
import com.revolut.feature.transfer.core.api.TransferCoreApi$Toggles;
import com.revolut.feature.transfer.core.api.reason.ReasonForTransferInputData;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import com.revolut.feature.transfer.core.api.ui.reference.ReferenceInputData;
import com.revolut.feature.transfer.core.impl.schedule.ScheduleTransferScreen;
import com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.ReasonForTransferFlow;
import com.revolut.feature.transfer.core.impl.ui.reference.ReferenceScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements zof.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f248387a;

    public h(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f248387a = featureToggleInteractor;
    }

    public final zof.a a(ReasonForTransferInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return ((jte.d) this.f248387a).c(TransferCoreApi$Toggles.NewPurposeOfPaymentScreen.f92115c) ? new ReasonForTransferFlow(inputData) : new com.revolut.feature.transfer.core.impl.ui.reason.flow.ReasonForTransferFlow(inputData);
    }

    public final ReferenceScreen b(ReferenceInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new ReferenceScreen(inputData);
    }

    public final ReferenceScreen c(String str) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(str != null ? R$string.reference_label_edit_title : R$string.reference_label_add_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.reference_label_textbox_title, null, null, 14);
        if (str == null) {
            str = "";
        }
        return new ReferenceScreen(new ReferenceInputData(25, textLocalisedClause, textLocalisedClause2, str));
    }

    public final ScheduleTransferScreen d(ScheduleTransferInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new ScheduleTransferScreen(inputData);
    }
}
