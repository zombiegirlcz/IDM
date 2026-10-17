package com.fourthline.orca.internal;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material.RippleKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.view.compose.BackHandlerKt;
import ch.qos.logback.core.net.SyslogConstants;
import com.fourthline.orca.internal.e1;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.rr0;
import com.fourthline.orca.internal.tr0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
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
public abstract class ds0 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f27908b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f27908b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f27908b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f27907a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f27908b.invoke(rr0.d.f32811a);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(tr0.a aVar, Function1 function1, int i, Composer composer, int i2) {
        a(aVar, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(tr0 tr0Var, Function1 function1, int i, Composer composer, int i2) {
        a(tr0Var, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(tr0 tr0Var, Function1 function1, int i, Composer composer, int i2) {
        b(tr0Var, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(tr0.a.b bVar, int i, Composer composer, int i2) {
        a(bVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void b(final tr0 state, final Function1 onEventSent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2011185666);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEventSent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2011185666, i2, -1, "com.fourthline.orca.qes.internal.screens.agreements.QesAgreementsScreen (QesAgreementsScreen.kt:80)");
            }
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new lj1(6, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
            String strC = d81.c(state.getTitle(), composerStartRestartGroup, 0);
            fj0 fj0Var = fj0.f28535a;
            i20 i20Var = new i20(true, zi0.b(fj0Var.a(composerStartRestartGroup, 6)).a(composerStartRestartGroup, 0), BitmapDescriptorFactory.HUE_RED, 4, null);
            composerStartRestartGroup.startReplaceGroup(-14117590);
            float fMo768toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo768toPx0680j_4(fj0Var.c(composerStartRestartGroup, 6).a());
            composerStartRestartGroup.endReplaceGroup();
            wz0 wz0Var = new wz0(i20Var, new mj0(true, true, 0.15f, new vz0(fMo768toPx0680j_4), Color.m1972boximpl(fj0Var.b(composerStartRestartGroup, 6).getAgreements().getBackground().a(composerStartRestartGroup, 0)), Color.m1972boximpl(Color.m1976copywmQWz5c$default(fj0Var.b(composerStartRestartGroup, 6).getAgreements().getBackground().a(composerStartRestartGroup, 0), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null)), null));
            composerStartRestartGroup.startReplaceGroup(-14070636);
            m80.b bVar = new m80.b(new a9(state.r(), state.p(), state.q()));
            boolean z3 = i3 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new li1(14, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            l80 l80Var = new l80(bVar, (Function1) objRememberedValue2);
            m80.a.b bVar2 = new m80.a.b(state.s());
            boolean z4 = i3 == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new li1(15, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            n80 n80Var = new n80(l80Var, new l80(bVar2, (Function1) objRememberedValue3), false, 4, null);
            composerStartRestartGroup.endReplaceGroup();
            final int i5 = 0;
            final int i6 = 1;
            ri0.a("qes_agreements", strC, null, ComposableLambdaKt.rememberComposableLambda(1090332721, true, new Function3() { // from class: com.fourthline.orca.internal.yk1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i21 = i5;
                    ColumnScope columnScope = (ColumnScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    switch (i21) {
                        case 0:
                            return ds0.a(state, onEventSent, columnScope, composer2, iIntValue);
                        default:
                            return ds0.b(state, onEventSent, columnScope, composer2, iIntValue);
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(428743248, true, new Function3() { // from class: com.fourthline.orca.internal.yk1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i21 = i6;
                    ColumnScope columnScope = (ColumnScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    switch (i21) {
                        case 0:
                            return ds0.a(state, onEventSent, columnScope, composer2, iIntValue);
                        default:
                            return ds0.b(state, onEventSent, columnScope, composer2, iIntValue);
                    }
                }
            }, composerStartRestartGroup, 54), n80Var, wz0Var, false, null, composerStartRestartGroup, 27654, 388);
            Unit unit = Unit.f186387a;
            boolean z6 = i3 == 32;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new a(onEventSent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zk1(state, onEventSent, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(tr0.a.InterfaceC0287a.C0288a c0288a, Function1 function1, int i, Composer composer, int i2) {
        a(c0288a, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, tr0.a.InterfaceC0287a.b bVar, Function1 function1, int i, int i2, Composer composer, int i3) {
        a(modifier, bVar, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(List list, Function1 function1, int i, Composer composer, int i2) {
        a(list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(rr0.e.f32812a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(tr0 tr0Var, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1090332721, i, -1, "com.fourthline.orca.qes.internal.screens.agreements.QesAgreementsScreen.<anonymous> (QesAgreementsScreen.kt:105)");
            }
            a(tr0Var, function1, composer, 0);
            if (tr0Var.n().c() == null) {
                composer.startReplaceGroup(-735448985);
                tr0.a aVarN = tr0Var.n();
                String strO = tr0Var.o();
                boolean zU = tr0Var.u();
                boolean zT = tr0Var.t();
                boolean zChanged = composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new li1(13, function1);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer2 = composer;
                pr0.a(aVarN, strO, zU, zT, function1, (Function1) objRememberedValue, composer2, 0, 0);
            } else {
                composer2 = composer;
                composer2.startReplaceGroup(-740800143);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, boolean z) {
        if (z) {
            function1.invoke(rr0.g.f32814a);
        } else {
            function1.invoke(rr0.f.f32813a);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, tr0.a.InterfaceC0287a.C0288a it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new rr0.b(it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(rr0.c.f32810a);
        return Unit.f186387a;
    }

    private static final void a(tr0.a.InterfaceC0287a.C0288a c0288a, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(622493328);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(c0288a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(622493328, i2, -1, "com.fourthline.orca.qes.internal.screens.agreements.QtspPrivacyPolicy (QesAgreementsScreen.kt:165)");
            }
            composerStartRestartGroup.startReplaceGroup(1215639682);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(i, i3, null);
            String strC = d81.c(c81.f27404a.a(R.string.step_qes_agree_disclaimer_fourthline, c0288a.a()), composerStartRestartGroup, 0);
            fj0 fj0Var = fj0.f28535a;
            TextStyle textStyleA = fj0Var.b(composerStartRestartGroup, 6).getLinkButton().getMessage().a(null, composerStartRestartGroup, 0, 1);
            long jA = fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getMessage().getColor().a(composerStartRestartGroup, 0);
            int iPushStyle = builder.pushStyle(new ParagraphStyle(TextAlign.INSTANCE.m3223getCentere0LSkKk(), 0, textStyleA.m2979getLineHeightXSAIIZE(), null, null, null, 0, 0, null, 506, null));
            try {
                int iPushStyle2 = builder.pushStyle(new SpanStyle(jA, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                try {
                    builder.append(strC);
                    Unit unit = Unit.f186387a;
                    builder.pop(iPushStyle);
                    builder.addStyle(new SpanStyle(fj0Var.b(composerStartRestartGroup, 6).getLinkButton().getDefault().getLink().getColor().a(composerStartRestartGroup, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.INSTANCE.getUnderline(), null, null, null, 61438, null), kotlin.text.d0.T(strC, c0288a.a(), 0, false, 6), kotlin.text.d0.T(strC, c0288a.a(), 0, false, 6) + c0288a.a().length());
                    int i5 = i2;
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM866paddingqDBjuR0$default = PaddingKt.m866paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(a80.a(Modifier.INSTANCE, "termsAndConditionMessage", (String) null, 2, (Object) null), null, false, 3, null), BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(14), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    TextStyle textStyleA2 = fj0Var.b(composerStartRestartGroup, 6).getLinkButton().getMessage().a(null, composerStartRestartGroup, 0, 1);
                    int i6 = ((i5 & 112) == 32 ? 1 : 0) | ((14 & i5) == 4 ? 1 : 0);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i6 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new jn1(function1, c0288a, 8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    ClickableTextKt.m978ClickableText4YKlhWE(annotatedString, modifierM866paddingqDBjuR0$default, textStyleA2, false, 0, 0, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, SyslogConstants.LOG_CLOCK);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } finally {
                    builder.pop(iPushStyle2);
                }
            } catch (Throwable th10) {
                builder.pop(iPushStyle);
                throw th10;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(c0288a, function1, i, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(tr0 tr0Var, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(428743248, i, -1, "com.fourthline.orca.qes.internal.screens.agreements.QesAgreementsScreen.<anonymous> (QesAgreementsScreen.kt:124)");
            }
            tr0.a.InterfaceC0287a.C0288a c0288aA = tr0Var.n().a();
            if (c0288aA == null) {
                composer.startReplaceGroup(-542576685);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-542576684);
                boolean zChanged = composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new li1(16, function1);
                    composer.updateRememberedValue(objRememberedValue);
                }
                a(c0288aA, (Function1) objRememberedValue, composer, 0);
                SpacerKt.Spacer(SizeKt.m874height3ABfNKs(Modifier.INSTANCE, Dp.m3297constructorimpl(16)), composer, 6);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(rr0.e.f32812a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, tr0.a.InterfaceC0287a.C0288a c0288a, int i) {
        function1.invoke(c0288a);
        return Unit.f186387a;
    }

    private static final void a(tr0 tr0Var, Function1 function1, Composer composer, int i) {
        int i2;
        Unit unit;
        Composer composerStartRestartGroup = composer.startRestartGroup(467221319);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(tr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(467221319, i2, -1, "com.fourthline.orca.qes.internal.screens.agreements.DocumentsToReview (QesAgreementsScreen.kt:210)");
            }
            e1 e1VarD = fj0.f28535a.b(composerStartRestartGroup, 6).getAgreements();
            Modifier modifierBorder = BorderKt.border(BackgroundKt.m612backgroundbw27NRU(Modifier.INSTANCE, e1VarD.getBackground().a(composerStartRestartGroup, 0), RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(Dp.m3297constructorimpl(e1VarD.getRadius()))), BorderStrokeKt.m624BorderStrokecXLIe8U(Dp.m3297constructorimpl(e1VarD.getBorder().getWidth()), e1VarD.getBorder().getColor().a(composerStartRestartGroup, 0)), RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(Dp.m3297constructorimpl(e1VarD.getRadius())));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBorder);
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
            tr0.a.b bVarC = tr0Var.n().c();
            if (bVarC == null) {
                composerStartRestartGroup.startReplaceGroup(-1197246500);
                composerStartRestartGroup.endReplaceGroup();
                unit = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1197246499);
                a(bVarC, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                unit = Unit.f186387a;
            }
            if (unit == null) {
                composerStartRestartGroup.startReplaceGroup(-177166116);
                tr0.a aVarN = tr0Var.n();
                boolean z = (i2 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new li1(17, function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                a(aVarN, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-177168782);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zk1(tr0Var, function1, i, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, tr0.a.InterfaceC0287a it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new rr0.b(it8));
        return Unit.f186387a;
    }

    private static final void a(tr0.a.b bVar, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1205407508);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(bVar) : composerStartRestartGroup.changedInstance(bVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1205407508, i2, -1, "com.fourthline.orca.qes.internal.screens.agreements.LoaderState (QesAgreementsScreen.kt:236)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 104;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f)), composerStartRestartGroup, 6);
            Modifier modifierM882size3ABfNKs = SizeKt.m882size3ABfNKs(SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), Dp.m3297constructorimpl(64));
            fj0 fj0Var = fj0.f28535a;
            g81.a(modifierM882size3ABfNKs, false, false, 0L, fj0Var.b(composerStartRestartGroup, 6).getGraphic().getSpinner().getBackground().getColor().a(composerStartRestartGroup, 0), 0L, 0L, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, null, bVar.a(), null, null, null, composerStartRestartGroup, 12582918, 0, 15214);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(20)), composerStartRestartGroup, 6);
            TextKt.m1280Text4IGK_g(d81.c(bVar.b(), composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), 0L, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3223getCentere0LSkKk()), 0L, 0, false, 0, 0, null, fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getMessage().a(null, composerStartRestartGroup, 0, 1), composerStartRestartGroup, 48, 0, 65020);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f)), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new al1(bVar, i, 0));
        }
    }

    private static final void a(tr0.a aVar, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-904660465);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-904660465, i2, -1, "com.fourthline.orca.qes.internal.screens.agreements.Contracts (QesAgreementsScreen.kt:264)");
            }
            float fM3297constructorimpl = Dp.m3297constructorimpl(16);
            Modifier.Companion companion = Modifier.INSTANCE;
            TextKt.m1280Text4IGK_g(d81.c(aVar.e(), composerStartRestartGroup, 0), a80.a(PaddingKt.m866paddingqDBjuR0$default(companion, fM3297constructorimpl, fM3297constructorimpl, fM3297constructorimpl, BitmapDescriptorFactory.HUE_RED, 8, null), "contentTitleView", (String) null, 2, (Object) null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fj0.f28535a.b(composerStartRestartGroup, 6).getAgreements().getLabel().a(null, composerStartRestartGroup, 0, 1), composerStartRestartGroup, 0, 0, 65532);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(10)), composerStartRestartGroup, 6);
            a(aVar.d(), function1, composerStartRestartGroup, i2 & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bl1(aVar, function1, i, 0));
        }
    }

    private static final void a(List list, Function1 function1, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1811721748);
        int i2 = 2;
        int i3 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i3;
        if (composerStartRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1811721748, i5, -1, "com.fourthline.orca.qes.internal.screens.agreements.SignDocuments (QesAgreementsScreen.kt:287)");
            }
            int i6 = 0;
            for (Object obj2 : list) {
                int i21 = i6 + 1;
                if (i6 >= 0) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    a(PaddingKt.m864paddingVpY3zN4$default(companion, Dp.m3297constructorimpl(20), BitmapDescriptorFactory.HUE_RED, i2, null), (tr0.a.InterfaceC0287a.b) obj2, function1, composerStartRestartGroup, ((i5 << 3) & 896) | 6, 0);
                    if (i6 == list.size() - 1) {
                        composerStartRestartGroup.startReplaceGroup(-1858039469);
                        SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(16)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1857969068);
                        SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(8)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    i6 = i21;
                    i2 = 2;
                } else {
                    zhm.v.s();
                    throw null;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(list, function1, i, 2));
        }
    }

    private static final void a(Modifier modifier, tr0.a.InterfaceC0287a.b bVar, Function1 function1, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1545398083);
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
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(bVar) : composerStartRestartGroup.changedInstance(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1545398083, i3, -1, "com.fourthline.orca.qes.internal.screens.agreements.SignDocument (QesAgreementsScreen.kt:308)");
            }
            e1.b button = fj0.f28535a.b(composerStartRestartGroup, 6).getAgreements().getButton();
            long jA = button.getBorder().getColor().a(composerStartRestartGroup, 0);
            final long jA2 = button.getBorder().getColor().a(composerStartRestartGroup, 0);
            final float fA = zi0.a(12, composerStartRestartGroup, 6);
            float fM3297constructorimpl = Dp.m3297constructorimpl(button.getBorder().getWidth());
            float fM3297constructorimpl2 = Dp.m3297constructorimpl(button.getRadius());
            Modifier modifier5 = modifier4;
            Modifier modifierM612backgroundbw27NRU = BackgroundKt.m612backgroundbw27NRU(SizeKt.m873defaultMinSizeVpY3zN4$default(ClipKt.clip(SizeKt.fillMaxWidth$default(modifier4, BitmapDescriptorFactory.HUE_RED, 1, null), RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(fM3297constructorimpl2)), BitmapDescriptorFactory.HUE_RED, th0.f33777a.a(), 1, null), button.getBackground().a(composerStartRestartGroup, 0), RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(fM3297constructorimpl2));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            IndicationNodeFactory indicationNodeFactoryM1240rippleH2RKhps$default = RippleKt.m1240rippleH2RKhps$default(true, BitmapDescriptorFactory.HUE_RED, Color.m1976copywmQWz5c$default(button.getText().getColor().a(composerStartRestartGroup, 0), 0.15f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 2, null);
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(bVar)));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new rj1(function1, bVar, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierM617borderxT4_qwU = BorderKt.m617borderxT4_qwU(ClickableKt.m629clickableO2vRcR0$default(modifierM612backgroundbw27NRU, mutableInteractionSource, indicationNodeFactoryM1240rippleH2RKhps$default, false, null, null, (Function0) objRememberedValue2, 28, null), fM3297constructorimpl, jA, RoundedCornerShapeKt.m968RoundedCornerShape0680j_4(fM3297constructorimpl2));
            Arrangement.Horizontal end2 = Arrangement.INSTANCE.getEnd();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end2, companion2.getCenterVertically(), composerStartRestartGroup, 54);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM617borderxT4_qwU);
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            TextKt.m1280Text4IGK_g(bVar.b(), PaddingKt.m862padding3ABfNKs(RowScope.weight$default(rowScopeInstance, companion4, 1.0f, false, 2, null), Dp.m3297constructorimpl(16)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, button.getText().a(null, composerStartRestartGroup, 0, 1), composerStartRestartGroup, 0, 0, 65532);
            Modifier modifierM882size3ABfNKs = SizeKt.m882size3ABfNKs(companion4, Dp.m3297constructorimpl(56));
            boolean zChanged = composerStartRestartGroup.changed(fA) | composerStartRestartGroup.changed(jA2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.fourthline.orca.internal.cl1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ds0.a(fA, jA2, (DrawScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ImageKt.Image(a20.a(bVar.a(), composerStartRestartGroup, 0), null, PaddingKt.m862padding3ABfNKs(DrawModifierKt.drawBehind(modifierM882size3ABfNKs, (Function1) objRememberedValue3), Dp.m3297constructorimpl(20)), companion2.getCenterEnd(), null, BitmapDescriptorFactory.HUE_RED, ColorFilter.Companion.m1996tintxETnrds$default(ColorFilter.INSTANCE, button.getIcon().a(composerStartRestartGroup, 0), 0, 2, null), composerStartRestartGroup, 3120, 48);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ck1(i, modifier3, i2, bVar, 4, function1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, tr0.a.InterfaceC0287a.b bVar) {
        function1.invoke(bVar);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(float f, long j2, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        DrawScope.m2203drawLineNGM6Ib0$default(drawBehind, j2, Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32) | (((long) Float.floatToRawIntBits(f)) & BodyPartID.bodyIdMax)), Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) - f)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32)), BitmapDescriptorFactory.HUE_RED, 0, null, BitmapDescriptorFactory.HUE_RED, null, 0, 504, null);
        return Unit.f186387a;
    }
}
