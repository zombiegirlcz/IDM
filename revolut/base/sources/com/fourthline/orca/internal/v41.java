package com.fourthline.orca.internal;

import com.fourthline.vision.document.ocr.OcrCountryAndTypeValidator;
import com.google.common.base.Optional;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class v41 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(List list) {
        return list;
    }

    public final fl a(bg documentAnalysisBundle) {
        Intrinsics.checkNotNullParameter(documentAnalysisBundle, "documentAnalysisBundle");
        return new fl(documentAnalysisBundle);
    }

    public final u41 a(to documentScannerRepository, phm.a localHandlerProvider, phm.a analysisHandlerProvider, phm.a backgroundUploadProvider) {
        Intrinsics.checkNotNullParameter(documentScannerRepository, "documentScannerRepository");
        Intrinsics.checkNotNullParameter(localHandlerProvider, "localHandlerProvider");
        Intrinsics.checkNotNullParameter(analysisHandlerProvider, "analysisHandlerProvider");
        Intrinsics.checkNotNullParameter(backgroundUploadProvider, "backgroundUploadProvider");
        if (documentScannerRepository.j()) {
            Object obj2 = analysisHandlerProvider.get();
            Intrinsics.h(obj2);
            return (u41) obj2;
        }
        if (documentScannerRepository.l()) {
            Object obj3 = backgroundUploadProvider.get();
            Intrinsics.h(obj3);
            return (u41) obj3;
        }
        Object obj4 = localHandlerProvider.get();
        Intrinsics.h(obj4);
        return (u41) obj4;
    }

    public final u41 a(Optional customStepConfirmationHandler) {
        Intrinsics.checkNotNullParameter(customStepConfirmationHandler, "customStepConfirmationHandler");
        if (customStepConfirmationHandler.isPresent()) {
            return new q21(zhm.u.c(customStepConfirmationHandler.get()));
        }
        return new e80();
    }

    public final u41 a(wf analysisConfig, fl documentIdentifierRepository, t1 analyzeImageWorker, i1 analysisStepRepository, ah validator, aq0 popupHandler, Optional customStepConfirmationHandler, sg0 tracker) {
        Iterable iterableC;
        Intrinsics.checkNotNullParameter(analysisConfig, "analysisConfig");
        Intrinsics.checkNotNullParameter(documentIdentifierRepository, "documentIdentifierRepository");
        Intrinsics.checkNotNullParameter(analyzeImageWorker, "analyzeImageWorker");
        Intrinsics.checkNotNullParameter(analysisStepRepository, "analysisStepRepository");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(customStepConfirmationHandler, "customStepConfirmationHandler");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        u41 g1Var = new g1(documentIdentifierRepository, analyzeImageWorker, analysisStepRepository, validator, popupHandler, new jq(tracker));
        if (customStepConfirmationHandler.isPresent()) {
            iterableC = zhm.u.c(customStepConfirmationHandler.get());
        } else {
            iterableC = zhm.f0.f322471a;
        }
        if (lh0.f30621a.c()) {
            g1Var = new u10(g1Var);
        }
        return new q21(zhm.d0.E0(iterableC, zhm.u.c(g1Var)));
    }

    public final ah a(to documentScannerRepository, List supportedCountries) {
        Intrinsics.checkNotNullParameter(documentScannerRepository, "documentScannerRepository");
        Intrinsics.checkNotNullParameter(supportedCountries, "supportedCountries");
        return new ah(new sh(new OcrCountryAndTypeValidator(new ti1(supportedCountries, 2))), new hq(), documentScannerRepository.isDynamicStepsEnabled());
    }

    public final i1 a(to documentScannerRepository, wf documentAnalysisConfig) {
        Intrinsics.checkNotNullParameter(documentScannerRepository, "documentScannerRepository");
        Intrinsics.checkNotNullParameter(documentAnalysisConfig, "documentAnalysisConfig");
        return new j1(documentAnalysisConfig.getImageUploadTimeoutMs(), documentScannerRepository.isDynamicStepsEnabled(), documentScannerRepository.n());
    }

    public final u41 a(fl documentIdentifierRepository, nc1 uploadDocumentImageWorker) {
        Intrinsics.checkNotNullParameter(documentIdentifierRepository, "documentIdentifierRepository");
        Intrinsics.checkNotNullParameter(uploadDocumentImageWorker, "uploadDocumentImageWorker");
        return new q21(zhm.u.c(new b20(documentIdentifierRepository, uploadDocumentImageWorker)));
    }

    public final nc1 a(Function0 workflowIdProvider, bg documentAnalysisBundle, Optional dataWorkManager, to repository, ib0 networkService) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(documentAnalysisBundle, "documentAnalysisBundle");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        if (cg.b(documentAnalysisBundle)) {
            if (dataWorkManager.isPresent() && (documentAnalysisBundle instanceof gj)) {
                gj gjVar = (gj) documentAnalysisBundle;
                Object obj2 = dataWorkManager.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                return new nb0(workflowIdProvider, gjVar, (ke) obj2, repository.i());
            }
            wz.a("Product is not correctly configured for Document Analysis endpoint.");
            throw new KotlinNothingValueException();
        }
        return new t50(workflowIdProvider, networkService, repository.i());
    }
}
