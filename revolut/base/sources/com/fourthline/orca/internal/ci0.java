package com.fourthline.orca.internal;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.fourthline.orca.internal.b30;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ci0 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PagerState f27468b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PagerState pagerState, Continuation continuation) {
            super(2, continuation);
            this.f27468b = pagerState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f27468b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27467a;
            if (i == 0) {
                yhm.o.b(obj2);
                PagerState pagerState = this.f27468b;
                int currentPage = pagerState.getCurrentPage() - 1;
                this.f27467a = 1;
                if (PagerState.scrollToPage$default(pagerState, currentPage, BitmapDescriptorFactory.HUE_RED, this, 2, null) == aVar) {
                    return aVar;
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
        int f27469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PagerState f27470b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PagerState pagerState, Continuation continuation) {
            super(2, continuation);
            this.f27470b = pagerState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new b(this.f27470b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27469a;
            if (i == 0) {
                yhm.o.b(obj2);
                PagerState pagerState = this.f27470b;
                int currentPage = pagerState.getCurrentPage() + 1;
                this.f27469a = 1;
                if (PagerState.scrollToPage$default(pagerState, currentPage, BitmapDescriptorFactory.HUE_RED, this, 2, null) == aVar) {
                    return aVar;
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

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PagerState f27472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f27473c;
        final /* synthetic */ List d;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2 f27474a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ List f27475b;

            public a(Function2 function2, List list) {
                this.f27474a = function2;
                this.f27475b = list;
            }

            public final Object a(int i, Continuation continuation) {
                this.f27474a.invoke(new Integer(i), new Integer(this.f27475b.size()));
                return Unit.f186387a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return a(((Number) obj2).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PagerState pagerState, Function2 function2, List list, Continuation continuation) {
            super(2, continuation);
            this.f27472b = pagerState;
            this.f27473c = function2;
            this.d = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new c(this.f27472b, this.f27473c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27471a;
            if (i == 0) {
                yhm.o.b(obj2);
                Flow flowQ = vkm.q.q(SnapshotStateKt.snapshotFlow(new gj1(this.f27472b, 1)));
                a aVar2 = new a(this.f27473c, this.d);
                this.f27471a = 1;
                if (flowQ.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int a(PagerState pagerState) {
            return pagerState.getCurrentPage();
        }
    }

    public static final class d extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f27477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PagerState f27478c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, PagerState pagerState, Continuation continuation) {
            super(2, continuation);
            this.f27477b = list;
            this.f27478c = pagerState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new d(this.f27477b, this.f27478c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27476a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f27476a = 1;
                if (skm.k0.b(500L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            FocusRequester.m1781requestFocus3ESFkO8$default((FocusRequester) this.f27477b.get(this.f27478c.getSettledPage()), 0, 1, null);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(int i, int i2, int i3, Composer composer, int i5) {
        a(i, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ColumnScope columnScope, bi0 bi0Var, Function0 function0, int i, int i2, Composer composer, int i3) {
        a(columnScope, bi0Var, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(CoroutineScope coroutineScope, PagerState pagerState) {
        skm.e0.C(coroutineScope, null, null, new b(pagerState, null), 3);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(PagerState pagerState, List list, z10 z10Var, int i, int i2, Composer composer, int i3) {
        a(pagerState, list, z10Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ColumnScope columnScope, Modifier modifier, List list, PagerState pagerState, Function2 function2, int i, int i2, Composer composer, int i3) {
        a(columnScope, modifier, list, pagerState, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    public static final void a(ColumnScope columnScope, Modifier modifier, final List pages, final PagerState pagerState, Function2 onPageViewed, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(onPageViewed, "onPageViewed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-208540073);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 48;
            modifier2 = modifier;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 32 : 16) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pages) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(pagerState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPageViewed) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9361) != 9360, i3 & 1)) {
            Modifier modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-208540073, i3, -1, "com.fourthline.orca.core.internal.composable.pager.OrcaPagerWithCustomContent (OrcaPager.kt:70)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object obj2 = objRememberedValue;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                ArrayList arrayList = new ArrayList();
                int size = pages.size();
                for (int i6 = 0; i6 < size; i6++) {
                    arrayList.add(new FocusRequester());
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj2 = arrayList;
            }
            final List list = (List) obj2;
            int i21 = i3 & 7168;
            boolean zChangedInstance = (i21 == 2048) | ((57344 & i3) == 16384) | composerStartRestartGroup.changedInstance(pages);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new c(pagerState, onPageViewed, pages, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int i22 = (i3 >> 9) & 14;
            EffectsKt.LaunchedEffect(pagerState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i22);
            PagerKt.m949HorizontalPager8jOkeI(pagerState, modifier3, null, null, 0, BitmapDescriptorFactory.HUE_RED, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1107221352, true, new oim.n() { // from class: com.fourthline.orca.internal.ik1
                @Override // oim.n
                public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                    int iIntValue = ((Integer) obj6).intValue();
                    return ci0.a(pages, list, pagerState, (PagerScope) obj3, ((Integer) obj4).intValue(), (Composer) obj5, iIntValue);
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i22 | (i3 & 112), 24576, 16380);
            modifier2 = modifier3;
            Composer composer3 = composerStartRestartGroup;
            Integer numValueOf = Integer.valueOf(pagerState.getSettledPage());
            boolean zChangedInstance2 = composer3.changedInstance(list) | (i21 == 2048);
            Object objRememberedValue3 = composer3.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new d(list, pagerState, null);
                composer3.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer3, 0);
            composer2 = composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer2 = composer3;
            }
        } else {
            Composer composer4 = composerStartRestartGroup;
            composer4.skipToGroupEnd();
            composer2 = composer4;
        }
        Modifier modifier4 = modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jk1(columnScope, modifier4, pages, pagerState, onPageViewed, i, i2, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(List list, List list2, PagerState pagerState, PagerScope HorizontalPager, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1107221352, i2, -1, "com.fourthline.orca.core.internal.composable.pager.OrcaPagerWithCustomContent.<anonymous> (OrcaPager.kt:92)");
        }
        Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(FocusableKt.focusable$default(FocusRequesterModifierKt.focusRequester(a80.a(a80.a(Modifier.INSTANCE, (String) null, 1, (Object) null), d81.c(c81.f27404a.a(R.string.shared_current_step_accessibility, String.valueOf(i + 1), String.valueOf(list.size())), composer, 0), false, 2, (Object) null), (FocusRequester) list2.get(i)), true, null, 2, null), BitmapDescriptorFactory.HUE_RED, 1, null), null, false, 3, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierWrapContentHeight$default);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
        Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
            composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
            composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
        }
        Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        ((ai0) list.get(i)).a().invoke(ColumnScopeInstance.INSTANCE, pagerState, composer, 6);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final androidx.compose.foundation.pager.PagerState r43, java.util.List r44, com.fourthline.orca.internal.z10 r45, androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ci0.a(androidx.compose.foundation.pager.PagerState, java.util.List, com.fourthline.orca.internal.z10, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(CoroutineScope coroutineScope, PagerState pagerState) {
        skm.e0.C(coroutineScope, null, null, new a(pagerState, null), 3);
        return Unit.f186387a;
    }

    private static final void a(final int i, final int i2, Composer composer, int i3) {
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1478296359);
        if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1478296359, i5, -1, "com.fourthline.orca.core.internal.composable.pager.DotsIndicator (OrcaPager.kt:209)");
            }
            final b30.c cVarJ = fj0.f28535a.b(composerStartRestartGroup, 6).getDialog().getInstructional().getInstruction().getPagination();
            Modifier modifierM874height3ABfNKs = SizeKt.m874height3ABfNKs(Modifier.INSTANCE, Dp.m3297constructorimpl(48));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            boolean zChanged = ((i5 & 14) == 4) | ((i5 & 112) == 32) | composerStartRestartGroup.changed(cVarJ);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.fourthline.orca.internal.mk1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ci0.a(i, i2, cVarJ, (LazyListScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyRow(modifierM874height3ABfNKs, null, null, false, null, centerVertically, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 196614, 478);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nk1(i, i2, i3, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(int i, float f, b30.c cVar, int i2, LazyItemScope items, int i3, Composer composer, int i5) {
        int i6;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i5 & 48) == 0) {
            i6 = i5 | (composer.changed(i3) ? 32 : 16);
        } else {
            i6 = i5;
        }
        if (composer.shouldExecute((i6 & 145) != 144, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1210129069, i6, -1, "com.fourthline.orca.core.internal.composable.pager.DotsIndicator.<anonymous>.<anonymous>.<anonymous> (OrcaPager.kt:218)");
            }
            if (i3 == i) {
                composer.startReplaceGroup(-1000330073);
                BoxKt.Box(BackgroundKt.m613backgroundbw27NRU$default(ClipKt.clip(SizeKt.m882size3ABfNKs(Modifier.INSTANCE, f), RoundedCornerShapeKt.getCircleShape()), cVar.getActive().a(composer, 0), null, 2, null), composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1000087963);
                BoxKt.Box(BackgroundKt.m613backgroundbw27NRU$default(ClipKt.clip(SizeKt.m882size3ABfNKs(Modifier.INSTANCE, f), RoundedCornerShapeKt.getCircleShape()), cVar.getInactive().a(composer, 0), null, 2, null), composer, 0);
                composer.endReplaceGroup();
            }
            if (i3 != i2 - 1) {
                composer.startReplaceGroup(-999812993);
                SpacerKt.Spacer(PaddingKt.m864paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3297constructorimpl(3), BitmapDescriptorFactory.HUE_RED, 2, null), composer, 6);
            } else {
                composer.startReplaceGroup(-1008594859);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.foundation.layout.ColumnScope r43, com.fourthline.orca.internal.bi0 r44, kotlin.jvm.functions.Function0 r45, androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            Method dump skipped, instruction units count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ci0.a(androidx.compose.foundation.layout.ColumnScope, com.fourthline.orca.internal.bi0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final ai0 a(bi0 bi0Var, Function0 function0) {
        Intrinsics.checkNotNullParameter(bi0Var, "<this>");
        return new ai0(ComposableLambdaKt.composableLambdaInstance(1896612783, true, new lk1(bi0Var, function0, 0)));
    }

    public static /* synthetic */ ai0 a(bi0 bi0Var, Function0 function0, int i, Object obj2) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        return a(bi0Var, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bi0 bi0Var, Function0 function0, ColumnScope OrcaPage, PagerState it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaPage, "$this$OrcaPage");
        Intrinsics.checkNotNullParameter(it8, "it");
        if ((i & 6) == 0) {
            i |= composer.changed(OrcaPage) ? 4 : 2;
        }
        if (composer.shouldExecute((i & ISO781611.CREATION_DATE_AND_TIME_TAG) != 130, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1896612783, i, -1, "com.fourthline.orca.core.internal.composable.pager.toPageComposable.<anonymous> (OrcaPager.kt:325)");
            }
            a(OrcaPage, bi0Var, function0, composer, i & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(final int i, final int i2, final b30.c cVar, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final float fM3297constructorimpl = Dp.m3297constructorimpl(8);
        LazyListScope.items$default(LazyRow, i, null, null, ComposableLambdaKt.composableLambdaInstance(1210129069, true, new oim.n() { // from class: com.fourthline.orca.internal.kk1
            @Override // oim.n
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                int iIntValue = ((Integer) obj5).intValue();
                return ci0.a(i2, fM3297constructorimpl, cVar, i, (LazyItemScope) obj2, ((Integer) obj3).intValue(), (Composer) obj4, iIntValue);
            }
        }), 6, null);
        return Unit.f186387a;
    }
}
