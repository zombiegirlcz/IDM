package mx0;

import android.os.Parcelable;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.media3.ui.PlayerControlView;
import com.onfido.android.sdk.capture.ui.camera.liveness.intro.error.LoadingErrorState;
import com.onfido.workflow.internal.ui.retry.RetryWorkflowFragment;
import com.revolut.chat.ui.chatlist.ChatListScreen;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.views.chart.ChartHeaderBottomValueView;
import com.revolut.core.ui_kit.internal.views.fullscreenheader.InternalFullscreenHeaderView;
import com.revolut.core.ui_kit.internal.views.swipeablecards.SwipeableCardHeaderView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.lightprompt.LightPromptViewModel;
import com.revolut.core.ui_kit.views.QrCodePlainView;
import com.revolut.core.ui_kit.views.code.CodeEditor;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.lightprompt.LightPromptFullScreenView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.feature.atm.impl.ui.redesign.v2.atm_list.AtmListScreen;
import com.revolut.feature.card_design.impl.card_design.card_video_preview.CardVideoPreviewController;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.TravelFlightsBaggageSelectionScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.TravelFlightsBaggageSelectionScreenContract$ModalStep;
import com.revolut.feature.travel.flights.models.domain.payment.Payment;
import com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.TransactionCountriesScreen;
import com.revolut.kompot.common.ModalDestination;
import com.trustdockekyc.core.backend.domain.model.AppError;
import com.trustdockekyc.core.backend.presentation.BaseReadingNfcDialogFragment;
import com.trustdockekyc.core.backend.presentation.CoreEkycCommonErrorFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.channels.ProducerScope;
import mx0.w9;
import r40.b;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c9 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f209638b;

    public /* synthetic */ c9(Object obj2, int i) {
        this.f209637a = i;
        this.f209638b = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, kotlin.jvm.functions.Function1, kotlin.jvm.internal.u] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f209637a;
        aw0.t2 t2Var = aw0.t2.f10539a;
        Object obj2 = this.f209638b;
        switch (i) {
            case 0:
                int i2 = d9.f209652h;
                ((hb) obj2).invoke(t2Var);
                return;
            case 1:
                w9.a aVar = w9.Companion;
                ((hb) obj2).invoke(aw0.u2.f10554a);
                return;
            case 2:
                ((QrCodePlainView) obj2).f58847a.onNext(Unit.f186387a);
                return;
            case 3:
                int i3 = vb.i;
                ((hb) obj2).invoke(t2Var);
                return;
            case 4:
                BaseReadingNfcDialogFragment this$0 = (BaseReadingNfcDialogFragment) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                this$0.dismiss();
                return;
            case 5:
                CoreEkycCommonErrorFragment this$02 = (CoreEkycCommonErrorFragment) obj2;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                n2m.k kVar = this$02.f107534a0;
                if (kVar != null) {
                    AppError appError = this$02.f107535b0;
                    if (appError != null) {
                        kVar.a(appError);
                        return;
                    } else {
                        Intrinsics.r("appError");
                        throw null;
                    }
                }
                return;
            case 6:
                ((PlayerControlView) obj2).onFullscreenButtonClicked(view);
                return;
            case 7:
                ((InternalFullscreenHeaderView) obj2).f57102g.onNext(Unit.f186387a);
                return;
            case 8:
                int i5 = qc0.b.F0;
                qc0.i iVar = (qc0.i) ((qc0.b) obj2).f218652a0;
                if (iVar != null) {
                    qc0.y0 y0Var = (qc0.y0) iVar;
                    pfm.a aVarS = y0Var.S();
                    Function1 function1K = y0Var.K();
                    pfm.a aVar2 = new pfm.a(aVarS, new n1i.b(10, new qc0.r0(new BreadcrumbException(), 5)), 2);
                    Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                    ofm.h hVarW = aVar2.w(new nii.o0(10, function1K), new ozc.z(17, qc0.x0.f244500a));
                    Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                    te0.w.j0(y0Var.f239031a, hVarW);
                    return;
                }
                return;
            case 9:
                KProperty[] kPropertyArr = TransactionCountriesScreen.V;
                com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.a aVar3 = (com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.a) ((TransactionCountriesScreen) obj2).e3();
                aVar3.C2(new qci.d(((qci.c) ((vkm.j2) aVar3.f97762p.f22677a).getValue()).f244791a));
                return;
            case 10:
                RetryWorkflowFragment this$03 = (RetryWorkflowFragment) obj2;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                String string = this$03.requireArguments().getString("retry_workflow_request_key");
                if (string == null) {
                    throw new IllegalArgumentException("retry_workflow_request_key is missing");
                }
                Intrinsics.checkNotNullExpressionValue(string, "requireNotNull(...)");
                this$03.getParentFragmentManager().setFragmentResult(string, BundleKt.bundleOf());
                return;
            case 11:
                CodeEditor.Companion aVar4 = CodeEditor.INSTANCE;
                ((CodeEditor) obj2).h0();
                return;
            case 12:
                KProperty[] kPropertyArr2 = CardVideoPreviewController.Q;
                ((qx2.c) ((CardVideoPreviewController) obj2).O.getValue()).B2();
                return;
            case 13:
                ChatListScreen.a aVar5 = ChatListScreen.Companion;
                r40.x0 x0Var = (r40.x0) ((ChatListScreen) obj2).i3();
                x0Var.v2(new b.C1386b(null, null, x0Var.f251376p.f, 3));
                return;
            case 14:
                rp0.s1 s1Var = (rp0.s1) obj2;
                if (s1Var.i) {
                    s1Var.d(true);
                    s1Var.f256166b.m();
                    return;
                }
                return;
            case 15:
                InputText.g0((InputText) obj2);
                return;
            case 16:
                PickerController.Companion aVar6 = PickerController.INSTANCE;
                com.revolut.feature.picker.a aVar7 = (com.revolut.feature.picker.a) ((PickerController) obj2).R2();
                aVar7.C2(new s7a.a0(aVar7.o.c(((s7a.r) ((vkm.j2) aVar7.f80350r.f22677a).getValue()).f260628c, aVar7.f80348p.f260648b)));
                return;
            case 17:
                ((SwipeableCardHeaderView) obj2).f57601b.onNext(Unit.f186387a);
                return;
            case 18:
                LightPromptFullScreenView lightPromptFullScreenView = (LightPromptFullScreenView) obj2;
                int i6 = LightPromptFullScreenView.f59148s;
                py0.f fVarN0 = or0.u.k(lightPromptFullScreenView).n0();
                TrackableItem.Companion companion = TrackableItem.INSTANCE;
                LightPromptViewModel lightPromptViewModel = lightPromptFullScreenView.e;
                Parcelable analyticsContext = lightPromptViewModel != null ? lightPromptViewModel.getF51988j() : null;
                companion.getClass();
                fVarN0.a(lightPromptFullScreenView, TrackableItem.Companion.a(lightPromptFullScreenView, analyticsContext), new py0.c(new TextLocalisedClause(R$string.common_action_dismiss, null, null, 14)));
                lightPromptFullScreenView.k.onNext(Unit.f186387a);
                return;
            case 19:
                ((ChartHeaderBottomValueView) obj2).e.onNext(Unit.f186387a);
                return;
            case 20:
                BasicNavBar.l((BasicNavBar) obj2);
                return;
            case 21:
                NavBarBottomSheet navBarBottomSheet = (NavBarBottomSheet) obj2;
                lw0.l lVar = navBarBottomSheet.H;
                if (lVar != null) {
                    navBarBottomSheet.E.onNext(lVar);
                    return;
                }
                return;
            case 22:
                ((NavBarLargeCentred) obj2).f59295q.onNext(Unit.f186387a);
                return;
            case 23:
                ((ProducerScope) obj2).mo3647trySendJP2dKIU(Unit.f186387a);
                return;
            case 24:
                ?? tmp0 = (kotlin.jvm.internal.u) obj2;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(view);
                return;
            case 25:
                KProperty[] kPropertyArr3 = AtmListScreen.W;
                ((AtmListScreen) obj2).e3().I2(new uk2.i(zv0.b.HALF_EXPANDED));
                return;
            case 26:
                ux0.a aVar8 = (ux0.a) obj2;
                aVar8.m0(aVar8.f283723m.o());
                return;
            case 27:
                KProperty[] kPropertyArr4 = TravelFlightsBaggageSelectionScreen.R;
                com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.b) ((TravelFlightsBaggageSelectionScreen) obj2).e3();
                cli.y yVar = bVar.f93253s;
                vkm.j2 j2Var = (vkm.j2) yVar.f22677a;
                vkm.j2 j2Var2 = (vkm.j2) yVar.f22677a;
                if (((v4g.g) j2Var.getValue()).f286078b.getContent() == null) {
                    if (((v4g.g) j2Var2.getValue()).f286078b.getError() != null) {
                        bVar.I2(((v4g.g) j2Var2.getValue()).f286079c);
                        return;
                    }
                    return;
                } else {
                    com.revolut.kompot.navigable.vc.modal.a aVar9 = bVar.f93254t;
                    Object content = ((v4g.g) j2Var2.getValue()).f286078b.getContent();
                    if (content == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    oki.h.v2(aVar9, new TravelFlightsBaggageSelectionScreenContract$ModalStep.PriceBreakdown((Payment) content), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    return;
                }
            case 28:
                LoadingErrorState.lambda$2$lambda$0((LoadingErrorState) obj2, view);
                return;
            default:
                vt0.d.b((vt0.d) obj2);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c9(Function1 function1) {
        this.f209637a = 24;
        this.f209638b = (kotlin.jvm.internal.u) function1;
    }
}
