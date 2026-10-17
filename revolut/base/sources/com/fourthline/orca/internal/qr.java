package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import com.fourthline.orca.internal.ir;
import com.fourthline.orca.internal.kr;
import com.fourthline.orca.internal.m80;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public abstract class qr {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f32517b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f32517b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f32517b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f32516a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f32517b.invoke(ir.d.f29688a);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(kr krVar, Function1 function1, int i, Composer composer, int i2) {
        a(krVar, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(kr state, Function1 onEventSent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(387534161);
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
                ComposerKt.traceEventStart(387534161, i2, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.screens.version.DocumentVersionScreen (DocumentVersionScreen.kt:32)");
            }
            float fM3297constructorimpl = Dp.m3297constructorimpl(4);
            String strC = d81.c(state.getTitle(), composerStartRestartGroup, 0);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(2073211518, true, new cm1(fM3297constructorimpl, state, onEventSent, 1), composerStartRestartGroup, 54);
            Function3 function3A = sa.f32957a.a();
            composerStartRestartGroup.startReplaceGroup(-1241782523);
            m80.b bVar = new m80.b(state.p());
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new eq1(20, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            l80 l80Var = new l80(bVar, (Function1) objRememberedValue);
            m80.a.C0250a c0250a = new m80.a.C0250a(null, 1, null);
            boolean z3 = i3 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new eq1(21, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            n80 n80Var = new n80(l80Var, new l80(c0250a, (Function1) objRememberedValue2), false, 4, null);
            composerStartRestartGroup.endReplaceGroup();
            ri0.a("document_version", strC, null, composableLambdaRememberComposableLambda, function3A, n80Var, null, false, null, composerStartRestartGroup, 27654, 452);
            Unit unit = Unit.f186387a;
            boolean z4 = i3 == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new a(onEventSent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(state, onEventSent, i, 12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(ir.a.f29685a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(float f, kr krVar, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2073211518, i, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.screens.version.DocumentVersionScreen.<anonymous> (DocumentVersionScreen.kt:39)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            TextKt.m1280Text4IGK_g(d81.c(krVar.o(), composer, 0), SizeKt.fillMaxWidth$default(PaddingKt.m866paddingqDBjuR0$default(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, f, 5, null), BitmapDescriptorFactory.HUE_RED, 1, null), 0L, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3228getStarte0LSkKk()), 0L, 0, false, 0, 0, null, fj0.f28535a.b(composer, 6).getAgreements().getLabel().a(null, composer, 0, 1), composer, 48, 0, 65020);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(4)), composer, 6);
            int i2 = 0;
            for (Object obj2 : krVar.n()) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    kr.a aVar = (kr.a) obj2;
                    composer.startReplaceGroup(-508540406);
                    c81 c81VarA = aVar.a();
                    z10 z10VarB = aVar.b();
                    boolean zD = aVar.d();
                    boolean zChanged = composer.changed(function1) | composer.changedInstance(aVar);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new vp1(function1, aVar, 5);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    mr.a(i2, c81VarA, z10VarB, zD, (Function0) objRememberedValue, composer, 0, 0);
                    composer.endReplaceGroup();
                    SpacerKt.Spacer(SizeKt.m874height3ABfNKs(Modifier.INSTANCE, Dp.m3297constructorimpl(24)), composer, 6);
                    i2 = i3;
                } else {
                    zhm.v.s();
                    throw null;
                }
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
    public static final Unit a(Function1 function1, kr.a aVar) {
        function1.invoke(new ir.c(aVar.c()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(ir.b.f29686a);
        return Unit.f186387a;
    }
}
