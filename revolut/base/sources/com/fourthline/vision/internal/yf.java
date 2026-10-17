package com.fourthline.vision.internal;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.Lifecycle;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.VisionScannerEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes23.dex */
public abstract class yf {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f37166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ rd f37167c;

        /* JADX INFO: renamed from: com.fourthline.vision.internal.yf$a$a, reason: collision with other inner class name */
        public static final class C0338a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f37168a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f37169b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ rd f37170c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0338a(rd rdVar, Continuation<? super C0338a> continuation) {
                super(2, continuation);
                this.f37170c = rdVar;
            }

            @Override // gim.a
            public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
                C0338a c0338a = new C0338a(this.f37170c, continuation);
                c0338a.f37169b = obj2;
                return c0338a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(VisionScannerEvent visionScannerEvent, Continuation<? super Unit> continuation) {
                return ((C0338a) create(visionScannerEvent, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                VisionScannerEvent visionScannerEvent = (VisionScannerEvent) this.f37169b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f37168a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (visionScannerEvent instanceof VisionScannerEvent.StartScanner) {
                    this.f37170c.start();
                } else if (visionScannerEvent instanceof VisionScannerEvent.RestartScanner) {
                    this.f37170c.restart();
                } else if (visionScannerEvent instanceof VisionScannerEvent.TakeSnapshot) {
                    this.f37170c.takeSnapshot();
                } else if (visionScannerEvent instanceof VisionScannerEvent.MoveToNextStep) {
                    this.f37170c.moveToNextStep();
                } else {
                    if (!(visionScannerEvent instanceof VisionScannerEvent.ResetCurrentStep)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f37170c.resetCurrentStep();
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow flow, rd rdVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f37166b = flow;
            this.f37167c = rdVar;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new a(this.f37166b, this.f37167c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f37165a;
            if (i == 0) {
                yhm.o.b(obj2);
                Flow flow = this.f37166b;
                C0338a c0338a = new C0338a(this.f37167c, null);
                this.f37165a = 1;
                Object objCollect = flow.collect(new akg.m(wkm.s.f298328a, c0338a, 5), this);
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
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final /* synthetic */ class b {
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

    /* JADX WARN: Removed duplicated region for block: B:131:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VisionXComposable(@org.jetbrains.annotations.NotNull com.fourthline.vision.RecordingType r20, @org.jetbrains.annotations.NotNull final com.fourthline.vision.internal.rd r21, @org.jetbrains.annotations.NotNull final com.fourthline.vision.internal.u r22, boolean r23, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.Flow r24, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.fourthline.vision.internal.pa, kotlin.Unit> r25, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, kotlin.Unit> r26, kotlin.jvm.functions.Function1<? super com.fourthline.vision.internal.l0, kotlin.Unit> r27, kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> r28, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.yf.VisionXComposable(com.fourthline.vision.RecordingType, com.fourthline.vision.internal.rd, com.fourthline.vision.internal.u, boolean, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VisionXComposable$lambda$0$0(l0 l0Var) {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VisionXComposable$lambda$2$0(rd rdVar, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_PAUSE) {
            rdVar.stop();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VisionXComposable$lambda$4$0(Function1 function1, ff PermissionGate) {
        pa paVar;
        Intrinsics.checkNotNullParameter(PermissionGate, "$this$PermissionGate");
        int i = b.$EnumSwitchMapping$0[PermissionGate.ordinal()];
        if (i == 1) {
            paVar = pa.f;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            paVar = pa.f36698g;
        }
        function1.invoke(paVar);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VisionXComposable$lambda$5(u uVar, Function1 function1, Function1 function12, MutableState mutableState, Function2 function2, boolean z, Function0 function0, rd rdVar, Composer composer, int i) {
        Composer composer2 = composer;
        if (composer2.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1545449699, i, -1, "com.fourthline.visionx.internal.VisionXComposable.<anonymous> (VisionXComposable.kt:91)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            i0.CameraPreview(SizeKt.fillMaxSize$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), uVar, function1, composer2, 6, 0);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean zChanged = composer2.changed(function12);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new com.fourthline.core.location.internal.d(mutableState, function12, 7);
                composer2.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierFillMaxSize$default, (Function1) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierOnSizeChanged);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composer2);
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composer2, 0);
            if (z) {
                composer2.startReplaceGroup(1157851489);
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
                boolean zChanged2 = composer2.changed(function0) | composer2.changedInstance(rdVar);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new com.fourthline.core.location.internal.d(function0, rdVar, 8);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                CanvasKt.Canvas(modifierFillMaxSize$default2, (Function1) objRememberedValue2, composer2, 6);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new qh(5);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                TextKt.m1420TextNvy7gAk("VisionX", PaddingKt.m862padding3ABfNKs(SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) objRememberedValue3), Dp.m3297constructorimpl(16)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262140);
                composer2 = composer;
            } else {
                composer2.startReplaceGroup(1153563321);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VisionXComposable$lambda$5$0$0(MutableState mutableState, Function1 function1, IntSize intSize) {
        Rect rect = new Rect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (int) (intSize.getPackedValue() >> 32), (int) (intSize.getPackedValue() & BodyPartID.bodyIdMax));
        if (!Intrinsics.f(mutableState.getValue(), rect)) {
            mutableState.setValue(rect);
            function1.invoke(rect);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VisionXComposable$lambda$5$1$0$0(Function0 function0, rd rdVar, DrawScope Canvas) {
        Rect rect;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        if (function0 != null && (rect = (Rect) function0.invoke()) != null) {
            DrawScope.m2207drawRectnJ9OG0$default(Canvas, Color.INSTANCE.m1990getGreen0d7_KjU(), rect.m1851getTopLeftF1C5BW0(), rect.m1850getSizeNHjbRc(), BitmapDescriptorFactory.HUE_RED, new Stroke(Canvas.mo768toPx0680j_4(Dp.m3297constructorimpl(2)), BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null), null, 0, 104, null);
        }
        fa recognizedBounds = rdVar.getRecognizedBounds();
        if (recognizedBounds != null) {
            DrawScope.m2207drawRectnJ9OG0$default(Canvas, Color.INSTANCE.m1992getRed0d7_KjU(), Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(recognizedBounds.getTop())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(recognizedBounds.getLeft())) << 32)), Size.m1862constructorimpl((((long) Float.floatToRawIntBits(recognizedBounds.width())) << 32) | (((long) Float.floatToRawIntBits(recognizedBounds.height())) & BodyPartID.bodyIdMax)), BitmapDescriptorFactory.HUE_RED, new Stroke(Canvas.mo768toPx0680j_4(Dp.m3297constructorimpl(5)), BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null), null, 0, 104, null);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VisionXComposable$lambda$5$1$1$0(SemanticsPropertyReceiver clearAndSetSemantics) {
        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VisionXComposable$lambda$6(RecordingType recordingType, rd rdVar, u uVar, boolean z, Flow flow, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function2 function2, int i, int i2, Composer composer, int i3) {
        VisionXComposable(recordingType, rdVar, uVar, z, flow, function1, function12, function13, function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }
}
