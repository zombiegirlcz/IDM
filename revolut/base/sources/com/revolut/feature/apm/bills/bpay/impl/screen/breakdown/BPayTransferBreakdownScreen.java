package com.revolut.feature.apm.bills.bpay.impl.screen.breakdown;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ao1.g;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.bpay.api.R$string;
import com.revolut.feature.apm.bills.bpay.impl.screen.breakdown.BPayTransferBreakdownScreen;
import com.revolut.feature.apm.bills.bpay.impl.screen.breakdown.BPayTransferBreakdownScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import il9.p;
import io1.b;
import io1.c;
import io1.e;
import io1.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/impl/screen/breakdown/BPayTransferBreakdownScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lio1/e;", "Ldli/a;", "Lio1/f;", "Lno/d1;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BPayTransferBreakdownScreen extends ViewController<e> implements a, d1 {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BPayTransferBreakdownScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final BPayTransferBreakdownScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final int P;
    public final Object Q;
    public final h R;

    public BPayTransferBreakdownScreen(BPayTransferBreakdownScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new p(9));
        this.M = w.y0(new p(10));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: io1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BPayTransferBreakdownScreen f163135b;

            {
                this.f163135b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BPayTransferBreakdownScreen bPayTransferBreakdownScreen = this.f163135b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BPayTransferBreakdownScreen.S;
                        return (g) ((ao1.g) bPayTransferBreakdownScreen.O.getValue()).f7890c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BPayTransferBreakdownScreen.S;
                        qji.b bVarU2 = bPayTransferBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.bpay.impl.screen.breakdown.di.BPayTransferBreakdownScreenInjector");
                        ao1.e eVar = (ao1.e) bVarU2;
                        ao1.d dVar = eVar.f7883b;
                        ao1.e eVar2 = eVar.f7884c;
                        BPayTransferBreakdownScreenContract$InputData bPayTransferBreakdownScreenContract$InputData = bPayTransferBreakdownScreen.K;
                        bPayTransferBreakdownScreenContract$InputData.getClass();
                        return new ao1.g(dVar, eVar2, bPayTransferBreakdownScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BPayTransferBreakdownScreen.S;
                        BPayTransferBreakdownScreen bPayTransferBreakdownScreen2 = this.f163135b;
                        return dli.f.a(bPayTransferBreakdownScreen2, (g) bPayTransferBreakdownScreen2.N.getValue(), v.k((CellDetailsDelegate) bPayTransferBreakdownScreen2.L.getValue(), (CellDetailsActionDelegate) bPayTransferBreakdownScreen2.M.getValue(), new CellDetailsNoteDelegate()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: io1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BPayTransferBreakdownScreen f163135b;

            {
                this.f163135b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BPayTransferBreakdownScreen bPayTransferBreakdownScreen = this.f163135b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BPayTransferBreakdownScreen.S;
                        return (g) ((ao1.g) bPayTransferBreakdownScreen.O.getValue()).f7890c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BPayTransferBreakdownScreen.S;
                        qji.b bVarU2 = bPayTransferBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.bpay.impl.screen.breakdown.di.BPayTransferBreakdownScreenInjector");
                        ao1.e eVar = (ao1.e) bVarU2;
                        ao1.d dVar = eVar.f7883b;
                        ao1.e eVar2 = eVar.f7884c;
                        BPayTransferBreakdownScreenContract$InputData bPayTransferBreakdownScreenContract$InputData = bPayTransferBreakdownScreen.K;
                        bPayTransferBreakdownScreenContract$InputData.getClass();
                        return new ao1.g(dVar, eVar2, bPayTransferBreakdownScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BPayTransferBreakdownScreen.S;
                        BPayTransferBreakdownScreen bPayTransferBreakdownScreen2 = this.f163135b;
                        return dli.f.a(bPayTransferBreakdownScreen2, (g) bPayTransferBreakdownScreen2.N.getValue(), v.k((CellDetailsDelegate) bPayTransferBreakdownScreen2.L.getValue(), (CellDetailsActionDelegate) bPayTransferBreakdownScreen2.M.getValue(), new CellDetailsNoteDelegate()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = R$layout.screen_bottom_sheet_list;
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: io1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BPayTransferBreakdownScreen f163135b;

            {
                this.f163135b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BPayTransferBreakdownScreen bPayTransferBreakdownScreen = this.f163135b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BPayTransferBreakdownScreen.S;
                        return (g) ((ao1.g) bPayTransferBreakdownScreen.O.getValue()).f7890c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BPayTransferBreakdownScreen.S;
                        qji.b bVarU2 = bPayTransferBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.bpay.impl.screen.breakdown.di.BPayTransferBreakdownScreenInjector");
                        ao1.e eVar = (ao1.e) bVarU2;
                        ao1.d dVar = eVar.f7883b;
                        ao1.e eVar2 = eVar.f7884c;
                        BPayTransferBreakdownScreenContract$InputData bPayTransferBreakdownScreenContract$InputData = bPayTransferBreakdownScreen.K;
                        bPayTransferBreakdownScreenContract$InputData.getClass();
                        return new ao1.g(dVar, eVar2, bPayTransferBreakdownScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BPayTransferBreakdownScreen.S;
                        BPayTransferBreakdownScreen bPayTransferBreakdownScreen2 = this.f163135b;
                        return dli.f.a(bPayTransferBreakdownScreen2, (g) bPayTransferBreakdownScreen2.N.getValue(), v.k((CellDetailsDelegate) bPayTransferBreakdownScreen2.L.getValue(), (CellDetailsActionDelegate) bPayTransferBreakdownScreen2.M.getValue(), new CellDetailsNoteDelegate()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = s.t(this, b.f);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (io1.g) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.f) value).f174519b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.pay_bills_taxes_transfer_breakdown_title, null, null, 14), null, null, null, false, 22));
        ViewController.P2(this, rd0.e.b(((CellDetailsActionDelegate) this.M.getValue()).d), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
