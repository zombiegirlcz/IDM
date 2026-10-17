package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.orca.internal.f1;
import com.fourthline.orca.internal.gq0;
import com.fourthline.vision.document.ocr.OcrBirthDateValidator;
import com.fourthline.vision.document.ocr.OcrCountryAndTypeValidator;
import com.fourthline.vision.document.ocr.OcrDocumentExpirationDateValidator;
import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f28127a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(to toVar) {
        return toVar.k().getValidationConfig().getMinPersonAge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentType d(to toVar) {
        return toVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fd e(to toVar) {
        return toVar.a();
    }

    public final wf a(Optional config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (!config.isPresent()) {
            wz.a("This solution does not support Document Analysis.");
            throw new KotlinNothingValueException();
        }
        Object obj2 = config.get();
        Intrinsics.h(obj2);
        return (wf) obj2;
    }

    public final List b(Optional supportedCountries) {
        Intrinsics.checkNotNullParameter(supportedCountries, "supportedCountries");
        if (!supportedCountries.isPresent()) {
            wz.a("Flow did not provide required Supported Countries.");
            throw new KotlinNothingValueException();
        }
        Object obj2 = supportedCountries.get();
        Intrinsics.h(obj2);
        return (List) obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(to toVar) {
        return toVar.k().getValidationConfig().getMinPersonAge();
    }

    public final dh a(fe1 viewNavigator, xg stateProvider, aq0 popupHandler, aq0 viewCompletionErrorPopupHandler, CoroutineScope coroutineScope, tf analytics, dg documentAnalysisManager, rg documentAnalysisRepository, wd1 viewCompletionHandler) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(viewCompletionErrorPopupHandler, "viewCompletionErrorPopupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(documentAnalysisManager, "documentAnalysisManager");
        Intrinsics.checkNotNullParameter(documentAnalysisRepository, "documentAnalysisRepository");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        return new dh(new f80(stateProvider), stateProvider, new wr(coroutineScope), popupHandler, viewCompletionErrorPopupHandler, analytics, viewNavigator, coroutineScope, documentAnalysisManager, documentAnalysisRepository, viewCompletionHandler);
    }

    public final tf a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new tf(tracker);
    }

    public final rg a(wf documentAnalysisConfig, bg documentAnalysisBundle, yj0 personBundle, Optional documentAnalysisResultHandler) {
        Intrinsics.checkNotNullParameter(documentAnalysisConfig, "documentAnalysisConfig");
        Intrinsics.checkNotNullParameter(documentAnalysisBundle, "documentAnalysisBundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        Intrinsics.checkNotNullParameter(documentAnalysisResultHandler, "documentAnalysisResultHandler");
        long jA = documentAnalysisConfig.getBackendProcessingTimeoutMs();
        Object objOr = documentAnalysisResultHandler.or(new bg0());
        Intrinsics.checkNotNullExpressionValue(objOr, "or(...)");
        return new sg(documentAnalysisBundle, personBundle, jA, (vg) objOr);
    }

    public final xg a(l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new xg(lottieServiceLocator, imageServiceLocator);
    }

    public final bh a(TimestampProvider timestampProvider, List supportedCountries, to documentScannerRepository) {
        bh n41Var;
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(supportedCountries, "supportedCountries");
        Intrinsics.checkNotNullParameter(documentScannerRepository, "documentScannerRepository");
        OcrBirthDateValidator ocrBirthDateValidator = new OcrBirthDateValidator(timestampProvider, new ol1(documentScannerRepository, 1));
        OcrCountryAndTypeValidator ocrCountryAndTypeValidator = new OcrCountryAndTypeValidator(new ti1(supportedCountries, 1));
        OcrDocumentExpirationDateValidator ocrDocumentExpirationDateValidator = new OcrDocumentExpirationDateValidator(timestampProvider);
        if (documentScannerRepository.isDynamicStepsEnabled()) {
            n41Var = new cg0();
        } else {
            n41Var = new n41(new ol1(documentScannerRepository, 2), new ol1(documentScannerRepository, 3), new hq());
        }
        return new rf(ocrBirthDateValidator, ocrCountryAndTypeValidator, ocrDocumentExpirationDateValidator, n41Var);
    }

    public final dg a(Function0 workflowIdProvider, to documentScannerRepository, e00 getDocumentAnalysisResultWorker, bh resultValidator) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(documentScannerRepository, "documentScannerRepository");
        Intrinsics.checkNotNullParameter(getDocumentAnalysisResultWorker, "getDocumentAnalysisResultWorker");
        Intrinsics.checkNotNullParameter(resultValidator, "resultValidator");
        return new aa0((String) workflowIdProvider.invoke(), getDocumentAnalysisResultWorker, new ol1(documentScannerRepository, 0), resultValidator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nd1 a(to toVar) {
        DocumentType documentTypeB;
        fd fdVarA = toVar.a();
        if (fdVarA == null || (documentTypeB = toVar.b()) == null) {
            return null;
        }
        return new nd1(fdVarA.c(), documentTypeB, null, null);
    }

    public final t1 a(to repository, nc1 uploadDocumentImageWorker) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(uploadDocumentImageWorker, "uploadDocumentImageWorker");
        return new i90(uploadDocumentImageWorker, repository.l());
    }

    public final e00 a(bg documentAnalysisDataBundle, ib0 onboardingNetworkService) {
        Intrinsics.checkNotNullParameter(documentAnalysisDataBundle, "documentAnalysisDataBundle");
        Intrinsics.checkNotNullParameter(onboardingNetworkService, "onboardingNetworkService");
        return new ja0(onboardingNetworkService, cg.b(documentAnalysisDataBundle));
    }

    public final aq0 a(to documentScannerRepository, bq0 popupHandlerBuilder, jq0 postProcessingPopupAnalytics, fe1 viewNavigator, v10 imageServiceLocator, bg documentAnalysisDataBundle) {
        Intrinsics.checkNotNullParameter(documentScannerRepository, "documentScannerRepository");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(postProcessingPopupAnalytics, "postProcessingPopupAnalytics");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(documentAnalysisDataBundle, "documentAnalysisDataBundle");
        int i = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z = false;
        return popupHandlerBuilder.a(new h40(postProcessingPopupAnalytics, viewNavigator, documentAnalysisDataBundle, imageServiceLocator, !(documentScannerRepository.n() instanceof f1.b)), new g40(postProcessingPopupAnalytics, viewNavigator, imageServiceLocator, !(documentScannerRepository.n() instanceof f1.b)), new nm(postProcessingPopupAnalytics, viewNavigator, imageServiceLocator, !(documentScannerRepository.n() instanceof f1.b)), new nl(postProcessingPopupAnalytics, viewNavigator, imageServiceLocator, !(documentScannerRepository.n() instanceof f1.b)), new wi(postProcessingPopupAnalytics, viewNavigator, z, imageServiceLocator, i, defaultConstructorMarker), new h80(postProcessingPopupAnalytics, viewNavigator, z, imageServiceLocator, i, defaultConstructorMarker), new ml0(new ol1(documentScannerRepository, 4), postProcessingPopupAnalytics, viewNavigator, imageServiceLocator));
    }

    public final aq0 a(bq0 popupHandlerBuilder, jq0 postProcessingPopupAnalytics, to documentScannerRepository, fe1 viewNavigator, v10 imageServiceLocator, bg documentAnalysisDataBundle) {
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(postProcessingPopupAnalytics, "postProcessingPopupAnalytics");
        Intrinsics.checkNotNullParameter(documentScannerRepository, "documentScannerRepository");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(documentAnalysisDataBundle, "documentAnalysisDataBundle");
        gq0.a[] elements = {new mm(imageServiceLocator), new xi(imageServiceLocator), new h40(postProcessingPopupAnalytics, viewNavigator, documentAnalysisDataBundle, imageServiceLocator, true), new g40(postProcessingPopupAnalytics, viewNavigator, imageServiceLocator, true), new nm(postProcessingPopupAnalytics, viewNavigator, imageServiceLocator, true), new nl(postProcessingPopupAnalytics, viewNavigator, imageServiceLocator, true), documentScannerRepository.isDynamicStepsEnabled() ? new i40(postProcessingPopupAnalytics, viewNavigator, documentAnalysisDataBundle, imageServiceLocator) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        gq0.a[] aVarArr = (gq0.a[]) ((ArrayList) kotlin.collections.d.L(elements)).toArray(new gq0.a[0]);
        return popupHandlerBuilder.a((gq0[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }
}
