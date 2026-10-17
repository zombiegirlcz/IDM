package fp0;

import ag.q;
import android.content.Context;
import android.os.SystemClock;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.fragment.app.Fragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.workflow.internal.ui.WorkflowFragment;
import com.revolut.core.ui_kit.chat.prompt.ChatPromptView;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.t9;
import com.revolut.core.ui_kit.gesture_control.VerticalSnapLayout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.status.StatusView;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen;
import com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.feed.RevolutFeedScreen;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreen;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlow;
import com.revolut.feature.travel.flights.impl.ui.screen.location_picker.TravelFlightsLocationPickerScreen;
import com.revolut.feature.vaults.impl.ui.details.terms_viewer.VaultTermsViewerScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.youTransactor.uCube.payment.PaymentState;
import defpackage.h0;
import et0.q0;
import gcm.j4;
import gcm.q5;
import gcm.r5;
import ip0.sb;
import ix0.h1;
import ix0.t;
import jfb.a0;
import k50.s1;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kp0.j0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f137027b;

    public /* synthetic */ l(Object obj2, int i) {
        this.f137026a = i;
        this.f137027b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f137026a) {
            case 0:
                p pVar = (p) this.f137027b;
                pVar.f137029a.setPressed(false);
                pVar.f137032g = null;
                break;
            case 1:
                fu0.e eVar = (fu0.e) this.f137027b;
                fu0.h hVar = eVar.f138058g;
                if (hVar != null) {
                    int[] iArr = eVar.f138059h;
                    int i = iArr[0];
                    int i2 = iArr[1];
                    hVar.getView().getLocationInWindow(iArr);
                    hVar.B();
                    for (fu0.g gVar : hVar.b()) {
                        gVar.c(iArr[0], iArr[1]);
                    }
                    if (hVar.getView().isDirty() || i != iArr[0] || i2 != iArr[1]) {
                        eVar.invalidate();
                    }
                    break;
                }
                break;
            case 2:
                ((j4) this.f137027b).e();
                break;
            case 3:
                r5 r5Var = ((q5) this.f137027b).f142843b;
                r5Var.f142855b.a(new q(r5Var, 18));
                break;
            case 4:
                StatusView statusView = (StatusView) this.f137027b;
                StatusView.Companion companion = StatusView.INSTANCE;
                statusView.s();
                break;
            case 5:
                ((q0) this.f137027b).invoke();
                break;
            case 6:
                WatchlistAddAssetFlow watchlistAddAssetFlow = (WatchlistAddAssetFlow) this.f137027b;
                WatchlistAddAssetFlow.Companion aVar = WatchlistAddAssetFlow.INSTANCE;
                watchlistAddAssetFlow.d3().f183959c.E0();
                break;
            case 7:
                CorporateEventsHomeScreen corporateEventsHomeScreen = (CorporateEventsHomeScreen) this.f137027b;
                CorporateEventsHomeScreen.Companion aVar2 = CorporateEventsHomeScreen.INSTANCE;
                corporateEventsHomeScreen.g3().setVisibility(8);
                break;
            case 8:
                ((ScreenContentRecyclerView) this.f137027b).setVisibility(8);
                break;
            case 9:
                TravelFlightsLocationPickerScreen travelFlightsLocationPickerScreen = (TravelFlightsLocationPickerScreen) this.f137027b;
                KProperty[] kPropertyArr = TravelFlightsLocationPickerScreen.T;
                InputText travelFlightsLocationPickerSearchInput = travelFlightsLocationPickerScreen.d3().f21275c;
                Intrinsics.checkNotNullExpressionValue(travelFlightsLocationPickerSearchInput, "travelFlightsLocationPickerSearchInput");
                InputText.Companion aVar3 = InputText.INSTANCE;
                travelFlightsLocationPickerSearchInput.C0(false);
                break;
            case 10:
                ((sb) this.f137027b).f.resumeAnimation();
                break;
            case 11:
                ((t9) this.f137027b).f.requestTransform();
                break;
            case 12:
                ie7.a aVar4 = (ie7.a) this.f137027b;
                RowDelegate.Companion companion2 = RowDelegate.INSTANCE;
                aVar4.invoke();
                break;
            case 13:
                ((t) this.f137027b).t();
                break;
            case 14:
                iz0.e eVar2 = (iz0.e) this.f137027b;
                if (eVar2.f169815c) {
                    eVar2.h();
                }
                break;
            case 15:
                AppCompatDelegate.lambda$syncRequestedAndStoredLocales$1((Context) this.f137027b);
                break;
            case 16:
                h0 h0Var = (h0) this.f137027b;
                h0Var.getClass();
                h0Var.j(PaymentState.START_EXIT_SECURE_SESSION);
                break;
            case 17:
                ReverywhereWebAppScreen reverywhereWebAppScreen = (ReverywhereWebAppScreen) this.f137027b;
                KProperty[] kPropertyArr2 = ReverywhereWebAppScreen.g0;
                a0 a0VarG3 = reverywhereWebAppScreen.g3();
                if (a0VarG3.f173781r) {
                    a0VarG3.a();
                }
                break;
            case 18:
                ((joi.p) this.f137027b).a();
                break;
            case 19:
                VaultTermsViewerScreen.d3((VaultTermsViewerScreen) this.f137027b);
                break;
            case 20:
                ju0.l lVar = (ju0.l) this.f137027b;
                ihm.f fVar = lVar.f178568a;
                ju0.k kVar = lVar.f178569b;
                if (kVar != null) {
                    long jF = kotlin.time.b.f(kVar.f178566a);
                    if (kVar.f178567b) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        long j2 = (jElapsedRealtime - lVar.e) % jF;
                        lVar.e = jElapsedRealtime - j2;
                        lVar.d = 0L;
                        long j3 = jF - j2;
                        long j5 = j3 >= 0 ? j3 : 0L;
                        Lazy lazy = h1.f169241a;
                        h1.d(j5, lVar.f);
                        lVar.a(j2, jF, true);
                        fVar.onNext(new ju0.b(true));
                    } else {
                        lVar.f178570c = false;
                        lVar.d = jF;
                        lVar.e = 0L;
                        lVar.a(jF, jF, false);
                        fVar.onNext(new ju0.b(false));
                    }
                    break;
                }
                break;
            case 21:
                DefaultSurfaceProcessor.lambda$snapshot$7((CallbackToFutureAdapter.Completer) this.f137027b);
                break;
            case 22:
                ((SurfaceOutput) this.f137027b).close();
                break;
            case 23:
                ((DefaultSurfaceProcessor) this.f137027b).lambda$release$5();
                break;
            case 24:
                ((SurfaceProcessorNode) this.f137027b).lambda$release$2();
                break;
            case 25:
                AndroidContentCaptureManager.contentCaptureChangeChecker$lambda$0((AndroidContentCaptureManager) this.f137027b);
                break;
            case 26:
                s1 s1Var = (s1) this.f137027b;
                VerticalSnapLayout verticalSnapLayout = s1Var.f181229a;
                ChatPromptView chatPromptView = s1Var.f181230b;
                ScreenContentRecyclerView screenContentRecyclerView = s1Var.f181231c;
                int scrollY = verticalSnapLayout.getScrollY();
                VerticalSnapLayout verticalSnapLayout2 = s1Var.f181229a;
                if (scrollY == verticalSnapLayout2.getHeight()) {
                    screenContentRecyclerView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    screenContentRecyclerView.animate().alpha(1.0f).setDuration(450L);
                }
                verticalSnapLayout2.setCurrent(0, false);
                chatPromptView.setAlpha(1.0f);
                chatPromptView.setDeferredUpdatesMode(false);
                s1Var.d.setDeferredMode(false);
                break;
            case 27:
                SmallActionButton smallActionButton = (SmallActionButton) this.f137027b;
                RevolutFeedScreen.Companion aVar5 = RevolutFeedScreen.INSTANCE;
                smallActionButton.setVisibility(8);
                break;
            case 28:
                WorkflowFragment.handleToolbarState$lambda$1((Fragment) this.f137027b);
                break;
            default:
                j0 j0Var = (j0) this.f137027b;
                k0.b bVar = j0Var.f188026c;
                if (bVar != null) {
                    bVar.run();
                }
                j0Var.f188026c = null;
                break;
        }
    }
}
