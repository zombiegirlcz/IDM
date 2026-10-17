package com.fourthline.orca.internal;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import com.fourthline.orca.internal.yp0;
import com.fourthline.orca.internal.zp0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class wp0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(List list, int i, Composer composer, int i2) {
        a(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1, kd1 intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        function1.invoke(new yp0.d(intent));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function1 function1, kd1 intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        function1.invoke(new yp0.c(intent));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function1 function1, kd1 intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        function1.invoke(new yp0.d(intent));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(zp0 zp0Var, ukm.j0 j0Var, int i, Composer composer, int i2) {
        a(zp0Var, j0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, kd1 intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        function1.invoke(new yp0.d(intent));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1, kd1 intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        function1.invoke(new yp0.c(intent));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(zp0.g gVar, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        a(gVar, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    public static final void a(zp0 zp0Var, ukm.j0 popupActions, Composer composer, int i) {
        int i2;
        zp0 zp0Var2;
        Intrinsics.checkNotNullParameter(popupActions, "popupActions");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1788748242);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(zp0Var) : composerStartRestartGroup.changedInstance(zp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(popupActions) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1788748242, i2, -1, "com.fourthline.orca.core.internal.popup.PopupContainer (PopupContainer.kt:69)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(popupActions);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ss1(popupActions, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            if (zp0Var == null) {
                composerStartRestartGroup.startReplaceGroup(-939164966);
                composerStartRestartGroup.endReplaceGroup();
                zp0Var2 = zp0Var;
            } else {
                composerStartRestartGroup.startReplaceGroup(-939164965);
                if (zp0Var instanceof zp0.g) {
                    composerStartRestartGroup.startReplaceGroup(-311361133);
                    zp0.g gVar = (zp0.g) zp0Var;
                    boolean zChanged = composerStartRestartGroup.changed(function1);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new us1(18, function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function12 = (Function1) objRememberedValue2;
                    boolean zChanged2 = composerStartRestartGroup.changed(function1);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new us1(19, function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    a(gVar, function12, (Function1) objRememberedValue3, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (!(zp0Var instanceof zp0.e) && !(zp0Var instanceof zp0.a) && !(zp0Var instanceof zp0.c) && !(zp0Var instanceof zp0.d)) {
                    if (zp0Var instanceof zp0.b) {
                        composerStartRestartGroup.startReplaceGroup(-310512477);
                        zp0.b bVar = (zp0.b) zp0Var;
                        boolean zChanged3 = composerStartRestartGroup.changed(function1);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new us1(20, function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        Function1 function13 = (Function1) objRememberedValue4;
                        boolean zChanged4 = composerStartRestartGroup.changed(function1);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new us1(21, function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        hi0.a(bVar, function13, (Function1) objRememberedValue5, ComposableLambdaKt.rememberComposableLambda(-1256616225, true, new fn1(zp0Var, 2), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (zp0Var instanceof zp0.f) {
                        composerStartRestartGroup.startReplaceGroup(-1534024009);
                        List listE = ((zp0.f) zp0Var).e();
                        boolean zChanged5 = composerStartRestartGroup.changed(function1);
                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new us1(22, function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        Function1 function14 = (Function1) objRememberedValue6;
                        boolean zChanged6 = composerStartRestartGroup.changed(function1);
                        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (zChanged6 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new qp1(25, function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        hi0.a(listE, function14, (Function0) objRememberedValue7, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1534065291);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1534047842);
                    boolean zChanged7 = composerStartRestartGroup.changed(function1);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new us1(23, function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    Function1 function15 = (Function1) objRememberedValue8;
                    boolean zChanged8 = composerStartRestartGroup.changed(function1);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChanged8 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new us1(17, function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    Function1 function16 = (Function1) objRememberedValue9;
                    zp0Var2 = zp0Var;
                    hi0.a(zp0Var2, function15, function16, (Function2) null, composerStartRestartGroup, 0, 8);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                }
                zp0Var2 = zp0Var;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            zp0Var2 = zp0Var;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(zp0Var2, popupActions, i, 20));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ukm.j0 j0Var, yp0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Object objMo3647trySendJP2dKIU = j0Var.mo3647trySendJP2dKIU(event);
        boolean z = objMo3647trySendJP2dKIU instanceof ukm.y;
        if (z) {
            Objects.toString(event);
        }
        if (!z) {
            Objects.toString(event);
        }
        if (objMo3647trySendJP2dKIU instanceof ukm.w) {
            Objects.toString(event);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, kd1 intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        function1.invoke(new yp0.c(intent));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(zp0 zp0Var, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1256616225, i, -1, "com.fourthline.orca.core.internal.popup.PopupContainer.<anonymous>.<anonymous> (PopupContainer.kt:100)");
            }
            a(((zp0.b) zp0Var).e(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, int i) {
        function1.invoke(new yp0.b(i));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(yp0.a.f35407a);
        return Unit.f186387a;
    }

    private static final void a(zp0.g gVar, Function1 function1, Function1 function12, Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1804009757);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(gVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i5 != 0) {
                function12 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1804009757, i3, -1, "com.fourthline.orca.core.internal.popup.PopupWithPages (PopupContainer.kt:120)");
            }
            hi0.a((Function0) null, ComposableLambdaKt.rememberComposableLambda(-2104164764, true, new uj1(gVar, 11, function1, function12), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Function1 function13 = function12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ck1(i, gVar, i2, function1, 12, function13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(zp0.g gVar, int i, int i2) {
        gVar.f().invoke(Integer.valueOf(i), Integer.valueOf(i2));
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r35v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v15, types: [com.fourthline.orca.internal.a81] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.Alignment, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v15, types: [com.fourthline.orca.internal.ea] */
    public static final void a(List bulletPoints, Composer composer, int i) {
        Composer composer2;
        int i2;
        zp0.b.a aVar;
        float f;
        int i3;
        char c2;
        Intrinsics.checkNotNullParameter(bulletPoints, "bulletPoints");
        Composer composerStartRestartGroup = composer.startRestartGroup(844467737);
        int i5 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(bulletPoints) ? 4 : 2) | i : i;
        int i6 = 1;
        ?? r152 = 0;
        if (composerStartRestartGroup.shouldExecute((i5 & 3) != 2, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(844467737, i5, -1, "com.fourthline.orca.core.internal.popup.ContentWithBullets (PopupContainer.kt:190)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ?? r4 = 0;
            Modifier modifierA = a80.a(a80.a(a80.a(companion, 2.0f)), (String) null, 1, (Object) null);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(bulletPoints);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new mm1(bulletPoints, i6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i21 = 6;
            float f4 = 6;
            Modifier modifierM864paddingVpY3zN4$default = PaddingKt.m864paddingVpY3zN4$default(BackgroundKt.m612backgroundbw27NRU(SizeKt.fillMaxWidth$default(SemanticsModifierKt.semantics$default(modifierA, false, (Function1) objRememberedValue, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), fj0.f28535a.b(composerStartRestartGroup, 6).getDialog().getDefault().getInstruction().getBackground().a(composerStartRestartGroup, 0), RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(Dp.m3297constructorimpl(f4))), BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(8), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            SpacerKt.Spacer(SizeKt.m887width3ABfNKs(companion, Dp.m3297constructorimpl(12)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1299677710);
            int i22 = 0;
            for (Iterator it8 = bulletPoints.iterator(); it8.hasNext(); it8 = it8) {
                Object next = it8.next();
                int i32 = i22 + 1;
                if (i22 >= 0) {
                    zp0.b.a aVar2 = (zp0.b.a) next;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierA2 = a80.a(companion3);
                    boolean zChanged = composerStartRestartGroup.changed(i22);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new ij1(i22, 5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierM863paddingVpY3zN4 = PaddingKt.m863paddingVpY3zN4(SizeKt.fillMaxWidth$default(a80.a(SemanticsModifierKt.semantics$default(modifierA2, r152, (Function1) objRememberedValue2, i6, r4), "listItem" + i22, (String) r4, 2, (Object) r4), BitmapDescriptorFactory.HUE_RED, i6, r4), Dp.m3297constructorimpl(18), Dp.m3297constructorimpl(f4));
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, r152));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM863paddingVpY3zN4);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                    Updater.m1665setimpl(composerM1662constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m1665setimpl(composerM1662constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM1662constructorimpl2.getInserting() || !Intrinsics.f(composerM1662constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                        composerM1662constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                        composerM1662constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                    }
                    Updater.m1665setimpl(composerM1662constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    z10 z10VarA = aVar2.a();
                    if (z10VarA == null) {
                        composerStartRestartGroup.startReplaceGroup(231438873);
                        composerStartRestartGroup.endReplaceGroup();
                        f = f4;
                        aVar = aVar2;
                        c2 = 2;
                        i3 = i21;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(231438874);
                        aVar = aVar2;
                        f = f4;
                        i3 = i21;
                        c2 = 2;
                        ImageKt.Image(a20.a(z10VarA, composerStartRestartGroup, r152), null, SizeKt.wrapContentSize$default(companion3, r4, r152, 3, r4), null, null, BitmapDescriptorFactory.HUE_RED, ColorFilter.Companion.m1996tintxETnrds$default(ColorFilter.INSTANCE, fj0.f28535a.b(composerStartRestartGroup, i21).getDialog().getDefault().getInstruction().getIcon().a(composerStartRestartGroup, r152), 0, 2, null), composerStartRestartGroup, 432, 56);
                        SpacerKt.Spacer(SizeKt.m887width3ABfNKs(companion3, Dp.m3297constructorimpl(14)), composerStartRestartGroup, i3);
                        Unit unit = Unit.f186387a;
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    Composer composer3 = composerStartRestartGroup;
                    TextKt.m1420TextNvy7gAk((String) aVar.b().invoke(composerStartRestartGroup, Integer.valueOf((int) r152)), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fj0.f28535a.b(composerStartRestartGroup, i3).getDialog().getDefault().getInstruction().getText().a(null, composerStartRestartGroup, r152, 1), composer3, 0, 0, 131070);
                    composer3.endNode();
                    i6 = 1;
                    composerStartRestartGroup = composer3;
                    i22 = i32;
                    f4 = f;
                    r152 = r152 == true ? 1 : 0;
                    r4 = 0;
                    i21 = i3;
                } else {
                    ?? r352 = r4;
                    zhm.v.s();
                    throw r352;
                }
            }
            composer2 = composerStartRestartGroup;
            i2 = i6;
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i2 = 1;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new po1(bulletPoints, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(List list, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setCollectionInfo(semantics, new CollectionInfo(list.size(), 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(int i, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setCollectionItemInfo(semantics, new CollectionItemInfo(i, 1, 0, 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(zp0.g gVar, Function1 function1, Function1 function12, Composer composer, int i) {
        Modifier modifier;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2104164764, i, -1, "com.fourthline.orca.core.internal.popup.PopupWithPages.<anonymous> (PopupContainer.kt:123)");
            }
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = gVar.g();
                composer.updateRememberedValue(objRememberedValue);
            }
            List list = (List) objRememberedValue;
            boolean zChangedInstance = composer.changedInstance(list);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ti1(list, 3);
                composer.updateRememberedValue(objRememberedValue2);
            }
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, BitmapDescriptorFactory.HUE_RED, (Function0) objRememberedValue2, composer, 6, 2);
            fj0 fj0Var = fj0.f28535a;
            b30 b30VarA = fj0Var.b(composer, 6).getDialog().getInstructional().getInstruction();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f = 40;
            Modifier modifierM865paddingqDBjuR0 = PaddingKt.m865paddingqDBjuR0(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxHeight(BackgroundKt.m612backgroundbw27NRU(companion2, fj0Var.b(composer, 6).getDialog().getBackground().a(composer, 0), RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(Dp.m3297constructorimpl(fj0Var.b(composer, 6).getDialog().getRadius()))), 0.8f), WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer, 6)), Dp.m3297constructorimpl(f), Dp.m3297constructorimpl(f), Dp.m3297constructorimpl(f), Dp.m3297constructorimpl(16));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion3.getStart(), composer, 6);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM865paddingqDBjuR0);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, companion2, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer, 0);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM1662constructorimpl2 = Updater.m1662constructorimpl(composer);
            Updater.m1665setimpl(composerM1662constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM1662constructorimpl2.getInserting() || !Intrinsics.f(composerM1662constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM1662constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM1662constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m1665setimpl(composerM1662constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            composer.startReplaceGroup(352159234);
            if (gVar.h()) {
                composer.startReplaceGroup(593524180);
                Modifier modifierM612backgroundbw27NRU = BackgroundKt.m612backgroundbw27NRU(companion2, b30VarA.getBackground().a(composer, 0), RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(Dp.m3297constructorimpl(b30VarA.getRadius())));
                composer.endReplaceGroup();
                modifier = modifierM612backgroundbw27NRU;
            } else {
                composer.startReplaceGroup(593811178);
                composer.endReplaceGroup();
                modifier = companion2;
            }
            composer.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, modifier, 1.0f, false, 2, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer, 0);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM1662constructorimpl3 = Updater.m1662constructorimpl(composer);
            Updater.m1665setimpl(composerM1662constructorimpl3, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM1662constructorimpl3.getInserting() || !Intrinsics.f(composerM1662constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM1662constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM1662constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m1665setimpl(composerM1662constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            Modifier modifierWeight$default2 = ColumnScope.weight$default(columnScopeInstance, companion2, 1.0f, false, 2, null);
            boolean zChangedInstance2 = composer.changedInstance(gVar);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new ci1(gVar, 8);
                composer.updateRememberedValue(objRememberedValue3);
            }
            ci0.a(columnScopeInstance, modifierWeight$default2, list, pagerStateRememberPagerState, (Function2) objRememberedValue3, composer, 6, 0);
            ci0.a(pagerStateRememberPagerState, (List) null, gVar.e(), composer, 0, 2);
            composer.endNode();
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(companion2, null, false, 3, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.getBottom(), companion3.getStart(), composer, 6);
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierWrapContentHeight$default);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composerM1662constructorimpl4 = Updater.m1662constructorimpl(composer);
            Updater.m1665setimpl(composerM1662constructorimpl4, measurePolicyColumnMeasurePolicy4, companion4.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (composerM1662constructorimpl4.getInserting() || !Intrinsics.f(composerM1662constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                composerM1662constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                composerM1662constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
            }
            Updater.m1665setimpl(composerM1662constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
            hi0.a(gVar, function1, function12, composer, 0);
            composer.endNode();
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }
}
