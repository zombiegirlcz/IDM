package com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.obligated_products;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.R$id;
import com.revolut.feature.bank_account_switching.impl.R$layout;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.obligated_products.SwitchOutObligatedProductsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vn2.b0;
import xki.e;
import zhm.v;
import zp2.b;
import zp2.c;
import zp2.g;
import zp2.i;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_out/review/obligated_products/SwitchOutObligatedProductsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzp2/g;", "Ldli/a;", "Lzp2/h;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwitchOutObligatedProductsScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(SwitchOutObligatedProductsScreen.class, "binding", "getBinding()Lcom/revolut/feature/bank_account_switching/impl/databinding/ScreenObligatedProductsBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final h N;
    public final Object O;

    public SwitchOutObligatedProductsScreen(SwitchOutObligatedProductsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_obligated_products;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: zp2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwitchOutObligatedProductsScreen f324162b;

            {
                this.f324162b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = SwitchOutObligatedProductsScreen.P;
                        SwitchOutObligatedProductsScreen switchOutObligatedProductsScreen = this.f324162b;
                        return dli.f.a(switchOutObligatedProductsScreen, (i) switchOutObligatedProductsScreen.O.getValue(), v.k(new RowDelegate(null, null, 7), new TextDelegate()), R$id.screenObligatedProducts_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = SwitchOutObligatedProductsScreen.P;
                        return (i) ((b0) this.f324162b.M.getValue()).f290649c.get();
                }
            }
        });
        this.M = w.y0(new zk7.a(this, inputData, 9));
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: zp2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwitchOutObligatedProductsScreen f324162b;

            {
                this.f324162b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SwitchOutObligatedProductsScreen.P;
                        SwitchOutObligatedProductsScreen switchOutObligatedProductsScreen = this.f324162b;
                        return dli.f.a(switchOutObligatedProductsScreen, (i) switchOutObligatedProductsScreen.O.getValue(), v.k(new RowDelegate(null, null, 7), new TextDelegate()), R$id.screenObligatedProducts_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = SwitchOutObligatedProductsScreen.P;
                        return (i) ((b0) this.f324162b.M.getValue()).f290649c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((zp2.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (i) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f264479c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.account_switch_request_review_out_obligated_products_title, null, null, 14), null, null, null, false, 30));
        d3().f264478b.setText(new TextLocalisedClause(R$string.account_switch_request_review_out_obligated_products_accept, null, null, 14));
        d3().d.setText(new TextLocalisedClause(R$string.account_switch_request_review_decline, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f264478b.o), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o), null, new c(this, null, 1), 3);
    }

    public final sn2.b d3() {
        ViewBinding value = this.N.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (sn2.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
