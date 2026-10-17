package com.revolut.feature.apm.bills.tapi.impl.screen.transfer.transfer_breakdown;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.bills.tapi.impl.R$string;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.transfer_breakdown.TapiTransferBreakdownScreen;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.transfer_breakdown.TapiTransferBreakdownScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import cpi.b;
import cs1.c;
import cs1.g;
import cs1.j;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import rr1.d;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/bills/tapi/impl/screen/transfer/transfer_breakdown/TapiTransferBreakdownScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcs1/g;", "Ldli/a;", "Lcs1/h;", "Lno/d1;", "feature_apm_bills_tapi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TapiTransferBreakdownScreen extends ViewController<g> implements a, d1 {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TapiTransferBreakdownScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final TapiTransferBreakdownScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final Object R;

    public TapiTransferBreakdownScreen(TapiTransferBreakdownScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new b(5));
        this.M = w.y0(new b(6));
        this.N = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: cs1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TapiTransferBreakdownScreen f108430b;

            {
                this.f108430b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TapiTransferBreakdownScreen tapiTransferBreakdownScreen = this.f108430b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TapiTransferBreakdownScreen.S;
                        return (j) ((rr1.d) tapiTransferBreakdownScreen.R.getValue()).f256648c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TapiTransferBreakdownScreen.S;
                        TapiTransferBreakdownScreen tapiTransferBreakdownScreen2 = this.f108430b;
                        return dli.f.a(tapiTransferBreakdownScreen2, (j) tapiTransferBreakdownScreen2.O.getValue(), v.k((CellDetailsDelegate) tapiTransferBreakdownScreen2.L.getValue(), (CellDetailsActionDelegate) tapiTransferBreakdownScreen2.M.getValue(), new CellDetailsNoteDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = TapiTransferBreakdownScreen.S;
                        qji.b bVarU2 = tapiTransferBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.tapi.impl.screen.transfer.transfer_breakdown.di.TapiTransferBreakdownScreenInjector");
                        rr1.e eVar = (rr1.e) bVarU2;
                        rr1.a aVar = eVar.f256650b;
                        rr1.e eVar2 = eVar.f256651c;
                        TapiTransferBreakdownScreenContract$InputData tapiTransferBreakdownScreenContract$InputData = tapiTransferBreakdownScreen.K;
                        tapiTransferBreakdownScreenContract$InputData.getClass();
                        return new rr1.d(aVar, eVar2, tapiTransferBreakdownScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: cs1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TapiTransferBreakdownScreen f108430b;

            {
                this.f108430b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TapiTransferBreakdownScreen tapiTransferBreakdownScreen = this.f108430b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TapiTransferBreakdownScreen.S;
                        return (j) ((rr1.d) tapiTransferBreakdownScreen.R.getValue()).f256648c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TapiTransferBreakdownScreen.S;
                        TapiTransferBreakdownScreen tapiTransferBreakdownScreen2 = this.f108430b;
                        return dli.f.a(tapiTransferBreakdownScreen2, (j) tapiTransferBreakdownScreen2.O.getValue(), v.k((CellDetailsDelegate) tapiTransferBreakdownScreen2.L.getValue(), (CellDetailsActionDelegate) tapiTransferBreakdownScreen2.M.getValue(), new CellDetailsNoteDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = TapiTransferBreakdownScreen.S;
                        qji.b bVarU2 = tapiTransferBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.tapi.impl.screen.transfer.transfer_breakdown.di.TapiTransferBreakdownScreenInjector");
                        rr1.e eVar = (rr1.e) bVarU2;
                        rr1.a aVar = eVar.f256650b;
                        rr1.e eVar2 = eVar.f256651c;
                        TapiTransferBreakdownScreenContract$InputData tapiTransferBreakdownScreenContract$InputData = tapiTransferBreakdownScreen.K;
                        tapiTransferBreakdownScreenContract$InputData.getClass();
                        return new rr1.d(aVar, eVar2, tapiTransferBreakdownScreenContract$InputData);
                }
            }
        });
        this.Q = s.t(this, cs1.b.f);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: cs1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TapiTransferBreakdownScreen f108430b;

            {
                this.f108430b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TapiTransferBreakdownScreen tapiTransferBreakdownScreen = this.f108430b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TapiTransferBreakdownScreen.S;
                        return (j) ((rr1.d) tapiTransferBreakdownScreen.R.getValue()).f256648c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TapiTransferBreakdownScreen.S;
                        TapiTransferBreakdownScreen tapiTransferBreakdownScreen2 = this.f108430b;
                        return dli.f.a(tapiTransferBreakdownScreen2, (j) tapiTransferBreakdownScreen2.O.getValue(), v.k((CellDetailsDelegate) tapiTransferBreakdownScreen2.L.getValue(), (CellDetailsActionDelegate) tapiTransferBreakdownScreen2.M.getValue(), new CellDetailsNoteDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = TapiTransferBreakdownScreen.S;
                        qji.b bVarU2 = tapiTransferBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.tapi.impl.screen.transfer.transfer_breakdown.di.TapiTransferBreakdownScreenInjector");
                        rr1.e eVar = (rr1.e) bVarU2;
                        rr1.a aVar = eVar.f256650b;
                        rr1.e eVar2 = eVar.f256651c;
                        TapiTransferBreakdownScreenContract$InputData tapiTransferBreakdownScreenContract$InputData = tapiTransferBreakdownScreen.K;
                        tapiTransferBreakdownScreenContract$InputData.getClass();
                        return new rr1.d(aVar, eVar2, tapiTransferBreakdownScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((cs1.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.Q.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.tapi_transfer_transfer_breakdown_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        ViewController.P2(this, rd0.e.b(((CellDetailsActionDelegate) this.M.getValue()).d), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
