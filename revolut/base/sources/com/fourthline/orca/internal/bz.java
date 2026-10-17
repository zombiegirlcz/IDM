package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.ss;
import com.fourthline.orca.internal.uy;
import com.fourthline.orca.internal.wy;
import com.fourthline.orca.internal.xr;
import com.fourthline.orca.internal.zp0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes23.dex */
public final class bz implements gq0.b, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f27276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ez f27277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xr f27278c;
    private final fe1 d;
    private final qg0 e;
    private final v10 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l70 f27279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final hq0 f27280h;
    private final Lazy i;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PagerState f27282b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PagerState pagerState, Continuation continuation) {
            super(2, continuation);
            this.f27282b = pagerState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f27282b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27281a;
            if (i == 0) {
                yhm.o.b(obj2);
                PagerState pagerState = this.f27282b;
                int pageCount = pagerState.getPageCount();
                this.f27281a = 1;
                if (PagerState.scrollToPage$default(pagerState, pageCount, BitmapDescriptorFactory.HUE_RED, this, 2, null) == aVar) {
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
        int f27283a;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return bz.this.new b(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27283a;
            if (i == 0) {
                yhm.o.b(obj2);
                xr xrVar = bz.this.f27278c;
                xr.a aVar2 = new xr.a(bz.this.f27277b.e());
                this.f27283a = 1;
                if (xrVar.a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                ((yhm.m) obj2).getClass();
            }
            bz.this.d.b(new wy.c(ss.b.f33125a));
            return Unit.f186387a;
        }
    }

    public bz(ez repository, xr eidAcceptAccessRightsWorker, fe1 viewNavigator, qg0 analytics, v10 imageServiceLocator, l70 lottieServiceLocator, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(eidAcceptAccessRightsWorker, "eidAcceptAccessRightsWorker");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f27276a = coroutineScope;
        this.f27277b = repository;
        this.f27278c = eidAcceptAccessRightsWorker;
        this.d = viewNavigator;
        this.e = analytics;
        this.f = imageServiceLocator;
        this.f27279g = lottieServiceLocator;
        this.f27280h = xy.f35106a;
        this.i = yhm.j.b(new gj1(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(String str, Composer composer, int i) {
        composer.startReplaceGroup(-208212906);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-208212906, i, -1, "com.fourthline.orca.kyc.internal.flow.eid.flow.FlowSelectionEidPopupProvider.buildPages.<anonymous>.<anonymous>.<anonymous> (FlowSelectionEidPopupProvider.kt:111)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.g d(bz bzVar) {
        return new zp0.g(bzVar.a(bzVar.f27277b.e()), new ci1(bzVar, 1), false, new kd1.d(null, 1, null), new kd1.a(null, 1, null), bzVar.f.a(r10.M0), false, 4, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF100596a() {
        return this.f27276a.getF100596a();
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(zp0.b bVar, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(471074280, i, -1, "com.fourthline.orca.kyc.internal.flow.eid.flow.FlowSelectionEidPopupProvider.buildPages.<anonymous>.<anonymous>.<anonymous> (FlowSelectionEidPopupProvider.kt:84)");
            }
            hi0.d(bVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.f27280h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(bz bzVar, ColumnScope OrcaPage, PagerState it8, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(OrcaPage, "$this$OrcaPage");
        Intrinsics.checkNotNullParameter(it8, "it");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(OrcaPage) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & ISO781611.CREATION_DATE_AND_TIME_TAG) != 130, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(983034062, i2, -1, "com.fourthline.orca.kyc.internal.flow.eid.flow.FlowSelectionEidPopupProvider.buildPages.<anonymous> (FlowSelectionEidPopupProvider.kt:105)");
            }
            p70 p70VarA = bzVar.f27279g.a(k70.f30163q);
            c81.a aVar = c81.f27404a;
            c81.d dVarA = c81.a.a(aVar, R.string.shared_dialog_permission_eid_data_header_germany, 0, 2, null);
            c81.d dVarA2 = c81.a.a(aVar, R.string.shared_dialog_permission_eid_data_message_germany, 0, 2, null);
            List listN0 = kotlin.text.d0.n0(d81.c(c81.a.a(aVar, R.string.shared_dialog_permission_eid_data_list_germany, 0, 2, null), composer, 0), new String[]{"\n"}, 0, 6);
            ArrayList arrayList = new ArrayList(zhm.w.t(listN0, 10));
            Iterator it9 = listN0.iterator();
            while (it9.hasNext()) {
                arrayList.add(new zp0.b.a(null, new wj1((String) it9.next(), 0), 1, null));
            }
            zp0.b bVar = new zp0.b(dVarA, p70VarA, dVarA2, arrayList, new kd1.d(null, 1, null), new kd1.a(null, 1, null), false, 64, null);
            hi0.a(OrcaPage, bVar, (Function2) null, ComposableLambdaKt.rememberComposableLambda(773961671, true, new sj1(bVar, 0), composer, 54), ComposableLambdaKt.rememberComposableLambda(1186867878, true, new sj1(bVar, 1), composer, 54), composer, (i2 & 14) | 28032, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(zp0.b bVar, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(773961671, i, -1, "com.fourthline.orca.kyc.internal.flow.eid.flow.FlowSelectionEidPopupProvider.buildPages.<anonymous>.<anonymous>.<anonymous> (FlowSelectionEidPopupProvider.kt:117)");
            }
            hi0.d(bVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bz bzVar, int i, int i2) {
        if (i == 1) {
            bzVar.e.track(uy.a.b.f34216b);
        }
        return Unit.f186387a;
    }

    private final List a(List list) {
        final int i = 0;
        final int i2 = 1;
        return zhm.v.k(new ai0(ComposableLambdaKt.composableLambdaInstance(680146671, true, new oim.n(this) { // from class: com.fourthline.orca.internal.vj1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ bz f34372b;

            {
                this.f34372b = this;
            }

            @Override // oim.n
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i3 = i;
                ColumnScope columnScope = (ColumnScope) obj2;
                PagerState pagerState = (PagerState) obj3;
                Composer composer = (Composer) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                switch (i3) {
                    case 0:
                        return bz.a(this.f34372b, columnScope, pagerState, composer, iIntValue);
                    default:
                        return bz.b(this.f34372b, columnScope, pagerState, composer, iIntValue);
                }
            }
        })), new ai0(ComposableLambdaKt.composableLambdaInstance(983034062, true, new oim.n(this) { // from class: com.fourthline.orca.internal.vj1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ bz f34372b;

            {
                this.f34372b = this;
            }

            @Override // oim.n
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i3 = i2;
                ColumnScope columnScope = (ColumnScope) obj2;
                PagerState pagerState = (PagerState) obj3;
                Composer composer = (Composer) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                switch (i3) {
                    case 0:
                        return bz.a(this.f34372b, columnScope, pagerState, composer, iIntValue);
                    default:
                        return bz.b(this.f34372b, columnScope, pagerState, composer, iIntValue);
                }
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(zp0.b bVar, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1186867878, i, -1, "com.fourthline.orca.kyc.internal.flow.eid.flow.FlowSelectionEidPopupProvider.buildPages.<anonymous>.<anonymous>.<anonymous> (FlowSelectionEidPopupProvider.kt:120)");
            }
            wp0.a(bVar.e(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void d() {
        this.e.track(uy.a.d.f34218b);
        skm.e0.C(this, null, null, new b(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bz bzVar, ColumnScope OrcaPage, PagerState pagerState, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaPage, "$this$OrcaPage");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        int i2 = (i & 6) == 0 ? i | (composer.changed(OrcaPage) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= composer.changed(pagerState) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(680146671, i2, -1, "com.fourthline.orca.kyc.internal.flow.eid.flow.FlowSelectionEidPopupProvider.buildPages.<anonymous> (FlowSelectionEidPopupProvider.kt:66)");
            }
            p70 p70VarA = bzVar.f27279g.a(k70.f30163q);
            c81.a aVar = c81.f27404a;
            c81.d dVarA = c81.a.a(aVar, R.string.shared_dialog_permission_eid_header_germany, 0, 2, null);
            c81.d dVarA2 = c81.a.a(aVar, R.string.shared_dialog_permission_eid_message_germany, 0, 2, null);
            List<Pair> listK = zhm.v.k(new Pair(r10.Z0, Integer.valueOf(R.string.shared_dialog_permission_eid_confirm_first_germany)), new Pair(r10.a1, Integer.valueOf(R.string.shared_dialog_permission_eid_confirm_second_germany)));
            ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
            for (Pair pair : listK) {
                arrayList.add(new zp0.b.a(bzVar.f.a((r10) pair.f186385a), new tj1(0, pair)));
            }
            zp0.b bVar = new zp0.b(dVarA, p70VarA, dVarA2, arrayList, new kd1.d(null, 1, null), new kd1.a(null, 1, null), false, 64, null);
            hi0.a(OrcaPage, bVar, ComposableLambdaKt.rememberComposableLambda(58168073, true, new sj1(bVar, 2), composer, 54), ComposableLambdaKt.rememberComposableLambda(471074280, true, new sj1(bVar, 3), composer, 54), ComposableLambdaKt.rememberComposableLambda(883980487, true, new uj1(bzVar, 0, pagerState, bVar), composer, 54), composer, (i2 & 14) | 28032, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(Pair pair, Composer composer, int i) {
        composer.startReplaceGroup(1102365504);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1102365504, i, -1, "com.fourthline.orca.kyc.internal.flow.eid.flow.FlowSelectionEidPopupProvider.buildPages.<anonymous>.<anonymous>.<anonymous> (FlowSelectionEidPopupProvider.kt:76)");
        }
        String strC = d81.c(c81.a.a(c81.f27404a, ((Number) pair.f186386b).intValue(), 0, 2, null), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(zp0.b bVar, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(58168073, i, -1, "com.fourthline.orca.kyc.internal.flow.eid.flow.FlowSelectionEidPopupProvider.buildPages.<anonymous>.<anonymous>.<anonymous> (FlowSelectionEidPopupProvider.kt:85)");
            }
            hi0.a(bVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bz bzVar, PagerState pagerState, zp0.b bVar, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(883980487, i, -1, "com.fourthline.orca.kyc.internal.flow.eid.flow.FlowSelectionEidPopupProvider.buildPages.<anonymous>.<anonymous>.<anonymous> (FlowSelectionEidPopupProvider.kt:87)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            String strC = d81.c(c81.a.a(c81.f27404a, R.string.shared_dialog_permission_eid_button_germany, 0, 2, null), composer, 0);
            boolean zChangedInstance = composer.changedInstance(bzVar) | composer.changed(pagerState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new rj1(bzVar, pagerState, 15);
                composer.updateRememberedValue(objRememberedValue);
            }
            u50.a(modifierFillMaxWidth$default, "", strC, null, false, false, (Function0) objRememberedValue, composer, 54, 56);
            wp0.a(bVar.e(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bz bzVar, PagerState pagerState) {
        skm.e0.C(bzVar, null, null, new a(pagerState, null), 3);
        return Unit.f186387a;
    }
}
