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
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.fourthline.vision.document.DocumentScannerCallback;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerDataSource;
import com.fourthline.vision.document.DocumentScannerError;
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepError;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.document.DocumentScannerStepWarning;
import com.fourthline.vision.document.compose.DocumentScannerControl;
import com.fourthline.vision.document.compose.DocumentScannerEvent;
import com.fourthline.vision.internal.camera.recording.RecordingExtensionsKt;
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
public abstract class j5 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f36397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y7 f36398c;
        final /* synthetic */ Function1 d;

        /* JADX INFO: renamed from: com.fourthline.vision.internal.j5$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0332a extends kotlin.jvm.internal.q implements Function1 {
            public C0332a(Object obj2) {
                super(1, 1, j5.class, obj2, "onPermissionDenied", "onPermissionDenied(Lkotlin/jvm/functions/Function1;Lcom/fourthline/vision/internal/VisionPermission;)V");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((ff) obj2);
                return Unit.f186387a;
            }

            public final void invoke(ff p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                j5.onPermissionDenied((Function1) this.receiver, p0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, y7 y7Var, Function1<? super DocumentScannerEvent, Unit> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f36397b = context;
            this.f36398c = y7Var;
            this.d = function1;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new a(this.f36397b, this.f36398c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f36396a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            z1.checkVisionPermissions(this.f36397b, this.f36398c.config().getRecordingType(), new C0332a(this.d));
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f36400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y7 f36401c;

        public static final class a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f36402a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f36403b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y7 f36404c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y7 y7Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f36404c = y7Var;
            }

            @Override // gim.a
            public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
                a aVar = new a(this.f36404c, continuation);
                aVar.f36403b = obj2;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DocumentScannerControl documentScannerControl, Continuation<? super Unit> continuation) {
                return ((a) create(documentScannerControl, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                DocumentScannerControl documentScannerControl = (DocumentScannerControl) this.f36403b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f36402a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (Intrinsics.f(documentScannerControl, DocumentScannerControl.RestartScanner.INSTANCE)) {
                    this.f36404c.setShouldReloadConfigOnce(true);
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Flow flow, y7 y7Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f36400b = flow;
            this.f36401c = y7Var;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new b(this.f36400b, this.f36401c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36399a;
            if (i == 0) {
                yhm.o.b(obj2);
                Flow flow = this.f36400b;
                a aVar2 = new a(this.f36401c, null);
                this.f36399a = 1;
                Object objCollect = flow.collect(new akg.m(wkm.s.f298328a, aVar2, 5), this);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    objCollect = Unit.f186387a;
                }
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    objCollect = Unit.f186387a;
                }
                if (objCollect == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class c implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f36405a;

        public c(MutableState<Matrix> mutableState) {
            this.f36405a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            m3658invoke58bKbWc(((Matrix) obj2).getValues());
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
        public final void m3658invoke58bKbWc(float[] fArr) {
            Intrinsics.checkNotNullParameter(fArr, "$v$c$androidx-compose-ui-graphics-Matrix$-$this$VisionView$0");
            this.f36405a.setValue(Matrix.m2048boximpl(fArr));
        }
    }

    public static final class d implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f36406a;

        public d(MutableState<Matrix> mutableState) {
            this.f36406a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return Matrix.m2048boximpl(m3659invokesQKQjiQ());
        }

        /* JADX INFO: renamed from: invoke-sQKQjiQ, reason: not valid java name */
        public final float[] m3659invokesQKQjiQ() {
            return ((Matrix) this.f36406a.getValue()).getValues();
        }
    }

    public static final class e implements Flow {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f36407a;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f36408a;

            /* JADX INFO: renamed from: com.fourthline.vision.internal.j5$e$a$a, reason: collision with other inner class name */
            public static final class C0333a extends gim.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f36409a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f36410b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f36411c;
                Object e;
                Object f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                Object f36412g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                int f36413h;

                public C0333a(Continuation continuation) {
                    super(continuation);
                }

                @Override // gim.a
                public final Object invokeSuspend(Object obj2) {
                    this.f36409a = obj2;
                    this.f36410b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f36408a = flowCollector;
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
                    boolean r0 = r6 instanceof com.fourthline.vision.internal.j5.e.a.C0333a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.fourthline.vision.internal.j5$e$a$a r0 = (com.fourthline.vision.internal.j5.e.a.C0333a) r0
                    int r1 = r0.f36410b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f36410b = r1
                    goto L18
                L13:
                    com.fourthline.vision.internal.j5$e$a$a r0 = new com.fourthline.vision.internal.j5$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f36409a
                    fim.a r1 = fim.a.COROUTINE_SUSPENDED
                    int r2 = r0.f36410b
                    r3 = 1
                    if (r2 == 0) goto L37
                    if (r2 != r3) goto L2f
                    java.lang.Object r5 = r0.f36412g
                    kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                    java.lang.Object r5 = r0.e
                    com.fourthline.vision.internal.j5$e$a$a r5 = (com.fourthline.vision.internal.j5.e.a.C0333a) r5
                    yhm.o.b(r6)
                    goto L75
                L2f:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L37:
                    yhm.o.b(r6)
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f36408a
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
                    r0.f36411c = r2
                    r0.e = r2
                    r0.f = r2
                    r0.f36412g = r2
                    r2 = 0
                    r0.f36413h = r2
                    r0.f36410b = r3
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
                throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.j5.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public e(Flow flow) {
            this.f36407a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f36407a.collect(new a(flowCollector), continuation);
            return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
        }
    }

    public static final class f implements DocumentScannerCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f36414a;

        public f(Function1<? super DocumentScannerEvent, Unit> function1) {
            this.f36414a = function1;
        }

        @Override // com.fourthline.vision.document.DocumentScannerCallback
        public void onFail(DocumentScannerError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f36414a.invoke(new DocumentScannerEvent.OnFail(error));
        }

        @Override // com.fourthline.vision.document.DocumentScannerCallback
        public void onStepFail(DocumentScannerStepError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f36414a.invoke(new DocumentScannerEvent.OnStepFail(error));
        }

        @Override // com.fourthline.vision.document.DocumentScannerCallback
        public void onStepSuccess(DocumentScannerStepResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f36414a.invoke(new DocumentScannerEvent.OnStepSuccess(result));
        }

        @Override // com.fourthline.vision.document.DocumentScannerCallback
        public void onStepUpdate(DocumentScannerStep step) {
            Intrinsics.checkNotNullParameter(step, "step");
            this.f36414a.invoke(new DocumentScannerEvent.OnStepUpdate(step));
        }

        @Override // com.fourthline.vision.document.DocumentScannerCallback
        public void onStepsCountUpdate(int i) {
            this.f36414a.invoke(new DocumentScannerEvent.OnStepsCountUpdate(i));
        }

        @Override // com.fourthline.vision.document.DocumentScannerCallback
        public void onSuccess(DocumentScannerResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f36414a.invoke(new DocumentScannerEvent.OnSuccess(result));
        }

        @Override // com.fourthline.vision.document.DocumentScannerCallback
        public void onWarnings(List<? extends DocumentScannerStepWarning> warnings) {
            Intrinsics.checkNotNullParameter(warnings, "warnings");
            this.f36414a.invoke(new DocumentScannerEvent.OnWarnings(warnings));
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

    public static final class h implements DocumentScannerDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f36415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DocumentScannerConfig f36416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f36417c;

        public h(DocumentScannerConfig documentScannerConfig, Function0<Rect> function0) {
            this.f36416b = documentScannerConfig;
            this.f36417c = function0;
            this.f36415a = documentScannerConfig.getShouldStartAutomatically();
        }

        @Override // com.fourthline.vision.document.DocumentScannerDataSource
        public DocumentScannerConfig getConfig() {
            return this.f36416b;
        }

        @Override // com.fourthline.vision.document.DocumentScannerDataSource
        public android.graphics.Rect getDocumentDetectionArea() {
            return RectHelper_androidKt.toAndroidRect((Rect) this.f36417c.invoke());
        }

        @Override // com.fourthline.vision.document.DocumentScannerDataSource
        public boolean getShouldStartAutomatically() {
            return this.f36415a;
        }
    }

    public static final void LegacyDocumentScanner(@NotNull DocumentScannerConfig config, @NotNull Function0<Rect> documentDetectionAreaProvider, @NotNull Flow controls, @NotNull Function1<? super DocumentScannerEvent, Unit> callback, @NotNull Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        int i2;
        Object obj2;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(documentDetectionAreaProvider, "documentDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(controls, "controls");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1555131502);
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
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1555131502, i2, -1, "com.fourthline.vision.document.internal.LegacyDocumentScanner (DocumentScannerComposable.kt:61)");
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
                objRememberedValue2 = proxy(config, documentDetectionAreaProvider, new d(mutableState));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            y7 y7Var = (y7) objRememberedValue2;
            int i3 = i2 & 7168;
            boolean zChanged = composerStartRestartGroup.changed(config) | composerStartRestartGroup.changed(controls) | (i3 == 2048);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = buildDaggerSubcomponent(context, y7Var, new f(callback), config.getInternalConfig().getFeatureConfig());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            v5 v5Var = (v5) objRememberedValue3;
            ub.a aVarH = a1m.e.H(RecordingExtensionsKt.getRequiredPermissions(y7Var.config().getRecordingType()), null, composerStartRestartGroup, 2);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(y7Var) | (i3 == 2048);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new a(context, y7Var, callback, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(aVarH, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
            Unit unit = Unit.f186387a;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(controls) | composerStartRestartGroup.changedInstance(y7Var);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                obj2 = null;
                objRememberedValue5 = new b(controls, y7Var, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                obj2 = null;
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 6);
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
                composerStartRestartGroup.startReplaceGroup(51235475);
                boolean debugModeEnabled = y7Var.config().getDebugModeEnabled();
                e eVar = new e(controls);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(y7Var);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new zg(y7Var, 2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                Function0 function0 = (Function0) objRememberedValue6;
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new c(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                wf.VisionView(v5Var, debugModeEnabled, false, function0, (Function1) objRememberedValue7, eVar, content, composerStartRestartGroup, ((i2 << 6) & 3670016) | 24960);
            } else {
                composerStartRestartGroup.startReplaceGroup(45741066);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new wg(config, documentDetectionAreaProvider, controls, callback, content, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect LegacyDocumentScanner$lambda$5$1$0(y7 y7Var) {
        return ga.toComposeRect(y7Var.contentDetectionArea());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegacyDocumentScanner$lambda$6(DocumentScannerConfig documentScannerConfig, Function0 function0, Flow flow, Function1 function1, Function2 function2, int i, Composer composer, int i2) {
        LegacyDocumentScanner(documentScannerConfig, function0, flow, function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    private static final v5 buildDaggerSubcomponent(Context context, y7 y7Var, DocumentScannerCallback documentScannerCallback, VisionDocumentScannerFeatureConfig visionDocumentScannerFeatureConfig) {
        return c2.a().a(new s0(context, la.f36486g.initFrom(y7Var.config(), y7Var.getShouldStartAutomatically()), null, null, visionDocumentScannerFeatureConfig, 12, null)).a(c0.f36032b.documentCamera$fourthline_vision_release()).a().documentBuilder().documentModule(new o3(new zg(y7Var, 0), new dg(documentScannerCallback, 5), new zg(y7Var, 1), y7Var)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentScannerCallback buildDaggerSubcomponent$lambda$1(DocumentScannerCallback documentScannerCallback) {
        return documentScannerCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oa buildDaggerSubcomponent$lambda$2(y7 y7Var) {
        return y7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPermissionDenied(Function1<? super DocumentScannerEvent, Unit> function1, ff ffVar) {
        DocumentScannerError documentScannerError;
        int i = g.$EnumSwitchMapping$0[ffVar.ordinal()];
        if (i == 1) {
            documentScannerError = DocumentScannerError.CAMERA_PERMISSION_NOT_GRANTED;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            documentScannerError = DocumentScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED;
        }
        function1.invoke(new DocumentScannerEvent.OnFail(documentScannerError));
    }

    private static final y7 proxy(DocumentScannerConfig documentScannerConfig, Function0<Rect> function0, Function0<Matrix> function02) {
        return new y7(false, new h(documentScannerConfig, function0), function02, 1, null);
    }
}
