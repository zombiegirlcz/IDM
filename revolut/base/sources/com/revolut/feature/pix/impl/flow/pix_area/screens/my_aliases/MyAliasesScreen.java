package com.revolut.feature.pix.impl.flow.pix_area.screens.my_aliases;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pix.impl.flow.pix_area.screens.my_aliases.MyAliasesScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.my_aliases.MyAliasesScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import p8a.f1;
import t9l.f;
import taa.b;
import taa.d;
import taa.h;
import taa.i;
import taa.k;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/screens/my_aliases/MyAliasesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltaa/h;", "Ldli/a;", "Ltaa/i;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MyAliasesScreen extends ViewController<h> implements a, d1 {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(MyAliasesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final MyAliasesScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final ao.h P;
    public final Object Q;

    public MyAliasesScreen(MyAliasesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: taa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyAliasesScreen f269293b;

            {
                this.f269293b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MyAliasesScreen myAliasesScreen = this.f269293b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MyAliasesScreen.R;
                        qji.b bVarU2 = myAliasesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.my_aliases.di.MyAliasesScreenInjector");
                        f1 f1Var = (f1) ((uaa.b) bVarU2).b().mo3808a(myAliasesScreen);
                        MyAliasesScreenContract$InputData myAliasesScreenContract$InputData = myAliasesScreen.K;
                        switch (f1Var.f233963a) {
                            case 0:
                                myAliasesScreenContract$InputData.getClass();
                                f1Var.d = myAliasesScreenContract$InputData;
                                break;
                            default:
                                myAliasesScreenContract$InputData.getClass();
                                f1Var.d = myAliasesScreenContract$InputData;
                                break;
                        }
                        return (uaa.a) f1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = MyAliasesScreen.R;
                        return ((uaa.a) myAliasesScreen.M.getValue()).a();
                    default:
                        KProperty[] kPropertyArr3 = MyAliasesScreen.R;
                        MyAliasesScreen myAliasesScreen2 = this.f269293b;
                        return dli.f.a(myAliasesScreen2, (k) myAliasesScreen2.N.getValue(), u.c((RowDelegate) myAliasesScreen2.Q.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: taa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyAliasesScreen f269293b;

            {
                this.f269293b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MyAliasesScreen myAliasesScreen = this.f269293b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MyAliasesScreen.R;
                        qji.b bVarU2 = myAliasesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.my_aliases.di.MyAliasesScreenInjector");
                        f1 f1Var = (f1) ((uaa.b) bVarU2).b().mo3808a(myAliasesScreen);
                        MyAliasesScreenContract$InputData myAliasesScreenContract$InputData = myAliasesScreen.K;
                        switch (f1Var.f233963a) {
                            case 0:
                                myAliasesScreenContract$InputData.getClass();
                                f1Var.d = myAliasesScreenContract$InputData;
                                break;
                            default:
                                myAliasesScreenContract$InputData.getClass();
                                f1Var.d = myAliasesScreenContract$InputData;
                                break;
                        }
                        return (uaa.a) f1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = MyAliasesScreen.R;
                        return ((uaa.a) myAliasesScreen.M.getValue()).a();
                    default:
                        KProperty[] kPropertyArr3 = MyAliasesScreen.R;
                        MyAliasesScreen myAliasesScreen2 = this.f269293b;
                        return dli.f.a(myAliasesScreen2, (k) myAliasesScreen2.N.getValue(), u.c((RowDelegate) myAliasesScreen2.Q.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: taa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyAliasesScreen f269293b;

            {
                this.f269293b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MyAliasesScreen myAliasesScreen = this.f269293b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MyAliasesScreen.R;
                        qji.b bVarU2 = myAliasesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.my_aliases.di.MyAliasesScreenInjector");
                        f1 f1Var = (f1) ((uaa.b) bVarU2).b().mo3808a(myAliasesScreen);
                        MyAliasesScreenContract$InputData myAliasesScreenContract$InputData = myAliasesScreen.K;
                        switch (f1Var.f233963a) {
                            case 0:
                                myAliasesScreenContract$InputData.getClass();
                                f1Var.d = myAliasesScreenContract$InputData;
                                break;
                            default:
                                myAliasesScreenContract$InputData.getClass();
                                f1Var.d = myAliasesScreenContract$InputData;
                                break;
                        }
                        return (uaa.a) f1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = MyAliasesScreen.R;
                        return ((uaa.a) myAliasesScreen.M.getValue()).a();
                    default:
                        KProperty[] kPropertyArr3 = MyAliasesScreen.R;
                        MyAliasesScreen myAliasesScreen2 = this.f269293b;
                        return dli.f.a(myAliasesScreen2, (k) myAliasesScreen2.N.getValue(), u.c((RowDelegate) myAliasesScreen2.Q.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = w.y0(new t73.h(19));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f269300b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (uaa.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (k) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new f(rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h), 1), new d(this, null), 3);
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((n) value).f174542b.E), new t9h.b(this, null, 4), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
