package com.fourthline.vision.internal;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.internal.VisionDocumentScannerFeatureConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class t5 implements d2, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VisionDocumentScannerFeatureConfig f36926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f36927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oa f36928c;
    private final Function1 d;
    private final List e;
    private final q7 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q7 f36929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q7 f36930h;
    private final q7 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final q7 f36931j;
    private final qd k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final o7 f36932l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final w7 f36933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f36934n;
    private final CoroutineContext o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final MutableState f36935p;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.PAPER_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public t5(@NotNull VisionDocumentScannerFeatureConfig featureConfig, @NotNull Function0<DocumentScannerConfig> configFactory, @NotNull oa scannerDetectionAreaProvider, @NotNull Function1<? super x5, ? extends m> timeoutFactory, @NotNull List<? extends q7> automaticWarnings, @NotNull q7 automaticProcessor, @NotNull q7 manualProcessor, @NotNull q7 dutchIdlManualStepMrzExtractor, @NotNull q7 manualStepMrzExtractor, @NotNull q7 detector, @NotNull qd triggerPrecondition, @NotNull o7 imageTooDarkConsumer, @NotNull w7 isSteadyWarningInteractor, @NotNull List<? extends x1> postProcessors, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        Intrinsics.checkNotNullParameter(configFactory, "configFactory");
        Intrinsics.checkNotNullParameter(scannerDetectionAreaProvider, "scannerDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(timeoutFactory, "timeoutFactory");
        Intrinsics.checkNotNullParameter(automaticWarnings, "automaticWarnings");
        Intrinsics.checkNotNullParameter(automaticProcessor, "automaticProcessor");
        Intrinsics.checkNotNullParameter(manualProcessor, "manualProcessor");
        Intrinsics.checkNotNullParameter(dutchIdlManualStepMrzExtractor, "dutchIdlManualStepMrzExtractor");
        Intrinsics.checkNotNullParameter(manualStepMrzExtractor, "manualStepMrzExtractor");
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(triggerPrecondition, "triggerPrecondition");
        Intrinsics.checkNotNullParameter(imageTooDarkConsumer, "imageTooDarkConsumer");
        Intrinsics.checkNotNullParameter(isSteadyWarningInteractor, "isSteadyWarningInteractor");
        Intrinsics.checkNotNullParameter(postProcessors, "postProcessors");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f36926a = featureConfig;
        this.f36927b = configFactory;
        this.f36928c = scannerDetectionAreaProvider;
        this.d = timeoutFactory;
        this.e = automaticWarnings;
        this.f = automaticProcessor;
        this.f36929g = manualProcessor;
        this.f36930h = dutchIdlManualStepMrzExtractor;
        this.i = manualStepMrzExtractor;
        this.f36931j = detector;
        this.k = triggerPrecondition;
        this.f36932l = imageTooDarkConsumer;
        this.f36933m = isSteadyWarningInteractor;
        this.f36934n = postProcessors;
        this.o = coroutineContext;
        this.f36935p = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
    }

    private final List<td> allManualSteps() {
        td[] elements = {compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.FRONT, false, null, 12, null), createIfAngledEnabled(new dh(this, 12)), compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.BACK, false, null, 12, null), createIfAngledEnabled(new dh(this, 2))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final td allManualSteps$lambda$0(t5 t5Var) {
        return compositeManualStep$default(t5Var, t5Var.getAndIncrementStepIndex(), DocumentFileSide.FRONT, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final td allManualSteps$lambda$1(t5 t5Var) {
        return compositeManualStep$default(t5Var, t5Var.getAndIncrementStepIndex(), DocumentFileSide.BACK, true, null, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final td automaticStep(int i, DocumentFileSide documentFileSide, boolean z) {
        Function1 function1 = this.d;
        x5 x5Var = x5.f37092b;
        ArrayList arrayListN = zhm.v.n(function1.invoke(x5Var));
        if (this.f36926a.getSupportedAutoDetectMode(getConfig().getType()) == VisionDocumentScannerFeatureConfig.AutoDetectMode.DirectCapture) {
            arrayListN.add(this.d.invoke(x5.f37093c));
        }
        h hVar = new h(new sd(new DocumentScannerStep(i, documentFileSide, z, true), false, 2, null), arrayListN, zhm.f0.f322471a, this.e, this.f, this.f36931j, this.f36934n);
        q7 q7Var = this.i;
        Function1 function12 = this.d;
        x5 x5Var2 = x5.f37091a;
        td tdVarStepWithTrigger = stepWithTrigger(hVar, manualStep(i, documentFileSide, z, q7Var, zhm.v.k(this.d.invoke(x5Var), function12.invoke(x5Var2))));
        return this.f36926a.getSupportedAutoDetectMode(getConfig().getType()) == VisionDocumentScannerFeatureConfig.AutoDetectMode.UserAssist ? tdVarStepWithTrigger : new cd((m) this.d.invoke(x5Var2), tdVarStepWithTrigger, compositeManualStep(i, documentFileSide, z, this.i));
    }

    public static /* synthetic */ td automaticStep$default(t5 t5Var, int i, DocumentFileSide documentFileSide, boolean z, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return t5Var.automaticStep(i, documentFileSide, z);
    }

    private final td automaticStepIfEnabled(int i, DocumentFileSide documentFileSide, boolean z) {
        return this.f36926a.isAutoDetectAvailable() ? automaticStep(i, documentFileSide, z) : compositeManualStep$default(this, i, documentFileSide, z, null, 8, null);
    }

    public static /* synthetic */ td automaticStepIfEnabled$default(t5 t5Var, int i, DocumentFileSide documentFileSide, boolean z, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return t5Var.automaticStepIfEnabled(i, documentFileSide, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final td compositeManualStep(int i, DocumentFileSide documentFileSide, boolean z, q7 q7Var) {
        return stepWithTrigger(warningsCheckerStep(i, documentFileSide, z), manualStep(i, documentFileSide, z, q7Var, zhm.v.k(this.d.invoke(x5.f37092b), this.d.invoke(x5.f37091a))));
    }

    public static /* synthetic */ td compositeManualStep$default(t5 t5Var, int i, DocumentFileSide documentFileSide, boolean z, q7 q7Var, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            q7Var = t5Var.f36929g;
        }
        return t5Var.compositeManualStep(i, documentFileSide, z, q7Var);
    }

    private final td createIfAngledEnabled(Function0<? extends td> function0) {
        if (getConfig().getIncludeAngledSteps()) {
            return (td) function0.invoke();
        }
        return null;
    }

    private final List<td> dutchDriversLicenseSteps() {
        td[] elements = {automaticStepIfEnabled$default(this, getAndIncrementStepIndex(), DocumentFileSide.FRONT, false, 4, null), createIfAngledEnabled(new dh(this, 8)), compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.BACK, false, this.f36930h, 4, null), createIfAngledEnabled(new dh(this, 9))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final td dutchDriversLicenseSteps$lambda$0(t5 t5Var) {
        return compositeManualStep$default(t5Var, t5Var.getAndIncrementStepIndex(), DocumentFileSide.FRONT, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final td dutchDriversLicenseSteps$lambda$1(t5 t5Var) {
        return compositeManualStep$default(t5Var, t5Var.getAndIncrementStepIndex(), DocumentFileSide.BACK, true, null, 8, null);
    }

    private final List<td> frontAutomaticBackManual() {
        td[] elements = {automaticStepIfEnabled$default(this, getAndIncrementStepIndex(), DocumentFileSide.FRONT, false, 4, null), createIfAngledEnabled(new dh(this, 10)), compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.BACK, false, null, 12, null), createIfAngledEnabled(new dh(this, 11))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final td frontAutomaticBackManual$lambda$0(t5 t5Var) {
        return compositeManualStep$default(t5Var, t5Var.getAndIncrementStepIndex(), DocumentFileSide.FRONT, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final td frontAutomaticBackManual$lambda$1(t5 t5Var) {
        return compositeManualStep$default(t5Var, t5Var.getAndIncrementStepIndex(), DocumentFileSide.BACK, true, null, 8, null);
    }

    private final List<td> frontManualBackAutomatic() {
        td[] elements = {compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.FRONT, false, null, 12, null), createIfAngledEnabled(new dh(this, 6)), automaticStepIfEnabled$default(this, getAndIncrementStepIndex(), DocumentFileSide.BACK, false, 4, null), createIfAngledEnabled(new dh(this, 7))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final td frontManualBackAutomatic$lambda$0(t5 t5Var) {
        return compositeManualStep$default(t5Var, t5Var.getAndIncrementStepIndex(), DocumentFileSide.FRONT, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final td frontManualBackAutomatic$lambda$1(t5 t5Var) {
        return compositeManualStep$default(t5Var, t5Var.getAndIncrementStepIndex(), DocumentFileSide.BACK, true, null, 8, null);
    }

    private final int getAndIncrementStepIndex() {
        MutableState mutableState = this.f36935p;
        int iIntValue = ((Number) mutableState.getValue()).intValue();
        mutableState.setValue(Integer.valueOf(iIntValue + 1));
        return iIntValue;
    }

    private final DocumentScannerConfig getConfig() {
        return (DocumentScannerConfig) this.f36927b.invoke();
    }

    private final List<td> getSteps() {
        List<td> listPassportSteps;
        switch (a.$EnumSwitchMapping$0[getConfig().getType().ordinal()]) {
            case 1:
                listPassportSteps = passportSteps();
                break;
            case 2:
                listPassportSteps = frontManualBackAutomatic();
                break;
            case 3:
                listPassportSteps = frontManualBackAutomatic();
                break;
            case 4:
                listPassportSteps = frontAutomaticBackManual();
                break;
            case 5:
                listPassportSteps = paperIdSteps();
                break;
            case 6:
                listPassportSteps = allManualSteps();
                break;
            case 7:
                listPassportSteps = dutchDriversLicenseSteps();
                break;
            case 8:
                listPassportSteps = proofOfAddressSteps();
                break;
            case 9:
                listPassportSteps = tinReferenceDocumentSteps();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f36935p.setValue(0);
        return listPassportSteps;
    }

    private final td manualStep(int i, DocumentFileSide documentFileSide, boolean z, q7 q7Var, List<? extends qd> list) {
        return new f8(this.f36928c, zhm.d0.F0(this.k, list), q7Var, new sd(new DocumentScannerStep(i, documentFileSide, z, false), false, 2, null), getF74819h());
    }

    public static /* synthetic */ td manualStep$default(t5 t5Var, int i, DocumentFileSide documentFileSide, boolean z, q7 q7Var, List list, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return t5Var.manualStep(i, documentFileSide, z, q7Var, list);
    }

    private final List<td> paperIdSteps() {
        td[] elements = {compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.INSIDE_LEFT, false, null, 12, null), compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.INSIDE_RIGHT, false, null, 12, null), createIfAngledEnabled(new dh(this, 3)), compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.BACK, false, null, 12, null)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final td paperIdSteps$lambda$0(t5 t5Var) {
        return compositeManualStep$default(t5Var, t5Var.getAndIncrementStepIndex(), DocumentFileSide.INSIDE_RIGHT, true, null, 8, null);
    }

    private final List<td> passportSteps() {
        td[] elements = {automaticStepIfEnabled$default(this, getAndIncrementStepIndex(), DocumentFileSide.FRONT, false, 4, null), createIfAngledEnabled(new dh(this, 1))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final td passportSteps$lambda$0(t5 t5Var) {
        return compositeManualStep$default(t5Var, t5Var.getAndIncrementStepIndex(), DocumentFileSide.FRONT, true, null, 8, null);
    }

    private final List<td> proofOfAddressSteps() {
        td[] elements = {compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.FRONT, false, null, 12, null), createIfAngledEnabled(new dh(this, 4))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final td proofOfAddressSteps$lambda$0(t5 t5Var) {
        return compositeManualStep$default(t5Var, t5Var.getAndIncrementStepIndex(), DocumentFileSide.FRONT, true, null, 8, null);
    }

    private final td stepWithTrigger(td tdVar, td tdVar2) {
        return this.f36926a.getSupportedAutoDetectMode(getConfig().getType()) == VisionDocumentScannerFeatureConfig.AutoDetectMode.UserAssist ? new aa(tdVar, tdVar2) : new t9(tdVar, tdVar2);
    }

    private final List<td> tinReferenceDocumentSteps() {
        td[] elements = {compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.FRONT, false, null, 12, null), createIfAngledEnabled(new dh(this, 5))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final td tinReferenceDocumentSteps$lambda$0(t5 t5Var) {
        return compositeManualStep$default(t5Var, t5Var.getAndIncrementStepIndex(), DocumentFileSide.FRONT, true, null, 8, null);
    }

    private final td warningsCheckerStep(int i, DocumentFileSide documentFileSide, boolean z) {
        return new s5(new sd(new DocumentScannerStep(i, documentFileSide, z, false), false, 2, null), this.f36932l, this.f36933m);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.o;
    }

    @Override // com.fourthline.vision.internal.d2
    public /* bridge */ void subscribe(Function2<? super List<? extends td>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        super.subscribe(function2);
    }

    @Override // com.fourthline.vision.internal.d2
    @NotNull
    public List<td> get() {
        return getSteps();
    }
}
