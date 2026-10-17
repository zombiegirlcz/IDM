package com.fourthline.orca.internal;

import android.content.Context;
import android.content.Intent;
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
import com.fourthline.orca.internal.bf0;
import com.fourthline.orca.internal.cf0;
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
public abstract class hv {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f29413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29414c;
        final /* synthetic */ ManagedActivityResultLauncher d;
        final /* synthetic */ Lazy e;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.hv$a$a, reason: collision with other inner class name */
        public static final class C0213a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f29415a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f29416b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f29417c;
            final /* synthetic */ ManagedActivityResultLauncher d;
            final /* synthetic */ Lazy e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0213a(Context context, ManagedActivityResultLauncher managedActivityResultLauncher, Lazy lazy, Continuation continuation) {
                super(2, continuation);
                this.f29417c = context;
                this.d = managedActivityResultLauncher;
                this.e = lazy;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(bf0 bf0Var, Continuation continuation) {
                return ((C0213a) create(bf0Var, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0213a c0213a = new C0213a(this.f29417c, this.d, this.e, continuation);
                c0213a.f29416b = obj2;
                return c0213a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                bf0 bf0Var = (bf0) this.f29416b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f29415a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (!(bf0Var instanceof bf0.a) && !(bf0Var instanceof bf0.b) && !(bf0Var instanceof bf0.c)) {
                    if (bf0Var instanceof bf0.e) {
                        vc.a(this.f29417c, 0L, 1, null);
                    } else {
                        if (!(bf0Var instanceof bf0.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.d.launch(hv.a(this.e));
                    }
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow flow, Context context, ManagedActivityResultLauncher managedActivityResultLauncher, Lazy lazy, Continuation continuation) {
            super(2, continuation);
            this.f29413b = flow;
            this.f29414c = context;
            this.d = managedActivityResultLauncher;
            this.e = lazy;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f29413b, this.f29414c, this.d, this.e, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f29412a;
            if (i == 0) {
                yhm.o.b(obj2);
                Flow flow = this.f29413b;
                if (flow != null) {
                    C0213a c0213a = new C0213a(this.f29414c, this.d, this.e, null);
                    this.f29412a = 1;
                    if (wz.a(flow, c0213a, this) == aVar) {
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

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f29419b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f29419b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new b(this.f29419b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f29418a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f29419b.invoke(cf0.d.f27455a);
            return Unit.f186387a;
        }
    }

    public static final class c implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f29420a;

        public c(Function1 function1) {
            this.f29420a = function1;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f29420a.invoke(cf0.c.f27454a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ff0 ff0Var, Flow flow, Function1 function1, int i, Composer composer, int i2) {
        a(ff0Var, flow, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(ff0 state, Flow flow, Function1 onEventSent, Composer composer, int i) {
        int i2;
        Object aVar;
        Unit unit;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1009449830);
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
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1009449830, i3, -1, "com.fourthline.orca.kyc.internal.flow.eid.scanner.EidScannerScreen (EidScannerScreen.kt:29)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new dl1(27);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Lazy lazyB = yhm.j.b((Function0) objRememberedValue);
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
            int i5 = i3 & 896;
            boolean z = i5 == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new mn1(1, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            Unit unit2 = Unit.f186387a;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(flow) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(lazyB);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                unit = unit2;
                aVar = new a(flow, context, managedActivityResultLauncherRememberLauncherForActivityResult, lazyB, null);
                composerStartRestartGroup.updateRememberedValue(aVar);
            } else {
                aVar = objRememberedValue3;
                unit = unit2;
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) aVar, composerStartRestartGroup, 6);
            boolean z3 = i5 == 256;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new mn1(2, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
            boolean z4 = i5 == 256;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new lj1(13, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue5, composerStartRestartGroup, 0, 1);
            jf0.b(state, onEventSent, composerStartRestartGroup, (i3 & 14) | ((i3 >> 3) & 112));
            je0.a(composerStartRestartGroup, 0);
            boolean z6 = i5 == 256;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new b(onEventSent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1(state, flow, onEventSent, i, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a() {
        return new Intent("android.settings.NFC_SETTINGS");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a(Lazy lazy) {
        return (Intent) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, ActivityResult it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(cf0.a.f27452a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(cf0.b.f27453a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult a(Function1 function1, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new c(function1);
    }
}
