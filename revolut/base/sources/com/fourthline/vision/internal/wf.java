package com.fourthline.vision.internal;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
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
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.Lifecycle;
import com.fourthline.orca.internal.ek1;
import com.fourthline.orca.internal.tm1;
import com.fourthline.vision.VisionScannerEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class wf {

    public static final class a implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f37070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ xf f37071b;

        public a(WeakReference weakReference, xf xfVar) {
            this.f37070a = weakReference;
            this.f37071b = xfVar;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f37070a.clear();
            xf xfVar = this.f37071b;
            xfVar.stop();
            o8 mediaRecorderManager = xfVar.getMediaRecorderManager();
            if (mediaRecorderManager != null) {
                mediaRecorderManager.setVideoRecorder(null);
            }
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f37073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ xf f37074c;

        public static final class a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f37075a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f37076b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ xf f37077c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(xf xfVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f37077c = xfVar;
            }

            @Override // gim.a
            public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
                a aVar = new a(this.f37077c, continuation);
                aVar.f37076b = obj2;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(VisionScannerEvent visionScannerEvent, Continuation<? super Unit> continuation) {
                return ((a) create(visionScannerEvent, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                VisionScannerEvent visionScannerEvent = (VisionScannerEvent) this.f37076b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f37075a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                xf xfVar = this.f37077c;
                if (visionScannerEvent instanceof VisionScannerEvent.StartScanner) {
                    xfVar.start();
                } else if (visionScannerEvent instanceof VisionScannerEvent.RestartScanner) {
                    xfVar.resetScanner();
                } else if (visionScannerEvent instanceof VisionScannerEvent.TakeSnapshot) {
                    xfVar.takeSnapshot();
                } else if (visionScannerEvent instanceof VisionScannerEvent.MoveToNextStep) {
                    xfVar.moveToNextStep();
                } else {
                    if (!(visionScannerEvent instanceof VisionScannerEvent.ResetCurrentStep)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xfVar.resetCurrentStep();
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Flow flow, xf xfVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f37073b = flow;
            this.f37074c = xfVar;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new b(this.f37073b, this.f37074c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f37072a;
            if (i == 0) {
                yhm.o.b(obj2);
                Flow flow = this.f37073b;
                a aVar2 = new a(this.f37074c, null);
                this.f37072a = 1;
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

    private static final <SCANNER_STEP> void CameraPreview(xf xfVar, i8 i8Var, Rect rect, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1795975779);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(xfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(i8Var) : composerStartRestartGroup.changedInstance(i8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(rect) ? 256 : 128;
        }
        boolean z = false;
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1795975779, i2, -1, "com.fourthline.vision.internal.ui.CameraPreview (VisionView.kt:145)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new WeakReference(xfVar);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            WeakReference weakReference = (WeakReference) objRememberedValue;
            Modifier modifierFullscreen = fullscreen(BackgroundKt.m613backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m1987getBlack0d7_KjU(), null, 2, null), rect);
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && composerStartRestartGroup.changedInstance(i8Var))) {
                z = true;
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(weakReference) | z | composerStartRestartGroup.changedInstance(xfVar);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new com.fourthline.core.location.internal.b(i8Var, 12, weakReference, xfVar);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, modifierFullscreen, null, composerStartRestartGroup, 0, 4);
            Unit unit = Unit.f186387a;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(weakReference) | composerStartRestartGroup.changedInstance(xfVar);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new com.fourthline.core.location.internal.d(weakReference, xfVar, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1(xfVar, i8Var, rect, i, 20));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z CameraPreview$lambda$1$0(i8 i8Var, WeakReference weakReference, xf xfVar, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        z zVar = new z(context, null, 0, i8Var, 6, null);
        zVar.setListener(weakReference);
        o8 mediaRecorderManager = xfVar.getMediaRecorderManager();
        if (mediaRecorderManager != null) {
            mediaRecorderManager.setVideoRecorder(zVar);
        }
        return zVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult CameraPreview$lambda$2$0(WeakReference weakReference, xf xfVar, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new a(weakReference, xfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraPreview$lambda$3(xf xfVar, i8 i8Var, Rect rect, int i, Composer composer, int i2) {
        CameraPreview(xfVar, i8Var, rect, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void KeepScreenOn(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-212805181);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-212805181, i, -1, "com.fourthline.vision.internal.ui.KeepScreenOn (VisionView.kt:196)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qh(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue, null, null, composerStartRestartGroup, 6, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new tm1(i, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View KeepScreenOn$lambda$0$0(Context it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        View view = new View(it8);
        view.setKeepScreenOn(true);
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KeepScreenOn$lambda$1(int i, Composer composer, int i2) {
        KeepScreenOn(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.compose.runtime.SnapshotMutationPolicy, float[], java.lang.Object, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r3v35 */
    public static final <SCANNER_STEP> void VisionView(@NotNull final uf subcomponent, final boolean z, final boolean z3, @NotNull final Function0<Rect> detectionAreaProvider, @NotNull final Function1<? super Matrix, Unit> onRecognitionToScreenCoordsMatrixComputed, @NotNull final Flow events, @NotNull final Function2<? super Composer, ? super Integer, Unit> overlayView, Composer composer, final int i) {
        int i2;
        Composer composer2;
        xf xfVar;
        ?? r3;
        final MutableState mutableState;
        MutableState mutableState2;
        final x9 x9Var;
        xf xfVar2;
        i8 i8Var;
        ?? r110;
        Intrinsics.checkNotNullParameter(subcomponent, "subcomponent");
        Intrinsics.checkNotNullParameter(detectionAreaProvider, "detectionAreaProvider");
        Intrinsics.checkNotNullParameter(onRecognitionToScreenCoordsMatrixComputed, "onRecognitionToScreenCoordsMatrixComputed");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(overlayView, "overlayView");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1640593841);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subcomponent) : composerStartRestartGroup.changedInstance(subcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(detectionAreaProvider) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRecognitionToScreenCoordsMatrixComputed) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(events) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(overlayView) ? PKIFailureInfo.badCertTemplate : 524288;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1640593841, i3, -1, "com.fourthline.vision.internal.ui.VisionView (VisionView.kt:48)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = subcomponent.getVisionViewModel();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            xf xfVar3 = (xf) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = subcomponent.getMediaCodecDataSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            i8 i8Var2 = (i8) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = subcomponent.getDebugConsumer();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            e2 e2Var = (e2) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = subcomponent.getPreviewCalculator();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            x9 x9Var2 = (x9) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = subcomponent.getCameraFocusManager();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final x xVar = (x) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Rect.INSTANCE.getZero(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue6 = mutableStateMutableStateOf$default;
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Lifecycle.Event.ON_CREATE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                xfVar = xfVar3;
                r3 = 0;
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            } else {
                xfVar = xfVar3;
                r3 = 0;
            }
            final MutableState mutableState5 = (MutableState) objRememberedValue8;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Matrix.m2048boximpl(Matrix.m2050constructorimpl$default(r3, 1, r3)), r3, 2, r3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            MutableState mutableState6 = (MutableState) objRememberedValue9;
            KeepScreenOn(composerStartRestartGroup, 0);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, r3);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(x9Var2) | composerStartRestartGroup.changedInstance(xVar) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue10 == companion.getEmpty()) {
                mutableState = mutableState6;
                mutableState2 = mutableState4;
                x9Var = x9Var2;
                xfVar2 = xfVar;
                i8Var = i8Var2;
                r110 = 0;
                Function1 function1 = new Function1() { // from class: com.fourthline.vision.internal.oh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return wf.VisionView$lambda$9$0(mutableState3, x9Var, xVar, detectionAreaProvider, onRecognitionToScreenCoordsMatrixComputed, mutableState, mutableState5, (IntSize) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue10 = function1;
            } else {
                mutableState2 = mutableState4;
                mutableState = mutableState6;
                x9Var = x9Var2;
                xfVar2 = xfVar;
                i8Var = i8Var2;
                r110 = 0;
            }
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierFillMaxSize$default, (Function1) objRememberedValue10);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r110);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, r110));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
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
            Object value = mutableState2.getValue();
            Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
            if (value == event && ((Boolean) mutableState5.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(948178469);
                CameraPreview(xfVar2, i8Var, x9Var.getPreviewHolderRect(), composerStartRestartGroup, r110);
            } else {
                composerStartRestartGroup.startReplaceGroup(944395353);
            }
            composerStartRestartGroup.endReplaceGroup();
            overlayView.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 18) & 14));
            if (mutableState2.getValue() == event && ((Boolean) mutableState5.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(948507224);
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(948541510);
                    composer2 = composerStartRestartGroup;
                    u1.m3660DebugViewStateHoisterFbeBA5I(((Matrix) mutableState.getValue()).getValues(), detectionAreaProvider, z3, e2Var, composer2, ((i3 >> 6) & 112) | (i3 & 896));
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(944395353);
                }
                composer2.endReplaceGroup();
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(944395353);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            Unit unit = Unit.f186387a;
            boolean zChangedInstance2 = composer2.changedInstance(events) | composer2.changedInstance(xfVar2);
            Object objRememberedValue11 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = new b(events, xfVar2, null);
                composer2.updateRememberedValue(objRememberedValue11);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composer2, 6);
            boolean zChangedInstance3 = composer2.changedInstance(xfVar2);
            Object objRememberedValue12 = composer2.rememberedValue();
            if (zChangedInstance3 || objRememberedValue12 == companion.getEmpty()) {
                objRememberedValue12 = new com.fourthline.core.location.internal.d(mutableState2, xfVar2, 5);
                composer2.updateRememberedValue(objRememberedValue12);
            }
            v1.OnLifecycleEvent((Function1) objRememberedValue12, composer2, r110);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.fourthline.vision.internal.ph
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return wf.VisionView$lambda$13(subcomponent, z, z3, detectionAreaProvider, onRecognitionToScreenCoordsMatrixComputed, events, overlayView, i, (Composer) obj2, iIntValue);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VisionView$lambda$12$0(MutableState mutableState, xf xfVar, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        mutableState.setValue(event);
        if (event == Lifecycle.Event.ON_PAUSE) {
            xfVar.stop();
            o8 mediaRecorderManager = xfVar.getMediaRecorderManager();
            if (mediaRecorderManager != null) {
                mediaRecorderManager.setVideoRecorder(null);
            }
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VisionView$lambda$13(uf ufVar, boolean z, boolean z3, Function0 function0, Function1 function1, Flow flow, Function2 function2, int i, Composer composer, int i2) {
        VisionView(ufVar, z, z3, function0, function1, flow, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VisionView$lambda$9$0(MutableState mutableState, x9 x9Var, x xVar, Function0 function0, Function1 function1, MutableState mutableState2, MutableState mutableState3, IntSize intSize) {
        Rect rect = new Rect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (int) (intSize.getPackedValue() >> 32), (int) (intSize.getPackedValue() & BodyPartID.bodyIdMax));
        if (!Intrinsics.f(mutableState.getValue(), rect)) {
            mutableState.setValue(rect);
            x9Var.setupTransformations(rect);
            xVar.setup(RectHelper_androidKt.toAndroidRect(rect), RectHelper_androidKt.toAndroidRect(x9Var.getPreviewHolderRect()));
            xVar.setContentDetectionAreaProvider(new mg(2, function0));
            float[] fArrM3661getRecognitionToScreenCoordsMatrixsQKQjiQ = x9Var.m3661getRecognitionToScreenCoordsMatrixsQKQjiQ();
            function1.invoke(Matrix.m2048boximpl(fArrM3661getRecognitionToScreenCoordsMatrixsQKQjiQ));
            mutableState2.setValue(Matrix.m2048boximpl(fArrM3661getRecognitionToScreenCoordsMatrixsQKQjiQ));
            mutableState3.setValue(Boolean.TRUE);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Rect VisionView$lambda$9$0$0$0$0(Function0 function0) {
        return RectHelper_androidKt.toAndroidRect((Rect) function0.invoke());
    }

    private static final Modifier fullscreen(Modifier modifier, final Rect rect) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3() { // from class: com.fourthline.vision.internal.nh
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int iIntValue = ((Integer) obj4).intValue();
                return wf.fullscreen$lambda$0(rect, (Modifier) obj2, (Composer) obj3, iIntValue);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier fullscreen$lambda$0(Rect rect, Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(-2025468330);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2025468330, i, -1, "com.fourthline.vision.internal.ui.fullscreen.<anonymous> (VisionView.kt:176)");
        }
        Modifier modifierM877requiredHeight3ABfNKs = SizeKt.m877requiredHeight3ABfNKs(SizeKt.m881requiredWidth3ABfNKs(composed, Dp.m3297constructorimpl(toDp(rect.getRight() - rect.getLeft(), composer, 0))), Dp.m3297constructorimpl(toDp(rect.getBottom() - rect.getTop(), composer, 0)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM877requiredHeight3ABfNKs;
    }

    private static final int toDp(float f, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(483573759, i, -1, "com.fourthline.vision.internal.ui.toDp (VisionView.kt:184)");
        }
        int density = (int) (f / ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return density;
    }
}
