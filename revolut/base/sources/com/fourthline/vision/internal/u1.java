package com.fourthline.vision.internal;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import com.fourthline.orca.internal.em1;
import com.fourthline.orca.internal.vq1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class u1 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f36972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f36973c;
        final /* synthetic */ State d;
        final /* synthetic */ MutableState e;
        final /* synthetic */ e2 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float[] f36974g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableState<Rect> mutableState, State<? extends Function0<Rect>> state, MutableState<List<Rect>> mutableState2, e2 e2Var, float[] fArr, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f36973c = mutableState;
            this.d = state;
            this.e = mutableState2;
            this.f = e2Var;
            this.f36974g = fArr;
        }

        private static final Rect invokeSuspend$toTransformedComposeRect(Rect rect, float[] fArr) {
            return Matrix.m2056mapimpl(fArr, rect);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            a aVar = new a(this.f36973c, this.d, this.e, this.f, this.f36974g, continuation);
            aVar.f36972b = obj2;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0067 A[LOOP:0: B:15:0x0061->B:17:0x0067, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002c -> B:14:0x002f). Please report as a decompilation issue!!! */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f36972b
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                fim.a r1 = fim.a.COROUTINE_SUSPENDED
                int r2 = r7.f36971a
                r3 = 1
                if (r2 == 0) goto L19
                if (r2 != r3) goto L11
                yhm.o.b(r8)
                goto L2f
            L11:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L19:
                yhm.o.b(r8)
            L1c:
                boolean r8 = skm.e0.y(r0)
                if (r8 == 0) goto L7d
                r7.f36972b = r0
                r7.f36971a = r3
                r4 = 50
                java.lang.Object r8 = skm.k0.b(r4, r7)
                if (r8 != r1) goto L2f
                return r1
            L2f:
                androidx.compose.runtime.MutableState r8 = r7.f36973c
                androidx.compose.runtime.State r2 = r7.d
                java.lang.Object r2 = r2.getValue()
                kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                java.lang.Object r2 = r2.invoke()
                androidx.compose.ui.geometry.Rect r2 = (androidx.compose.ui.geometry.Rect) r2
                float[] r4 = r7.f36974g
                androidx.compose.ui.geometry.Rect r2 = invokeSuspend$toTransformedComposeRect(r2, r4)
                r8.setValue(r2)
                androidx.compose.runtime.MutableState r8 = r7.e
                com.fourthline.vision.internal.e2 r2 = r7.f
                java.util.List r2 = r2.getDetections$fourthline_vision_release()
                float[] r4 = r7.f36974g
                java.util.ArrayList r5 = new java.util.ArrayList
                r6 = 10
                int r6 = zhm.w.t(r2, r6)
                r5.<init>(r6)
                java.util.Iterator r2 = r2.iterator()
            L61:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L79
                java.lang.Object r6 = r2.next()
                com.fourthline.vision.internal.fa r6 = (com.fourthline.vision.internal.fa) r6
                androidx.compose.ui.geometry.Rect r6 = com.fourthline.vision.internal.ga.toComposeRect(r6)
                androidx.compose.ui.geometry.Rect r6 = invokeSuspend$toTransformedComposeRect(r6, r4)
                r5.add(r6)
                goto L61
            L79:
                r8.setValue(r5)
                goto L1c
            L7d:
                kotlin.Unit r8 = kotlin.Unit.f186387a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.u1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    private static final void DebugView(Modifier modifier, Rect rect, List<Rect> list, boolean z, Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1058103349);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(rect) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1058103349, i3, -1, "com.fourthline.vision.internal.ui.DebugView (ComposeDebugView.kt:63)");
            }
            boolean zChangedInstance = ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new em1(z, rect, list, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CanvasKt.Canvas(modifier, (Function1) objRememberedValue, composerStartRestartGroup, i3 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new vq1(modifier2, rect, list, z, i, i2, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DebugView$lambda$0$0(boolean z, Rect rect, List list, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f = z ? -1.0f : 1.0f;
        long jMo2211getCenterF1C5BW0 = Canvas.mo2211getCenterF1C5BW0();
        DrawContext drawContext = Canvas.getDrawContext();
        long jMo2190getSizeNHjbRc = drawContext.mo2190getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2196scale0AR0LA0(f, 1.0f, jMo2211getCenterF1C5BW0);
            DebugView$lambda$0$0$drawRect(Canvas, rect, Color.INSTANCE.m1990getGreen0d7_KjU());
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                DebugView$lambda$0$0$drawRect(Canvas, (Rect) it8.next(), Color.INSTANCE.m1992getRed0d7_KjU());
            }
            drawContext.getCanvas().restore();
            drawContext.mo2191setSizeuvyYCjk(jMo2190getSizeNHjbRc);
            return Unit.f186387a;
        } catch (Throwable th10) {
            drawContext.getCanvas().restore();
            drawContext.mo2191setSizeuvyYCjk(jMo2190getSizeNHjbRc);
            throw th10;
        }
    }

    private static final void DebugView$lambda$0$0$drawRect(DrawScope drawScope, Rect rect, long j2) {
        DrawScope.m2207drawRectnJ9OG0$default(drawScope, j2, rect.m1851getTopLeftF1C5BW0(), rect.m1850getSizeNHjbRc(), BitmapDescriptorFactory.HUE_RED, new Stroke(drawScope.mo768toPx0680j_4(Dp.m3297constructorimpl(1)), BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null), null, 0, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DebugView$lambda$1(Modifier modifier, Rect rect, List list, boolean z, int i, int i2, Composer composer, int i3) {
        DebugView(modifier, rect, list, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: DebugViewStateHoister-FbeBA5I, reason: not valid java name */
    public static final void m3660DebugViewStateHoisterFbeBA5I(@NotNull final float[] fArr, @NotNull final Function0<Rect> detectionAreaProvider, final boolean z, @NotNull final e2 debugConsumer, Composer composer, final int i) {
        int i2;
        MutableState mutableState;
        Intrinsics.checkNotNullParameter(fArr, "$v$c$androidx-compose-ui-graphics-Matrix$-recognitionToScreenCoordsMatrix$0");
        Intrinsics.checkNotNullParameter(detectionAreaProvider, "detectionAreaProvider");
        Intrinsics.checkNotNullParameter(debugConsumer, "debugConsumer");
        Composer composerStartRestartGroup = composer.startRestartGroup(883913381);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(fArr) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(detectionAreaProvider) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(debugConsumer) ? 2048 : 1024;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(883913381, i3, -1, "com.fourthline.vision.internal.ui.DebugViewStateHoister (ComposeDebugView.kt:26)");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(detectionAreaProvider, composerStartRestartGroup, (i3 >> 3) & 14);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Rect.INSTANCE.getZero(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(zhm.f0.f322471a, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue2;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(fArr) | composerStartRestartGroup.changed(stateRememberUpdatedState) | composerStartRestartGroup.changedInstance(debugConsumer);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                mutableState = mutableState2;
                a aVar = new a(mutableState, stateRememberUpdatedState, mutableState3, debugConsumer, fArr, null);
                composerStartRestartGroup.updateRememberedValue(aVar);
                objRememberedValue3 = aVar;
            } else {
                mutableState = mutableState2;
            }
            EffectsKt.LaunchedEffect(debugConsumer, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, (i3 >> 9) & 14);
            DebugView(SizeKt.fillMaxSize$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), (Rect) mutableState.getValue(), (List) mutableState3.getValue(), z, composerStartRestartGroup, ((i3 << 3) & 7168) | 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.fourthline.vision.internal.kh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return u1.DebugViewStateHoister_FbeBA5I$lambda$3(fArr, detectionAreaProvider, z, debugConsumer, i, (Composer) obj2, iIntValue);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DebugViewStateHoister_FbeBA5I$lambda$3(float[] fArr, Function0 function0, boolean z, e2 e2Var, int i, Composer composer, int i2) {
        m3660DebugViewStateHoisterFbeBA5I(fArr, function0, z, e2Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }
}
