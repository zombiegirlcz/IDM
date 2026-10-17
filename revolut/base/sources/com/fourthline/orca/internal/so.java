package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import ch.qos.logback.core.net.SyslogConstants;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.fj0;
import com.fourthline.orca.internal.lo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public abstract class so {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f33073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f33074c;
        final /* synthetic */ float d;
        final /* synthetic */ Function1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, float f, float f4, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f33073b = z;
            this.f33074c = f;
            this.d = f4;
            this.e = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f33073b, this.f33074c, this.d, this.e, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f33072a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            if (this.f33073b) {
                float f = this.f33074c;
                if (f > BitmapDescriptorFactory.HUE_RED) {
                    float f4 = this.d;
                    if (f4 > BitmapDescriptorFactory.HUE_RED) {
                        float f5 = (f4 - f) / 2.0f;
                        if (f5 < BitmapDescriptorFactory.HUE_RED) {
                            f5 = 0.0f;
                        }
                        float f6 = f + f5;
                        if (f6 <= f4) {
                            f4 = f6;
                        }
                        this.e.invoke(new Rect(BitmapDescriptorFactory.HUE_RED, f5, this.f33074c, f4));
                    }
                }
            }
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t70.values().length];
            try {
                iArr[t70.f33239a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t70.f33240b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(lo.c cVar, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        a(cVar, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, String str, int i, int i2, Composer composer, int i3) {
        a(modifier, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b() {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c() {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d() {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e() {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(lo loVar, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function12, Function1 function13, Function0 function05, int i, int i2, Composer composer, int i3) {
        a(loVar, function1, function0, function02, function03, function04, function12, function13, function05, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(float f) {
        return Unit.f186387a;
    }

    private static final String c(lo.c cVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1372209302, i, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.screens.scanner.overlay.getStepScannerAccessibilityDescription (DocumentScannerOverlayScreen.kt:204)");
        }
        String strA = d81.a(cVar.getTitle(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(lo.c cVar, Function0 function0, int i, Composer composer, int i2) {
        a(cVar, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(lo.c cVar, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1442384221, i, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.screens.scanner.overlay.ScannerScreen.<anonymous>.<anonymous>.<anonymous> (DocumentScannerOverlayScreen.kt:157)");
            }
            a(cVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(lo.c cVar, int i, Composer composer, int i2) {
        a(cVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(z10 z10Var, z10 z10Var2, Function0 function0, int i, Composer composer, int i2) {
        a(z10Var, z10Var2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(lo.c cVar, Function1 function1, Function0 function0, Function0 function02, Function1 function12, int i, int i2, Composer composer, int i3) {
        a(cVar, function1, function0, function02, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(lo.c cVar, Function1 function1, Function1 function12, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-585734078, i, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.screens.scanner.overlay.ScannerScreen.<anonymous>.<anonymous>.<anonymous> (DocumentScannerOverlayScreen.kt:162)");
            }
            a(cVar, function1, function12, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(lo.c.a aVar, Function0 function0, int i, Composer composer, int i2) {
        a(aVar, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Rect it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a() {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.m2838setRolekuIjeqM(semantics, Role.INSTANCE.m2822getButtono7Vup1c());
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(float f) {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Bitmap it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Unit.f186387a;
    }

    private static final boolean b(lo.c cVar) {
        boolean z = cVar.i() != null;
        if (cVar instanceof lo.c.b) {
            return ((lo.c.b) cVar).n();
        }
        if (!(cVar instanceof lo.c.a)) {
            return (z || cVar.e()) ? false : true;
        }
        lo.c.a aVar = (lo.c.a) cVar;
        return (aVar.isDynamicStepsEnabled() || (aVar.n() != null) || z || aVar.e()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final com.fourthline.orca.internal.lo r31, kotlin.jvm.functions.Function1 r32, kotlin.jvm.functions.Function0 r33, kotlin.jvm.functions.Function0 r34, kotlin.jvm.functions.Function0 r35, kotlin.jvm.functions.Function0 r36, kotlin.jvm.functions.Function1 r37, kotlin.jvm.functions.Function1 r38, kotlin.jvm.functions.Function0 r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.so.a(com.fourthline.orca.internal.lo, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void a(final com.fourthline.orca.internal.lo.c r17, kotlin.jvm.functions.Function1 r18, kotlin.jvm.functions.Function0 r19, kotlin.jvm.functions.Function0 r20, kotlin.jvm.functions.Function1 r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.so.a(com.fourthline.orca.internal.lo$c, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(MutableState mutableState, Function1 function1, Rect position) {
        Intrinsics.checkNotNullParameter(position, "position");
        if (!Intrinsics.f(mutableState.getValue(), position)) {
            function1.invoke(position);
            mutableState.setValue(position);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(lo.c cVar, Function0 function0, MutableTransitionState mutableTransitionState, Function1 function1, Function1 function12, Function0 function02, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(202831485, i, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.screens.scanner.overlay.ScannerScreen.<anonymous> (DocumentScannerOverlayScreen.kt:152)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composer);
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ro.a(cVar, SizeKt.fillMaxSize$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), 0L, cVar.b(), ComposableLambdaKt.rememberComposableLambda(-1442384221, true, new ci1(cVar, 6), composer, 54), ComposableLambdaKt.rememberComposableLambda(-585734078, true, new uj1(cVar, 9, function1, function12), composer, 54), ComposableLambdaKt.rememberComposableLambda(270916065, true, new uj1(cVar, 10, mutableTransitionState, function02), composer, 54), function0, composer, 1794096, 4);
            t21.a(mutableTransitionState, composer, MutableTransitionState.$stable);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(lo.c cVar, MutableTransitionState mutableTransitionState, Function0 function0, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(270916065, i, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.screens.scanner.overlay.ScannerScreen.<anonymous>.<anonymous>.<anonymous> (DocumentScannerOverlayScreen.kt:169)");
            }
            boolean zChangedInstance = composer.changedInstance(mutableTransitionState) | composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new vp1(mutableTransitionState, function0);
                composer.updateRememberedValue(objRememberedValue);
            }
            a(cVar, (Function0) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(MutableTransitionState mutableTransitionState, Function0 function0) {
        mutableTransitionState.setTargetState(Boolean.TRUE);
        function0.invoke();
        return Unit.f186387a;
    }

    private static final String a(lo.c.a aVar, Composer composer, int i) {
        composer.startReplaceGroup(-2042605776);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2042605776, i, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.screens.scanner.overlay.getStepAccessibilityIntroduction (DocumentScannerOverlayScreen.kt:188)");
        }
        String strC = d81.c(aVar.getTitle(), composer, 0);
        if (aVar.getProgress() == null) {
            composer.startReplaceGroup(-171578453);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return strC;
        }
        composer.startReplaceGroup(-171859499);
        String str = d81.c(c81.f27404a.a(R.string.shared_current_step_accessibility, String.valueOf(((Number) aVar.getProgress().f186385a).intValue() + 1), String.valueOf(((Number) aVar.getProgress().f186386b).intValue())), composer, 0) + ". " + strC + ".";
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return str;
    }

    private static final void a(lo.c cVar, Composer composer, int i) {
        int i2;
        String strC;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1168089938);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(cVar) : composerStartRestartGroup.changedInstance(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1168089938, i2, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.screens.scanner.overlay.Header (DocumentScannerOverlayScreen.kt:211)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM864paddingVpY3zN4$default = PaddingKt.m864paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(a80.a(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 1, null), fj0.f28535a.c(composerStartRestartGroup, 6).f(), BitmapDescriptorFactory.HUE_RED, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM864paddingVpY3zN4$default);
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            c81 c81VarC = cVar.c();
            if (c81VarC == null) {
                c81VarC = cVar.a();
            }
            c81 c81Var = c81VarC;
            if (cVar instanceof lo.c.a) {
                lo.c.a aVar = (lo.c.a) cVar;
                if (aVar.i() != null) {
                    composerStartRestartGroup.startReplaceGroup(899312930);
                    strC = a(aVar, composerStartRestartGroup, i2 & 14);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(899390492);
                    strC = c(cVar, composerStartRestartGroup, i2 & 14);
                    composerStartRestartGroup.endReplaceGroup();
                }
            } else {
                strC = "";
            }
            String str = strC;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(48)), composerStartRestartGroup, 6);
            float f = 16;
            qz0.a(PaddingKt.m864paddingVpY3zN4$default(companion, BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(f), 1, null), d81.c(cVar.getTitle(), composerStartRestartGroup, 0), str, composerStartRestartGroup, 6, 0);
            float f4 = 32;
            SpacerKt.Spacer(SizeKt.m875heightInVpY3zN4(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f4)), Dp.m3297constructorimpl(f), Dp.m3297constructorimpl(f4)), composerStartRestartGroup, 6);
            Modifier modifierA = a80.a(companion, cVar.c() != null);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new nq1(11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            a(SemanticsModifierKt.semantics$default(modifierA, false, (Function1) objRememberedValue, 1, null), d81.c(c81Var, composerStartRestartGroup, 0), composerStartRestartGroup, 0, 0);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f)), composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new al1(cVar, i, 9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.m2837setLiveRegionhR3wRGc(semantics, LiveRegionMode.INSTANCE.m2814getPolite0phEisY());
        return Unit.f186387a;
    }

    private static final void a(lo.c cVar, Function1 function1, Function1 function12, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2051150487);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(cVar) : composerStartRestartGroup.changedInstance(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2051150487, i2, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.screens.scanner.overlay.Body (DocumentScannerOverlayScreen.kt:260)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), null, false, 3, null), Alignment.INSTANCE.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(-533980461, true, new dk1(cVar, function1, function12, 7), composerStartRestartGroup, 54), composerStartRestartGroup, 3126, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1((Object) cVar, function1, (Object) function12, i, 11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(lo.c cVar, Function1 function1, Function1 function12, BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        ContentScale fillHeight;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-533980461, i2, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.screens.scanner.overlay.Body.<anonymous> (DocumentScannerOverlayScreen.kt:273)");
            }
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            float fMo768toPx0680j_4 = density.mo768toPx0680j_4(BoxWithConstraints.mo847getMaxWidthD9Ej5fM());
            float fMo768toPx0680j_42 = density.mo768toPx0680j_4(BoxWithConstraints.mo846getMaxHeightD9Ej5fM());
            lo.c.a aVar = cVar instanceof lo.c.a ? (lo.c.a) cVar : null;
            boolean z = aVar != null && aVar.isDynamicStepsEnabled();
            Boolean boolValueOf = Boolean.valueOf(z);
            Float fValueOf = Float.valueOf(fMo768toPx0680j_4);
            Float fValueOf2 = Float.valueOf(fMo768toPx0680j_42);
            boolean zChanged = composer.changed(z) | composer.changed(fMo768toPx0680j_4) | composer.changed(fMo768toPx0680j_42) | composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(z, fMo768toPx0680j_4, fMo768toPx0680j_42, function1, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(boolValueOf, fValueOf, fValueOf2, (Function2) objRememberedValue, composer, 0);
            float f = (!z && cVar.i() == null) ? 1.0f : 0.0f;
            Modifier.Companion companion = Modifier.INSTANCE;
            ke1.a(PaddingKt.m864paddingVpY3zN4$default(AlphaKt.alpha(BoxWithConstraints.align(companion, Alignment.INSTANCE.getCenter()), f), Dp.m3297constructorimpl(16), BitmapDescriptorFactory.HUE_RED, 2, null), cVar.getMask(), z ? null : function1, composer, 0, 0);
            p70 p70VarI = cVar.i();
            if (p70VarI == null) {
                composer.startReplaceGroup(748613574);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(748613575);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
                int i3 = b.$EnumSwitchMapping$0[cVar.getMask().a().ordinal()];
                if (i3 == 1) {
                    fillHeight = ContentScale.INSTANCE.getFillHeight();
                } else if (i3 == 2) {
                    fillHeight = ContentScale.INSTANCE.getFillWidth();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                g81.a(modifierFillMaxWidth$default, false, false, 0L, 0L, 0L, 0L, 1, BitmapDescriptorFactory.HUE_RED, null, p70VarI, null, function12, fillHeight, composer, 12582918, 0, 2942);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    private static final void a(lo.c cVar, Function0 function0, Composer composer, int i) {
        int i2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(430007472);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(cVar) : composerStartRestartGroup.changedInstance(cVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(430007472, i2, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.screens.scanner.overlay.Footer (DocumentScannerOverlayScreen.kt:320)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM864paddingVpY3zN4$default = PaddingKt.m864paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), fj0.f28535a.c(composerStartRestartGroup, 6).f(), BitmapDescriptorFactory.HUE_RED, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM864paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(16)), composerStartRestartGroup, 6);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getBottom(), companion2.getCenterHorizontally(), composerStartRestartGroup, 54);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1662constructorimpl2 = Updater.m1662constructorimpl(composerStartRestartGroup);
            Updater.m1665setimpl(composerM1662constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl2.getInserting() || !Intrinsics.f(composerM1662constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM1662constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM1662constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m1665setimpl(composerM1662constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            if (cVar instanceof lo.c.a) {
                composerStartRestartGroup.startReplaceGroup(624536086);
                lo.c.a aVar = (lo.c.a) cVar;
                if (aVar.i() == null) {
                    composerStartRestartGroup.startReplaceGroup(624589468);
                    if (aVar.n() != null) {
                        composerStartRestartGroup.startReplaceGroup(624668797);
                        i3 = 0;
                        g81.a(SizeKt.m882size3ABfNKs(companion, Dp.m3297constructorimpl(72)), false, false, 0L, 0L, 0L, 0L, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, null, aVar.n(), null, null, null, composerStartRestartGroup, 12582918, 0, 15230);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        i3 = 0;
                        composerStartRestartGroup.startReplaceGroup(624992406);
                        a(aVar, function0, composerStartRestartGroup, i2 & 126);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    i3 = 0;
                    composerStartRestartGroup.startReplaceGroup(625460010);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i3 = 0;
                if (cVar instanceof lo.c.b) {
                    composerStartRestartGroup.startReplaceGroup(625611228);
                    ImageKt.Image(a20.a(((lo.c.b) cVar).o(), composerStartRestartGroup, 0), null, SizeKt.m882size3ABfNKs(companion, Dp.m3297constructorimpl(72)), null, null, BitmapDescriptorFactory.HUE_RED, null, composerStartRestartGroup, 432, SyslogConstants.LOG_CLOCK);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1365328738);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (cVar.isDynamicStepsEnabled()) {
                composerStartRestartGroup.startReplaceGroup(610914686);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1365281575);
                Pair progress = cVar.getProgress();
                if (progress == null) {
                    composerStartRestartGroup.startReplaceGroup(625944136);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(625944137);
                    i51.a(progress, composerStartRestartGroup, i3);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(22)), composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(cVar, function0, i, 14));
        }
    }

    private static final void a(lo.c.a aVar, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1663123987);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(aVar) : composerStartRestartGroup.changedInstance(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1663123987, i2, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.screens.scanner.overlay.TriggerButton (DocumentScannerOverlayScreen.kt:381)");
            }
            if (aVar.q()) {
                composerStartRestartGroup.startReplaceGroup(616177036);
                a(aVar.o(), aVar.p(), function0, composerStartRestartGroup, (i2 << 3) & 896);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(616407521);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(aVar, function0, i, 15));
        }
    }

    private static final void a(z10 z10Var, z10 z10Var2, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1676856650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(z10Var) : composerStartRestartGroup.changedInstance(z10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(z10Var2) : composerStartRestartGroup.changedInstance(z10Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1676856650, i3, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.screens.scanner.overlay.NativeCameraTriggerButton (DocumentScannerOverlayScreen.kt:398)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            State<Boolean> stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, composerStartRestartGroup, 6);
            Modifier modifierScale = ScaleKt.scale(Modifier.INSTANCE, AnimateAsStateKt.animateFloatAsState(stateCollectIsPressedAsState.getValue().booleanValue() ? 0.9f : 1.0f, null, BitmapDescriptorFactory.HUE_RED, null, null, composerStartRestartGroup, 0, 30).getValue().floatValue());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new nq1(13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierM882size3ABfNKs = SizeKt.m882size3ABfNKs(a80.a(a80.a(a80.a(SemanticsModifierKt.semantics$default(modifierScale, false, (Function1) objRememberedValue2, 1, null), "primaryButton", (String) null, 2, (Object) null), 2.0f), d81.c(c81.a.a(c81.f27404a, R.string.shared_button_take_picture, 0, 2, null), composerStartRestartGroup, 0), false, 2, (Object) null), Dp.m3297constructorimpl(72));
            boolean z = (i3 & 896) == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new xj1(10, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ImageKt.Image(a20.a(stateCollectIsPressedAsState.getValue().booleanValue() ? z10Var2 : z10Var, composerStartRestartGroup, 0), null, ClickableKt.m629clickableO2vRcR0$default(modifierM882size3ABfNKs, mutableInteractionSource, null, false, null, null, (Function0) objRememberedValue3, 28, null), null, null, BitmapDescriptorFactory.HUE_RED, null, composerStartRestartGroup, 48, SyslogConstants.LOG_CLOCK);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1(z10Var, z10Var2, function0, i, 12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function0 function0) {
        function0.invoke();
        return Unit.f186387a;
    }

    private static final boolean a(lo.c cVar) {
        lo.c.a aVar = cVar instanceof lo.c.a ? (lo.c.a) cVar : null;
        if (aVar != null) {
            return aVar.isDynamicStepsEnabled();
        }
        return false;
    }

    private static final void a(Modifier modifier, String str, Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1124228322);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1124228322, i3, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.screens.scanner.overlay.Description (DocumentScannerOverlayScreen.kt:442)");
            }
            pq0.a(false, ComposableLambdaKt.rememberComposableLambda(2132594916, true, new cn1(modifier, str, 7), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new tq1(modifier2, str, i, i2, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, String str, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2132594916, i, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.screens.scanner.overlay.Description.<anonymous> (DocumentScannerOverlayScreen.kt:444)");
            }
            TextKt.m1280Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(a80.a(modifier, "messageView", (String) null, 2, (Object) null), BitmapDescriptorFactory.HUE_RED, 1, null), null, false, 3, null), 0L, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3223getCentere0LSkKk()), 0L, 0, false, 2, 2, null, fj0.f28535a.b(composer, 6).getIb.b.Scanner java.lang.String().getMessage().a(TextUnit.m3364boximpl(fj0.a.f28536a.d()), composer, 6, 0), composer, 0, 27648, 40444);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }
}
