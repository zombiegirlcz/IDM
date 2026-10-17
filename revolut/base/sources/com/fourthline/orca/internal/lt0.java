package com.fourthline.orca.internal;

import android.content.ContentResolver;
import android.content.Context;
import androidx.view.result.ActivityResultRegistry;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.e40;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.selfie.LivenessCheckType;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerResult;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class lt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final it0 f30745a;

    public static final class a implements c70 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Coordinate f30746a;

        @Override // com.fourthline.orca.internal.c70
        public void a(Coordinate coordinate) {
            this.f30746a = coordinate;
        }

        @Override // com.fourthline.orca.internal.c70
        public Coordinate getLocation() {
            return this.f30746a;
        }
    }

    public static final class b implements i21 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final oy0 f30747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SelfieScannerConfig f30748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SelfieScannerResult f30749c;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.fourthline.orca.internal.oy0] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public b(it0 it0Var) {
            ?? lq0Var = 0;
            lq0Var = 0;
            if (it0Var.getLiveness().getEnabled() && it0Var.getLiveness().getRandomness().getEnabled()) {
                lq0Var = new lq0(lq0Var, 1, lq0Var);
            }
            this.f30747a = lq0Var;
            this.f30748b = new SelfieScannerConfig(false, it0Var.getSelfie().getVideo().getEnabled() ? RecordingType.VIDEO_ONLY : RecordingType.NONE, null, it0Var.getLiveness().getEnabled() ? LivenessCheckType.HEAD_TURN : LivenessCheckType.NONE, false, null, 52, null);
        }

        @Override // com.fourthline.orca.internal.i21
        public SelfieScannerResult a() {
            return this.f30749c;
        }

        @Override // com.fourthline.orca.internal.i21
        public oy0 b() {
            return this.f30747a;
        }

        @Override // com.fourthline.orca.internal.i21
        public SelfieScannerConfig c() {
            return this.f30748b;
        }

        @Override // com.fourthline.orca.internal.i21
        public void a(SelfieScannerResult selfieScannerResult) {
            this.f30749c = selfieScannerResult;
        }
    }

    public lt0(it0 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f30745a = flowConfig;
    }

    public final fe1 a(jt0 flowCoordinator) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        return flowCoordinator;
    }

    public final xw0 d(kt0 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new yw0(bundle);
    }

    public final nw0 e(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new nw0(tracker);
    }

    public final f11 f(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new f11(tracker);
    }

    public final y11 g(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new y11(tracker);
    }

    public final kt0 a(Function0 workflowIdProvider, xg1 xg1Var) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        return new kt0((String) workflowIdProvider.invoke(), xg1Var, null, null, null, 28, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lr0 b() {
        return new lr0(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final i21 c() {
        return new b(this.f30745a);
    }

    public final pv0 d(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new pv0(tracker);
    }

    public final bs0 b(kt0 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new cs0(bundle);
    }

    public final nv0 b(lr0 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new ov0(bundle);
    }

    public final lw0 c(kt0 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new mw0(bundle);
    }

    public final zr0 a(kt0 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new as0(bundle);
    }

    public final oj0 b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new mv0(context);
    }

    public final j30 c(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new j30("qes", tracker);
    }

    public final cx0 a(kt0 bundle, r70 mainRepository) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        return new dx0(bundle, mainRepository.getFlavor().getLocalization());
    }

    public final e70 b(l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        return new e70(lottieServiceLocator.a(k70.f30158m));
    }

    public final l11 c(l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new l11(0, 0, lottieServiceLocator, imageServiceLocator, 3, null);
    }

    public final mr0 a(lr0 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new nr0(bundle);
    }

    public final jt0 a(o80 navigationChannel, fw0 qesSelfieIntroCoordinator, hw0 qesSelfieScannerCoordinator, ur0 qesAgreementCoordinator, tv0 qesPdfRendererCoordinator, sw0 qesSignCoordinator, bq0 popupHandlerBuilder, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(qesSelfieIntroCoordinator, "qesSelfieIntroCoordinator");
        Intrinsics.checkNotNullParameter(qesSelfieScannerCoordinator, "qesSelfieScannerCoordinator");
        Intrinsics.checkNotNullParameter(qesAgreementCoordinator, "qesAgreementCoordinator");
        Intrinsics.checkNotNullParameter(qesPdfRendererCoordinator, "qesPdfRendererCoordinator");
        Intrinsics.checkNotNullParameter(qesSignCoordinator, "qesSignCoordinator");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        sx0 sx0VarE = this.f30745a.getInitialStatus();
        if (sx0VarE != null) {
            return new jt0(navigationChannel, qesSelfieIntroCoordinator, qesSelfieScannerCoordinator, qesAgreementCoordinator, qesPdfRendererCoordinator, qesSignCoordinator, popupHandlerBuilder.a(new q9(c81.a.a(c81.f27404a, R.string.shared_button_exit_qes, 0, 2, null), imageServiceLocator)), sx0VarE);
        }
        wz.a("Initial QesStatus is not available.");
        throw new KotlinNothingValueException();
    }

    public final wd1 b(r70 mainRepository, lz whatsNextWorker) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        ht0 ht0Var = new ht0(false);
        z51 z51Var = new z51();
        y51 y51Var = new y51();
        if (mainRepository.c()) {
            whatsNextWorker = new b61("QES", true);
        }
        return new lj0(ht0Var, z51Var, y51Var, whatsNextWorker);
    }

    public final es0 a(l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new es0(lottieServiceLocator.a(k70.i), imageServiceLocator);
    }

    public final jw0 b(l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        p70 p70VarA = lottieServiceLocator.a(k70.f30152g);
        return new jw0(new g50(p70VarA, lottieServiceLocator.a(k70.e), lottieServiceLocator.a(k70.f), lottieServiceLocator.a(k70.d), imageServiceLocator), p70VarA, imageServiceLocator);
    }

    public final fs0 a(jt0 flowCoordinator, wd1 viewCompletionHandler, zr0 repository, es0 stateProvider, bs0 resultRepository, mr0 activePdfRepository, dw0 qesRetrieveSigningDetailsWorker, nx0 qesUserAuthorizationWorker, kw qesErrorHandler, aq0 popupHandler, or0 analytics, v10 imageServiceLocator, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(activePdfRepository, "activePdfRepository");
        Intrinsics.checkNotNullParameter(qesRetrieveSigningDetailsWorker, "qesRetrieveSigningDetailsWorker");
        Intrinsics.checkNotNullParameter(qesUserAuthorizationWorker, "qesUserAuthorizationWorker");
        Intrinsics.checkNotNullParameter(qesErrorHandler, "qesErrorHandler");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        f80 f80Var = new f80(stateProvider);
        cq0.a(popupHandler, new zv0(imageServiceLocator, new mp1(flowCoordinator, 18)));
        Unit unit = Unit.f186387a;
        return new fs0(f80Var, stateProvider, flowCoordinator, viewCompletionHandler, repository, resultRepository, activePdfRepository, qesRetrieveSigningDetailsWorker, qesUserAuthorizationWorker, qesErrorHandler, popupHandler, analytics, coroutineScope);
    }

    public final or0 b(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new or0(tracker);
    }

    private final List b(v10 v10Var, fe1 fe1Var) {
        return zhm.v.k(new tx0(fe1Var, v10Var), new vx0(fe1Var, v10Var), new ux0(fe1Var, v10Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(jt0 jt0Var, kh0 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        jt0Var.b(new et0(it8));
        return Unit.f186387a;
    }

    public final wd1 a(r70 mainRepository, lz whatsNextWorker) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        ht0 ht0Var = new ht0(false);
        z51 z51Var = new z51();
        y51 y51Var = new y51();
        if (mainRepository.c()) {
            whatsNextWorker = new b61("QES", true);
        }
        return new lj0(ht0Var, z51Var, y51Var, whatsNextWorker);
    }

    public final kx a(ContentResolver contentResolver, ActivityResultRegistry registry) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(registry, "registry");
        return new af(contentResolver, registry);
    }

    public final lx a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new nj0(context);
    }

    public final wv0 a(nv0 repository, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new wv0(repository.b(), imageServiceLocator);
    }

    public final xv0 a(wv0 stateProvider, jt0 flowCoordinator, nv0 repository, kx fileDownloader, lx fileSharer, oj0 renderer, pv0 analytics) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(fileDownloader, "fileDownloader");
        Intrinsics.checkNotNullParameter(fileSharer, "fileSharer");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        return new xv0(new f80(stateProvider), stateProvider, flowCoordinator, renderer, repository, fileDownloader, fileSharer, analytics);
    }

    public final iv0 a(l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        return new iv0(lottieServiceLocator.a(k70.f30168t));
    }

    public final e40.c a(kt0 bundle, LocationProvider locationProvider, fx0 startSignatureWorker, kw errorHandler, Locale locale, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(startSignatureWorker, "startSignatureWorker");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        String strE = bundle.e();
        String language = locale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        return new gv0(locationProvider, strE, language, !this.f30745a.getGeolocation().getEnabled(), startSignatureWorker, coroutineScope, errorHandler);
    }

    public final e40 a(j30 analytics, jt0 flowCoordinator, iv0 stateProvider, e40.c finishIntroScreenHandler) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(finishIntroScreenHandler, "finishIntroScreenHandler");
        return new e40(analytics, new f80(stateProvider), stateProvider, flowCoordinator, hv0.f29421a, null, finishIntroScreenHandler, 32, null);
    }

    public final x60 a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new x60(tracker);
    }

    public final c70 a() {
        return new a();
    }

    public final f70 a(c70 repository, e70 stateProvider, bq0 popupHandlerBuilder, jt0 flowCoordinator, wd1 viewCompletionHandler, LocationProvider locationProvider, x60 analytics, CoroutineScope coroutineScope, l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        wr wrVar = new wr(coroutineScope);
        ArrayList arrayListE0 = zhm.d0.E0(b(imageServiceLocator, flowCoordinator), zhm.d0.E0(a(imageServiceLocator, flowCoordinator), zhm.v.k(new v60(lottieServiceLocator), new kq0(lottieServiceLocator), new u60(wrVar, imageServiceLocator), new g70(wrVar, imageServiceLocator))));
        f80 f80Var = new f80(stateProvider);
        gq0[] gq0VarArr = (gq0[]) arrayListE0.toArray(new gq0[0]);
        return new f70(f80Var, wrVar, flowCoordinator, viewCompletionHandler, stateProvider, popupHandlerBuilder.a((gq0[]) Arrays.copyOf(gq0VarArr, gq0VarArr.length)), locationProvider, repository, analytics, coroutineScope);
    }

    public final wd1 a(fx0 startSignatureWorker, cx0 repository) {
        Intrinsics.checkNotNullParameter(startSignatureWorker, "startSignatureWorker");
        Intrinsics.checkNotNullParameter(repository, "repository");
        return new kv0(startSignatureWorker, repository);
    }

    public final bx0 a(jt0 flowCoordinator, xw0 qesSignRepository, qx0 qesUserConfirmationWorker, bw0 qesResendOtpWorker, v10 imageServiceLocator, kw errorHandler, kw qesSignErrorHandler, wd1 viewCompletionHandler, nw0 analytics, aq0 popupHandler, sg0 tracker, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(qesSignRepository, "qesSignRepository");
        Intrinsics.checkNotNullParameter(qesUserConfirmationWorker, "qesUserConfirmationWorker");
        Intrinsics.checkNotNullParameter(qesResendOtpWorker, "qesResendOtpWorker");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(qesSignErrorHandler, "qesSignErrorHandler");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        p20 p20Var = new p20(tracker);
        ax0 ax0Var = new ax0(imageServiceLocator, qesSignRepository.b(), qesSignRepository.d(), p20Var, qesSignRepository.c().a());
        return new bx0(new f80(ax0Var), new wr(coroutineScope), ax0Var, flowCoordinator, viewCompletionHandler, qesSignRepository, qesUserConfirmationWorker, qesResendOtpWorker, errorHandler, qesSignErrorHandler, popupHandler, analytics, coroutineScope);
    }

    public final aq0 a(bq0 popupHandlerBuilder, fh0 orcaDestroyer, l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(orcaDestroyer, "orcaDestroyer");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return popupHandlerBuilder.a(new i9(lottieServiceLocator), new dt0(orcaDestroyer, imageServiceLocator));
    }

    public final m11 a(jt0 flowCoordinator, f11 analytics, l11 stateProvider, aq0 popupHandler) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        return new m11(new f80(stateProvider), flowCoordinator, popupHandler, analytics);
    }

    public final wd1 a(lw0 repository, kx0 uploadSelfieWorker) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(uploadSelfieWorker, "uploadSelfieWorker");
        return new kw0(repository, uploadSelfieWorker);
    }

    public final m21 a(jw0 uiStateProvider, i21 repository, wd1 viewCompletionHandler, kw selfieErrorHandler, jt0 flowCoordinator, y11 analytics, bq0 popupHandlerBuilder, CoroutineScope coroutineScope, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(uiStateProvider, "uiStateProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(selfieErrorHandler, "selfieErrorHandler");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        ArrayList arrayListE0 = zhm.d0.E0(zhm.u.c(new gw0(flowCoordinator, imageServiceLocator)), b(imageServiceLocator, flowCoordinator));
        f80 f80Var = new f80(uiStateProvider);
        wr wrVar = new wr(coroutineScope);
        gq0[] gq0VarArr = (gq0[]) arrayListE0.toArray(new gq0[0]);
        return new m21(f80Var, wrVar, uiStateProvider, false, flowCoordinator, viewCompletionHandler, repository, selfieErrorHandler, popupHandlerBuilder.a((gq0[]) Arrays.copyOf(gq0VarArr, gq0VarArr.length)), analytics, coroutineScope);
    }

    public final fw0 a(o80 navigationChannel, sj0 permissionChecker, bq0 popupHandlerBuilder, l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(permissionChecker, "permissionChecker");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        return new fw0(navigationChannel, new on1(permissionChecker, 2), popupHandlerBuilder.a(new i9(lottieServiceLocator)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(sj0 sj0Var) {
        return !sj0Var.a();
    }

    private final List a(v10 v10Var, fe1 fe1Var) {
        return zhm.v.k(new gs0(fe1Var, v10Var), new jv0(fe1Var, v10Var), new aw0(fe1Var, v10Var), new ix0(fe1Var, v10Var), new hx0(fe1Var, v10Var), new jx0(fe1Var, v10Var));
    }
}
