package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.w81;
import com.fourthline.vision.document.DocumentScannerConfig;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class r91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j91 f32654a;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[x71.values().length];
            try {
                iArr[x71.f34915b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x71.f34916c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x71.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public r91(j91 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f32654a = flowConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(g51 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return true;
    }

    public final g91 c() {
        return new g91(this.f32654a.getTaxationCountry());
    }

    public final b31 d(gj documentFlowDataBundle) {
        Intrinsics.checkNotNullParameter(documentFlowDataBundle, "documentFlowDataBundle");
        Boolean boolF = this.f32654a.getIsTinCaptureRequired();
        if (boolF != null) {
            return new az0(boolF.booleanValue());
        }
        int i = a.$EnumSwitchMapping$0[this.f32654a.getTaxationCountry().ordinal()];
        if (i == 1) {
            return new g31();
        }
        if (i == 2) {
            return new k40();
        }
        if (i == 3) {
            return new b90(documentFlowDataBundle.f());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b() {
        return 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fd c(gj gjVar) {
        return gjVar.g();
    }

    public final a31 a(gj documentFlowDataBundle, b31 skipDocumentScannerUseCaseEvaluator) {
        Intrinsics.checkNotNullParameter(documentFlowDataBundle, "documentFlowDataBundle");
        Intrinsics.checkNotNullParameter(skipDocumentScannerUseCaseEvaluator, "skipDocumentScannerUseCaseEvaluator");
        return new a31(this.f32654a, documentFlowDataBundle.f(), new br1(documentFlowDataBundle, 1), skipDocumentScannerUseCaseEvaluator);
    }

    public final w81 e(gj documentBundle) {
        Intrinsics.checkNotNullParameter(documentBundle, "documentBundle");
        int i = a.$EnumSwitchMapping$0[this.f32654a.getTaxationCountry().ordinal()];
        if (i == 1) {
            return w81.a.f34549g;
        }
        if (i == 2) {
            return w81.b.f34550g;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        di diVarO = documentBundle.o();
        return new w81.c(diVarO != null ? diVarO.c() : null);
    }

    public final j30 b(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new j30("tin", tracker);
    }

    public final a50 c(l91 flowCoordinator) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        return new a50(flowCoordinator);
    }

    public final wd1 b(ya1 flowActionProvider, o91 uploadDataRequestsBuilder, ry dataWorkManager, lz whatsNextWorker) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(uploadDataRequestsBuilder, "uploadDataRequestsBuilder");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, uploadDataRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final a91 b(m81 tinBundle) {
        Intrinsics.checkNotNullParameter(tinBundle, "tinBundle");
        return new b91(tinBundle);
    }

    public final wo b(gj documentFlowDataBundle) {
        Intrinsics.checkNotNullParameter(documentFlowDataBundle, "documentFlowDataBundle");
        return new wo(documentFlowDataBundle.n(), DocumentType.TIN_REFERENCE_DOCUMENT);
    }

    public final f31 a(vc1 tinBundleIsValidUseCase) {
        Intrinsics.checkNotNullParameter(tinBundleIsValidUseCase, "tinBundleIsValidUseCase");
        return new f31(tinBundleIsValidUseCase);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k91 a(o80 navigationChannel, rb1 updateTinFromDocumentBundleUseCase, a31 skipDocumentScannerUseCase, bq0 popupHandlerBuilder, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(updateTinFromDocumentBundleUseCase, "updateTinFromDocumentBundleUseCase");
        Intrinsics.checkNotNullParameter(skipDocumentScannerUseCase, "skipDocumentScannerUseCase");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        updateTinFromDocumentBundleUseCase.b(this.f32654a.getTaxationCountry());
        return new k91(navigationChannel, new ko1(skipDocumentScannerUseCase, 28), popupHandlerBuilder.a(new q9(null, imageServiceLocator, 1, 0 == true ? 1 : 0)));
    }

    public final ab1 d() {
        int i = a.$EnumSwitchMapping$0[this.f32654a.getTaxationCountry().ordinal()];
        if (i == 1) {
            return new j31();
        }
        if (i == 2) {
            return new l40();
        }
        if (i == 3) {
            return new c90();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final z40 b(l91 flowCoordinator) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        return new z40(flowCoordinator);
    }

    public final no b(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new no(false, imageServiceLocator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(a31 a31Var) {
        return a31Var.a();
    }

    public final l91 a(o80 navigationChannel) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        return new l91(navigationChannel);
    }

    public final e40 a(j30 analytics, k91 flowCoordinator, l70 lottieServiceLocator) {
        d40 i31Var;
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        p70 p70VarA = lottieServiceLocator.a(k70.f30166s);
        int i = a.$EnumSwitchMapping$0[this.f32654a.getTaxationCountry().ordinal()];
        if (i == 1) {
            i31Var = new i31(p70VarA);
        } else if (i == 2) {
            i31Var = new j40(p70VarA);
        } else if (i == 3) {
            i31Var = new a90(p70VarA);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        d40 d40Var = i31Var;
        return new e40(analytics, new f80(d40Var), d40Var, flowCoordinator, p91.f31892a, null, null, 96, null);
    }

    public final f91 a() {
        return new f91(this.f32654a.getTaxationCountry());
    }

    public final dx a(m81 tinBundle) {
        Intrinsics.checkNotNullParameter(tinBundle, "tinBundle");
        return new ex(tinBundle);
    }

    public final q21 a(dx extractTinResultRepository) {
        ab1 j31Var;
        cx cxVar;
        Intrinsics.checkNotNullParameter(extractTinResultRepository, "extractTinResultRepository");
        x71 x71VarE = this.f32654a.getTaxationCountry();
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[x71VarE.ordinal()];
        if (i == 2 || i == 3) {
            nq1 nq1Var = new nq1(5);
            int i2 = iArr[x71VarE.ordinal()];
            if (i2 == 1) {
                j31Var = new j31();
            } else if (i2 == 2) {
                j31Var = new l40();
            } else if (i2 == 3) {
                j31Var = new c90();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            cxVar = new cx(x71VarE, extractTinResultRepository, nq1Var, j31Var);
        } else {
            cxVar = null;
        }
        return new q21(zhm.v.l(cxVar));
    }

    public final wd1 a(ya1 flowActionProvider, o91 uploadDataRequestsBuilder, ry dataWorkManager, lz whatsNextWorker) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(uploadDataRequestsBuilder, "uploadDataRequestsBuilder");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, uploadDataRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final ya1 a(r70 mainRepository, f31 skipTinDetailsUseCase) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(skipTinDetailsUseCase, "skipTinDetailsUseCase");
        return new ya1(s70.a(mainRepository), skipTinDetailsUseCase);
    }

    public final o81 a(r70 mainRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        return new o81(s70.a(mainRepository));
    }

    public final rb1 a(m81 tinBundle, gj documentFlowDataBundle) {
        Set setY0;
        Intrinsics.checkNotNullParameter(tinBundle, "tinBundle");
        Intrinsics.checkNotNullParameter(documentFlowDataBundle, "documentFlowDataBundle");
        int i = a.$EnumSwitchMapping$0[this.f32654a.getTaxationCountry().ordinal()];
        if (i == 1) {
            DocumentType[] elements = {DocumentType.ID_CARD, DocumentType.RESIDENCE_PERMIT};
            Intrinsics.checkNotNullParameter(elements, "elements");
            setY0 = kotlin.collections.d.y0(elements);
        } else if (i != 3) {
            setY0 = zhm.h0.f322473a;
        } else {
            DocumentType[] elements2 = {DocumentType.ID_CARD, DocumentType.PASSPORT};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            setY0 = kotlin.collections.d.y0(elements2);
        }
        return new rb1(tinBundle, documentFlowDataBundle, setY0);
    }

    public final x81 a(m81 tinBundle, ab1 tinValidator) {
        Intrinsics.checkNotNullParameter(tinBundle, "tinBundle");
        Intrinsics.checkNotNullParameter(tinValidator, "tinValidator");
        x71 x71VarE = this.f32654a.getTaxationCountry();
        String strA = tinBundle.a();
        if (strA == null || tinValidator.a(strA) != za1.f35552a) {
            strA = null;
        }
        return new y81(x71VarE, strA);
    }

    public final d91 a(a31 skipDocumentScannerUseCase, x81 repository, ab1 tinValidator, w81 tinSpecifics, v10 imageServiceLocator, sg0 tracker) {
        Intrinsics.checkNotNullParameter(skipDocumentScannerUseCase, "skipDocumentScannerUseCase");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(tinValidator, "tinValidator");
        Intrinsics.checkNotNullParameter(tinSpecifics, "tinSpecifics");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new d91(new p20(tracker), tinSpecifics, imageServiceLocator, skipDocumentScannerUseCase.a(), repository.b(), tinValidator);
    }

    public final e91 a(d91 stateProvider, p81 analytics, x81 repository, a91 resultRepository, k91 flowCoordinator, ab1 tinValidator, wd1 viewCompletionHandler, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(tinValidator, "tinValidator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new e91(repository, stateProvider, resultRepository, analytics, flowCoordinator, viewCompletionHandler, tinValidator, new wr(coroutineScope), new f80(stateProvider), popupHandler, coroutineScope);
    }

    public final wd1 a(o81 flowActionProvider, o91 uploadDataRequestsBuilder, ry dataWorkManager, lz whatsNextWorker) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(uploadDataRequestsBuilder, "uploadDataRequestsBuilder");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, uploadDataRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final o91 a(Function0 workflowIdProvider, m81 tinBundle, gj documentBundle) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(tinBundle, "tinBundle");
        Intrinsics.checkNotNullParameter(documentBundle, "documentBundle");
        return new o91(workflowIdProvider, tinBundle, documentBundle);
    }

    public final p81 a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new p81(tracker);
    }

    public final uo a(gj documentFlowDataBundle) {
        Intrinsics.checkNotNullParameter(documentFlowDataBundle, "documentFlowDataBundle");
        boolean z = false;
        boolean z3 = false;
        return new uo(new DocumentScannerConfig(DocumentType.TIN_REFERENCE_DOCUMENT, false, false, false, null, null, null, null, 0L, false, 1018, null), documentFlowDataBundle.g(), false, z, z3, false, false, 0.8d, this.f32654a.getCameraX().getEnabled(), null, null, 1120, null);
    }

    public final b50 a(l91 scannerCoordinator) {
        Intrinsics.checkNotNullParameter(scannerCoordinator, "scannerCoordinator");
        return new b50(scannerCoordinator);
    }

    public final tm a(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new tm(true, new nr1(6), imageServiceLocator);
    }
}
