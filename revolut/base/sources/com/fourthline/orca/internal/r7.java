package com.fourthline.orca.internal;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.view.compose.BackHandlerKt;
import ch.qos.logback.core.net.SyslogConstants;
import com.fourthline.orca.internal.h11;
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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes23.dex */
public abstract class r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f32638a = ColorKt.Color(4283258347L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f32639b = ColorKt.Color(4292467161L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f32640c = 0.8f;
    private static final float d = Dp.m3297constructorimpl(12);

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f32642b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f32642b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f32642b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f32641a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f32642b.invoke(h11.c.f29092a);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, int i, Composer composer, int i2) {
        a(function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1) {
        function1.invoke(h11.a.f29090a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(float f, float f4, float f5, float f6, Function0 function0, z10 z10Var, Function0 function02, z10 z10Var2, int i, Composer composer, int i2) throws Throwable {
        a(f, f4, f5, f6, function0, z10Var, function02, z10Var2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1) {
        function1.invoke(h11.b.f29091a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, Function0 function0, Function2 function2, int i, int i2, Composer composer, int i3) {
        a(modifier, function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(float f, z10 z10Var, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1730259091, i, -1, "com.fourthline.orca.kyc.internal.flow.selfie.bioauth.NumberUnlockPad.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BioAuthPOCUnlockScreen.kt:188)");
            }
            IconKt.m1223Iconww6aTOc(a20.a(z10Var, composer, 0), (String) null, SizeKt.m882size3ABfNKs(Modifier.INSTANCE, f), f32638a, composer, 3120, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    public static final void a(Function1 onEventSent, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        float f;
        int i3;
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(727853983);
        int i5 = (i & 6) == 0 ? i | (composerStartRestartGroup.changedInstance(onEventSent) ? 4 : 2) : i;
        if (composerStartRestartGroup.shouldExecute((i5 & 3) != 2, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(727853983, i5, -1, "com.fourthline.orca.kyc.internal.flow.selfie.bioauth.BioAuthPOCUnlockScreen (BioAuthPOCUnlockScreen.kt:52)");
            }
            int i6 = i5 & 14;
            boolean z = i6 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qp1(12, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
            z10 z10VarA = new x10().a(r10.d);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM866paddingqDBjuR0$default = PaddingKt.m866paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(100), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM866paddingqDBjuR0$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f4 = SyslogConstants.LOG_CLOCK;
            float f5 = 24;
            Modifier modifierM864paddingVpY3zN4$default = PaddingKt.m864paddingVpY3zN4$default(SizeKt.m882size3ABfNKs(companion2, Dp.m3297constructorimpl(f4)), Dp.m3297constructorimpl(f5), BitmapDescriptorFactory.HUE_RED, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM864paddingVpY3zN4$default);
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
            Updater.m1665setimpl(composerM1662constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM1662constructorimpl2.getInserting() || !Intrinsics.f(composerM1662constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM1662constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM1662constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m1665setimpl(composerM1662constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z10VarA != null) {
                composerStartRestartGroup.startReplaceGroup(1829214584);
                ImageKt.Image(a20.a(z10VarA, composerStartRestartGroup, 0), null, SizeKt.m882size3ABfNKs(companion2, Dp.m3297constructorimpl(f4)), null, ContentScale.INSTANCE.getInside(), BitmapDescriptorFactory.HUE_RED, null, composerStartRestartGroup, 25008, 104);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                i2 = i6;
                companion = companion2;
                f = f5;
                i3 = 0;
            } else if (z10VarA instanceof p70) {
                composerStartRestartGroup.startReplaceGroup(59015685);
                i2 = i6;
                companion = companion2;
                i3 = 0;
                f = f5;
                g81.a(SizeKt.m882size3ABfNKs(companion2, Dp.m3297constructorimpl(f4)), false, false, 0L, 0L, 0L, 0L, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, null, (p70) z10VarA, null, null, null, composerStartRestartGroup, 12582918, 0, 15230);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i2 = i6;
                companion = companion2;
                f = f5;
                i3 = 0;
                composerStartRestartGroup.startReplaceGroup(59022751);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            float f6 = 16;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f6)), composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion, f32640c);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i3));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1662constructorimpl3 = Updater.m1662constructorimpl(composerStartRestartGroup);
            Updater.m1665setimpl(composerM1662constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM1662constructorimpl3.getInserting() || !Intrinsics.f(composerM1662constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM1662constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM1662constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m1665setimpl(composerM1662constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            Composer composer2 = composerStartRestartGroup;
            TextKt.m1280Text4IGK_g("Enter Pin", null, f32638a, TextUnitKt.getSp(32), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 3462, 0, 131058);
            composerStartRestartGroup = composer2;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f)), composerStartRestartGroup, 6);
            Modifier modifierM864paddingVpY3zN4$default2 = PaddingKt.m864paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 0.7f), BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(f), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion3.getCenterVertically(), composerStartRestartGroup, 54);
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM864paddingVpY3zN4$default2);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1662constructorimpl4 = Updater.m1662constructorimpl(composerStartRestartGroup);
            Updater.m1665setimpl(composerM1662constructorimpl4, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (composerM1662constructorimpl4.getInserting() || !Intrinsics.f(composerM1662constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                composerM1662constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                composerM1662constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
            }
            Updater.m1665setimpl(composerM1662constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1473349769);
            for (int i21 = 0; i21 < 4; i21++) {
                BoxKt.Box(BackgroundKt.m613backgroundbw27NRU$default(ClipKt.clip(SizeKt.m882size3ABfNKs(Modifier.INSTANCE, d), RoundedCornerShapeKt.getCircleShape()), f32639b, null, 2, null), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            Modifier.Companion companion5 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion5, Dp.m3297constructorimpl(f6)), composerStartRestartGroup, 6);
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth(companion5, 0.9f), null, false, ComposableLambdaKt.rememberComposableLambda(1408415457, true, new ak1(onEventSent, 8), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            Unit unit = Unit.f186387a;
            boolean z3 = i2 == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new a(onEventSent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mj1(i, 2, onEventSent));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b() {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(h11.a.f29090a);
        return Unit.f186387a;
    }

    private static final void a(final float f, final float f4, final float f5, final float f6, final Function0 function0, final z10 z10Var, final Function0 function02, final z10 z10Var2, Composer composer, final int i) throws Throwable {
        Function0 function03;
        boolean z;
        String str;
        Throwable th10;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1944208230);
        int i3 = (i & 6) == 0 ? (composerStartRestartGroup.changed(f) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f4) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(f5) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(f6) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function03 = function0;
            i3 |= composerStartRestartGroup.changedInstance(function03) ? 16384 : 8192;
        } else {
            function03 = function0;
        }
        if ((196608 & i) == 0) {
            i3 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(z10Var) : composerStartRestartGroup.changedInstance(z10Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? PKIFailureInfo.badCertTemplate : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= (16777216 & i) == 0 ? composerStartRestartGroup.changed(z10Var2) : composerStartRestartGroup.changedInstance(z10Var2) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1944208230, i3, -1, "com.fourthline.orca.kyc.internal.flow.selfie.bioauth.NumberUnlockPad (BioAuthPOCUnlockScreen.kt:150)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            int i5 = 2;
            int i6 = 1;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m835spacedBy0680j_4(f4), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(736468900);
            String str2 = "0";
            Iterator it8 = zhm.v.k(zhm.v.k("1", "2", "3"), zhm.v.k("4", "5", "6"), zhm.v.k("7", "8", "9"), zhm.v.k(null, "0", null)).iterator();
            while (it8.hasNext()) {
                List list = (List) it8.next();
                Iterator it9 = it8;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, i6, null);
                int i21 = i3;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                Updater.m1665setimpl(composerM1662constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m1665setimpl(composerM1662constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (composerM1662constructorimpl2.getInserting() || !Intrinsics.f(composerM1662constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    composerM1662constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                    composerM1662constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                }
                Updater.m1665setimpl(composerM1662constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Throwable th11 = null;
                boolean zF = Intrinsics.f(list, zhm.v.k(null, str2, null));
                composerStartRestartGroup.startReplaceGroup(1374666884);
                int i22 = 0;
                for (Object obj2 : list) {
                    int i32 = i22 + 1;
                    if (i22 < 0) {
                        Throwable th12 = th11;
                        zhm.v.s();
                        throw th12;
                    }
                    String str3 = (String) obj2;
                    if (zF && i22 == 0) {
                        composerStartRestartGroup.startReplaceGroup(-842377358);
                        final int i33 = 0;
                        z = zF;
                        str = str2;
                        th10 = null;
                        a(SizeKt.m882size3ABfNKs(Modifier.INSTANCE, f), function03, ComposableLambdaKt.rememberComposableLambda(790643396, true, new Function2() { // from class: com.fourthline.orca.internal.rr1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                int i43 = i33;
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                switch (i43) {
                                    case 0:
                                        return r7.a(f5, z10Var, composer2, iIntValue);
                                    default:
                                        return r7.b(f5, z10Var, composer2, iIntValue);
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i21 >> 9) & 112) | 384, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        z = zF;
                        str = str2;
                        th10 = th11;
                        int i43 = i5;
                        if (z && i22 == i43) {
                            composerStartRestartGroup.startReplaceGroup(-841721646);
                            final int i59 = 1;
                            i5 = i43;
                            a(SizeKt.m882size3ABfNKs(Modifier.INSTANCE, f), function02, ComposableLambdaKt.rememberComposableLambda(-1730259091, true, new Function2() { // from class: com.fourthline.orca.internal.rr1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    int i432 = i59;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    switch (i432) {
                                        case 0:
                                            return r7.a(f6, z10Var2, composer2, iIntValue);
                                        default:
                                            return r7.b(f6, z10Var2, composer2, iIntValue);
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i21 >> 15) & 112) | 384, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            i5 = i43;
                            if (str3 != null) {
                                composerStartRestartGroup.startReplaceGroup(-841079109);
                                Modifier modifierM882size3ABfNKs = SizeKt.m882size3ABfNKs(Modifier.INSTANCE, f);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    i2 = 4;
                                    objRememberedValue = new nr1(i2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    i2 = 4;
                                }
                                a(modifierM882size3ABfNKs, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(-827043252, true, new wj1(str3, 1), composerStartRestartGroup, 54), composerStartRestartGroup, 432, 0);
                                composerStartRestartGroup.endReplaceGroup();
                                function03 = function0;
                                str2 = str;
                                i22 = i32;
                                th11 = th10;
                                zF = z;
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-840490202);
                                Modifier modifierAlpha = AlphaKt.alpha(SizeKt.m882size3ABfNKs(Modifier.INSTANCE, f), 0.5f);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new nr1(5);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                a(modifierAlpha, (Function0) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(1202126861, true, new Function2() { // from class: com.fourthline.orca.internal.sr1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        int iIntValue = ((Integer) obj4).intValue();
                                        return r7.a(f, (Composer) obj3, iIntValue);
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 432, 0);
                                composerStartRestartGroup.endReplaceGroup();
                                function03 = function0;
                                str2 = str;
                                i22 = i32;
                                th11 = th10;
                                zF = z;
                            }
                        }
                    }
                    function03 = function0;
                    str2 = str;
                    i22 = i32;
                    th11 = th10;
                    zF = z;
                }
                i6 = 1;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                function03 = function0;
                it8 = it9;
                i3 = i21;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.fourthline.orca.internal.tr1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return r7.a(f, f4, f5, f6, function0, z10Var, function02, z10Var2, i, (Composer) obj3, iIntValue);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(float f, z10 z10Var, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(790643396, i, -1, "com.fourthline.orca.kyc.internal.flow.selfie.bioauth.NumberUnlockPad.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BioAuthPOCUnlockScreen.kt:175)");
            }
            IconKt.m1223Iconww6aTOc(a20.a(z10Var, composer, 0), (String) null, SizeKt.m882size3ABfNKs(Modifier.INSTANCE, f), f32638a, composer, 3120, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a() {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-827043252, i, -1, "com.fourthline.orca.kyc.internal.flow.selfie.bioauth.NumberUnlockPad.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BioAuthPOCUnlockScreen.kt:201)");
            }
            TextKt.m1280Text4IGK_g(str, null, f32638a, TextUnitKt.getSp(28), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fj0.f28535a.b(composer, 6).getIb.b.Screen java.lang.String().getTitle().a(null, composer, 0, 1), composer, 3456, 0, 65522);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(float f, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1202126861, i, -1, "com.fourthline.orca.kyc.internal.flow.selfie.bioauth.NumberUnlockPad.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BioAuthPOCUnlockScreen.kt:216)");
            }
            BoxKt.Box(SizeKt.m882size3ABfNKs(Modifier.INSTANCE, f), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    private static final void a(Modifier modifier, Function0 function0, Function2 function2, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1984894830);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1984894830, i3, -1, "com.fourthline.orca.kyc.internal.flow.selfie.bioauth.PadKey (BioAuthPOCUnlockScreen.kt:231)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM629clickableO2vRcR0$default = ClickableKt.m629clickableO2vRcR0$default(modifier3, (MutableInteractionSource) objRememberedValue, null, false, null, null, function0, 28, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM629clickableO2vRcR0$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ck1(i, modifier2, i2, function0, 11, function2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) throws Throwable {
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 6) == 0) {
            i |= composer.changed(BoxWithConstraints) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1408415457, i, -1, "com.fourthline.orca.kyc.internal.flow.selfie.bioauth.BioAuthPOCUnlockScreen.<anonymous>.<anonymous>.<anonymous> (BioAuthPOCUnlockScreen.kt:116)");
            }
            float fM3297constructorimpl = Dp.m3297constructorimpl(12);
            float value = ((Dp) cim.c.k(Dp.m3295boximpl(Dp.m3297constructorimpl(Dp.m3297constructorimpl(BoxWithConstraints.mo847getMaxWidthD9Ej5fM() - Dp.m3297constructorimpl(2 * fM3297constructorimpl)) / 3)), Dp.m3295boximpl(Dp.m3297constructorimpl(48)))).getValue();
            float fM3297constructorimpl2 = Dp.m3297constructorimpl(0.44f * value);
            float fM3297constructorimpl3 = Dp.m3297constructorimpl(0.8f * fM3297constructorimpl2);
            float fM3297constructorimpl4 = Dp.m3297constructorimpl(fM3297constructorimpl2 * 1.5f);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qp1(13, function1);
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            z10 z10VarA = new x10().a(r10.P0);
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new qp1(14, function1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            a(value, fM3297constructorimpl, fM3297constructorimpl3, fM3297constructorimpl4, function0, z10VarA, (Function0) objRememberedValue2, new x10().a(r10.M0), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }
}
