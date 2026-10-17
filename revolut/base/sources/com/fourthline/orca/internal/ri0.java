package com.fourthline.orca.internal;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ri0 {

    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f32746a;

        public a(FocusManager focusManager) {
            this.f32746a = focusManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit a(FocusManager focusManager, Offset offset) {
            FocusManager.clearFocus$default(focusManager, false, 1, null);
            return Unit.f186387a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            Object objDetectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new wr1(this.f32746a, 0), continuation, 7, null);
            return objDetectTapGestures$default == fim.a.COROUTINE_SUSPENDED ? objDetectTapGestures$default : Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, String str2, Alignment.Horizontal horizontal, Function3 function3, Function3 function32, n80 n80Var, wz0 wz0Var, boolean z, String str3, int i, int i2, Composer composer, int i3) {
        a(str, str2, horizontal, function3, function32, n80Var, wz0Var, z, str3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090 A[PHI: r15
      0x0090: PHI (r15v22 int) = (r15v0 int), (r15v6 int), (r15v7 int) binds: [B:47:0x008e, B:57:0x00a8, B:56:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r22, final java.lang.String r23, androidx.compose.ui.Alignment.Horizontal r24, final kotlin.jvm.functions.Function3 r25, kotlin.jvm.functions.Function3 r26, com.fourthline.orca.internal.n80 r27, com.fourthline.orca.internal.wz0 r28, boolean r29, java.lang.String r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ri0.a(java.lang.String, java.lang.String, androidx.compose.ui.Alignment$Horizontal, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, com.fourthline.orca.internal.n80, com.fourthline.orca.internal.wz0, boolean, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setPaneTitle(semantics, str);
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, Alignment.Horizontal horizontal, boolean z, n80 n80Var, ColumnScope OrcaScaffold, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScaffold, "$this$OrcaScaffold");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1889737231, i, -1, "com.fourthline.orca.core.internal.composable.OrcaScreen.<anonymous> (OrcaScreen.kt:81)");
            }
            b10.a(Modifier.INSTANCE, str, horizontal, 0L, null, z ? n80Var : null, composer, 6, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(wz0 wz0Var, Function3 function3, Function3 function32, n80 n80Var, boolean z, ColumnScope OrcaScaffold, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(OrcaScaffold, "$this$OrcaScaffold");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(OrcaScaffold) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-589742576, i2, -1, "com.fourthline.orca.core.internal.composable.OrcaScreen.<anonymous> (OrcaScreen.kt:89)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierWeight$default = ColumnScope.weight$default(OrcaScaffold, SizeKt.fillMaxWidth$default(PaddingKt.m866paddingqDBjuR0$default(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fj0.f28535a.c(composer, 6).e(), 7, null), BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null);
            if (wz0Var != null) {
                composer.startReplaceGroup(1690331511);
                si0.a(modifierWeight$default, null, wz0Var, function3, composer, 0, 2);
                composer2 = composer;
                composer2.endReplaceGroup();
            } else {
                composer2 = composer;
                composer2.startReplaceGroup(1690520890);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
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
                Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                    composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                    composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
                }
                Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                function3.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            if (function32 == null) {
                composer2.startReplaceGroup(1690666341);
            } else {
                composer2.startReplaceGroup(193084956);
                function32.invoke(OrcaScaffold, composer2, Integer.valueOf(i2 & 14));
            }
            composer2.endReplaceGroup();
            if (n80Var == null) {
                composer2.startReplaceGroup(1690726295);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1690726296);
                oz.a(a80.a(a80.a(companion), 90.0f), n80Var.a(), z ? null : n80Var.c(), n80Var.b(), composer2, 0, 0);
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
}
