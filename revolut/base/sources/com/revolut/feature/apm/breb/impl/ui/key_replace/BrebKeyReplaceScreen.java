package com.revolut.feature.apm.breb.impl.ui.key_replace;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.apm.breb.impl.ui.key_replace.BrebKeyReplaceScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.n;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nv1.i;
import te0.w;
import vc.s;
import yk6.m;
import yui.d;
import yv1.b;
import yv1.c;
import yv1.e;
import yv1.h;
import yv1.j;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ui/key_replace/BrebKeyReplaceScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyv1/h;", "Ldli/a;", "Lyv1/j;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrebKeyReplaceScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BrebKeyReplaceScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final e K;
    public final int L;
    public final boolean M;
    public final ao.h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public BrebKeyReplaceScreen(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = true;
        this.N = s.t(this, b.f);
        this.O = w.y0(new d(1));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: yv1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebKeyReplaceScreen f317083b;

            {
                this.f317083b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BrebKeyReplaceScreen brebKeyReplaceScreen = this.f317083b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BrebKeyReplaceScreen.S;
                        BrebKeyReplaceScreen brebKeyReplaceScreen2 = this.f317083b;
                        return dli.f.a(brebKeyReplaceScreen2, (i) brebKeyReplaceScreen2.R.getValue(), v.k((RowDelegate) brebKeyReplaceScreen2.O.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BrebKeyReplaceScreen.S;
                        qji.b bVarU2 = brebKeyReplaceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.key_replace.di.BrebKeyReplaceScreenInjector");
                        nv1.e eVar = (nv1.e) bVarU2;
                        nv1.g gVar = eVar.f219389b;
                        nv1.e eVar2 = eVar.f219390c;
                        e eVar3 = brebKeyReplaceScreen.K;
                        eVar3.getClass();
                        return new nv1.i(gVar, eVar2, eVar3);
                    default:
                        KProperty[] kPropertyArr3 = BrebKeyReplaceScreen.S;
                        return (i) ((nv1.i) brebKeyReplaceScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: yv1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebKeyReplaceScreen f317083b;

            {
                this.f317083b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BrebKeyReplaceScreen brebKeyReplaceScreen = this.f317083b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebKeyReplaceScreen.S;
                        BrebKeyReplaceScreen brebKeyReplaceScreen2 = this.f317083b;
                        return dli.f.a(brebKeyReplaceScreen2, (i) brebKeyReplaceScreen2.R.getValue(), v.k((RowDelegate) brebKeyReplaceScreen2.O.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BrebKeyReplaceScreen.S;
                        qji.b bVarU2 = brebKeyReplaceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.key_replace.di.BrebKeyReplaceScreenInjector");
                        nv1.e eVar = (nv1.e) bVarU2;
                        nv1.g gVar = eVar.f219389b;
                        nv1.e eVar2 = eVar.f219390c;
                        e eVar3 = brebKeyReplaceScreen.K;
                        eVar3.getClass();
                        return new nv1.i(gVar, eVar2, eVar3);
                    default:
                        KProperty[] kPropertyArr3 = BrebKeyReplaceScreen.S;
                        return (i) ((nv1.i) brebKeyReplaceScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: yv1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebKeyReplaceScreen f317083b;

            {
                this.f317083b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BrebKeyReplaceScreen brebKeyReplaceScreen = this.f317083b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebKeyReplaceScreen.S;
                        BrebKeyReplaceScreen brebKeyReplaceScreen2 = this.f317083b;
                        return dli.f.a(brebKeyReplaceScreen2, (i) brebKeyReplaceScreen2.R.getValue(), v.k((RowDelegate) brebKeyReplaceScreen2.O.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BrebKeyReplaceScreen.S;
                        qji.b bVarU2 = brebKeyReplaceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.key_replace.di.BrebKeyReplaceScreenInjector");
                        nv1.e eVar = (nv1.e) bVarU2;
                        nv1.g gVar = eVar.f219389b;
                        nv1.e eVar2 = eVar.f219390c;
                        e eVar3 = brebKeyReplaceScreen.K;
                        eVar3.getClass();
                        return new nv1.i(gVar, eVar2, eVar3);
                    default:
                        KProperty[] kPropertyArr3 = BrebKeyReplaceScreen.S;
                        return (i) ((nv1.i) brebKeyReplaceScreen.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f317091b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (yv1.i) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((n) value).f174542b.E), null, new m(this, (Continuation) null, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.O.getValue()).f53220l), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
