package com.fourthline.vision.internal;

import android.content.Context;
import androidx.camera.core.CameraSelector;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerError;
import com.fourthline.vision.document.compose.DocumentScannerEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class i5 {

    public static final class a implements Flow {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f36348a;

        /* JADX INFO: renamed from: com.fourthline.vision.internal.i5$a$a, reason: collision with other inner class name */
        public static final class C0330a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f36349a;

            /* JADX INFO: renamed from: com.fourthline.vision.internal.i5$a$a$a, reason: collision with other inner class name */
            public static final class C0331a extends gim.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f36350a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f36351b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f36352c;
                Object e;
                Object f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                Object f36353g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                int f36354h;

                public C0331a(Continuation continuation) {
                    super(continuation);
                }

                @Override // gim.a
                public final Object invokeSuspend(Object obj2) {
                    this.f36350a = obj2;
                    this.f36351b |= Integer.MIN_VALUE;
                    return C0330a.this.emit(null, this);
                }
            }

            public C0330a(FlowCollector flowCollector) {
                this.f36349a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.fourthline.vision.internal.i5.a.C0330a.C0331a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.fourthline.vision.internal.i5$a$a$a r0 = (com.fourthline.vision.internal.i5.a.C0330a.C0331a) r0
                    int r1 = r0.f36351b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f36351b = r1
                    goto L18
                L13:
                    com.fourthline.vision.internal.i5$a$a$a r0 = new com.fourthline.vision.internal.i5$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f36350a
                    fim.a r1 = fim.a.COROUTINE_SUSPENDED
                    int r2 = r0.f36351b
                    r3 = 1
                    if (r2 == 0) goto L37
                    if (r2 != r3) goto L2f
                    java.lang.Object r5 = r0.f36353g
                    kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                    java.lang.Object r5 = r0.e
                    com.fourthline.vision.internal.i5$a$a$a r5 = (com.fourthline.vision.internal.i5.a.C0330a.C0331a) r5
                    yhm.o.b(r6)
                    goto L75
                L2f:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L37:
                    yhm.o.b(r6)
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f36349a
                    com.fourthline.vision.document.compose.DocumentScannerControl r5 = (com.fourthline.vision.document.compose.DocumentScannerControl) r5
                    boolean r2 = r5 instanceof com.fourthline.vision.document.compose.DocumentScannerControl.MoveToNextStep
                    if (r2 == 0) goto L45
                    com.fourthline.vision.VisionScannerEvent$MoveToNextStep r5 = com.fourthline.vision.VisionScannerEvent.MoveToNextStep.INSTANCE
                    goto L60
                L45:
                    boolean r2 = r5 instanceof com.fourthline.vision.document.compose.DocumentScannerControl.ResetCurrentStep
                    if (r2 == 0) goto L4c
                    com.fourthline.vision.VisionScannerEvent$ResetCurrentStep r5 = com.fourthline.vision.VisionScannerEvent.ResetCurrentStep.INSTANCE
                    goto L60
                L4c:
                    boolean r2 = r5 instanceof com.fourthline.vision.document.compose.DocumentScannerControl.RestartScanner
                    if (r2 == 0) goto L53
                    com.fourthline.vision.VisionScannerEvent$RestartScanner r5 = com.fourthline.vision.VisionScannerEvent.RestartScanner.INSTANCE
                    goto L60
                L53:
                    boolean r2 = r5 instanceof com.fourthline.vision.document.compose.DocumentScannerControl.StartScanner
                    if (r2 == 0) goto L5a
                    com.fourthline.vision.VisionScannerEvent$StartScanner r5 = com.fourthline.vision.VisionScannerEvent.StartScanner.INSTANCE
                    goto L60
                L5a:
                    boolean r5 = r5 instanceof com.fourthline.vision.document.compose.DocumentScannerControl.TakeSnapshot
                    if (r5 == 0) goto L78
                    com.fourthline.vision.VisionScannerEvent$TakeSnapshot r5 = com.fourthline.vision.VisionScannerEvent.TakeSnapshot.INSTANCE
                L60:
                    r2 = 0
                    r0.f36352c = r2
                    r0.e = r2
                    r0.f = r2
                    r0.f36353g = r2
                    r2 = 0
                    r0.f36354h = r2
                    r0.f36351b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L75
                    return r1
                L75:
                    kotlin.Unit r5 = kotlin.Unit.f186387a
                    return r5
                L78:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.i5.a.C0330a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(Flow flow) {
            this.f36348a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f36348a.collect(new C0330a(flowCollector), continuation);
            return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[pa.values().length];
            try {
                iArr[pa.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pa.f36698g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void CameraXDocumentScanner(@NotNull DocumentScannerConfig config, @NotNull Function0<Rect> documentDetectionAreaProvider, @NotNull Flow controls, @NotNull Function1<? super DocumentScannerEvent, Unit> callback, @NotNull Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        int i2;
        d3 d3Var;
        DocumentScannerConfig documentScannerConfig;
        Function1<? super DocumentScannerEvent, Unit> function1;
        u uVar;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(documentDetectionAreaProvider, "documentDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(controls, "controls");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(153951283);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(config) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(documentDetectionAreaProvider) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(controls) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(callback) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(153951283, i3, -1, "com.fourthline.visionx.document.CameraXDocumentScanner (DocumentScannerComposable.kt:37)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new od(0, 0), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.g.f186406a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new d3(context, coroutineScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            d3 d3Var2 = (d3) objRememberedValue3;
            CameraSelector DEFAULT_BACK_CAMERA = CameraSelector.DEFAULT_BACK_CAMERA;
            Intrinsics.checkNotNullExpressionValue(DEFAULT_BACK_CAMERA, "DEFAULT_BACK_CAMERA");
            u uVarRememberCameraXEngine = q0.rememberCameraXEngine(DEFAULT_BACK_CAMERA, config.getInternalConfig().getPreferredVideoRecordingBitrate(), composerStartRestartGroup, 0);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                rd rdVarStateMachine = d3Var2.stateMachine(config, uVarRememberCameraXEngine, new sg(mutableState, 0), documentDetectionAreaProvider, callback);
                uVar = uVarRememberCameraXEngine;
                d3Var = d3Var2;
                documentScannerConfig = config;
                function1 = callback;
                composerStartRestartGroup.updateRememberedValue(rdVarStateMachine);
                objRememberedValue4 = rdVarStateMachine;
            } else {
                d3Var = d3Var2;
                documentScannerConfig = config;
                function1 = callback;
                uVar = uVarRememberCameraXEngine;
            }
            rd rdVar = (rd) objRememberedValue4;
            RecordingType recordingType = documentScannerConfig.getRecordingType();
            boolean debugModeEnabled = documentScannerConfig.getDebugModeEnabled();
            u uVar2 = uVar;
            a aVar = new a(controls);
            boolean z = (i3 & 7168) == 2048;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new tg(0, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function1 function12 = (Function1) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new ug(mutableState, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Function1 function13 = (Function1) objRememberedValue6;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(d3Var) | composerStartRestartGroup.changedInstance(documentScannerConfig) | composerStartRestartGroup.changedInstance(rdVar);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new com.fourthline.core.location.internal.b(documentScannerConfig, 10, rdVar, d3Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            yf.VisionXComposable(recordingType, rdVar, uVar2, debugModeEnabled, aVar, function12, function13, (Function1) objRememberedValue7, documentDetectionAreaProvider, content, composerStartRestartGroup, ((i3 << 21) & 234881024) | 1572864 | ((i3 << 15) & 1879048192), 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(rdVar);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new vg(rdVar, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            v1.OnLifecycleEvent((Function1) objRememberedValue8, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wg(config, documentDetectionAreaProvider, controls, callback, content, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final od CameraXDocumentScanner$lambda$1(MutableState<od> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraXDocumentScanner$lambda$10(DocumentScannerConfig documentScannerConfig, Function0 function0, Flow flow, Function1 function1, Function2 function2, int i, Composer composer, int i2) {
        CameraXDocumentScanner(documentScannerConfig, function0, flow, function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraXDocumentScanner$lambda$6$0(Function1 function1, pa VisionXComposable) {
        DocumentScannerError documentScannerError;
        Intrinsics.checkNotNullParameter(VisionXComposable, "$this$VisionXComposable");
        int i = b.$EnumSwitchMapping$0[VisionXComposable.ordinal()];
        if (i == 1) {
            documentScannerError = DocumentScannerError.CAMERA_PERMISSION_NOT_GRANTED;
        } else {
            if (i != 2) {
                throw new IllegalStateException("handled differently");
            }
            documentScannerError = DocumentScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED;
        }
        function1.invoke(new DocumentScannerEvent.OnFail(documentScannerError));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraXDocumentScanner$lambda$7$0(MutableState mutableState, Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        mutableState.setValue(new od((int) (rect.getRight() - rect.getLeft()), (int) (rect.getBottom() - rect.getTop())));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraXDocumentScanner$lambda$8$0(DocumentScannerConfig documentScannerConfig, rd rdVar, d3 d3Var, l0 l0Var) {
        if (l0Var != null) {
            d3Var.setCameraSpecsOnScannerContext(l0Var);
        }
        if (documentScannerConfig.getShouldStartAutomatically()) {
            rdVar.start();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraXDocumentScanner$lambda$9$0(rd rdVar, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_PAUSE) {
            rdVar.stop();
        }
        return Unit.f186387a;
    }
}
