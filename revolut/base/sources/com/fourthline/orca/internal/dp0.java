package com.fourthline.orca.internal;

import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.view.compose.ActivityResultRegistryKt;
import androidx.view.compose.ManagedActivityResultLauncher;
import androidx.view.result.PickVisualMediaRequestKt;
import androidx.view.result.contract.ActivityResultContracts$OpenDocument;
import androidx.view.result.contract.ActivityResultContracts$PickVisualMedia;
import com.fourthline.orca.internal.fb1;
import com.fourthline.orca.internal.jm0;
import com.fourthline.orca.internal.km0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public abstract class dp0 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f27888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ManagedActivityResultLauncher f27889c;
        final /* synthetic */ ManagedActivityResultLauncher d;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.dp0$a$a, reason: collision with other inner class name */
        public static final class C0186a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f27890a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f27891b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ManagedActivityResultLauncher f27892c;
            final /* synthetic */ ManagedActivityResultLauncher d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0186a(ManagedActivityResultLauncher managedActivityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher2, Continuation continuation) {
                super(2, continuation);
                this.f27892c = managedActivityResultLauncher;
                this.d = managedActivityResultLauncher2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(jm0 jm0Var, Continuation continuation) {
                return ((C0186a) create(jm0Var, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0186a c0186a = new C0186a(this.f27892c, this.d, continuation);
                c0186a.f27891b = obj2;
                return c0186a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                jm0 jm0Var = (jm0) this.f27891b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f27890a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (jm0Var instanceof jm0.b) {
                    this.f27892c.launch(new String[]{"application/pdf"});
                } else if (jm0Var instanceof jm0.c) {
                    this.d.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default(ActivityResultContracts$PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
                } else if (!(jm0Var instanceof jm0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow flow, ManagedActivityResultLauncher managedActivityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher2, Continuation continuation) {
            super(2, continuation);
            this.f27888b = flow;
            this.f27889c = managedActivityResultLauncher;
            this.d = managedActivityResultLauncher2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f27888b, this.f27889c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27887a;
            if (i == 0) {
                yhm.o.b(obj2);
                Flow flow = this.f27888b;
                if (flow != null) {
                    C0186a c0186a = new C0186a(this.f27889c, this.d, null);
                    this.f27887a = 1;
                    if (wz.a(flow, c0186a, this) == aVar) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(gb1 gb1Var, Function1 function1, Flow flow, int i, Composer composer, int i2) {
        a(gb1Var, function1, flow, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(gb1 state, Function1 onEventSent, Flow flow, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-411789973);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEventSent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(flow) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-411789973, i2, -1, "com.fourthline.orca.kyc.internal.flow.poa.documenttype.PoaDocumentTypeScreen (PoaDocumentTypeScreen.kt:25)");
            }
            ActivityResultContracts$OpenDocument activityResultContracts$OpenDocument = new ActivityResultContracts$OpenDocument();
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new li1(10, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(activityResultContracts$OpenDocument, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            ActivityResultContracts$PickVisualMedia activityResultContracts$PickVisualMedia = new ActivityResultContracts$PickVisualMedia();
            boolean z3 = i3 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new li1(11, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(activityResultContracts$PickVisualMedia, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            Unit unit = Unit.f186387a;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(flow) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new a(flow, managedActivityResultLauncherRememberLauncherForActivityResult, managedActivityResultLauncherRememberLauncherForActivityResult2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            boolean z4 = i3 == 32;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new li1(12, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            mb1.a(state, (Function1) objRememberedValue4, "poa_document_type", composerStartRestartGroup, (i2 & 14) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1((Object) state, onEventSent, (Object) flow, i, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, Uri uri2) {
        function1.invoke(new km0.d(uri2));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, Uri uri2) {
        function1.invoke(new km0.c(uri2));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, fb1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof fb1.d) {
            function1.invoke(km0.g.f30324a);
        } else if (event instanceof fb1.e) {
            function1.invoke(new km0.f((uo0) ((fb1.e) event).a()));
        } else if (event instanceof fb1.c) {
            function1.invoke(km0.e.f30322a);
        } else if (event instanceof fb1.a) {
            function1.invoke(km0.a.f30318a);
        } else {
            if (!(event instanceof fb1.b)) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(km0.b.f30319a);
        }
        return Unit.f186387a;
    }
}
