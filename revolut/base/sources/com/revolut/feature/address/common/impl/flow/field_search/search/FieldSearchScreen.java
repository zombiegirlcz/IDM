package com.revolut.feature.address.common.impl.flow.field_search.search;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import au0.j4;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.common.impl.flow.field_search.search.FieldSearchScreen;
import com.revolut.feature.address.common.impl.flow.field_search.search.FieldSearchScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ea4.d;
import ec8.c;
import egb.m0;
import ei1.b;
import ei1.h;
import ei1.i;
import ihm.f;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/field_search/search/FieldSearchScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lei1/h;", "Ldli/a;", "Lei1/i;", "Lno/m;", "Lno/k;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FieldSearchScreen extends ViewController<h> implements a, m, k {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(FieldSearchScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final FieldSearchScreenContract$InputData K;
    public final ao.h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final int P;
    public final boolean Q;
    public final AnalyticsProduct R;
    public AnalyticsContext S;
    public final Object T;
    public final Object U;
    public final Object V;

    public FieldSearchScreen(FieldSearchScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = w.y0(new m0(8));
        this.N = w.y0(new m0(9));
        this.O = w.y0(new m0(10));
        this.P = R$layout.screen_recycler_navbar;
        this.Q = true;
        this.R = inputData.f;
        this.S = inputData.f60977g;
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: ei1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FieldSearchScreen f126343b;

            {
                this.f126343b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FieldSearchScreen fieldSearchScreen = this.f126343b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FieldSearchScreen.W;
                        qji.b bVarU2 = fieldSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.address.common.impl.flow.field_search.search.di.FieldSearchScreenInjector");
                        yh1.c cVar = (yh1.c) bVarU2;
                        yh1.e eVar = cVar.f313700b;
                        yh1.c cVar2 = cVar.f313701c;
                        FieldSearchScreenContract$InputData fieldSearchScreenContract$InputData = fieldSearchScreen.K;
                        fieldSearchScreenContract$InputData.getClass();
                        return new yh1.h(eVar, cVar2, fieldSearchScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FieldSearchScreen.W;
                        return (k) ((yh1.h) fieldSearchScreen.T.getValue()).f313720c.get();
                    default:
                        KProperty[] kPropertyArr3 = FieldSearchScreen.W;
                        FieldSearchScreen fieldSearchScreen2 = this.f126343b;
                        return dli.f.a(fieldSearchScreen2, fieldSearchScreen2.d(), v.k((RowDelegate) fieldSearchScreen2.M.getValue(), (FullScreenStateDelegate) fieldSearchScreen2.N.getValue(), (SingleChoiceLoadingDelegate) fieldSearchScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: ei1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FieldSearchScreen f126343b;

            {
                this.f126343b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FieldSearchScreen fieldSearchScreen = this.f126343b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FieldSearchScreen.W;
                        qji.b bVarU2 = fieldSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.address.common.impl.flow.field_search.search.di.FieldSearchScreenInjector");
                        yh1.c cVar = (yh1.c) bVarU2;
                        yh1.e eVar = cVar.f313700b;
                        yh1.c cVar2 = cVar.f313701c;
                        FieldSearchScreenContract$InputData fieldSearchScreenContract$InputData = fieldSearchScreen.K;
                        fieldSearchScreenContract$InputData.getClass();
                        return new yh1.h(eVar, cVar2, fieldSearchScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FieldSearchScreen.W;
                        return (k) ((yh1.h) fieldSearchScreen.T.getValue()).f313720c.get();
                    default:
                        KProperty[] kPropertyArr3 = FieldSearchScreen.W;
                        FieldSearchScreen fieldSearchScreen2 = this.f126343b;
                        return dli.f.a(fieldSearchScreen2, fieldSearchScreen2.d(), v.k((RowDelegate) fieldSearchScreen2.M.getValue(), (FullScreenStateDelegate) fieldSearchScreen2.N.getValue(), (SingleChoiceLoadingDelegate) fieldSearchScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: ei1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FieldSearchScreen f126343b;

            {
                this.f126343b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FieldSearchScreen fieldSearchScreen = this.f126343b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FieldSearchScreen.W;
                        qji.b bVarU2 = fieldSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.address.common.impl.flow.field_search.search.di.FieldSearchScreenInjector");
                        yh1.c cVar = (yh1.c) bVarU2;
                        yh1.e eVar = cVar.f313700b;
                        yh1.c cVar2 = cVar.f313701c;
                        FieldSearchScreenContract$InputData fieldSearchScreenContract$InputData = fieldSearchScreen.K;
                        fieldSearchScreenContract$InputData.getClass();
                        return new yh1.h(eVar, cVar2, fieldSearchScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FieldSearchScreen.W;
                        return (k) ((yh1.h) fieldSearchScreen.T.getValue()).f313720c.get();
                    default:
                        KProperty[] kPropertyArr3 = FieldSearchScreen.W;
                        FieldSearchScreen fieldSearchScreen2 = this.f126343b;
                        return dli.f.a(fieldSearchScreen2, fieldSearchScreen2.d(), v.k((RowDelegate) fieldSearchScreen2.M.getValue(), (FullScreenStateDelegate) fieldSearchScreen2.N.getValue(), (SingleChoiceLoadingDelegate) fieldSearchScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.S = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (yh1.h) this.T.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getS() {
        return this.S;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: T2 */
    public final Boolean getG() {
        return Boolean.valueOf(this.Q);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        navBarWithToolbar.j0(false);
        FieldSearchScreenContract$InputData fieldSearchScreenContract$InputData = this.K;
        navBarWithToolbar.setHint(fieldSearchScreenContract$InputData.f60975b);
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        String str = fieldSearchScreenContract$InputData.e;
        if (str != null) {
            navBarWithToolbar.setSearchInput(str);
        }
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        f fVar = d3().f174539b.f59409p.f57337m;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(w.y(fVar, 300L)), new d(this, continuation, 16), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59409p.f57336l), new c(this, continuation, 10), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.M.getValue()).f53218h), new ei1.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), new ei1.d(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.L.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ei1.k d() {
        return (ei1.k) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
