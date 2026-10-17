package com.fourthline.orca.internal;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.FaceKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.view.compose.BackHandlerKt;
import ch.qos.logback.core.net.SyslogConstants;
import com.fourthline.orca.internal.fj0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.wb1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes23.dex */
public abstract class o7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f31600c;
    private static final float d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f31598a = Dp.m3297constructorimpl(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f31599b = Dp.m3297constructorimpl(132);
    private static final float e = Dp.m3297constructorimpl(220);
    private static final long f = ColorKt.Color(4280255841L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f31601g = ColorKt.Color(4284073868L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f31602h = ColorKt.Color(4281234385L);

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f31604b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f31604b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f31604b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f31603a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f31604b.invoke(wb1.b.f34586a);
            return Unit.f186387a;
        }
    }

    static {
        float f4 = 20;
        f31600c = Dp.m3297constructorimpl(f4);
        d = Dp.m3297constructorimpl(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(int i, Composer composer, int i2) {
        a(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, int i, int i2, Composer composer, int i3) {
        a(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    private static final float b(float f4, float f5, float f6, float f32, float f35) {
        return f35 - (((f6 - f4) / f5) * (f35 - f32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(yb1 yb1Var, Function1 function1, int i, Composer composer, int i2) {
        a(yb1Var, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(int i, Composer composer, int i2) {
        b(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(yb1 state, Function1 onEventSent, Composer composer, int i) {
        int i2;
        Function1 function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-388297680);
        if ((i & 48) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(onEventSent) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-388297680, i2, -1, "com.fourthline.orca.kyc.internal.flow.selfie.bioauth.BioAuthPOCContentUnlockedScreen (BioAuthPOCContentUnlockedScreen.kt:72)");
            }
            Unit unit = Unit.f186387a;
            int i3 = i2 & 112;
            Object[] objArr = i3 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objArr != false || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(onEventSent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            Object[] objArr2 = i3 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objArr2 != false || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new qp1(4, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 1);
            fj0 fj0Var = fj0.f28535a;
            float f4 = fj0Var.c(composerStartRestartGroup, 6).f();
            float fM3297constructorimpl = Dp.m3297constructorimpl(56);
            Dp.m3297constructorimpl(24);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Modifier modifierA = a80.a(PaddingKt.m865paddingqDBjuR0(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), BitmapDescriptorFactory.HUE_RED, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), f4, fM3297constructorimpl, f4, Dp.m3297constructorimpl(16)), "bio_auth_upload_scroll", (String) null, 2, (Object) null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            a81 a81VarE = fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getHeader();
            fj0.a aVar = fj0.a.f28536a;
            TextKt.m1280Text4IGK_g("Hi Federica", null, fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getHeader().getColor().a(composerStartRestartGroup, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a81VarE.a(TextUnit.m3364boximpl(aVar.b()), composerStartRestartGroup, 6, 0), composerStartRestartGroup, 6, 0, 65530);
            float f5 = f31600c;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, f5), composerStartRestartGroup, 6);
            TextKt.m1280Text4IGK_g("Kick off your adventure with Fourthline Hub!", null, Color.m1976copywmQWz5c$default(fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getMessage().getColor().a(composerStartRestartGroup, 0), 0.85f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getMessage().a(TextUnit.m3364boximpl(aVar.c()), composerStartRestartGroup, 6, 0), composerStartRestartGroup, 6, 0, 65530);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, f5), composerStartRestartGroup, 6);
            float f6 = 1;
            SpacerKt.Spacer(BackgroundKt.m613backgroundbw27NRU$default(SizeKt.m874height3ABfNKs(SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), Dp.m3297constructorimpl(f6)), Color.m1976copywmQWz5c$default(fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getMessage().getColor().a(composerStartRestartGroup, 0), 0.2f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null, 2, null), composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, f5), composerStartRestartGroup, 6);
            b(composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, f5), composerStartRestartGroup, 6);
            a(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(BackgroundKt.m613backgroundbw27NRU$default(SizeKt.m874height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m866paddingqDBjuR0$default(companion, f4, BitmapDescriptorFactory.HUE_RED, f4, BitmapDescriptorFactory.HUE_RED, 10, null), BitmapDescriptorFactory.HUE_RED, 1, null), Dp.m3297constructorimpl(f6)), Color.m1976copywmQWz5c$default(fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getMessage().getColor().a(composerStartRestartGroup, 0), 0.2f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null, 2, null), composerStartRestartGroup, 0);
            kd1.f fVar = new kd1.f(null, 1, 0 == true ? 1 : 0);
            Object[] objArr3 = i3 == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objArr3 == true || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                function1 = onEventSent;
                objRememberedValue3 = new eq1(15, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                function1 = onEventSent;
            }
            p9.a(null, null, fVar, false, null, (Function1) objRememberedValue3, composerStartRestartGroup, 0, 27);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(32)), composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function1 = onEventSent;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bo1(state, function1, i, 1));
        }
    }

    private static final void b(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1708890633);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1708890633, i, -1, "com.fourthline.orca.kyc.internal.flow.selfie.bioauth.BioAuthUploadCard (BioAuthPOCContentUnlockedScreen.kt:156)");
            }
            fj0 fj0Var = fj0.f28535a;
            i8 i8VarE = fj0Var.b(composerStartRestartGroup, 6).getHint().getDefault().getBorder();
            RoundedCornerShape roundedCornerShapeM968RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(f31598a);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierA = a80.a(BackgroundKt.m613backgroundbw27NRU$default(BorderKt.m617borderxT4_qwU(ClipKt.clip(SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), roundedCornerShapeM968RoundedCornerShape0680j_4), Dp.m3297constructorimpl(i8VarE.getWidth()), i8VarE.getColor().a(composerStartRestartGroup, 0), roundedCornerShapeM968RoundedCornerShape0680j_4), fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getBackground().a(composerStartRestartGroup, 0), null, 2, null), "bio_auth_upload_card", (String) null, 2, (Object) null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m874height3ABfNKs(SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), f31599b), Brush.Companion.m1960verticalGradient8A3gB4$default(Brush.INSTANCE, zhm.v.k(Color.m1972boximpl(f), Color.m1972boximpl(f31601g)), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 14, null), null, BitmapDescriptorFactory.HUE_RED, 6, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default);
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
            Updater.m1665setimpl(composerM1662constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl2.getInserting() || !Intrinsics.f(composerM1662constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM1662constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM1662constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m1665setimpl(composerM1662constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            IconKt.m1224Iconww6aTOc(FaceKt.getFace(Icons.INSTANCE.getDefault()), (String) null, a80.a(SizeKt.m882size3ABfNKs(companion, Dp.m3297constructorimpl(56)), "bio_auth_upload_card_icon", (String) null, 2, (Object) null), Color.INSTANCE.m1995getWhite0d7_KjU(), composerStartRestartGroup, 3120, 0);
            composerStartRestartGroup.endNode();
            TextKt.m1280Text4IGK_g("This guide gives both experienced and new developers the tools and examples they need to make the most of our platform.", PaddingKt.m862padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), d), fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getMessage().getColor().a(composerStartRestartGroup, 0), 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3223getCentere0LSkKk()), 0L, 0, false, 0, 0, null, fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getMessage().a(TextUnit.m3364boximpl(fj0.a.f28536a.c()), composerStartRestartGroup, 6, 0), composerStartRestartGroup, 54, 0, 65016);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new tm1(i, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(wb1.c.f34587a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(wb1.a.f34585a);
        return Unit.f186387a;
    }

    private static final void a(Composer composer, int i) {
        Composer composer2;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1396570967);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1396570967, i, -1, "com.fourthline.orca.kyc.internal.flow.selfie.bioauth.BioAuthConversionMetricsChart (BioAuthPOCContentUnlockedScreen.kt:206)");
            }
            fj0 fj0Var = fj0.f28535a;
            i8 i8VarE = fj0Var.b(composerStartRestartGroup, 6).getHint().getDefault().getBorder();
            RoundedCornerShape roundedCornerShapeM968RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(f31598a);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM862padding3ABfNKs = PaddingKt.m862padding3ABfNKs(BackgroundKt.m613backgroundbw27NRU$default(BorderKt.m617borderxT4_qwU(ClipKt.clip(SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), roundedCornerShapeM968RoundedCornerShape0680j_4), Dp.m3297constructorimpl(i8VarE.getWidth()), i8VarE.getColor().a(composerStartRestartGroup, 0), roundedCornerShapeM968RoundedCornerShape0680j_4), fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getBackground().a(composerStartRestartGroup, 0), null, 2, null), Dp.m3297constructorimpl(16));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM862padding3ABfNKs);
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
            a81 a81VarG = fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getTitle();
            fj0.a aVar = fj0.a.f28536a;
            TextStyle textStyleA = a81VarG.a(TextUnit.m3364boximpl(aVar.c()), composerStartRestartGroup, 6, 0);
            long jA = fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getTitle().getColor().a(composerStartRestartGroup, 0);
            int i3 = 6;
            TextKt.m1280Text4IGK_g("E2E Conversion Performance Metrics", null, jA, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleA, composerStartRestartGroup, 6, 0, 65530);
            float f4 = 8;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f4)), composerStartRestartGroup, 6);
            TextKt.m1280Text4IGK_g("Conversion %", null, Color.m1976copywmQWz5c$default(fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getMessage().getColor().a(composerStartRestartGroup, 0), 0.9f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m2967copyp1EtxEg$default(fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getMessage().a(TextUnit.m3364boximpl(aVar.d()), composerStartRestartGroup, 6, 0), 0L, TextUnitKt.getSp(14), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composerStartRestartGroup, 6, 0, 65530);
            Composer composer3 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f4)), composer3, 6);
            int i5 = 2;
            int i6 = 0;
            a(a80.a(SizeKt.m874height3ABfNKs(SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), e), "bio_auth_conversion_chart_plot", (String) null, 2, (Object) null), composer3, 0, 0);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f4)), composer3, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m835spacedBy0680j_4(Dp.m3297constructorimpl(4)), companion2.getTop(), composer3, 6);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            Composer composerM1662constructorimpl2 = Updater.m1662constructorimpl(composer3);
            Updater.m1665setimpl(composerM1662constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl2.getInserting() || !Intrinsics.f(composerM1662constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM1662constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM1662constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m1665setimpl(composerM1662constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextStyle textStyleM2967copyp1EtxEg$default = TextStyle.m2967copyp1EtxEg$default(fj0Var.b(composer3, 6).getIb.b.Screen java.lang.String().getMessage().a(TextUnit.m3364boximpl(aVar.d()), composer3, 6, 0), 0L, TextUnitKt.getSp(11), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            List listK = zhm.v.k("Week 1", "Week 2", "Week 3", "Week 4");
            composer3.startReplaceGroup(-302969357);
            Iterator it8 = listK.iterator();
            while (it8.hasNext()) {
                Composer composer4 = composer3;
                TextKt.m1280Text4IGK_g((String) it8.next(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), fj0.f28535a.b(composer3, i3).getIb.b.Screen java.lang.String().getMessage().getColor().a(composer3, i6), 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3223getCentere0LSkKk()), 0L, 0, false, 2, 0, null, textStyleM2967copyp1EtxEg$default, composer4, 0, 3072, 56824);
                i5 = i5;
                composer3 = composer4;
                rowScopeInstance = rowScopeInstance;
                i6 = i6;
                i3 = 6;
            }
            composer2 = composer3;
            i2 = i5;
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i2 = 2;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new tm1(i, i2));
        }
    }

    private static final void a(Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-531861590);
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
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            Modifier modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-531861590, i3, -1, "com.fourthline.orca.kyc.internal.flow.selfie.bioauth.BioAuthLineChartPlot (BioAuthPOCContentUnlockedScreen.kt:270)");
            }
            fj0 fj0Var = fj0.f28535a;
            final long jA = fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getMessage().getColor().a(composerStartRestartGroup, 0);
            final long jA2 = fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getBackground().a(composerStartRestartGroup, 0);
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            final List listK = zhm.v.k(Float.valueOf(81.0f), Float.valueOf(76.0f), Float.valueOf(83.0f), Float.valueOf(91.0f));
            final List listK2 = zhm.v.k(Float.valueOf(100.0f), Float.valueOf(90.0f), Float.valueOf(80.0f), Float.valueOf(70.0f));
            final TextStyle textStyleM2967copyp1EtxEg$default = TextStyle.m2967copyp1EtxEg$default(fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getMessage().a(TextUnit.m3364boximpl(fj0.a.f28536a.d()), composerStartRestartGroup, 6, 0), 0L, TextUnitKt.getSp(10), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
            Modifier modifierM613backgroundbw27NRU$default = BackgroundKt.m613backgroundbw27NRU$default(modifier3, Color.m1976copywmQWz5c$default(jA, 0.06f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null, 2, null);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new jm1(28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BoxWithConstraintsKt.BoxWithConstraints(SemanticsModifierKt.semantics$default(modifierM613backgroundbw27NRU$default, false, (Function1) objRememberedValue, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(687691904, true, new Function3() { // from class: com.fourthline.orca.internal.lq1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return o7.a(density, jA, jA2, listK2, listK, 70.0f, 30.0f, textStyleM2967copyp1EtxEg$default, (BoxWithConstraintsScope) obj2, (Composer) obj3, iIntValue);
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zj1(modifier2, i, i2, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, "Conversion trend: 81 percent, 76 percent, 83 percent, 91 percent over four weeks.");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Density density, final long j2, final long j3, List list, final List list2, final float f4, final float f5, TextStyle textStyle, BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) throws Throwable {
        int i2;
        float f6;
        Modifier modifier;
        float f32;
        int i3;
        float f35;
        Throwable th10;
        float f36;
        float f37;
        float f41;
        float f42;
        float f57;
        float f69;
        String str;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 6) == 0) {
            i2 = i | (composer2.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i5 = 0;
        if (composer2.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(687691904, i2, -1, "com.fourthline.orca.kyc.internal.flow.selfie.bioauth.BioAuthLineChartPlot.<anonymous> (BioAuthPOCContentUnlockedScreen.kt:292)");
            }
            float fM3279getMaxWidthimpl = Constraints.m3279getMaxWidthimpl(BoxWithConstraints.getConstraints());
            float fM3278getMaxHeightimpl = Constraints.m3278getMaxHeightimpl(BoxWithConstraints.getConstraints());
            final float fMo768toPx0680j_4 = density.mo768toPx0680j_4(Dp.m3297constructorimpl(36)) + density.mo768toPx0680j_4(Dp.m3297constructorimpl(6));
            final float fMo768toPx0680j_42 = density.mo768toPx0680j_4(Dp.m3297constructorimpl(22));
            float fMo768toPx0680j_43 = density.mo768toPx0680j_4(Dp.m3297constructorimpl(12));
            final float fMo768toPx0680j_44 = fM3279getMaxWidthimpl - density.mo768toPx0680j_4(Dp.m3297constructorimpl(8));
            final float f75 = fM3278getMaxHeightimpl - fMo768toPx0680j_43;
            final float f77 = fMo768toPx0680j_44 - fMo768toPx0680j_4;
            float fMo768toPx0680j_45 = density.mo768toPx0680j_4(Dp.m3297constructorimpl(5));
            float fMo768toPx0680j_46 = density.mo768toPx0680j_4(Dp.m3297constructorimpl(14));
            float fMo768toPx0680j_47 = density.mo768toPx0680j_4(Dp.m3297constructorimpl(10));
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean zChanged = composer2.changed(fMo768toPx0680j_42) | composer2.changed(f75) | composer2.changed(j2) | composer2.changed(fMo768toPx0680j_4) | composer2.changed(fMo768toPx0680j_44) | composer2.changed(f77) | composer2.changed(j3);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                f6 = fM3278getMaxHeightimpl;
                modifier = modifierFillMaxSize$default;
                f32 = fM3279getMaxWidthimpl;
                i3 = 6;
                f35 = BitmapDescriptorFactory.HUE_RED;
                th10 = null;
                Function1 function1 = new Function1() { // from class: com.fourthline.orca.internal.jq1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return o7.a(j2, fMo768toPx0680j_4, fMo768toPx0680j_44, list2, j3, fMo768toPx0680j_42, f75, f4, f5, f77, (DrawScope) obj2);
                    }
                };
                f36 = fMo768toPx0680j_4;
                f37 = fMo768toPx0680j_42;
                f41 = f75;
                f42 = f4;
                f57 = f5;
                f69 = f77;
                composer2.updateRememberedValue(function1);
                objRememberedValue = function1;
            } else {
                modifier = modifierFillMaxSize$default;
                f6 = fM3278getMaxHeightimpl;
                f36 = fMo768toPx0680j_4;
                f37 = fMo768toPx0680j_42;
                f41 = f75;
                f69 = f77;
                f32 = fM3279getMaxWidthimpl;
                i3 = 6;
                f35 = BitmapDescriptorFactory.HUE_RED;
                th10 = null;
                f42 = f4;
                f57 = f5;
            }
            CanvasKt.Canvas(modifier, (Function1) objRememberedValue, composer2, i3);
            if (f32 > 2.0f && f6 > 2.0f) {
                composer2.startReplaceGroup(38426657);
                composer2.startReplaceGroup(-552949904);
                Iterator it8 = list.iterator();
                while (true) {
                    str = "%";
                    if (!it8.hasNext()) {
                        break;
                    }
                    float fFloatValue = ((Number) it8.next()).floatValue();
                    float fB = b(f42, f57, fFloatValue, f37, f41) - fMo768toPx0680j_45;
                    String str2 = ((int) fFloatValue) + "%";
                    int iM3227getRighte0LSkKk = TextAlign.INSTANCE.m3227getRighte0LSkKk();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    boolean zChanged2 = composer2.changed(fB);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new aj1(fB, 1);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    TextKt.m1280Text4IGK_g(str2, OffsetKt.offset(companion, (Function1) objRememberedValue2), j2, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(iM3227getRighte0LSkKk), 0L, 0, false, 0, 0, null, textStyle, composer, 0, 0, 65016);
                    f42 = f4;
                    f57 = f5;
                    composer2 = composer;
                    f37 = f37;
                    f41 = f41;
                }
                float f81 = f37;
                float f82 = f41;
                composer2.endReplaceGroup();
                Iterator it9 = list2.iterator();
                while (true) {
                    int i6 = i5;
                    if (!it9.hasNext()) {
                        break;
                    }
                    Object next = it9.next();
                    i5 = i6 + 1;
                    if (i6 >= 0) {
                        float fFloatValue2 = ((Number) next).floatValue();
                        float f93 = i6;
                        int size = list2.size() - 1;
                        if (size < 1) {
                            size = 1;
                        }
                        float f94 = f36 + (f69 * (f93 / size));
                        float f99 = f81;
                        float f100 = f82;
                        float fB2 = (b(f4, f5, fFloatValue2, f99, f100) - fMo768toPx0680j_46) - fMo768toPx0680j_47;
                        if (fB2 < f35) {
                            fB2 = f35;
                        }
                        String str3 = ((int) fFloatValue2) + str;
                        long j5 = f31602h;
                        int iM3223getCentere0LSkKk = TextAlign.INSTANCE.m3223getCentere0LSkKk();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        boolean zChanged3 = composer2.changed(f94) | composer2.changed(fB2);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new kq1(f94, fB2, 0);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        f81 = f99;
                        f82 = f100;
                        TextKt.m1280Text4IGK_g(str3, OffsetKt.offset(companion2, (Function1) objRememberedValue3), j5, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(iM3223getCentere0LSkKk), 0L, 0, false, 0, 0, null, textStyle, composer, 384, 0, 65016);
                        composer2 = composer;
                        str = str;
                    } else {
                        zhm.v.s();
                        throw th10;
                    }
                }
            } else {
                composer2.startReplaceGroup(25149698);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(long j2, float f4, float f5, List list, long j3, float f6, float f32, float f35, float f36, float f37, DrawScope Canvas) {
        int i;
        float f41 = f6;
        float f42 = f32;
        float f57 = f35;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        if (Float.intBitsToFloat((int) (Canvas.mo2212getSizeNHjbRc() >> 32)) > 2.0f && Float.intBitsToFloat((int) (Canvas.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) > 2.0f) {
            int i2 = 70;
            int iA = iim.b.a(70, 100, 10);
            if (70 <= iA) {
                while (true) {
                    float fA = a(f41, f42, f57, f36, i2);
                    int i3 = i2;
                    int i5 = iA;
                    i = 10;
                    DrawScope.m2203drawLineNGM6Ib0$default(Canvas, Color.m1976copywmQWz5c$default(j2, 0.2f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(fA)) & BodyPartID.bodyIdMax)), Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(fA)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f5) << 32)), Canvas.mo768toPx0680j_4(Dp.m3297constructorimpl(1)), 0, null, BitmapDescriptorFactory.HUE_RED, null, 0, 496, null);
                    if (i3 == i5) {
                        break;
                    }
                    i2 = i3 + 10;
                    f42 = f32;
                    iA = i5;
                    f41 = f6;
                    f57 = f35;
                }
            } else {
                i = 10;
            }
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                float f69 = i6 * f37;
                int i21 = size - 1;
                if (i21 < 1) {
                    i21 = 1;
                }
                arrayList.add(Float.valueOf(f4 + (f69 / i21)));
            }
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list, i));
            int i22 = 0;
            for (Object obj2 : list) {
                int i32 = i22 + 1;
                if (i22 >= 0) {
                    float fFloatValue = ((Number) obj2).floatValue();
                    float fFloatValue2 = ((Number) arrayList.get(i22)).floatValue();
                    arrayList2.add(Offset.m1826boximpl(Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(a(f6, f32, f35, f36, fFloatValue))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fFloatValue2) << 32))));
                    i22 = i32;
                } else {
                    zhm.v.s();
                    throw null;
                }
            }
            Path Path = AndroidPath_androidKt.Path();
            int i33 = 0;
            Path.moveTo(Float.intBitsToFloat((int) (((Offset) arrayList2.get(0)).getPackedValue() >> 32)), Float.intBitsToFloat((int) (((Offset) arrayList2.get(0)).getPackedValue() & BodyPartID.bodyIdMax)));
            int size2 = arrayList2.size();
            for (int i43 = 1; i43 < size2; i43++) {
                Path.lineTo(Float.intBitsToFloat((int) (((Offset) arrayList2.get(i43)).getPackedValue() >> 32)), Float.intBitsToFloat((int) (((Offset) arrayList2.get(i43)).getPackedValue() & BodyPartID.bodyIdMax)));
            }
            DrawScope.m2205drawPathLG529CI$default(Canvas, Path, f31602h, BitmapDescriptorFactory.HUE_RED, new Stroke(Canvas.mo768toPx0680j_4(Dp.m3297constructorimpl((float) 2.5d)), BitmapDescriptorFactory.HUE_RED, StrokeCap.INSTANCE.m2115getRoundKaPHkGw(), 0, null, 26, null), null, 0, 52, null);
            DrawScope drawScope = Canvas;
            float fMo768toPx0680j_4 = drawScope.mo768toPx0680j_4(Dp.m3297constructorimpl(5));
            float fMo768toPx0680j_42 = drawScope.mo768toPx0680j_4(Dp.m3297constructorimpl(2));
            for (int size3 = arrayList2.size(); i33 < size3; size3 = size3) {
                long packedValue = ((Offset) arrayList2.get(i33)).getPackedValue();
                DrawScope.m2199drawCircleVaOC9Bg$default(drawScope, j3, fMo768toPx0680j_4, packedValue, BitmapDescriptorFactory.HUE_RED, null, null, 0, SyslogConstants.LOG_CLOCK, null);
                DrawScope.m2199drawCircleVaOC9Bg$default(Canvas, f31602h, fMo768toPx0680j_4, packedValue, BitmapDescriptorFactory.HUE_RED, new Stroke(fMo768toPx0680j_42, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null), null, 0, 104, null);
                drawScope = Canvas;
                i33++;
            }
            return Unit.f186387a;
        }
        return Unit.f186387a;
    }

    private static final float a(float f4, float f5, float f6, float f32, float f35) {
        return b(f6, f32, f35, f4, f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset a(float f4, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        int iMo762roundToPx0680j_4 = offset.mo762roundToPx0680j_4(Dp.m3297constructorimpl(2));
        int iC = rim.d.c(f4);
        if (iC < 0) {
            iC = 0;
        }
        return IntOffset.m3328boximpl(IntOffset.m3329constructorimpl((((long) iC) & BodyPartID.bodyIdMax) | (((long) iMo762roundToPx0680j_4) << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset a(float f4, float f5, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        int iC = rim.d.c(f4 - offset.mo762roundToPx0680j_4(Dp.m3297constructorimpl(14)));
        if (iC < 0) {
            iC = 0;
        }
        return IntOffset.m3328boximpl(IntOffset.m3329constructorimpl((((long) rim.d.c(f5)) & BodyPartID.bodyIdMax) | (((long) iC) << 32)));
    }
}
