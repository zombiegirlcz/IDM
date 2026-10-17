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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.compose.SelfieScannerEvent;
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
public abstract class oc {

    public static final class a implements Flow {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f36628a;

        /* JADX INFO: renamed from: com.fourthline.vision.internal.oc$a$a, reason: collision with other inner class name */
        public static final class C0334a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f36629a;

            /* JADX INFO: renamed from: com.fourthline.vision.internal.oc$a$a$a, reason: collision with other inner class name */
            public static final class C0335a extends gim.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f36630a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f36631b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f36632c;
                Object e;
                Object f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                Object f36633g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                int f36634h;

                public C0335a(Continuation continuation) {
                    super(continuation);
                }

                @Override // gim.a
                public final Object invokeSuspend(Object obj2) {
                    this.f36630a = obj2;
                    this.f36631b |= Integer.MIN_VALUE;
                    return C0334a.this.emit(null, this);
                }
            }

            public C0334a(FlowCollector flowCollector) {
                this.f36629a = flowCollector;
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
                    boolean r0 = r6 instanceof com.fourthline.vision.internal.oc.a.C0334a.C0335a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.fourthline.vision.internal.oc$a$a$a r0 = (com.fourthline.vision.internal.oc.a.C0334a.C0335a) r0
                    int r1 = r0.f36631b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f36631b = r1
                    goto L18
                L13:
                    com.fourthline.vision.internal.oc$a$a$a r0 = new com.fourthline.vision.internal.oc$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f36630a
                    fim.a r1 = fim.a.COROUTINE_SUSPENDED
                    int r2 = r0.f36631b
                    r3 = 1
                    if (r2 == 0) goto L37
                    if (r2 != r3) goto L2f
                    java.lang.Object r5 = r0.f36633g
                    kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                    java.lang.Object r5 = r0.e
                    com.fourthline.vision.internal.oc$a$a$a r5 = (com.fourthline.vision.internal.oc.a.C0334a.C0335a) r5
                    yhm.o.b(r6)
                    goto L59
                L2f:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L37:
                    yhm.o.b(r6)
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f36629a
                    com.fourthline.vision.selfie.compose.SelfieScannerControl r5 = (com.fourthline.vision.selfie.compose.SelfieScannerControl) r5
                    boolean r5 = r5 instanceof com.fourthline.vision.selfie.compose.SelfieScannerControl.RestartScanner
                    if (r5 == 0) goto L5c
                    com.fourthline.vision.VisionScannerEvent$RestartScanner r5 = com.fourthline.vision.VisionScannerEvent.RestartScanner.INSTANCE
                    r2 = 0
                    r0.f36632c = r2
                    r0.e = r2
                    r0.f = r2
                    r0.f36633g = r2
                    r2 = 0
                    r0.f36634h = r2
                    r0.f36631b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L59
                    return r1
                L59:
                    kotlin.Unit r5 = kotlin.Unit.f186387a
                    return r5
                L5c:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.oc.a.C0334a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(Flow flow) {
            this.f36628a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f36628a.collect(new C0334a(flowCollector), continuation);
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

    public static final void CameraXSelfieScanner(@NotNull final SelfieScannerConfig config, @NotNull Function0<Rect> faceDetectionAreaProvider, @NotNull final Flow controls, @NotNull final Function1<? super SelfieScannerEvent, Unit> callback, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        int i2;
        u uVar;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(faceDetectionAreaProvider, "faceDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(controls, "controls");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-326649677);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(config) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(faceDetectionAreaProvider) ? 32 : 16;
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
                ComposerKt.traceEventStart(-326649677, i3, -1, "com.fourthline.visionx.selfie.CameraXSelfieScanner (SelfieScannerComposable.kt:38)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new od(0, 0), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.g.f186406a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new za(context, coroutineScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final za zaVar = (za) objRememberedValue3;
            CameraSelector DEFAULT_FRONT_CAMERA = CameraSelector.DEFAULT_FRONT_CAMERA;
            Intrinsics.checkNotNullExpressionValue(DEFAULT_FRONT_CAMERA, "DEFAULT_FRONT_CAMERA");
            u uVarRememberCameraXEngine = q0.rememberCameraXEngine(DEFAULT_FRONT_CAMERA, config.getInternalConfig().getPreferredVideoRecordingBitrate(), composerStartRestartGroup, 0);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                uVar = uVarRememberCameraXEngine;
                rd rdVarStateMachine = zaVar.stateMachine(uVar, new sg(mutableState, 1), faceDetectionAreaProvider, config, callback);
                composerStartRestartGroup.updateRememberedValue(rdVarStateMachine);
                objRememberedValue4 = rdVarStateMachine;
            } else {
                uVar = uVarRememberCameraXEngine;
            }
            final rd rdVar = (rd) objRememberedValue4;
            boolean z = (i3 & 7168) == 2048;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new dg(callback, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final u uVar2 = uVar;
            w9.PlayServicesGate((Function0) objRememberedValue5, ComposableLambdaKt.rememberComposableLambda(-1169455704, true, new Function2() { // from class: com.fourthline.vision.internal.fh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return oc.CameraXSelfieScanner$lambda$6(config, controls, rdVar, uVar2, callback, zaVar, content, mutableState, (Composer) obj2, iIntValue);
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cg(config, faceDetectionAreaProvider, controls, callback, content, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final od CameraXSelfieScanner$lambda$1(MutableState<od> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraXSelfieScanner$lambda$5$0(Function1 function1) {
        function1.invoke(new SelfieScannerEvent.OnFail(SelfieScannerError.GOOGLE_PLAY_SERVICES_NOT_AVAILABLE));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraXSelfieScanner$lambda$6(SelfieScannerConfig selfieScannerConfig, Flow flow, rd rdVar, u uVar, Function1 function1, za zaVar, Function2 function2, MutableState mutableState, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1169455704, i, -1, "com.fourthline.visionx.selfie.CameraXSelfieScanner.<anonymous> (SelfieScannerComposable.kt:63)");
            }
            RecordingType recordingType = selfieScannerConfig.getRecordingType();
            boolean debugModeEnabled = selfieScannerConfig.getDebugModeEnabled();
            a aVar = new a(flow);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new tg(1, function1);
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function12 = (Function1) objRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ug(mutableState, 1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function13 = (Function1) objRememberedValue2;
            boolean zChangedInstance = composer.changedInstance(zaVar) | composer.changedInstance(rdVar);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new com.fourthline.core.location.internal.d(rdVar, zaVar, 3);
                composer.updateRememberedValue(objRememberedValue3);
            }
            yf.VisionXComposable(recordingType, rdVar, uVar, debugModeEnabled, aVar, function12, function13, (Function1) objRememberedValue3, null, function2, composer, 1572864, 256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraXSelfieScanner$lambda$6$1$0(Function1 function1, pa VisionXComposable) {
        SelfieScannerError selfieScannerError;
        Intrinsics.checkNotNullParameter(VisionXComposable, "$this$VisionXComposable");
        int i = b.$EnumSwitchMapping$0[VisionXComposable.ordinal()];
        if (i == 1) {
            selfieScannerError = SelfieScannerError.CAMERA_PERMISSION_NOT_GRANTED;
        } else {
            if (i != 2) {
                throw new IllegalStateException("handled differently");
            }
            selfieScannerError = SelfieScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED;
        }
        function1.invoke(new SelfieScannerEvent.OnFail(selfieScannerError));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraXSelfieScanner$lambda$6$2$0(MutableState mutableState, Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        mutableState.setValue(new od((int) (rect.getRight() - rect.getLeft()), (int) (rect.getBottom() - rect.getTop())));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraXSelfieScanner$lambda$6$3$0(rd rdVar, za zaVar, l0 l0Var) {
        if (l0Var != null) {
            zaVar.setCameraSpecsOnScannerContext(l0Var);
        }
        rdVar.start();
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraXSelfieScanner$lambda$7(SelfieScannerConfig selfieScannerConfig, Function0 function0, Flow flow, Function1 function1, Function2 function2, int i, Composer composer, int i2) {
        CameraXSelfieScanner(selfieScannerConfig, function0, flow, function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }
}
