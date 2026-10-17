package com.fourthline.vision.internal;

import android.graphics.Rect;
import android.util.Size;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.core.mrz.ValidationError;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepWarning;
import com.fourthline.vision.document.MrzValidationPolicy;
import com.fourthline.vision.document.compose.DocumentScannerEvent;
import com.fourthline.vision.internal.e3;
import com.google.mlkit.vision.text.Text;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class e5 implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerConfig f36133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f36134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g3 f36135c;
    private final q5 d;
    private final u7 e;
    private final Function1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CoroutineScope f36136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f36137h;
    private d5 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Job f36138j;

    public interface a {
        void a(d5 d5Var);
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MrzValidationPolicy.values().length];
            try {
                iArr[MrzValidationPolicy.STRONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MrzValidationPolicy.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MrzValidationPolicy.WEAK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36139a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return e5.this.new c(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36139a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f36139a = 1;
                if (skm.k0.b(500L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            e5.this.acceptBestMrzCandidate();
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public e5(@NotNull DocumentScannerConfig config, @NotNull u cameraEngine, @NotNull g3 documentDetectionAreaProvider, @NotNull q5 stepFlowRepository, @NotNull u7 isSteadyProvider, @NotNull Function1<? super DocumentScannerEvent, Unit> onEvent, @NotNull CoroutineScope coroutineScope, @NotNull a onMrzCandidateAvailable) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(cameraEngine, "cameraEngine");
        Intrinsics.checkNotNullParameter(documentDetectionAreaProvider, "documentDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(stepFlowRepository, "stepFlowRepository");
        Intrinsics.checkNotNullParameter(isSteadyProvider, "isSteadyProvider");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onMrzCandidateAvailable, "onMrzCandidateAvailable");
        this.f36133a = config;
        this.f36134b = cameraEngine;
        this.f36135c = documentDetectionAreaProvider;
        this.d = stepFlowRepository;
        this.e = isSteadyProvider;
        this.f = onEvent;
        this.f36136g = coroutineScope;
        this.f36137h = onMrzCandidateAvailable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void acceptBestMrzCandidate() {
        d5 d5Var = this.i;
        if (d5Var == null) {
            return;
        }
        this.d.setRecognizedBounds(d5Var.getDetectionArea());
        resetMrzCandidateState();
        this.f36137h.a(d5Var);
    }

    private final boolean doesPassPolicy(MrzInfo mrzInfo) {
        int i = b.$EnumSwitchMapping$0[this.f36133a.getMrzValidationPolicy().ordinal()];
        if (i == 1) {
            return filteredErrorCount(mrzInfo) == 0;
        }
        if (i == 2) {
            return filteredErrorCount(mrzInfo) < 2;
        }
        if (i == 3) {
            return filteredErrorCount(mrzInfo) < 4;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0014 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int filteredErrorCount(com.fourthline.core.mrz.MrzInfo r5) {
        /*
            r4 = this;
            java.util.List r5 = r5.getValidationErrors()
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L10
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L10
            return r1
        L10:
            java.util.Iterator r5 = r5.iterator()
        L14:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r5.next()
            com.fourthline.core.mrz.ValidationError r0 = (com.fourthline.core.mrz.ValidationError) r0
            com.fourthline.vision.document.DocumentScannerConfig r2 = r4.f36133a
            com.fourthline.vision.document.MrzValidationPolicy r2 = r2.getMrzValidationPolicy()
            int[] r3 = com.fourthline.vision.internal.e5.b.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r3 = 1
            if (r2 == r3) goto L4b
            r3 = 2
            if (r2 == r3) goto L3e
            r3 = 3
            if (r2 != r3) goto L38
            goto L3e
        L38:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L3e:
            com.fourthline.core.mrz.MrtdMrzInfoValidationError r2 = com.fourthline.core.mrz.MrtdMrzInfoValidationError.TRUNCATED_NAMES
            if (r0 == r2) goto L14
            com.fourthline.core.mrz.MrtdMrzInfoValidationError r2 = com.fourthline.core.mrz.MrtdMrzInfoValidationError.INVALID_TOTAL_CHECKSUM
            if (r0 == r2) goto L14
            com.fourthline.core.mrz.IdlMrzInfoValidationError r2 = com.fourthline.core.mrz.IdlMrzInfoValidationError.INVALID_TOTAL_CHECKSUM
            if (r0 != r2) goto L50
            goto L14
        L4b:
            com.fourthline.core.mrz.MrtdMrzInfoValidationError r2 = com.fourthline.core.mrz.MrtdMrzInfoValidationError.TRUNCATED_NAMES
            if (r0 != r2) goto L50
            goto L14
        L50:
            int r1 = r1 + 1
            if (r1 < 0) goto L55
            goto L14
        L55:
            zhm.v.r()
            r5 = 0
            throw r5
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.e5.filteredErrorCount(com.fourthline.core.mrz.MrzInfo):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handleDetectedText$lambda$0(Rect rect, e5 e5Var, com.google.mlkit.vision.text.a textBlock) {
        fa rectangle;
        Intrinsics.checkNotNullParameter(textBlock, "textBlock");
        Rect rect2 = (Rect) textBlock.f151344b;
        fa faVar = (rect2 == null || (rectangle = ga.toRectangle(rect2)) == null) ? null : (fa) e5Var.f36134b.getCoordinates().getBoundingBoxToScreen().invoke(rectangle);
        return faVar != null && rect.contains(ga.toRect(faVar));
    }

    private final boolean isPerfectMrz(MrzInfo mrzInfo) {
        return filteredErrorCount(mrzInfo) == 0;
    }

    private final void resetMrzCandidateState() {
        this.i = null;
        Job job2 = this.f36138j;
        if (job2 != null) {
            job2.f(null);
        }
        this.f36138j = null;
    }

    private final MrzInfo tryCreateMrzCandidate(String str) {
        MrzInfo mrzInfoCreate = MrzInfo.INSTANCE.create(str);
        if (mrzInfoCreate != null) {
            mrzInfoCreate.getRawMrz();
            List<ValidationError> validationErrors = mrzInfoCreate.getValidationErrors();
            filteredErrorCount(mrzInfoCreate);
            Objects.toString(validationErrors);
            if (doesPassPolicy(mrzInfoCreate)) {
                return mrzInfoCreate;
            }
        }
        return null;
    }

    public final void cancel() {
        resetMrzCandidateState();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f36136g.getF74819h();
    }

    public final void handleDetectedBarcodes(@NotNull rf step, @NotNull List<? extends fh.a> barcodes) {
        d5 d5Var;
        MrzInfo mrzInfoTryCreateMrzCandidate;
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(barcodes, "barcodes");
        Iterator<T> it8 = barcodes.iterator();
        do {
            d5Var = null;
            if (!it8.hasNext()) {
                break;
            }
            fh.a aVar = (fh.a) it8.next();
            String strA = aVar.f135117a.a();
            if (strA != null && (mrzInfoTryCreateMrzCandidate = tryCreateMrzCandidate(strA)) != null) {
                Function1<fa, fa> boundingBoxToScreen = this.f36134b.getCoordinates().getBoundingBoxToScreen();
                Rect rect = aVar.f135118b;
                Intrinsics.h(rect);
                d5Var = new d5(mrzInfoTryCreateMrzCandidate, (fa) boundingBoxToScreen.invoke(ga.toRectangle(rect)));
            }
        } while (d5Var == null);
        if (d5Var != null) {
            processMrzCandidate(step, d5Var);
        }
    }

    public final void handleDetectedText(@NotNull rf step, @NotNull Text text) {
        d5 d5Var;
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(text, "text");
        Rect documentDetectionArea = this.f36135c.getDocumentDetectionArea();
        k9 k9Var = new k9(new b9(), new m9());
        e3.c cVarBuildDetectionRoot = new d9(new com.fourthline.core.location.internal.d(documentDetectionArea, this, 1)).buildDetectionRoot(text);
        fa faVar = (fa) this.f36134b.getCoordinates().getScreenToBoundingBox().invoke(ga.toRectangle(documentDetectionArea));
        e3.c cVarCorrect = k9Var.correct(cVarBuildDetectionRoot, new Size(faVar.width(), faVar.height()));
        Iterator<T> it8 = cVarCorrect.getTexts().iterator();
        while (it8.hasNext()) {
            ((e3.d) it8.next()).getText();
        }
        if (!this.e.isSteady()) {
            this.f.invoke(new DocumentScannerEvent.OnWarnings(zhm.u.c(DocumentScannerStepWarning.DEVICE_NOT_STEADY)));
            return;
        }
        Iterator<T> it9 = cVarCorrect.getTexts().iterator();
        do {
            d5Var = null;
            if (!it9.hasNext()) {
                break;
            }
            e3.d dVar = (e3.d) it9.next();
            MrzInfo mrzInfoTryCreateMrzCandidate = tryCreateMrzCandidate(dVar.getText());
            if (mrzInfoTryCreateMrzCandidate != null) {
                d5Var = new d5(mrzInfoTryCreateMrzCandidate, (fa) this.f36134b.getCoordinates().getBoundingBoxToScreen().invoke(dVar.getBox()));
            }
        } while (d5Var == null);
        if (d5Var != null) {
            processMrzCandidate(step, d5Var);
        }
    }

    public final void processMrzCandidate(@NotNull rf step, @NotNull d5 candidate) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        this.d.setRecognizedBounds(candidate.getDetectionArea());
        this.d.addMrzResult(step, candidate);
        DocumentScannerStep documentScannerStep = (DocumentScannerStep) step.getPublicStep();
        documentScannerStep.isAutoDetectAvailable();
        filteredErrorCount(candidate.getMrzInfo());
        documentScannerStep.toString();
        if (documentScannerStep.isAutoDetectAvailable()) {
            if (isPerfectMrz(candidate.getMrzInfo())) {
                resetMrzCandidateState();
                this.f36137h.a(candidate);
                return;
            }
            d5 d5Var = this.i;
            if (d5Var == null) {
                this.i = candidate;
                Job job2 = this.f36138j;
                if (job2 != null) {
                    job2.f(null);
                }
                this.f36138j = skm.e0.C(this, null, null, new c(null), 3);
                return;
            }
            if (filteredErrorCount(candidate.getMrzInfo()) < filteredErrorCount(d5Var.getMrzInfo())) {
                filteredErrorCount(candidate.getMrzInfo());
                filteredErrorCount(d5Var.getMrzInfo());
                this.i = candidate;
            }
        }
    }
}
