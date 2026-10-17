package com.onfido.android.sdk.capture.component.active.video.capture.data.repository;

import android.content.Context;
import android.view.View;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.AvcTimer;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostViewModel;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalyticsImpl;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.token.TokenExpirationServiceConnector;
import com.onfido.android.sdk.capture.ui.NfcDataService;
import com.onfido.android.sdk.capture.ui.camera.CaptureUploadService;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationPresenter;
import com.onfido.android.sdk.capture.ui.documentintro.AddressPageIntroScreen;
import com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.PoaDocumentSubmissionViewModel;
import com.onfido.android.sdk.capture.utils.AccessibilityExtensionsKt;
import com.onfido.android.sdk.capture.validation.BarcodeValidationSuspender;
import com.onfido.workflow.internal.ui.PoaScreen;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nl.e1;
import nl.p;
import ol.c;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b implements igm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49876b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f49875a = i;
        this.f49876b = obj2;
    }

    @Override // igm.a
    public final void run() {
        switch (this.f49875a) {
            case 0:
                ActiveVideoCaptureRepositoryImpl.deleteVideoFiles$lambda$3((ActiveVideoCaptureRepositoryImpl) this.f49876b);
                return;
            case 1:
                MotionCaptureViewModelImpl.startRecordingTimer$lambda$0((MotionCaptureViewModelImpl) this.f49876b);
                return;
            case 2:
                AvcTimer.start$lambda$0((Function0) this.f49876b);
                return;
            case 3:
                MotionHostViewModel.checkMLKitAvailability$lambda$0((MotionHostViewModel) this.f49876b);
                return;
            case 4:
                OnfidoAnalyticsImpl.track$lambda$0((OnfidoAnalyticsImpl) this.f49876b);
                return;
            case 5:
                AnnouncementService.interruptAnnouncement$lambda$5((AnnouncementService) this.f49876b);
                return;
            case 6:
                TokenExpirationServiceConnector.connect$lambda$1((TokenExpirationServiceConnector) this.f49876b);
                return;
            case 7:
                NfcDataService.uploadBinary$lambda$0((NfcDataService) this.f49876b);
                return;
            case 8:
                CaptureUploadService.uploadDocumentVideoForDocumentId$lambda$0((String) this.f49876b);
                return;
            case 9:
                LivenessConfirmationPresenter.onVideoStarted$lambda$6((LivenessConfirmationPresenter) this.f49876b);
                return;
            case 10:
                LivenessConfirmationPresenter.uploadVideo$lambda$0((File) this.f49876b);
                return;
            case 11:
                PoaDocumentSubmissionViewModel.uploadPoaDocument$lambda$4((PoaDocumentSubmissionViewModel) this.f49876b);
                return;
            case 12:
                AccessibilityExtensionsKt.setDefaultAccessibilityFocus$lambda$0((View) this.f49876b);
                return;
            case 13:
                BarcodeValidationSuspender.startBarcodeProcessingTimeout$lambda$0((BarcodeValidationSuspender) this.f49876b);
                return;
            case 14:
                p this$0 = (p) this.f49876b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f216933c.navigateTo(AddressPageIntroScreen.INSTANCE);
                return;
            case 15:
                ((Navigator) this.f49876b).exitCurrentScreen();
                return;
            case 16:
                e1 this$02 = (e1) this.f49876b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.f216901a.navigateTo(new PoaScreen(true));
                return;
            default:
                c this$03 = (c) this.f49876b;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Context context = this$03.f226262a;
                ol.b bVar = this$03.f226264c;
                if (bVar != null) {
                    context.unbindService(bVar);
                    return;
                } else {
                    Intrinsics.r("tokenRetrievalServiceConnection");
                    throw null;
                }
        }
    }
}
