package com.revolut.feature.check_topup.impl.ui_kompot.screen.scan;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.check_topup.impl.R$string;
import com.revolut.feature.check_topup.impl.ui_kompot.screen.scan.CheckTopUpScanScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import hg3.b;
import hg3.c;
import hg3.d;
import hg3.f;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import yf3.g;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/check_topup/impl/ui_kompot/screen/scan/CheckTopUpScanScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lhg3/d;", "feature_check_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CheckTopUpScanScreen extends ViewController<Object> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CheckTopUpScanScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final b K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public CheckTopUpScanScreen(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, f.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: hg3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckTopUpScanScreen f152082b;

            {
                this.f152082b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CheckTopUpScanScreen checkTopUpScanScreen = this.f152082b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CheckTopUpScanScreen.Q;
                        CheckTopUpScanScreen checkTopUpScanScreen2 = this.f152082b;
                        return dli.f.a(checkTopUpScanScreen2, (c) checkTopUpScanScreen2.P.getValue(), f0.f322471a, R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CheckTopUpScanScreen.Q;
                        qji.b bVarU2 = checkTopUpScanScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.check_topup.impl.ui_kompot.screen.scan.di.CheckTopUpScanScreenInjector");
                        yf3.e eVar = (yf3.e) bVarU2;
                        yf3.c cVar = eVar.f313164b;
                        yf3.e eVar2 = eVar.f313165c;
                        b bVar = checkTopUpScanScreen.K;
                        bVar.getClass();
                        return new yf3.g(cVar, eVar2, bVar);
                    default:
                        KProperty[] kPropertyArr3 = CheckTopUpScanScreen.Q;
                        return (c) ((yf3.g) checkTopUpScanScreen.O.getValue()).f313169b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: hg3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckTopUpScanScreen f152082b;

            {
                this.f152082b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CheckTopUpScanScreen checkTopUpScanScreen = this.f152082b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CheckTopUpScanScreen.Q;
                        CheckTopUpScanScreen checkTopUpScanScreen2 = this.f152082b;
                        return dli.f.a(checkTopUpScanScreen2, (c) checkTopUpScanScreen2.P.getValue(), f0.f322471a, R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CheckTopUpScanScreen.Q;
                        qji.b bVarU2 = checkTopUpScanScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.check_topup.impl.ui_kompot.screen.scan.di.CheckTopUpScanScreenInjector");
                        yf3.e eVar = (yf3.e) bVarU2;
                        yf3.c cVar = eVar.f313164b;
                        yf3.e eVar2 = eVar.f313165c;
                        b bVar = checkTopUpScanScreen.K;
                        bVar.getClass();
                        return new yf3.g(cVar, eVar2, bVar);
                    default:
                        KProperty[] kPropertyArr3 = CheckTopUpScanScreen.Q;
                        return (c) ((yf3.g) checkTopUpScanScreen.O.getValue()).f313169b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: hg3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckTopUpScanScreen f152082b;

            {
                this.f152082b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CheckTopUpScanScreen checkTopUpScanScreen = this.f152082b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CheckTopUpScanScreen.Q;
                        CheckTopUpScanScreen checkTopUpScanScreen2 = this.f152082b;
                        return dli.f.a(checkTopUpScanScreen2, (c) checkTopUpScanScreen2.P.getValue(), f0.f322471a, R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CheckTopUpScanScreen.Q;
                        qji.b bVarU2 = checkTopUpScanScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.check_topup.impl.ui_kompot.screen.scan.di.CheckTopUpScanScreenInjector");
                        yf3.e eVar = (yf3.e) bVarU2;
                        yf3.c cVar = eVar.f313164b;
                        yf3.e eVar2 = eVar.f313165c;
                        b bVar = checkTopUpScanScreen.K;
                        bVar.getClass();
                        return new yf3.g(cVar, eVar2, bVar);
                    default:
                        KProperty[] kPropertyArr3 = CheckTopUpScanScreen.Q;
                        return (c) ((yf3.g) checkTopUpScanScreen.O.getValue()).f313169b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174564b.setText(new TextLocalisedClause(R$string.topup_check_confirmation_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new hg3.g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new hg3.g(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
