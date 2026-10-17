package com.fourthline.orca.internal;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.view.compose.ActivityResultRegistryKt;
import androidx.view.compose.BackHandlerKt;
import androidx.view.compose.ManagedActivityResultLauncher;
import androidx.view.result.ActivityResult;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.fourthline.orca.internal.a21;
import com.fourthline.orca.internal.c21;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.ne1;
import com.fourthline.orca.internal.p70;
import com.fourthline.orca.internal.z11;
import com.fourthline.vision.internal.camera.recording.RecordingExtensionsKt;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.compose.SelfieScannerComposableKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import java.util.Map;
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
public abstract class q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f32210a = ColorKt.Color(3641116962L);

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f32212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f32213c;
        final /* synthetic */ ManagedActivityResultLauncher d;
        final /* synthetic */ ub.a e;
        final /* synthetic */ Lazy f;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.q7$a$a, reason: collision with other inner class name */
        public static final class C0268a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f32214a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f32215b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f32216c;
            final /* synthetic */ ManagedActivityResultLauncher d;
            final /* synthetic */ ub.a e;
            final /* synthetic */ Lazy f;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.q7$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0269a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[z11.d.a.values().length];
                    try {
                        iArr[z11.d.a.f35494a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[z11.d.a.f35495b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0268a(Context context, ManagedActivityResultLauncher managedActivityResultLauncher, ub.a aVar, Lazy lazy, Continuation continuation) {
                super(2, continuation);
                this.f32216c = context;
                this.d = managedActivityResultLauncher;
                this.e = aVar;
                this.f = lazy;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(z11 z11Var, Continuation continuation) {
                return ((C0268a) create(z11Var, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0268a c0268a = new C0268a(this.f32216c, this.d, this.e, this.f, continuation);
                c0268a.f32215b = obj2;
                return c0268a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                z11 z11Var = (z11) this.f32215b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f32214a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (z11Var instanceof z11.d) {
                    int i = C0269a.$EnumSwitchMapping$0[((z11.d) z11Var).a().ordinal()];
                    if (i == 1) {
                        vc.a(this.f32216c, 0L, 1, null);
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        vc.a(this.f32216c, 50L);
                    }
                } else if (z11Var instanceof z11.b) {
                    this.d.launch(q7.a(this.f));
                } else if (z11Var instanceof z11.c) {
                    this.e.a();
                } else if (!(z11Var instanceof z11.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow flow, Context context, ManagedActivityResultLauncher managedActivityResultLauncher, ub.a aVar, Lazy lazy, Continuation continuation) {
            super(2, continuation);
            this.f32212b = flow;
            this.f32213c = context;
            this.d = managedActivityResultLauncher;
            this.e = aVar;
            this.f = lazy;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f32212b, this.f32213c, this.d, this.e, this.f, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f32211a;
            if (i == 0) {
                yhm.o.b(obj2);
                Flow flow = this.f32212b;
                if (flow != null) {
                    C0268a c0268a = new C0268a(this.f32213c, this.d, this.e, this.f, null);
                    this.f32211a = 1;
                    if (wz.a(flow, c0268a, this) == aVar) {
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
        int f32217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f32218b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.f32218b = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new b(this.f32218b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f32217a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f32217a = 1;
                if (skm.k0.b(4000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            q7.a(this.f32218b, "Almost there");
            return Unit.f186387a;
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f32220b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f32220b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new c(this.f32220b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f32219a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f32220b.invoke(a21.h.f26685a);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(m21 m21Var, c21 c21Var, Flow flow, Function1 function1, int i, Composer composer, int i2) {
        a(m21Var, c21Var, flow, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1) {
        function1.invoke(a21.c.f26680a);
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(m21 viewModel, c21 state, Flow flow, Function1 onEventSent, Composer composer, int i) {
        int i2;
        Object aVar;
        MutableState mutableState;
        int i3;
        String str;
        Unit unit;
        int i5;
        int i6;
        boolean z;
        boolean z3;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1754750400);
        int i21 = 2;
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(flow) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEventSent) ? 2048 : 1024;
        }
        int i22 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1754750400, i2, -1, "com.fourthline.orca.kyc.internal.flow.selfie.bioauth.BioAuthPOCScannerScreen (BioAuthPOCScannerOverlayScreen.kt:73)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Rect.INSTANCE.getZero(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new sk1(context, i21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Lazy lazyB = yhm.j.b((Function0) objRememberedValue2);
            List<String> requiredPermissions = RecordingExtensionsKt.getRequiredPermissions(viewModel.d().getRecordingType());
            int i32 = i2 & 7168;
            Object[] objArr = i32 == 2048;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objArr != false || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new eq1(19, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ub.a aVarH = a1m.e.H(requiredPermissions, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
            boolean zChanged = composerStartRestartGroup.changed(aVarH);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new to1(aVarH, i22);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult, (Function1) objRememberedValue4, composerStartRestartGroup, 0);
            Unit unit2 = Unit.f186387a;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(flow) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(lazyB) | composerStartRestartGroup.changed(aVarH);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                mutableState = mutableState2;
                i3 = i32;
                aVar = new a(flow, context, managedActivityResultLauncherRememberLauncherForActivityResult, aVarH, lazyB, null);
                composerStartRestartGroup.updateRememberedValue(aVar);
            } else {
                mutableState = mutableState2;
                aVar = objRememberedValue5;
                i3 = i32;
            }
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) aVar, composerStartRestartGroup, 6);
            boolean z4 = i3 == 2048;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new qp1(7, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue6, composerStartRestartGroup, 0, 1);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new nq1(3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue7, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean z6 = state instanceof c21.b;
            if (z6) {
                str = "selfie_scan";
            } else {
                if (!(state instanceof c21.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "selfie_scan_confirm";
            }
            Modifier modifierB = a80.b(modifierFillMaxSize$default, str);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierB);
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-875549074);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Look straight at the camera", null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                MutableState mutableState3 = (MutableState) objRememberedValue8;
                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new b(mutableState3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composerStartRestartGroup, 6);
                unit = unit2;
                SelfieScannerConfig selfieScannerConfigD = viewModel.d();
                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == companion.getEmpty()) {
                    z = true;
                    objRememberedValue10 = new qo1(mutableState, 1 == true ? 1 : 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    z = true;
                }
                i5 = i3;
                i6 = 2048;
                SelfieScannerComposableKt.SelfieScanner(selfieScannerConfigD, (Function0) objRememberedValue10, viewModel.h(), viewModel.i(), ComposableLambdaKt.rememberComposableLambda(-367574437, z, new cn1(mutableState, mutableState3, 6), composerStartRestartGroup, 54), composerStartRestartGroup, SelfieScannerConfig.$stable | 24624, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                z3 = false;
            } else {
                unit = unit2;
                i5 = i3;
                i6 = 2048;
                z = true;
                z = true;
                if (state instanceof c21.a.C0175a) {
                    composerStartRestartGroup.startReplaceGroup(-873639071);
                    c21.a.C0175a c0175a = (c21.a.C0175a) state;
                    if (c0175a.r() != null) {
                        composerStartRestartGroup.startReplaceGroup(358718465);
                        hw hwVarR = c0175a.r();
                        Object[] objArr2 = i5 == 2048;
                        Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        if (objArr2 != false || objRememberedValue11 == companion.getEmpty()) {
                            objRememberedValue11 = new qp1(8, onEventSent);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                        }
                        iw.a(hwVarR, true, (Function0) objRememberedValue11, composerStartRestartGroup, 48, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(359022854);
                        String strC = d81.c(c0175a.getTitle(), composerStartRestartGroup, 0);
                        String strC2 = d81.c(c81.a.a(c81.f27404a, R.string.shared_selfie_confirmation_header_accessibility, 0, 2, null), composerStartRestartGroup, 0);
                        ne1.b bVar = new ne1.b(c0175a.s());
                        String strC3 = d81.c(c0175a.n(), composerStartRestartGroup, 0);
                        String strC4 = d81.c(c0175a.p(), composerStartRestartGroup, 0);
                        String strC5 = d81.c(c0175a.o(), composerStartRestartGroup, 0);
                        String strC6 = d81.c(c0175a.t(), composerStartRestartGroup, 0);
                        String strC7 = d81.c(c0175a.u(), composerStartRestartGroup, 0);
                        z10 z10VarQ = c0175a.q();
                        Object[] objArr3 = i5 == 2048;
                        Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                        if (objArr3 != false || objRememberedValue12 == companion.getEmpty()) {
                            objRememberedValue12 = new qp1(5, onEventSent);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                        }
                        Function0 function0 = (Function0) objRememberedValue12;
                        boolean z11 = i5 == 2048;
                        Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                        if (z11 || objRememberedValue13 == companion.getEmpty()) {
                            objRememberedValue13 = new qp1(6, onEventSent);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                        }
                        Function0 function02 = (Function0) objRememberedValue13;
                        boolean zChangedInstance3 = (i5 == 2048) | composerStartRestartGroup.changedInstance(c0175a);
                        Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue14 == companion.getEmpty()) {
                            objRememberedValue14 = new ro1(onEventSent, c0175a, z ? 1 : 0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                        }
                        oe1.a(strC, strC2, bVar, true, strC3, strC4, strC5, strC6, strC7, z10VarQ, false, function0, function02, (Function1) objRememberedValue14, null, composerStartRestartGroup, 3072, 0, 17408);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    z3 = false;
                } else {
                    if (!(state instanceof c21.a.b)) {
                        composerStartRestartGroup.startReplaceGroup(-1552263573);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-872000101);
                    c21.a.b bVar2 = (c21.a.b) state;
                    z3 = false;
                    pe1.a(d81.c(bVar2.getTitle(), composerStartRestartGroup, 0), d81.c(bVar2.a(), composerStartRestartGroup, 0), bVar2.b(), bVar2.n(), bVar2.o(), bVar2.p(), true, composerStartRestartGroup, 1572864, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            composerStartRestartGroup.endNode();
            boolean z12 = i5 == i6 ? z : z3;
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (z12 || objRememberedValue15 == companion.getEmpty()) {
                objRememberedValue15 = new c(onEventSent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue15, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new so1(viewModel, state, flow, onEventSent, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect c(MutableState mutableState) {
        return a(mutableState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1) {
        function1.invoke(a21.f.f26683a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1) {
        function1.invoke(a21.a.f26678a);
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String b(MutableState mutableState) {
        return (String) mutableState.getValue();
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
    public static final Unit a(Function1 function1, Map permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        function1.invoke(new a21.g(permissions));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ub.a aVar, ActivityResult it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        aVar.a();
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setPaneTitle(semantics, " ");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit a(MutableState mutableState, MutableState mutableState2, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-367574437, i, -1, "com.fourthline.orca.kyc.internal.flow.selfie.bioauth.BioAuthPOCScannerScreen.<anonymous>.<anonymous> (BioAuthPOCScannerOverlayScreen.kt:146)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new an1(mutableState, 4);
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM613backgroundbw27NRU$default = BackgroundKt.m613backgroundbw27NRU$default(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxSize$default, (Function1) objRememberedValue), f32210a, null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM613backgroundbw27NRU$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(64)), composer, 6);
            TextKt.m1280Text4IGK_g(b(mutableState2), null, Color.INSTANCE.m1995getWhite0d7_KjU(), TextUnitKt.getSp(24), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 200064, 0, 131026);
            g81.a(PaddingKt.m862padding3ABfNKs(ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null), Dp.m3297constructorimpl(60)), false, false, 0L, 0L, 0L, 0L, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, null, new p70.b(com.fourthline.sdk.assets.R.raw.bio_auth_poc_halo_02, null, 2, 0 == true ? 1 : 0), null, null, null, composer, 12582912, 0, 15230);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(88)), composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(MutableState mutableState, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        a(mutableState, LayoutCoordinatesKt.boundsInRoot(coordinates));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(a21.b.f26679a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, c21.a.C0175a c0175a, Bitmap it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new a21.d(c0175a.s()));
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Rect a(MutableState mutableState) {
        return (Rect) mutableState.getValue();
    }

    private static final void a(MutableState mutableState, Rect rect) {
        mutableState.setValue(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }
}
