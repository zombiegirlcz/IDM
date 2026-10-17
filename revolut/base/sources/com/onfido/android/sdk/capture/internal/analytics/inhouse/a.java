package com.onfido.android.sdk.capture.internal.analytics.inhouse;

import android.view.accessibility.AccessibilityEvent;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsEvent;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.BiometricTokenEvents;
import com.onfido.android.sdk.capture.internal.camera.OnfidoImage;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengesViewModel;
import com.onfido.workflow.internal.ui.MotionScreen;
import com.onfido.workflow.internal.ui.PermissionsScreen;
import com.onfido.workflow.internal.ui.RetryWorkflowScreen;
import com.onfido.workflow.internal.ui.retry.RetryWorkflowViewDescriptor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nl.f1;
import nl.g0;
import nl.g1;
import nl.u;
import nl.x0;
import ol.p;
import sl.n;
import sl.o;
import sl.t;
import sl.v;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements igm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49921c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f49919a = i;
        this.f49920b = obj2;
        this.f49921c = obj3;
    }

    @Override // igm.a
    public final void run() {
        int i;
        int i2;
        switch (this.f49919a) {
            case 0:
                OnfidoAnalyticsImpl.sendPendingEvents$lambda$2$lambda$1((OnfidoAnalyticsImpl) this.f49920b, (AnalyticsEvent) this.f49921c);
                return;
            case 1:
                AnnouncementService.sendEvent$lambda$4((AnnouncementService) this.f49920b, (AccessibilityEvent) this.f49921c);
                return;
            case 2:
                AnnouncementService.announceString$lambda$3((AnnouncementService) this.f49920b, (String[]) this.f49921c);
                return;
            case 3:
                CapturePresenter.startLivenessProcessing$lambda$8((LivenessChallengesViewModel) this.f49920b, (CapturePresenter) this.f49921c);
                return;
            case 4:
                CapturePresenter.applyValidationsAfterAnimationDelay$lambda$14((CapturePresenter) this.f49920b, (OnfidoImage) this.f49921c);
                return;
            case 5:
                u this$0 = (u) this.f49920b;
                n documentTask = (n) this.f49921c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(documentTask, "$documentTask");
                this$0.d.storeWorkflowSupportedDocuments(documentTask.d);
                return;
            case 6:
                g0 this$02 = (g0) this.f49920b;
                o motionTask = (o) this.f49921c;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(motionTask, "$motionTask");
                this$02.f216908a.navigateTo(new MotionScreen(motionTask.f264056c, true));
                return;
            case 7:
                x0 this$03 = (x0) this.f49920b;
                CaptureStepDataBundle captureStepDataBundle = (CaptureStepDataBundle) this.f49921c;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(captureStepDataBundle, "$captureStepDataBundle");
                this$03.f216962a.navigateTo(new PermissionsScreen(captureStepDataBundle));
                return;
            case 8:
                v task = (v) this.f49920b;
                g1 this$04 = (g1) this.f49921c;
                Intrinsics.checkNotNullParameter(task, "$task");
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                t tVar = task.f264071c;
                switch (tVar == null ? -1 : f1.f216907a[tVar.ordinal()]) {
                    case -1:
                    case 1:
                    case 2:
                        i = R.string.onfido_retry_feedback_id_generic_title;
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 3:
                        i = R.string.onfido_retry_feedback_id_expired_title;
                        break;
                    case 4:
                        i = R.string.onfido_retry_feedback_id_unaccepted_title;
                        break;
                    case 5:
                        i = R.string.onfido_retry_feedback_selfie_generic_title;
                        break;
                    case 6:
                        i = R.string.onfido_retry_feedback_custom_title;
                        break;
                    case 7:
                        i = R.string.onfido_retry_headline_generic_proof_of_address_issue;
                        break;
                }
                t tVar2 = task.f264071c;
                switch (tVar2 != null ? f1.f216907a[tVar2.ordinal()] : -1) {
                    case -1:
                    case 1:
                    case 2:
                        i2 = R.string.onfido_retry_feedback_id_generic_subtitle;
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 3:
                        i2 = R.string.onfido_retry_feedback_id_expired_subtitle;
                        break;
                    case 4:
                        i2 = R.string.onfido_retry_feedback_id_unaccepted_subtitle;
                        break;
                    case 5:
                        i2 = R.string.onfido_retry_feedback_selfie_generic_subtitle;
                        break;
                    case 6:
                        i2 = R.string.onfido_retry_feedback_custom_subtitle;
                        break;
                    case 7:
                        i2 = R.string.onfido_retry_description_generic_proof_of_address_issue;
                        break;
                }
                RetryWorkflowViewDescriptor.StringResIds stringResIds = new RetryWorkflowViewDescriptor.StringResIds(i, i2, R.string.onfido_retry_feedback_button_primary);
                sl.u uVar = task.d;
                this$04.f216910a.navigateTo(new RetryWorkflowScreen(new RetryWorkflowViewDescriptor(stringResIds, uVar != null ? new RetryWorkflowViewDescriptor.Texts(uVar.f264066a, uVar.f264067b, uVar.f264068c) : null)));
                return;
            default:
                p this$05 = (p) this.f49920b;
                String storageType = (String) this.f49921c;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(storageType, "$storageType");
                this$05.d.track(new BiometricTokenEvents.BiometricTokenStorageCompleted(storageType));
                return;
        }
    }
}
