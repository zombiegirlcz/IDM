package com.revolut.feature.apm.breb.impl.ui.keys;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.i;
import aw1.c;
import aw1.d;
import aw1.f;
import aw1.l;
import aw1.m;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.apm.breb.impl.ui.keys.BrebKeysScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import nv1.j;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ui/keys/BrebKeysScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Law1/l;", "Ldli/a;", "Law1/n;", "<init>", "()V", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrebKeysScreen extends ViewController<l> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BrebKeysScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_bottomsheet;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final Object N = w.y0(new aw1.a(0));
    public final Object O = w.y0(new aw1.a(1));
    public final Object P;
    public final Object Q;
    public final Object R;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, n.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return n.a(p0);
        }
    }

    public BrebKeysScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: aw1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebKeysScreen f10651b;

            {
                this.f10651b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BrebKeysScreen brebKeysScreen = this.f10651b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BrebKeysScreen.S;
                        BrebKeysScreen brebKeysScreen2 = this.f10651b;
                        return dli.f.a(brebKeysScreen2, brebKeysScreen2.R2(), v.k((RowDelegate) brebKeysScreen2.N.getValue(), (FullScreenStateDelegate) brebKeysScreen2.O.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BrebKeysScreen.S;
                        qji.b bVarU2 = brebKeysScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.keys.di.BrebKeysScreenInjector");
                        nv1.e eVar = (nv1.e) bVarU2;
                        return new nv1.j(eVar.f219389b, eVar.f219390c);
                    default:
                        KProperty[] kPropertyArr3 = BrebKeysScreen.S;
                        return (m) ((nv1.j) brebKeysScreen.Q.getValue()).f219421c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: aw1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebKeysScreen f10651b;

            {
                this.f10651b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BrebKeysScreen brebKeysScreen = this.f10651b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebKeysScreen.S;
                        BrebKeysScreen brebKeysScreen2 = this.f10651b;
                        return dli.f.a(brebKeysScreen2, brebKeysScreen2.R2(), v.k((RowDelegate) brebKeysScreen2.N.getValue(), (FullScreenStateDelegate) brebKeysScreen2.O.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BrebKeysScreen.S;
                        qji.b bVarU2 = brebKeysScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.keys.di.BrebKeysScreenInjector");
                        nv1.e eVar = (nv1.e) bVarU2;
                        return new nv1.j(eVar.f219389b, eVar.f219390c);
                    default:
                        KProperty[] kPropertyArr3 = BrebKeysScreen.S;
                        return (m) ((nv1.j) brebKeysScreen.Q.getValue()).f219421c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: aw1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebKeysScreen f10651b;

            {
                this.f10651b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BrebKeysScreen brebKeysScreen = this.f10651b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebKeysScreen.S;
                        BrebKeysScreen brebKeysScreen2 = this.f10651b;
                        return dli.f.a(brebKeysScreen2, brebKeysScreen2.R2(), v.k((RowDelegate) brebKeysScreen2.N.getValue(), (FullScreenStateDelegate) brebKeysScreen2.O.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BrebKeysScreen.S;
                        qji.b bVarU2 = brebKeysScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.keys.di.BrebKeysScreenInjector");
                        nv1.e eVar = (nv1.e) bVarU2;
                        return new nv1.j(eVar.f219389b, eVar.f219390c);
                    default:
                        KProperty[] kPropertyArr3 = BrebKeysScreen.S;
                        return (m) ((nv1.j) brebKeysScreen.Q.getValue()).f219421c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        aw1.n uiState = (aw1.n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f10659b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), null, new c(this, null), 3);
        ?? r62 = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r62.getValue()).f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r62.getValue()).k), null, new aw1.e(this, null), 3);
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((n) value).f174542b.E), null, new i(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r62.getValue()).f53220l), null, new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final m R2() {
        return (m) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
