package com.fourthline.orca.internal;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.DividerKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.view.compose.BackHandlerKt;
import com.fourthline.orca.internal.fj0;
import com.fourthline.orca.internal.ib;
import com.fourthline.orca.internal.m80;
import com.fourthline.orca.internal.rb;
import com.fourthline.orca.internal.wb;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes23.dex */
public abstract class xb {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f34934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Flow f34935c;
        final /* synthetic */ SoftwareKeyboardController d;
        final /* synthetic */ FocusManager e;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.xb$a$a, reason: collision with other inner class name */
        public static final class C0309a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34936a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f34937b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SoftwareKeyboardController f34938c;
            final /* synthetic */ FocusManager d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0309a(SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, Continuation continuation) {
                super(2, continuation);
                this.f34938c = softwareKeyboardController;
                this.d = focusManager;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ib ibVar, Continuation continuation) {
                return ((C0309a) create(ibVar, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0309a c0309a = new C0309a(this.f34938c, this.d, continuation);
                c0309a.f34937b = obj2;
                return c0309a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                ib ibVar = (ib) this.f34937b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f34936a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (ibVar instanceof ib.b) {
                    SoftwareKeyboardController softwareKeyboardController = this.f34938c;
                    if (softwareKeyboardController != null) {
                        softwareKeyboardController.hide();
                    }
                } else if (ibVar instanceof ib.a) {
                    a30.a(this.d);
                } else if (!(ibVar instanceof ib.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Flow flow, SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, Continuation continuation) {
            super(2, continuation);
            this.f34934b = function1;
            this.f34935c = flow;
            this.d = softwareKeyboardController;
            this.e = focusManager;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f34934b, this.f34935c, this.d, this.e, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f34933a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f34934b.invoke(rb.d.f32673a);
                Flow flow = this.f34935c;
                if (flow != null) {
                    C0309a c0309a = new C0309a(this.d, this.e, null);
                    this.f34933a = 1;
                    if (wz.a(flow, c0309a, this) == aVar) {
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
    public static final Unit b(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(rb.a.f32670a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(wb wbVar, Flow flow, Function1 function1, int i, Composer composer, int i2) {
        a(wbVar, flow, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, boolean z) {
        if (z) {
            function1.invoke(lb.f30562a);
        } else {
            function1.invoke(nb.f31371a);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1, boolean z) {
        if (z) {
            function1.invoke(tb.f33270a);
        } else {
            function1.invoke(ub.f33989a);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(wb.a aVar, Function1 function1, int i, Composer composer, int i2) {
        a(aVar, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, String str, String str2, String str3, Function0 function0, int i, int i2, Composer composer, int i3) {
        a(modifier, str, str2, str3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(wb.c cVar, Function1 function1, int i, Composer composer, int i2) {
        a(cVar, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(wb.a aVar, Function1 function1, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1306740667, i, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.CountrySearch.<anonymous>.<anonymous> (ContactsDetailsScreen.kt:176)");
            }
            boolean zChangedInstance = composer.changedInstance(aVar) | composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new vp1(aVar, function1, 9);
                composer.updateRememberedValue(objRememberedValue);
            }
            o2.a((Function0) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new sb(it8));
        return Unit.f186387a;
    }

    public static final void a(wb state, Flow flow, Function1 onEventSent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1616982949);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(-1616982949, i2, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.ContactsDetailsScreen (ContactsDetailsScreen.kt:77)");
            }
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qp1(27, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            Unit unit = Unit.f186387a;
            boolean zChangedInstance = (i3 == 256) | composerStartRestartGroup.changedInstance(flow) | composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                a aVar = new a(onEventSent, flow, softwareKeyboardController, focusManager, null);
                composerStartRestartGroup.updateRememberedValue(aVar);
                objRememberedValue2 = aVar;
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            String strC = d81.c(state.getTitle(), composerStartRestartGroup, 0);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1178107378, true, new bk1(state, onEventSent, 10), composerStartRestartGroup, 54);
            m80.b bVarR = state.r();
            boolean z3 = i3 == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new us1(29, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            l80 l80Var = new l80(bVarR, (Function1) objRememberedValue3);
            m80.a aVarS = state.s();
            boolean z4 = i3 == 256;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new jt1(0, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ri0.a("contact_details", strC, null, composableLambdaRememberComposableLambda, null, new n80(l80Var, new l80(aVarS, (Function1) objRememberedValue4), false, 4, null), null, false, null, composerStartRestartGroup, 3078, 468);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1(state, flow, onEventSent, i, 18));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        function1.invoke(rb.b.f32671a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new jb(it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        function1.invoke(rb.b.f32671a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1) {
        function1.invoke(kb.f30197a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(rb.a.f32670a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(wb wbVar, Function1 function1, ColumnScope OrcaScreen, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1178107378, i, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.ContactsDetailsScreen.<anonymous> (ContactsDetailsScreen.kt:100)");
            }
            composer.startReplaceGroup(1710177850);
            s20 s20VarO = wbVar.o();
            String strA = t20.a(s20VarO, composer, 0);
            String strB = t20.b(s20VarO, composer, 0);
            r20 format = s20VarO.getFormat();
            l20 state = wbVar.o().getState();
            String text = s20VarO.getText();
            String strC = d81.c(s20VarO.getTitle(), composer, 0);
            String strC2 = d81.c(s20VarO.b(), composer, 0);
            z10 z10VarF = s20VarO.f();
            String strC3 = d81.c(s20VarO.e(), composer, 0);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, KeyboardType.INSTANCE.m3092getEmailPjHm6EE(), ImeAction.INSTANCE.m3059getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 113, (DefaultConstructorMarker) null);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new jt1(1, function1);
                composer.updateRememberedValue(objRememberedValue);
            }
            KeyboardActions keyboardActions = new KeyboardActions((Function1) objRememberedValue, null, null, null, null, null, 62, null);
            q20 q20Var = q20.f32173j;
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new jt1(2, function1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            boolean zChanged3 = composer.changed(function1);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new jt1(3, function1);
                composer.updateRememberedValue(objRememberedValue3);
            }
            a30.a(null, "emailAddress", format, state, text, strC, null, strC3, false, function12, 0, strC2, z10VarF, (Function1) objRememberedValue3, false, keyboardOptions, keyboardActions, q20Var, null, strA, strB, null, composer, 48, 12582912, 0, 2377025);
            composer.endReplaceGroup();
            if (wbVar.p() == wb.b.f34578a) {
                composer.startReplaceGroup(1477414539);
                a(wbVar.q(), function1, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1477493062);
                a(wbVar.n(), function1, composer, 0);
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
    public static final Unit a(Function1 function1, boolean z) {
        if (z) {
            function1.invoke(pb.f31911a);
        } else {
            function1.invoke(qb.f32369a);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new ob(it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        function1.invoke(rb.b.f32671a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(rb.c.f32672a);
        return Unit.f186387a;
    }

    private static final void a(wb.a aVar, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        ComposableLambda composableLambdaRememberComposableLambda;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2105524886);
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
                ComposerKt.traceEventStart(-2105524886, i2, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.CountrySearch (ContactsDetailsScreen.kt:156)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = i2 & 14;
            String strA = t20.a(aVar, composerStartRestartGroup, i3);
            String strB = t20.b(aVar, composerStartRestartGroup, i3);
            r20 format = aVar.getFormat();
            l20 state = aVar.getState();
            String text = aVar.getText();
            String strC = d81.c(aVar.getTitle(), composerStartRestartGroup, 0);
            z10 z10VarD = aVar.d();
            if (!aVar.e().isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(356579542);
                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1306740667, true, new cn1(aVar, function1, 9), composerStartRestartGroup, 54);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(357516858);
                composerStartRestartGroup.endReplaceGroup();
                composableLambdaRememberComposableLambda = null;
            }
            ComposableLambda composableLambda = composableLambdaRememberComposableLambda;
            String strC2 = d81.c(aVar.c(), composerStartRestartGroup, 0);
            boolean zW = kotlin.text.d0.W(aVar.getText());
            boolean z = false;
            KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.INSTANCE.m3082getWordsIUNYP9k(), z, KeyboardType.INSTANCE.m3097getTextPjHm6EE(), ImeAction.INSTANCE.m3059getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 112, (DefaultConstructorMarker) null);
            int i5 = i2 & 112;
            boolean z3 = i5 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new us1(26, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            KeyboardActions keyboardActions = new KeyboardActions((Function1) objRememberedValue, null, null, null, null, null, 62, null);
            boolean z4 = i5 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new us1(27, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            boolean z6 = i5 == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new us1(28, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composer2 = composerStartRestartGroup;
            a30.a(null, "countryCode", format, state, text, strC, strC2, function12, null, null, z10VarD, (Function1) objRememberedValue3, composableLambda, zW, keyboardOptions, keyboardActions, strA, strB, composer2, 48, 0, 769);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(aVar, function1, i, 22));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(wb.a aVar, Function1 function1) {
        List listE = aVar.e();
        ArrayList arrayList = new ArrayList(zhm.w.t(listE, 10));
        Iterator it8 = listE.iterator();
        while (it8.hasNext()) {
            arrayList.add(ComposableLambdaKt.composableLambdaInstance(1698047935, true, new bk1((fd) it8.next(), function1, 9)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(fd fdVar, Function1 function1, int i, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = (composer.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1698047935, i3, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.CountrySearch.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContactsDetailsScreen.kt:180)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            String strA = z71.f35541a.a(i);
            String str = fdVar.e() + d81.c(fdVar.getName(), composer, 0);
            String strG = fdVar.g();
            boolean zChanged = composer.changed(function1) | composer.changedInstance(fdVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new vp1(function1, fdVar, 10);
                composer.updateRememberedValue(objRememberedValue);
            }
            a(companion, strA, str, strG, (Function0) objRememberedValue, composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, fd fdVar) {
        function1.invoke(new mb(fdVar));
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void a(androidx.compose.ui.Modifier r22, java.lang.String r23, final java.lang.String r24, final java.lang.String r25, kotlin.jvm.functions.Function0 r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.xb.a(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(RowScope rowScope, String str, String str2, TextStyle textStyle, String str3, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(105021384, i, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.CustomSuggestionItem.<anonymous>.<anonymous> (ContactsDetailsScreen.kt:233)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 16;
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, PaddingKt.m866paddingqDBjuR0$default(companion.then(str != null ? a80.a(companion, str, (String) null, 2, (Object) null) : companion), Dp.m3297constructorimpl(f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 1.0f, false, 2, null);
            TextOverflow.Companion companion2 = TextOverflow.INSTANCE;
            TextKt.m1280Text4IGK_g(str2, modifierWeight$default, 0L, 0L, null, null, null, 0L, null, null, 0L, companion2.m3263getEllipsisgIe3tQ8(), false, 1, 0, null, textStyle, composer, 0, 3120, 55292);
            TextKt.m1280Text4IGK_g(str3 == null ? "" : str3, PaddingKt.m864paddingVpY3zN4$default(companion, Dp.m3297constructorimpl(f), BitmapDescriptorFactory.HUE_RED, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, companion2.m3263getEllipsisgIe3tQ8(), false, 1, 0, null, textStyle, composer, 48, 3120, 55292);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    private static final void a(wb.c cVar, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1493194422);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(cVar) : composerStartRestartGroup.changedInstance(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1493194422, i2, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.PhoneEnter (ContactsDetailsScreen.kt:261)");
            }
            s20 s20VarB = cVar.b();
            r20 format = s20VarB.getFormat();
            l20 state = s20VarB.getState();
            String text = s20VarB.getText();
            String strC = d81.c(s20VarB.getTitle(), composerStartRestartGroup, 0);
            String strC2 = d81.c(s20VarB.b(), composerStartRestartGroup, 0);
            z10 z10VarF = s20VarB.f();
            String strC3 = d81.c(s20VarB.e(), composerStartRestartGroup, 0);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m3093getNumberPjHm6EE(), ImeAction.INSTANCE.m3059getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG, (DefaultConstructorMarker) null);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new jt1(4, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            KeyboardActions keyboardActions = new KeyboardActions((Function1) objRememberedValue, null, null, null, null, null, 62, null);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(736306585, true, new uj1(cVar, 12, function1, s20VarB), composerStartRestartGroup, 54);
            boolean z3 = i3 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new us1(24, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            boolean z4 = i3 == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new us1(25, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            a30.a((Modifier) null, "phoneNumber", format, state, text, strC, strC3, composableLambdaRememberComposableLambda, function12, strC2, z10VarF, (Function1) objRememberedValue3, keyboardOptions, keyboardActions, (String) null, (String) null, composerStartRestartGroup, 12582960, 0, 49153);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(Modifier.INSTANCE, Dp.m3297constructorimpl(8)), composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(cVar, function1, i, 21));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(wb.c cVar, Function1 function1, s20 s20Var, Composer composer, int i) {
        long jM1976copywmQWz5c$default;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(736306585, i, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.PhoneEnter.<anonymous>.<anonymous> (ContactsDetailsScreen.kt:272)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierA = a80.a((Modifier) companion, d81.c(cVar.c(), composer, 0), false, 2, (Object) null);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qp1(26, function1);
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierA2 = a80.a(modifierA, false, (String) null, (Role) null, (Function0) objRememberedValue, 7, (Object) null);
            th0 th0Var = th0.f33777a;
            Modifier modifierM873defaultMinSizeVpY3zN4$default = SizeKt.m873defaultMinSizeVpY3zN4$default(modifierA2, BitmapDescriptorFactory.HUE_RED, th0Var.a(), 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getEnd(), centerVertically, composer, 54);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM873defaultMinSizeVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f = 1;
            float fM3297constructorimpl = Dp.m3297constructorimpl(f);
            float fM3297constructorimpl2 = Dp.m3297constructorimpl(2);
            Modifier modifierM887width3ABfNKs = SizeKt.m887width3ABfNKs(companion, Dp.m3297constructorimpl(85));
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion2.getCenterVertically(), composer, 54);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM887width3ABfNKs);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m1665setimpl(composerM1662constructorimpl2, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl2.getInserting() || !Intrinsics.f(composerM1662constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM1662constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM1662constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m1665setimpl(composerM1662constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            float f4 = 4;
            TextKt.m1280Text4IGK_g(cVar.a(), PaddingKt.m866paddingqDBjuR0$default(companion, BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(f4), Dp.m3297constructorimpl(8), BitmapDescriptorFactory.HUE_RED, 9, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131068);
            Modifier modifierM866paddingqDBjuR0$default = PaddingKt.m866paddingqDBjuR0$default(companion, BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(f4), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            Painter painterA = a20.a(cVar.d(), composer, 0);
            if (DarkThemeKt.isSystemInDarkTheme(composer, 0)) {
                composer.startReplaceGroup(20647894);
                composer.endReplaceGroup();
                jM1976copywmQWz5c$default = Color.INSTANCE.m1995getWhite0d7_KjU();
            } else {
                composer.startReplaceGroup(20649112);
                jM1976copywmQWz5c$default = Color.m1976copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).getValue(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                composer.endReplaceGroup();
            }
            IconKt.m1223Iconww6aTOc(painterA, (String) null, modifierM866paddingqDBjuR0$default, jM1976copywmQWz5c$default, composer, 432, 0);
            SpacerKt.Spacer(SizeKt.m887width3ABfNKs(companion, Dp.m3297constructorimpl(16)), composer, 6);
            if (s20Var.getState() != l20.f30507a) {
                fM3297constructorimpl = fM3297constructorimpl2;
            }
            DividerKt.m1207DivideroMI9zvI(SizeKt.m874height3ABfNKs(SizeKt.m887width3ABfNKs(companion, Dp.m3297constructorimpl(f)), Dp.m3297constructorimpl(th0Var.a() - fM3297constructorimpl)), fj0.f28535a.b(composer, 6).getInput().getDefault().getBorder().getColor().a(composer, 0), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, composer, 0, 12);
            SpacerKt.Spacer(SizeKt.m887width3ABfNKs(companion, Dp.m3297constructorimpl(12)), composer, 6);
            composer.endNode();
            pq0.a(false, ComposableLambdaKt.rememberComposableLambda(-458225481, true, new ci1(cVar, 9), composer, 54), composer, 48, 1);
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
    public static final Unit a(wb.c cVar, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-458225481, i, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.PhoneEnter.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContactsDetailsScreen.kt:320)");
            }
            TextKt.m1280Text4IGK_g(cVar.e(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fj0.f28535a.b(composer, 6).getInput().getDefault().getValue().a(false, TextUnit.m3364boximpl(fj0.a.f28536a.a()), composer, 48, 1), composer, 0, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }
}
