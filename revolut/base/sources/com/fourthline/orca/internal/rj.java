package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.ContextExtensionsKt;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.MrzInfo;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class rj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32750b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f32751c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qo f32752a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[x71.values().length];
            try {
                iArr[x71.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x71.f34916c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x71.f34915b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rj(qo flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f32752a = flowConfig;
    }

    public final qo a(gj dataBundle) {
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        qo qoVar = this.f32752a;
        dataBundle.a(qoVar.e().a());
        return qoVar;
    }

    public final mi b(uk documentFlowRepository) {
        Intrinsics.checkNotNullParameter(documentFlowRepository, "documentFlowRepository");
        return documentFlowRepository;
    }

    public final wd1 c(cj flowActionProvider, al uploadDataRequestsBuilder, ry dataWorkManager, el whatsNextWorker) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(uploadDataRequestsBuilder, "uploadDataRequestsBuilder");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, uploadDataRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final List d() {
        return this.f32752a.h();
    }

    public final wf a() {
        return this.f32752a.b();
    }

    public final wd1 b(cj flowActionProvider, al uploadDataRequestsBuilder, ry dataWorkManager, el whatsNextWorker) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(uploadDataRequestsBuilder, "uploadDataRequestsBuilder");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, uploadDataRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final qq0 c() {
        return new qq0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(gj gjVar) {
        List<MrtdMrzInfoValidationError> validationErrors;
        if (gjVar.i() != null) {
            return true;
        }
        MrzInfo mrzInfoG = gjVar.f().g();
        MrtdMrzInfo mrtdMrzInfo = mrzInfoG instanceof MrtdMrzInfo ? (MrtdMrzInfo) mrzInfoG : null;
        return (mrtdMrzInfo == null || (validationErrors = mrtdMrzInfo.getValidationErrors()) == null) ? false : validationErrors.isEmpty();
    }

    public final uk a(gj bundle, yj0 personBundle, ef deviceDataBundle, sg0 analyticsTracker, cd0 nfcResultToBundleMapper, zc0 nfcCanFlowUseCase, boolean z) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        Intrinsics.checkNotNullParameter(deviceDataBundle, "deviceDataBundle");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        Intrinsics.checkNotNullParameter(nfcResultToBundleMapper, "nfcResultToBundleMapper");
        Intrinsics.checkNotNullParameter(nfcCanFlowUseCase, "nfcCanFlowUseCase");
        return new vk(this.f32752a, bundle, personBundle, deviceDataBundle, analyticsTracker, nfcResultToBundleMapper, nfcCanFlowUseCase.a(bundle.g()), this.f32752a.d().a(wk.f34723a.f()) ? true : this.f32752a.j(), this.f32752a.l().getBitrate(), z);
    }

    public final an b(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new an(tracker);
    }

    public final Function0 b(gj bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new br1(bundle, 2);
    }

    public final zc0 b() {
        return new pn1(this, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fourthline.orca.internal.q21 a(com.fourthline.orca.internal.gj r5, com.fourthline.orca.internal.dx r6) {
        /*
            r4 = this;
            java.lang.String r0 = "documentFlowDataBundle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "extractTinResultRepository"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.fourthline.orca.internal.fd r5 = r5.g()
            r0 = 0
            if (r5 == 0) goto L16
            java.lang.String r5 = r5.c()
            goto L17
        L16:
            r5 = r0
        L17:
            if (r5 == 0) goto L50
            int r1 = r5.hashCode()
            r2 = 68962(0x10d62, float:9.6636E-41)
            if (r1 == r2) goto L45
            r2 = 72822(0x11c76, float:1.02045E-40)
            if (r1 == r2) goto L39
            r2 = 77382(0x12e46, float:1.08435E-40)
            if (r1 == r2) goto L2d
            goto L50
        L2d:
            java.lang.String r1 = "NLD"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L36
            goto L50
        L36:
            com.fourthline.orca.internal.x71 r0 = com.fourthline.orca.internal.x71.d
            goto L50
        L39:
            java.lang.String r1 = "ITA"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L42
            goto L50
        L42:
            com.fourthline.orca.internal.x71 r0 = com.fourthline.orca.internal.x71.f34916c
            goto L50
        L45:
            java.lang.String r1 = "ESP"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L4e
            goto L50
        L4e:
            com.fourthline.orca.internal.x71 r0 = com.fourthline.orca.internal.x71.f34915b
        L50:
            if (r0 == 0) goto L8b
            com.fourthline.orca.internal.cx r5 = new com.fourthline.orca.internal.cx
            com.fourthline.orca.internal.nq1 r1 = new com.fourthline.orca.internal.nq1
            r2 = 6
            r1.<init>(r2)
            int[] r2 = com.fourthline.orca.internal.rj.b.$EnumSwitchMapping$0
            int r3 = r0.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L7d
            r3 = 2
            if (r2 == r3) goto L77
            r3 = 3
            if (r2 != r3) goto L71
            com.fourthline.orca.internal.j31 r2 = new com.fourthline.orca.internal.j31
            r2.<init>()
            goto L82
        L71:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L77:
            com.fourthline.orca.internal.l40 r2 = new com.fourthline.orca.internal.l40
            r2.<init>()
            goto L82
        L7d:
            com.fourthline.orca.internal.c90 r2 = new com.fourthline.orca.internal.c90
            r2.<init>()
        L82:
            r5.<init>(r0, r6, r1, r2)
            java.util.List r5 = zhm.u.c(r5)
            if (r5 != 0) goto L8d
        L8b:
            zhm.f0 r5 = zhm.f0.f322471a
        L8d:
            com.fourthline.orca.internal.q21 r6 = new com.fourthline.orca.internal.q21
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.rj.a(com.fourthline.orca.internal.gj, com.fourthline.orca.internal.dx):com.fourthline.orca.internal.q21");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(g51 stepResultConfirmation) {
        Intrinsics.checkNotNullParameter(stepResultConfirmation, "stepResultConfirmation");
        String strB = stepResultConfirmation.b();
        return Intrinsics.f(strB, "NLD") ? stepResultConfirmation.a() == DocumentType.ID_CARD && stepResultConfirmation.c().getFileSide() == DocumentFileSide.BACK : Intrinsics.f(strB, "ITA") && stepResultConfirmation.a() == DocumentType.ID_CARD && stepResultConfirmation.c().getFileSide() == DocumentFileSide.BACK;
    }

    public final qd1 a(Function0 workflowIdProvider, gj dataBundle, ry dataWorkManager) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        return new dr(workflowIdProvider, dataBundle, dataWorkManager);
    }

    public final el a(pf0 nfcScannerVideosWorker, lz delegate, Function0 nfcScannerRequiredUseCase) {
        Intrinsics.checkNotNullParameter(nfcScannerVideosWorker, "nfcScannerVideosWorker");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(nfcScannerRequiredUseCase, "nfcScannerRequiredUseCase");
        return new el(nfcScannerVideosWorker, this.f32752a, delegate, nfcScannerRequiredUseCase);
    }

    public final pf0 a(Context context, t9 cdnUrlDownloadWorker, r70 mainRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cdnUrlDownloadWorker, "cdnUrlDownloadWorker");
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        return new ma0(cdnUrlDownloadWorker, ContextExtensionsKt.getAssetsFourthlineDirectory(context), mainRepository.f());
    }

    public final al a(Function0 workflowIdProvider, gj dataBundle, yj0 personBundle, m81 tinBundle, vc1 skipNationalityUseCase, vc1 skipPersonDetailsUseCase, vc1 tinBundleIsValidUseCase) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        Intrinsics.checkNotNullParameter(tinBundle, "tinBundle");
        Intrinsics.checkNotNullParameter(skipNationalityUseCase, "skipNationalityUseCase");
        Intrinsics.checkNotNullParameter(skipPersonDetailsUseCase, "skipPersonDetailsUseCase");
        Intrinsics.checkNotNullParameter(tinBundleIsValidUseCase, "tinBundleIsValidUseCase");
        return new al(workflowIdProvider, dataBundle, personBundle, tinBundle, skipNationalityUseCase, skipPersonDetailsUseCase, tinBundleIsValidUseCase);
    }

    public final dx a(m81 tinBundle) {
        Intrinsics.checkNotNullParameter(tinBundle, "tinBundle");
        return new ex(tinBundle);
    }

    public final cj a(r70 mainRepository, gj dataBundle, Function0 skipDocumentDetailsUseCase, Function0 nfcScannerRequiredUseCase, uk flowRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(skipDocumentDetailsUseCase, "skipDocumentDetailsUseCase");
        Intrinsics.checkNotNullParameter(nfcScannerRequiredUseCase, "nfcScannerRequiredUseCase");
        Intrinsics.checkNotNullParameter(flowRepository, "flowRepository");
        return new cj(s70.a(mainRepository), this.f32752a, dataBundle, skipDocumentDetailsUseCase, nfcScannerRequiredUseCase, flowRepository);
    }

    public final in a(fj flowCoordinator, hn stateProvider, an analytics) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        return new in(new f80(stateProvider), flowCoordinator, analytics);
    }

    public final hn a(l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new hn(lottieServiceLocator.a(k70.f30163q), imageServiceLocator);
    }

    public final qi a(fj flowCoordinator, uk repository, oi stateProvider, ei analytics, TimestampProvider timestampProvider, wd1 viewCompletionHandler, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new qi(new f80(stateProvider), flowCoordinator, repository, stateProvider, analytics, timestampProvider, viewCompletionHandler, popupHandler, coroutineScope);
    }

    public final wd1 a(cj flowActionProvider, al uploadDataRequestsBuilder, ry dataWorkManager, el whatsNextWorker) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(uploadDataRequestsBuilder, "uploadDataRequestsBuilder");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, uploadDataRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final fi a(uk repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        return new vr(repository);
    }

    public final ei a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new ei(tracker);
    }

    public final oi a(v10 imageServiceLocator, mi repository, fi contentProvider, jy dateFormatter, sg0 tracker) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new xe(new p20(tracker), repository, imageServiceLocator, contentProvider, dateFormatter, new xr1(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(rj rjVar) {
        return rjVar.f32752a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(zc0 zc0Var, gj gjVar, Function0 function0) {
        return zc0Var.a(gjVar.g()) && ((Boolean) function0.invoke()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(sj0 sj0Var) {
        return !sj0Var.a();
    }

    public final fj a(o80 navigationChannel, Function0 nfcSupportedUseCase, zc0 nfcCanFlowUseCase, sj0 permissionChecker, aq0 popupHandler, c80 analyticsContext, gj documentFlowDataBundle) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(nfcSupportedUseCase, "nfcSupportedUseCase");
        Intrinsics.checkNotNullParameter(nfcCanFlowUseCase, "nfcCanFlowUseCase");
        Intrinsics.checkNotNullParameter(permissionChecker, "permissionChecker");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        Intrinsics.checkNotNullParameter(documentFlowDataBundle, "documentFlowDataBundle");
        return new fj(navigationChannel, new ir1(nfcCanFlowUseCase, documentFlowDataBundle, nfcSupportedUseCase, 1), new on1(permissionChecker, 3), popupHandler, this.f32752a.d().a(wk.f34723a.e()), analyticsContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(rj rjVar, fd fdVar) {
        String strC;
        if (rjVar.f32752a.g().getEnabled()) {
            if ((fdVar == null || (strC = fdVar.c()) == null) ? false : strC.equals("ESP")) {
                return true;
            }
        }
        return false;
    }

    public final oo a(uk repository, gj dataBundle) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        if (repository.isDynamicStepsEnabled()) {
            return new d31(repository.k(), dataBundle);
        }
        return new ye();
    }

    public final vg a(List countries, gj dataBundle) {
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        if (this.f32752a.d().a(wk.f34723a.e())) {
            return new c31(countries, this.f32752a, dataBundle);
        }
        return new bg0();
    }
}
