package au0;

import android.view.View;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.intro.MotionIntroFragment;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.nofacedetected.MotionNoFaceDetectedFragment;
import com.onfido.android.sdk.capture.ui.BulletedMessageFragment;
import com.onfido.android.sdk.capture.ui.MessageFragment;
import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessIntroFragment;
import com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment;
import com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSourcePreview;
import com.onfido.android.sdk.capture.ui.camera.view.PlaybackControlsVideoPlayerView;
import com.onfido.android.sdk.capture.ui.nfc.NfcChipBlockedOptionalFragment;
import com.onfido.android.sdk.capture.ui.nfc.NfcDeviceNotSupportedFragment;
import com.onfido.android.sdk.capture.ui.nfc.permission.NfcPermissionFragment;
import com.onfido.android.sdk.capture.ui.proofOfAddress.verifyAddress.PoaVerifyAddressFragment;
import com.onfido.android.sdk.capture.ui.welcome.WelcomeFragment;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.ActionTileDelegate;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleView;
import com.revolut.core.ui_kit.internal.views.navbar.ImageDelegate;
import com.revolut.core.ui_kit.views.state.FullScreenStateView;
import com.revolut.feature.atm.impl.ui.redesign.details.AtmDetailsBottomSheetController;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreen;
import com.revolut.feature_pdf_view.ui.PdfViewFragment;
import com.revolut.ui.activity.container.ContainerActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9147b;

    public /* synthetic */ b2(Object obj2, int i) {
        this.f9146a = i;
        this.f9147b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f9146a;
        Continuation continuation = null;
        int i2 = 0;
        Object obj2 = this.f9147b;
        switch (i) {
            case 0:
                ((ImageDelegate) obj2).f57295c.onNext(Unit.f186387a);
                return;
            case 1:
                KProperty[] kPropertyArr = GroupChatScreen.j0;
                ks9.a aVar = ((com.revolut.feature.payments.groups.impl.ui_chat.chat.a) ((GroupChatScreen) obj2).f3()).z;
                aVar.getClass();
                aVar.T2(new k7c.l0(aVar, continuation, 25), new yi5.b(27));
                return;
            case 2:
                ((byl.h) obj2).f19869c.invoke();
                return;
            case 3:
                ((MaterialDatePicker) obj2).lambda$initHeaderToggle$0(view);
                return;
            case 4:
                MotionIntroFragment.setNextButtonListener$lambda$0((MotionIntroFragment) obj2, view);
                return;
            case 5:
                MotionNoFaceDetectedFragment.attachListeners$lambda$1$lambda$0((MotionNoFaceDetectedFragment) obj2, view);
                return;
            case 6:
                ((BulletedMessageFragment) obj2).onNextClicked$onfido_capture_sdk_core_release(view);
                return;
            case 7:
                MessageFragment.onCreateView$lambda$2$lambda$1$lambda$0((MessageFragment) obj2, view);
                return;
            case 8:
                DocumentCaptureFragment.setupCaptureButton$lambda$6((DocumentCaptureFragment) obj2, view);
                return;
            case 9:
                LivenessIntroFragment.onCreateView$lambda$5$lambda$4((LivenessIntroFragment) obj2, view);
                return;
            case 10:
                LivenessCaptureFragment.inflateCaptureButton$lambda$11((LivenessCaptureFragment) obj2, view);
                return;
            case 11:
                SelfieCaptureFragment.setupCaptureButton$lambda$2((SelfieCaptureFragment) obj2, view);
                return;
            case 12:
                ((CameraSourcePreview) obj2).lambda$new$0(view);
                return;
            case 13:
                PlaybackControlsVideoPlayerView.setupVideoPlayButton$lambda$1$lambda$0((PlaybackControlsVideoPlayerView) obj2, view);
                return;
            case 14:
                NfcChipBlockedOptionalFragment.onViewCreated$lambda$0((NfcChipBlockedOptionalFragment) obj2, view);
                return;
            case 15:
                NfcDeviceNotSupportedFragment.onViewCreated$lambda$0((NfcDeviceNotSupportedFragment) obj2, view);
                return;
            case 16:
                NfcPermissionFragment.onCreateView$lambda$1$lambda$0((NfcPermissionFragment) obj2, view);
                return;
            case 17:
                PoaVerifyAddressFragment.onViewCreated$lambda$2$lambda$1((PoaVerifyAddressFragment) obj2, view);
                return;
            case 18:
                WelcomeFragment.renderState$lambda$3$lambda$2((WelcomeFragment) obj2, view);
                return;
            case 19:
                BottomExpandableDialogView.Companion aVar2 = BottomExpandableDialogView.INSTANCE;
                ((BottomExpandableDialogView) obj2).r0(cr0.h.HIDDEN, false);
                return;
            case 20:
                KProperty[] kPropertyArr2 = AtmDetailsBottomSheetController.Y;
                ek2.a aVarE3 = ((AtmDetailsBottomSheetController) obj2).e3();
                zv0.b state = zv0.b.HALF_EXPANDED;
                com.revolut.feature.atm.impl.ui.redesign.details.a aVar3 = (com.revolut.feature.atm.impl.ui.redesign.details.a) aVarE3;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                aVar3.f63170x.a(new tk2.b(state));
                return;
            case 21:
                int i3 = et0.i.f129036y;
                ((et0.i) obj2).callOnClick();
                return;
            case 22:
                int i5 = et0.i.f129036y;
                ((Function0) obj2).invoke();
                return;
            case 23:
                int i6 = et0.n.f;
                Function0 function0 = ((et0.m) obj2).e;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 24:
                ((ChatBubbleView) obj2).f56821x.onNext(Unit.f186387a);
                return;
            case 25:
                ContainerActivity.Companion companion = ContainerActivity.INSTANCE;
                ewl.i iVar = (ewl.i) ((ContainerActivity) obj2).f218652a0;
                if (iVar != null) {
                    ((ypi.a) iVar.f130328h).f315904a.onNext(Unit.f186387a);
                    return;
                }
                return;
            case 26:
                ((FullScreenStateView) obj2).f59711a.onNext(Unit.f186387a);
                return;
            case 27:
                KProperty[] kPropertyArr3 = PdfViewFragment.f97459h0;
                g9i.l lVar = (g9i.l) ((PdfViewFragment) obj2).C();
                if (lVar != null) {
                    g9i.t tVar = (g9i.t) lVar;
                    if (((com.revolut.feature_pdf_view.ui.b) tVar.k).j3()) {
                        com.revolut.feature_pdf_view.ui.a aVar4 = (com.revolut.feature_pdf_view.ui.a) tVar.f141897l;
                        efm.d0 d0VarFirstOrError = te0.w.a0(((g9i.u) aVar4.f97464b).y0().c(te0.s.f270018a), new g64.c(14)).firstOrError();
                        int i21 = 18;
                        g48.k kVar = new g48.k(i21, new g9i.c(aVar4, i2));
                        d0VarFirstOrError.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarFirstOrError, kVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        efm.d0 d0VarO = hx7.a.O(iVar2, tVar.f141896j, false, null, 24);
                        g9i.s sVar = new g9i.s(1, tVar.f141899n, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 0);
                        akl.s sVar2 = tVar.i;
                        ufm.i iVar3 = new ufm.i(d0VarO, new a08.f0(16, new g0d.m(new BreadcrumbException(), i21)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "onErrorResumeNext(...)");
                        ofm.i iVar4 = new ofm.i(new a08.s(14, sVar), new a08.s(14, sVar2), i2);
                        iVar3.q(iVar4);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "subscribe(...)");
                        te0.w.j0(tVar.f239031a, iVar4);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                h60.e eVar = h60.f.Companion;
                ((h60.f) obj2).T();
                return;
            default:
                ((ActionTileDelegate) obj2).f51588c.onNext(null);
                throw null;
        }
    }
}
