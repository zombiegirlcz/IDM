package com.revolut.feature.apm.breb.impl.ui.more;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.breb.impl.ui.more.BrebMoreScreen;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ew1.b;
import ew1.c;
import ew1.d;
import ew1.i;
import ew1.j;
import ew1.k;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ui/more/BrebMoreScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lew1/i;", "Ldli/a;", "Lew1/k;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrebMoreScreen extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(BrebMoreScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final Alias K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public BrebMoreScreen(Alias alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.K = alias;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = true;
        this.N = s.t(this, b.f);
        this.O = w.y0(new euf.a(6));
        this.P = w.y0(new euf.a(7));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: ew1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebMoreScreen f129985b;

            {
                this.f129985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BrebMoreScreen brebMoreScreen = this.f129985b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BrebMoreScreen.T;
                        BrebMoreScreen brebMoreScreen2 = this.f129985b;
                        return dli.f.a(brebMoreScreen2, (j) brebMoreScreen2.S.getValue(), v.k((RowDelegate) brebMoreScreen2.P.getValue(), (PlainTextWarningDelegate) brebMoreScreen2.O.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BrebMoreScreen.T;
                        qji.b bVarU2 = brebMoreScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.more.di.BrebMoreScreenInjector");
                        nv1.e eVar = (nv1.e) bVarU2;
                        nv1.g gVar = eVar.f219389b;
                        nv1.e eVar2 = eVar.f219390c;
                        Alias alias2 = brebMoreScreen.K;
                        alias2.getClass();
                        return new nv1.k(gVar, eVar2, alias2);
                    default:
                        KProperty[] kPropertyArr3 = BrebMoreScreen.T;
                        return (j) ((nv1.k) brebMoreScreen.R.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: ew1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebMoreScreen f129985b;

            {
                this.f129985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BrebMoreScreen brebMoreScreen = this.f129985b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebMoreScreen.T;
                        BrebMoreScreen brebMoreScreen2 = this.f129985b;
                        return dli.f.a(brebMoreScreen2, (j) brebMoreScreen2.S.getValue(), v.k((RowDelegate) brebMoreScreen2.P.getValue(), (PlainTextWarningDelegate) brebMoreScreen2.O.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BrebMoreScreen.T;
                        qji.b bVarU2 = brebMoreScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.more.di.BrebMoreScreenInjector");
                        nv1.e eVar = (nv1.e) bVarU2;
                        nv1.g gVar = eVar.f219389b;
                        nv1.e eVar2 = eVar.f219390c;
                        Alias alias2 = brebMoreScreen.K;
                        alias2.getClass();
                        return new nv1.k(gVar, eVar2, alias2);
                    default:
                        KProperty[] kPropertyArr3 = BrebMoreScreen.T;
                        return (j) ((nv1.k) brebMoreScreen.R.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: ew1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebMoreScreen f129985b;

            {
                this.f129985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BrebMoreScreen brebMoreScreen = this.f129985b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebMoreScreen.T;
                        BrebMoreScreen brebMoreScreen2 = this.f129985b;
                        return dli.f.a(brebMoreScreen2, (j) brebMoreScreen2.S.getValue(), v.k((RowDelegate) brebMoreScreen2.P.getValue(), (PlainTextWarningDelegate) brebMoreScreen2.O.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BrebMoreScreen.T;
                        qji.b bVarU2 = brebMoreScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.more.di.BrebMoreScreenInjector");
                        nv1.e eVar = (nv1.e) bVarU2;
                        nv1.g gVar = eVar.f219389b;
                        nv1.e eVar2 = eVar.f219390c;
                        Alias alias2 = brebMoreScreen.K;
                        alias2.getClass();
                        return new nv1.k(gVar, eVar2, alias2);
                    default:
                        KProperty[] kPropertyArr3 = BrebMoreScreen.T;
                        return (j) ((nv1.k) brebMoreScreen.R.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f129993b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (nv1.k) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PlainTextWarningDelegate) this.O.getValue()).d.f121375b), null, new d(this, null, 0), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
