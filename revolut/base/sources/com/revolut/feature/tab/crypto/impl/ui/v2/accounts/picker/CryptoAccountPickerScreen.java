package com.revolut.feature.tab.crypto.impl.ui.v2.accounts.picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c65.i;
import cbf.c;
import ck7.j;
import cke.b;
import cke.f;
import cke.g;
import cli.o;
import cli.q;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.picker.CryptoAccountPickerScreen;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.picker.CryptoAccountPickerScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import cwi.u;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nd.n;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/crypto/impl/ui/v2/accounts/picker/CryptoAccountPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcke/f;", "Ldli/a;", "Lcke/g;", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoAccountPickerScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CryptoAccountPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CryptoAccountPickerScreenContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final int Q;

    public CryptoAccountPickerScreen(CryptoAccountPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: cke.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAccountPickerScreen f24818b;

            {
                this.f24818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoAccountPickerScreen cryptoAccountPickerScreen = this.f24818b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoAccountPickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoAccountPickerScreen.m2()).a().get(aje.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", aje.a.class, " is not found"));
                        }
                        jje.c cVar = ((jje.c) aVar2.b()).V;
                        CryptoAccountPickerScreenContract$InputData cryptoAccountPickerScreenContract$InputData = cryptoAccountPickerScreen.K;
                        cryptoAccountPickerScreenContract$InputData.getClass();
                        return new jje.a(cVar, cryptoAccountPickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoAccountPickerScreen.R;
                        jje.a aVar3 = (jje.a) ((dke.a) cryptoAccountPickerScreen.M.getValue());
                        aVar3.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
                        jje.c cVar2 = aVar3.f174820b;
                        d16.b bVar = cVar2.f174844t;
                        ix5.b bVar2 = cVar2.f174834h0;
                        ite.a aVar4 = cVar2.f174832g;
                        gte.a aVarB = aVar4.b();
                        s.j(aVarB);
                        builderBuilderWithExpectedSize.addAll((Iterable) u.p(bVar, bVar2, aVarB));
                        rje.e eVar = new rje.e(new wqi.a());
                        n nVarE = cVar2.e();
                        pak.h hVar = new pak.h((vje.a) cVar2.i0.get());
                        gte.a aVarB2 = aVar4.b();
                        s.j(aVarB2);
                        builderBuilderWithExpectedSize.add(new ake.b(new uje.a(eVar, nVarE, hVar, aVarB2)));
                        return new h(new j(builderBuilderWithExpectedSize.build()), aVar3.f174819a);
                    default:
                        KProperty[] kPropertyArr3 = CryptoAccountPickerScreen.R;
                        CryptoAccountPickerScreen cryptoAccountPickerScreen2 = this.f24818b;
                        return dli.f.a(cryptoAccountPickerScreen2, (h) cryptoAccountPickerScreen2.N.getValue(), v.k(cryptoAccountPickerScreen2.P, new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: cke.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAccountPickerScreen f24818b;

            {
                this.f24818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoAccountPickerScreen cryptoAccountPickerScreen = this.f24818b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoAccountPickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoAccountPickerScreen.m2()).a().get(aje.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", aje.a.class, " is not found"));
                        }
                        jje.c cVar = ((jje.c) aVar2.b()).V;
                        CryptoAccountPickerScreenContract$InputData cryptoAccountPickerScreenContract$InputData = cryptoAccountPickerScreen.K;
                        cryptoAccountPickerScreenContract$InputData.getClass();
                        return new jje.a(cVar, cryptoAccountPickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoAccountPickerScreen.R;
                        jje.a aVar3 = (jje.a) ((dke.a) cryptoAccountPickerScreen.M.getValue());
                        aVar3.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
                        jje.c cVar2 = aVar3.f174820b;
                        d16.b bVar = cVar2.f174844t;
                        ix5.b bVar2 = cVar2.f174834h0;
                        ite.a aVar4 = cVar2.f174832g;
                        gte.a aVarB = aVar4.b();
                        s.j(aVarB);
                        builderBuilderWithExpectedSize.addAll((Iterable) u.p(bVar, bVar2, aVarB));
                        rje.e eVar = new rje.e(new wqi.a());
                        n nVarE = cVar2.e();
                        pak.h hVar = new pak.h((vje.a) cVar2.i0.get());
                        gte.a aVarB2 = aVar4.b();
                        s.j(aVarB2);
                        builderBuilderWithExpectedSize.add(new ake.b(new uje.a(eVar, nVarE, hVar, aVarB2)));
                        return new h(new j(builderBuilderWithExpectedSize.build()), aVar3.f174819a);
                    default:
                        KProperty[] kPropertyArr3 = CryptoAccountPickerScreen.R;
                        CryptoAccountPickerScreen cryptoAccountPickerScreen2 = this.f24818b;
                        return dli.f.a(cryptoAccountPickerScreen2, (h) cryptoAccountPickerScreen2.N.getValue(), v.k(cryptoAccountPickerScreen2.P, new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: cke.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAccountPickerScreen f24818b;

            {
                this.f24818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoAccountPickerScreen cryptoAccountPickerScreen = this.f24818b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoAccountPickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoAccountPickerScreen.m2()).a().get(aje.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", aje.a.class, " is not found"));
                        }
                        jje.c cVar = ((jje.c) aVar2.b()).V;
                        CryptoAccountPickerScreenContract$InputData cryptoAccountPickerScreenContract$InputData = cryptoAccountPickerScreen.K;
                        cryptoAccountPickerScreenContract$InputData.getClass();
                        return new jje.a(cVar, cryptoAccountPickerScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoAccountPickerScreen.R;
                        jje.a aVar3 = (jje.a) ((dke.a) cryptoAccountPickerScreen.M.getValue());
                        aVar3.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
                        jje.c cVar2 = aVar3.f174820b;
                        d16.b bVar = cVar2.f174844t;
                        ix5.b bVar2 = cVar2.f174834h0;
                        ite.a aVar4 = cVar2.f174832g;
                        gte.a aVarB = aVar4.b();
                        s.j(aVarB);
                        builderBuilderWithExpectedSize.addAll((Iterable) u.p(bVar, bVar2, aVarB));
                        rje.e eVar = new rje.e(new wqi.a());
                        n nVarE = cVar2.e();
                        pak.h hVar = new pak.h((vje.a) cVar2.i0.get());
                        gte.a aVarB2 = aVar4.b();
                        s.j(aVarB2);
                        builderBuilderWithExpectedSize.add(new ake.b(new uje.a(eVar, nVarE, hVar, aVarB2)));
                        return new h(new j(builderBuilderWithExpectedSize.build()), aVar3.f174819a);
                    default:
                        KProperty[] kPropertyArr3 = CryptoAccountPickerScreen.R;
                        CryptoAccountPickerScreen cryptoAccountPickerScreen2 = this.f24818b;
                        return dli.f.a(cryptoAccountPickerScreen2, (h) cryptoAccountPickerScreen2.N.getValue(), v.k(cryptoAccountPickerScreen2.P, new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        this.Q = R$layout.screen_recycler_navbar;
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (dke.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (cke.h) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setExpanded(false, false);
        navBarWithToolbar.j0(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, new c(rd0.e.b(this.P.f53218h), 9), new j(this, continuation, 1), 3);
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new i(this, continuation, 21), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
