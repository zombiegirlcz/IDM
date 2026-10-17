package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_action;

import afj.g0;
import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_action.EsimMobilePlanPhoneNumberActionScreen;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;
import zlj.i;
import zlj.m;
import zlj.n;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_action/EsimMobilePlanPhoneNumberActionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzlj/i;", "Ldli/a;", "Lzlj/n;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanPhoneNumberActionScreen extends ViewController<i> implements a {
    public final Object K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public EsimMobilePlanPhoneNumberActionScreen(EsimMobilePlanPhoneNumberActionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new zj9.a(8));
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: zlj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPhoneNumberActionScreen f323286b;

            {
                this.f323286b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EsimMobilePlanPhoneNumberActionScreen esimMobilePlanPhoneNumberActionScreen = this.f323286b;
                        return dli.f.a(esimMobilePlanPhoneNumberActionScreen, (m) esimMobilePlanPhoneNumberActionScreen.O.getValue(), u.c((RowDelegate) esimMobilePlanPhoneNumberActionScreen.K.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        return (m) ((g0) this.f323286b.N.getValue()).f4253c.get();
                }
            }
        });
        this.N = w.y0(new zk7.a(this, inputData, 4));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: zlj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPhoneNumberActionScreen f323286b;

            {
                this.f323286b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        EsimMobilePlanPhoneNumberActionScreen esimMobilePlanPhoneNumberActionScreen = this.f323286b;
                        return dli.f.a(esimMobilePlanPhoneNumberActionScreen, (m) esimMobilePlanPhoneNumberActionScreen.O.getValue(), u.c((RowDelegate) esimMobilePlanPhoneNumberActionScreen.K.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        return (m) ((g0) this.f323286b.N.getValue()).f4253c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((n) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (m) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.K.getValue()).f53218h), null, new zlj.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
