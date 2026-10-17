package com.fourthline.orca.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.compose.ActivityResultRegistryKt;
import androidx.view.compose.BackHandlerKt;
import androidx.view.compose.ManagedActivityResultLauncher;
import androidx.view.result.ActivityResult;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.y60;
import com.fourthline.orca.internal.z60;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public abstract class d70 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f27661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Flow f27662c;
        final /* synthetic */ ManagedActivityResultLauncher d;
        final /* synthetic */ ManagedActivityResultLauncher e;
        final /* synthetic */ Lazy f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Lazy f27663g;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.d70$a$a, reason: collision with other inner class name */
        public static final class C0182a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f27664a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f27665b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ManagedActivityResultLauncher f27666c;
            final /* synthetic */ ManagedActivityResultLauncher d;
            final /* synthetic */ Lazy e;
            final /* synthetic */ Lazy f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0182a(ManagedActivityResultLauncher managedActivityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher2, Lazy lazy, Lazy lazy2, Continuation continuation) {
                super(2, continuation);
                this.f27666c = managedActivityResultLauncher;
                this.d = managedActivityResultLauncher2;
                this.e = lazy;
                this.f = lazy2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(y60 y60Var, Continuation continuation) {
                return ((C0182a) create(y60Var, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0182a c0182a = new C0182a(this.f27666c, this.d, this.e, this.f, continuation);
                c0182a.f27665b = obj2;
                return c0182a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                y60 y60Var = (y60) this.f27665b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f27664a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (!(y60Var instanceof y60.a)) {
                    if (y60Var instanceof y60.c) {
                        this.f27666c.launch(d70.a(this.e));
                    } else {
                        if (!(y60Var instanceof y60.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.d.launch(d70.b(this.f));
                    }
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Flow flow, ManagedActivityResultLauncher managedActivityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher2, Lazy lazy, Lazy lazy2, Continuation continuation) {
            super(2, continuation);
            this.f27661b = function1;
            this.f27662c = flow;
            this.d = managedActivityResultLauncher;
            this.e = managedActivityResultLauncher2;
            this.f = lazy;
            this.f27663g = lazy2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f27661b, this.f27662c, this.d, this.e, this.f, this.f27663g, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27660a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f27661b.invoke(z60.f.f35533a);
                Flow flow = this.f27662c;
                if (flow != null) {
                    C0182a c0182a = new C0182a(this.d, this.e, this.f, this.f27663g, null);
                    this.f27660a = 1;
                    if (wz.a(flow, c0182a, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }
    }

    public static final class b implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f27667a;

        public b(Function1 function1) {
            this.f27667a = function1;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f27667a.invoke(z60.e.f35532a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(b70 b70Var, Flow flow, Function1 function1, int i, Composer composer, int i2) {
        a(b70Var, flow, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(b70 state, Flow flow, Function1 onEventSent, Composer composer, int i) {
        int i2;
        Object aVar;
        Unit unit;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1127200955);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(flow) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEventSent) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1127200955, i2, -1, "com.fourthline.orca.kyc.internal.flow.location.scanner.LocationScannerScreen (LocationScannerScreen.kt:39)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new sk1(context, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Lazy lazyB = yhm.j.b((Function0) objRememberedValue);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new lj1(5, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 1);
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
            boolean z3 = i3 == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new li1(5, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new pj1(21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Lazy lazyB2 = yhm.j.b((Function0) objRememberedValue4);
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult2 = new ActivityResultContracts$StartActivityForResult();
            boolean z4 = i3 == 256;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new li1(6, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult2, (Function1) objRememberedValue5, composerStartRestartGroup, 0);
            Unit unit2 = Unit.f186387a;
            boolean zChangedInstance2 = (i3 == 256) | composerStartRestartGroup.changedInstance(flow) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(lazyB) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2) | composerStartRestartGroup.changedInstance(lazyB2);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                unit = unit2;
                aVar = new a(onEventSent, flow, managedActivityResultLauncherRememberLauncherForActivityResult, managedActivityResultLauncherRememberLauncherForActivityResult2, lazyB, lazyB2, null);
                composerStartRestartGroup.updateRememberedValue(aVar);
            } else {
                aVar = objRememberedValue6;
                unit = unit2;
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) aVar, composerStartRestartGroup, 6);
            boolean z6 = i3 == 256;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new li1(7, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composerStartRestartGroup, 6);
            String strC = d81.c(state.getTitle(), composerStartRestartGroup, 0);
            String strC2 = d81.c(state.a(), composerStartRestartGroup, 0);
            p70 p70VarN = state.n();
            m80.b bVarO = state.o();
            boolean z11 = i3 == 256;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new li1(8, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            l80 l80Var = new l80(bVarO, (Function1) objRememberedValue8);
            m80.a aVarP = state.p();
            boolean z12 = i3 == 256;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (z12 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new li1(9, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            a40.a("location_scan", strC, strC2, null, null, new n80(l80Var, new l80(aVarP, (Function1) objRememberedValue9), false, 4, null), p70VarN, 0, false, composerStartRestartGroup, 6, 408);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1(state, flow, onEventSent, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent b(Lazy lazy) {
        return (Intent) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, ActivityResult it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(z60.b.f35529a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(z60.a.f35528a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a(Lazy lazy) {
        return (Intent) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(z60.a.f35528a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, ActivityResult it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(z60.c.f35530a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a() {
        Intent intent = new Intent();
        intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(z60.d.f35531a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult a(Function1 function1, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new b(function1);
    }
}
