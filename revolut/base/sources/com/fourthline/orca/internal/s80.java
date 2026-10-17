package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.content.NavGraphBuilder;
import androidx.content.NavHostController;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public abstract class s80 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ bj0 f32935b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bj0 bj0Var, Continuation continuation) {
            super(2, continuation);
            this.f32935b = bj0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f32935b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f32934a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f32935b.s().b();
            return Unit.f186387a;
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ bj0 f32937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ lg0 f32938c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(bj0 bj0Var, lg0 lg0Var, Continuation continuation) {
            super(2, continuation);
            this.f32937b = bj0Var;
            this.f32938c = lg0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new b(this.f32937b, this.f32938c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f32936a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f32937b.y().a(this.f32938c);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bj0 bj0Var, int i, Composer composer, int i2) {
        a(bj0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(bj0 orcaSubcomponent, Composer composer, int i) {
        int i2;
        String strA;
        Intrinsics.checkNotNullParameter(orcaSubcomponent, "orcaSubcomponent");
        Composer composerStartRestartGroup = composer.startRestartGroup(331103980);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(orcaSubcomponent) : composerStartRestartGroup.changedInstance(orcaSubcomponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = true;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(331103980, i2, -1, "com.fourthline.orca.core.internal.navigation.NavigationGraph (NavigationGraph.kt:25)");
            }
            int i3 = i2 & 14;
            boolean z3 = i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changed(orcaSubcomponent));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LinkedHashMap();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            boolean z4 = i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changed(orcaSubcomponent));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(zhm.f0.f322471a, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            boolean zChanged = composerStartRestartGroup.changed(orcaSubcomponent.a().e()) | (i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changed(orcaSubcomponent)));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new lg0(orcaSubcomponent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            lg0 lg0Var = (lg0) objRememberedValue3;
            boolean zChanged2 = composerStartRestartGroup.changed(orcaSubcomponent.a().e()) | composerStartRestartGroup.changed(lg0Var);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = lg0Var.a(orcaSubcomponent.a().e());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            mh0 mh0Var = (mh0) objRememberedValue4;
            if (mh0Var == null || (strA = mh0Var.e()) == null) {
                strA = orcaSubcomponent.h().a();
            }
            if (a(orcaSubcomponent)) {
                composerStartRestartGroup.startReplaceGroup(-1218681552);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(orcaSubcomponent);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new a(orcaSubcomponent, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                EffectsKt.LaunchedEffect(orcaSubcomponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, i3);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1220453450);
            }
            composerStartRestartGroup.endReplaceGroup();
            NavHostController navHostControllerO = orcaSubcomponent.o();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(mh0Var);
            if (i3 != 4 && ((i2 & 8) == 0 || !composerStartRestartGroup.changedInstance(orcaSubcomponent))) {
                z = false;
            }
            boolean zChanged3 = zChangedInstance2 | z | composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new com.fourthline.core.location.internal.b(mh0Var, 5, orcaSubcomponent, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            v1.a(navHostControllerO, strA, (Function1) objRememberedValue6, composerStartRestartGroup, 0);
            List listA = a(mutableState);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(orcaSubcomponent) | composerStartRestartGroup.changedInstance(lg0Var);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new b(orcaSubcomponent, lg0Var, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            EffectsKt.LaunchedEffect(listA, lg0Var, (Function2) objRememberedValue7, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new al1(orcaSubcomponent, i, 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(mh0 mh0Var, bj0 bj0Var, MutableState mutableState, NavGraphBuilder AnimatedGraph) {
        Intrinsics.checkNotNullParameter(AnimatedGraph, "$this$AnimatedGraph");
        a();
        if (mh0Var != null) {
            String strC = mh0Var.b().b().c();
            String strE = mh0Var.e();
            Function1 function1C = mh0Var.c();
            NavGraphBuilder navGraphBuilder = new NavGraphBuilder(AnimatedGraph.getProvider(), strC, strE);
            function1C.invoke(navGraphBuilder);
            AnimatedGraph.destination(navGraphBuilder);
        }
        if (bj0Var instanceof hy) {
            a(mutableState, zhm.f0.f322471a);
        } else if (!(bj0Var instanceof kq) && !(bj0Var instanceof n21)) {
            throw new IllegalStateException("Unsupported subcomponent type!");
        }
        return Unit.f186387a;
    }

    private static final boolean a(bj0 bj0Var) {
        return (bj0Var instanceof kq) || (bj0Var instanceof n21);
    }

    private static final void a() {
        ib.d dVar = new ib.d(6, "root_composition_triggered", null, null);
        ib.h hVar = hb.a.f150532a;
        if (hVar != null) {
            hVar.f(dVar);
        }
    }

    private static final List a(MutableState mutableState) {
        return (List) mutableState.getValue();
    }

    private static final void a(MutableState mutableState, List list) {
        mutableState.setValue(list);
    }
}
