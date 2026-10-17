package com.fourthline.vision.internal;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.fourthline.vision.OnVisionScannerEffect;
import com.fourthline.vision.VisionScannerEffect;
import com.fourthline.vision.internal.camera.recording.RecordingExtensionsKt;
import com.fourthline.vision.selfie.SelfieScannerCallback;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerResult;
import com.fourthline.vision.selfie.SelfieScannerStep;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import com.fourthline.vision.selfie.compose.SelfieScannerEvent;
import com.fourthline.vision.selfie.compose.SelfieScannerInternalConfig;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
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
public abstract class a8 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f35938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SelfieScannerConfig f35939c;
        final /* synthetic */ Function1 d;

        /* JADX INFO: renamed from: com.fourthline.vision.internal.a8$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0327a extends kotlin.jvm.internal.q implements Function1 {
            public C0327a(Object obj2) {
                super(1, 1, a8.class, obj2, "onPermissionDenied", "onPermissionDenied(Lkotlin/jvm/functions/Function1;Lcom/fourthline/vision/internal/VisionPermission;)V");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((ff) obj2);
                return Unit.f186387a;
            }

            public final void invoke(ff p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                a8.onPermissionDenied((Function1) this.receiver, p0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, SelfieScannerConfig selfieScannerConfig, Function1<? super SelfieScannerEvent, Unit> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35938b = context;
            this.f35939c = selfieScannerConfig;
            this.d = function1;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new a(this.f35938b, this.f35939c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f35937a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            z1.checkVisionPermissions(this.f35938b, this.f35939c.getRecordingType(), new C0327a(this.d));
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f35940a;

        public b(MutableState<Matrix> mutableState) {
            this.f35940a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            m3655invoke58bKbWc(((Matrix) obj2).getValues());
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
        public final void m3655invoke58bKbWc(float[] fArr) {
            Intrinsics.checkNotNullParameter(fArr, "$v$c$androidx-compose-ui-graphics-Matrix$-$this$VisionView$0");
            this.f35940a.setValue(Matrix.m2048boximpl(fArr));
        }
    }

    public static final class c implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f35941a;

        public c(MutableState<Matrix> mutableState) {
            this.f35941a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return Matrix.m2048boximpl(m3656invokesQKQjiQ());
        }

        /* JADX INFO: renamed from: invoke-sQKQjiQ, reason: not valid java name */
        public final float[] m3656invokesQKQjiQ() {
            return ((Matrix) this.f35941a.getValue()).getValues();
        }
    }

    public static final class d implements Flow {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f35942a;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f35943a;

            /* JADX INFO: renamed from: com.fourthline.vision.internal.a8$d$a$a, reason: collision with other inner class name */
            public static final class C0328a extends gim.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f35944a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f35945b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f35946c;
                Object e;
                Object f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                Object f35947g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                int f35948h;

                public C0328a(Continuation continuation) {
                    super(continuation);
                }

                @Override // gim.a
                public final Object invokeSuspend(Object obj2) {
                    this.f35944a = obj2;
                    this.f35945b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f35943a = flowCollector;
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
                    boolean r0 = r6 instanceof com.fourthline.vision.internal.a8.d.a.C0328a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.fourthline.vision.internal.a8$d$a$a r0 = (com.fourthline.vision.internal.a8.d.a.C0328a) r0
                    int r1 = r0.f35945b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f35945b = r1
                    goto L18
                L13:
                    com.fourthline.vision.internal.a8$d$a$a r0 = new com.fourthline.vision.internal.a8$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f35944a
                    fim.a r1 = fim.a.COROUTINE_SUSPENDED
                    int r2 = r0.f35945b
                    r3 = 1
                    if (r2 == 0) goto L37
                    if (r2 != r3) goto L2f
                    java.lang.Object r5 = r0.f35947g
                    kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                    java.lang.Object r5 = r0.e
                    com.fourthline.vision.internal.a8$d$a$a r5 = (com.fourthline.vision.internal.a8.d.a.C0328a) r5
                    yhm.o.b(r6)
                    goto L59
                L2f:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L37:
                    yhm.o.b(r6)
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f35943a
                    com.fourthline.vision.selfie.compose.SelfieScannerControl r5 = (com.fourthline.vision.selfie.compose.SelfieScannerControl) r5
                    boolean r5 = r5 instanceof com.fourthline.vision.selfie.compose.SelfieScannerControl.RestartScanner
                    if (r5 == 0) goto L5c
                    com.fourthline.vision.VisionScannerEvent$RestartScanner r5 = com.fourthline.vision.VisionScannerEvent.RestartScanner.INSTANCE
                    r2 = 0
                    r0.f35946c = r2
                    r0.e = r2
                    r0.f = r2
                    r0.f35947g = r2
                    r2 = 0
                    r0.f35948h = r2
                    r0.f35945b = r3
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
                throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.a8.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(Flow flow) {
            this.f35942a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f35942a.collect(new a(flowCollector), continuation);
            return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
        }
    }

    public static final class e implements SelfieScannerCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f35949a;

        public e(Function1<? super SelfieScannerEvent, Unit> function1) {
            this.f35949a = function1;
        }

        @Override // com.fourthline.vision.selfie.SelfieScannerCallback
        public void onFail(SelfieScannerError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f35949a.invoke(new SelfieScannerEvent.OnFail(error));
        }

        @Override // com.fourthline.vision.selfie.SelfieScannerCallback
        public void onStepUpdate(SelfieScannerStep step) {
            Intrinsics.checkNotNullParameter(step, "step");
            this.f35949a.invoke(new SelfieScannerEvent.OnStepUpdate(step));
        }

        @Override // com.fourthline.vision.selfie.SelfieScannerCallback
        public void onSuccess(SelfieScannerResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f35949a.invoke(new SelfieScannerEvent.OnSuccess(result));
        }

        @Override // com.fourthline.vision.selfie.SelfieScannerCallback
        public void onWarnings(List<? extends SelfieScannerWarning> warnings) {
            Intrinsics.checkNotNullParameter(warnings, "warnings");
            this.f35949a.invoke(new SelfieScannerEvent.OnWarnings(warnings));
        }
    }

    public static final class f implements OnVisionScannerEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SelfieScannerConfig f35950a;

        public f(SelfieScannerConfig selfieScannerConfig) {
            this.f35950a = selfieScannerConfig;
        }

        @Override // com.fourthline.vision.OnVisionScannerEffect
        public void onVisionScannerEffect(VisionScannerEffect effect) {
            Function1<SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent, Unit> callback;
            Object onLivenessStepUpdate;
            Intrinsics.checkNotNullParameter(effect, "effect");
            SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = this.f35950a.getInternalConfig().getRandomnessLiveness();
            if (randomnessLiveness == null || (callback = randomnessLiveness.getCallback()) == null) {
                return;
            }
            if (effect instanceof VisionScannerEffect.OnHeadMoved) {
                onLivenessStepUpdate = new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnHeadMoved(((VisionScannerEffect.OnHeadMoved) effect).getMetadata());
            } else if (effect instanceof VisionScannerEffect.OnLivenessStepCountUpdate) {
                onLivenessStepUpdate = new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepCountUpdate(((VisionScannerEffect.OnLivenessStepCountUpdate) effect).getCount());
            } else if (effect instanceof VisionScannerEffect.OnLivenessStepSuccess) {
                onLivenessStepUpdate = new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepSuccess(((VisionScannerEffect.OnLivenessStepSuccess) effect).getIndex());
            } else {
                if (!(effect instanceof VisionScannerEffect.OnLivenessStepUpdate)) {
                    throw new NoWhenBranchMatchedException();
                }
                onLivenessStepUpdate = new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepUpdate(((VisionScannerEffect.OnLivenessStepUpdate) effect).getDirection());
            }
            callback.invoke(onLivenessStepUpdate);
        }
    }

    public static final /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ff.values().length];
            try {
                iArr[ff.f36208a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ff.f36209b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void LegacySelfieScanner(@NotNull SelfieScannerConfig config, @NotNull Function0<Rect> faceDetectionAreaProvider, @NotNull Flow controls, @NotNull Function1<? super SelfieScannerEvent, Unit> callback, @NotNull Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        int i2;
        Object obj2;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(faceDetectionAreaProvider, "faceDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(controls, "controls");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1021675777);
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
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1021675777, i2, -1, "com.fourthline.vision.selfie.internal.LegacySelfieScanner (LegacySelfieScannerComposable.kt:62)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Matrix.m2048boximpl(Matrix.m2050constructorimpl$default(null, 1, null)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = internalDataSource(config, faceDetectionAreaProvider, new c(mutableState));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            b8 b8Var = (b8) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = buildDaggerSubcomponent(context, b8Var, new e(callback), new f(config), new ag(config, i3));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            yc ycVar = (yc) objRememberedValue3;
            ub.a aVarH = a1m.e.H(RecordingExtensionsKt.getRequiredPermissions(config.getRecordingType()), null, composerStartRestartGroup, 2);
            boolean zChangedInstance = ((i2 & 7168) == 2048) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(config);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                obj2 = null;
                objRememberedValue4 = new a(context, config, callback, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                obj2 = null;
            }
            EffectsKt.LaunchedEffect(aVarH, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
            Modifier modifierM613backgroundbw27NRU$default = BackgroundKt.m613backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, obj2), Color.INSTANCE.m1987getBlack0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM613backgroundbw27NRU$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composerStartRestartGroup);
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (aVarH.b()) {
                composerStartRestartGroup.startReplaceGroup(-1217191693);
                int i5 = i2;
                boolean debugModeEnabled = config.getDebugModeEnabled();
                d dVar = new d(controls);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(b8Var);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new bg(b8Var, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function0 function0 = (Function0) objRememberedValue5;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new b(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                wf.VisionView(ycVar, debugModeEnabled, true, function0, (Function1) objRememberedValue6, dVar, content, composerStartRestartGroup, ((i5 << 6) & 3670016) | 24960);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1222854277);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cg(config, faceDetectionAreaProvider, controls, callback, content, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List LegacySelfieScanner$lambda$2$0(SelfieScannerConfig selfieScannerConfig) {
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = selfieScannerConfig.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null) {
            return randomnessLiveness.getSessionRandomnessLivenessSteps();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect LegacySelfieScanner$lambda$4$1$0(b8 b8Var) {
        return ga.toComposeRect(b8Var.contentDetectionArea());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegacySelfieScanner$lambda$5(SelfieScannerConfig selfieScannerConfig, Function0 function0, Flow flow, Function1 function1, Function2 function2, int i, Composer composer, int i2) {
        LegacySelfieScanner(selfieScannerConfig, function0, flow, function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    private static final yc buildDaggerSubcomponent(Context context, b8 b8Var, SelfieScannerCallback selfieScannerCallback, OnVisionScannerEffect onVisionScannerEffect, Function0<? extends List<Integer>> function0) {
        return c2.a().a(new s0(context, la.f36486g.initFrom(b8Var.config()), null, null, null, 28, null)).a(c0.f36032b.selfieCamera$fourthline_vision_release()).a().selfieBuilder().selfieModule(new bb(new bg(b8Var, 1), new dg(selfieScannerCallback, 0), new bg(b8Var, 2), b8Var, onVisionScannerEffect, function0)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelfieScannerCallback buildDaggerSubcomponent$lambda$1(SelfieScannerCallback selfieScannerCallback) {
        return selfieScannerCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oa buildDaggerSubcomponent$lambda$2(b8 b8Var) {
        return b8Var;
    }

    private static final b8 internalDataSource(SelfieScannerConfig selfieScannerConfig, Function0<Rect> function0, Function0<Matrix> function02) {
        return new b8(selfieScannerConfig, function0, function02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPermissionDenied(Function1<? super SelfieScannerEvent, Unit> function1, ff ffVar) {
        SelfieScannerError selfieScannerError;
        int i = g.$EnumSwitchMapping$0[ffVar.ordinal()];
        if (i == 1) {
            selfieScannerError = SelfieScannerError.CAMERA_PERMISSION_NOT_GRANTED;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            selfieScannerError = SelfieScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED;
        }
        function1.invoke(new SelfieScannerEvent.OnFail(selfieScannerError));
    }
}
