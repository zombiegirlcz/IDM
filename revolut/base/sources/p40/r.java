package p40;

import com.revolut.chat.ui.chat_profile.TranscriptPeriodOption;
import com.revolut.chat.ui.chat_profile.profile_screen.ChatProfileScreenContract$ModelStep;
import com.revolut.chat.ui.transcript.ChatTranscriptPeriodCalendarBottomSheetController;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class r implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.chat.ui.chat_profile.profile_screen.b f232797b;

    public /* synthetic */ r(com.revolut.chat.ui.chat_profile.profile_screen.b bVar, int i) {
        this.f232796a = i;
        this.f232797b = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f232796a) {
            case 0:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ChatProfileScreenContract$ModelStep step = (ChatProfileScreenContract$ModelStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                boolean z = step instanceof ChatProfileScreenContract$ModelStep.FeedbackFlowStep;
                com.revolut.chat.ui.chat_profile.profile_screen.b bVar = this.f232797b;
                if (z) {
                    return bVar.e1(new n90.a(((ChatProfileScreenContract$ModelStep.FeedbackFlowStep) step).f51126a));
                }
                if (step instanceof ChatProfileScreenContract$ModelStep.TranscriptPeriodSelectionStep) {
                    bVar.f51137w.getClass();
                    RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(new lw0.a(new TextLocalisedClause(R$string.chat_transcript_download_period, null, null, 14), null, null, null, false, 30), null, zhm.v.k(new eii.l((Clause) new TextLocalisedClause(R$string.chat_transcript_all_time, null, null, 14), (Clause) null, (RowDelegate.Model.MainImage) null, true, false, (RowDelegate.Model.c) null, (Object) TranscriptPeriodOption.ALL_TIME, 232), new eii.l((Clause) new TextLocalisedClause(R$string.chat_transcript_custom, null, null, 14), (Clause) null, (RowDelegate.Model.MainImage) null, true, false, (RowDelegate.Model.c) null, (Object) TranscriptPeriodOption.CUSTOM, 232)), d40.a.f111223a, null));
                    bVar.a(rowActionsBottomSheetController, new kp0.m(bVar, step, 22));
                    return rowActionsBottomSheetController;
                }
                if (!(step instanceof ChatProfileScreenContract$ModelStep.TranscriptPeriodCalendarStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                ChatProfileScreenContract$ModelStep.TranscriptPeriodCalendarStep transcriptPeriodCalendarStep = (ChatProfileScreenContract$ModelStep.TranscriptPeriodCalendarStep) step;
                ChatTranscriptPeriodCalendarBottomSheetController chatTranscriptPeriodCalendarBottomSheetController = new ChatTranscriptPeriodCalendarBottomSheetController(new w50.b(transcriptPeriodCalendarStep.f51128b, transcriptPeriodCalendarStep.f51127a));
                bVar.a(chatTranscriptPeriodCalendarBottomSheetController, new r(bVar, 1));
                return chatTranscriptPeriodCalendarBottomSheetController;
            default:
                oki.g onResult = (oki.g) obj2;
                w50.c result = (w50.c) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(result, "result");
                this.f232797b.C2(new o40.c(result.f294653a));
                return Unit.f186387a;
        }
    }
}
