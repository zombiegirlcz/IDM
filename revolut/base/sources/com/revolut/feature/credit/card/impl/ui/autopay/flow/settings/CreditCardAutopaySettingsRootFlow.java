package com.revolut.feature.credit.card.impl.ui.autopay.flow.settings;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsRootFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import in0.g;
import jm4.a3;
import jm4.j0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import ss4.h;
import t9l.f;
import te0.w;
import uki.c;
import vkm.d;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsRootFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Luki/c;", "Lin0/g;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardAutopaySettingsRootFlow extends ViewController<q> implements c, g {
    public static final /* synthetic */ int S = 0;
    public final CreditCardAutopaySettingsFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public CreditCardAutopaySettingsRootFlow(CreditCardAutopaySettingsFlowContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: tp4.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardAutopaySettingsRootFlow f273283b;

            {
                this.f273283b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (j60.a) ((j0) this.f273283b.Q.getValue()).f.get();
                    case 1:
                        CreditCardAutopaySettingsRootFlow creditCardAutopaySettingsRootFlow = this.f273283b;
                        return czi.c.a(R$id.screen_transparent_container, (b) creditCardAutopaySettingsRootFlow.R.getValue(), creditCardAutopaySettingsRootFlow);
                    case 2:
                        CreditCardAutopaySettingsRootFlow creditCardAutopaySettingsRootFlow2 = this.f273283b;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardAutopaySettingsRootFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardAutopaySettingsFlowContract$InputData creditCardAutopaySettingsFlowContract$InputData = creditCardAutopaySettingsRootFlow2.K;
                        creditCardAutopaySettingsFlowContract$InputData.getClass();
                        return new j0(a3Var, creditCardAutopaySettingsRootFlow2, creditCardAutopaySettingsFlowContract$InputData);
                    default:
                        return (b) ((j0) this.f273283b.Q.getValue()).f176147h.get();
                }
            }
        });
        this.M = w.y0(new tl7.a(9));
        this.N = w.y0(new tl7.a(10));
        this.O = R$layout.screen_transparent;
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: tp4.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardAutopaySettingsRootFlow f273283b;

            {
                this.f273283b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (j60.a) ((j0) this.f273283b.Q.getValue()).f.get();
                    case 1:
                        CreditCardAutopaySettingsRootFlow creditCardAutopaySettingsRootFlow = this.f273283b;
                        return czi.c.a(R$id.screen_transparent_container, (b) creditCardAutopaySettingsRootFlow.R.getValue(), creditCardAutopaySettingsRootFlow);
                    case 2:
                        CreditCardAutopaySettingsRootFlow creditCardAutopaySettingsRootFlow2 = this.f273283b;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardAutopaySettingsRootFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardAutopaySettingsFlowContract$InputData creditCardAutopaySettingsFlowContract$InputData = creditCardAutopaySettingsRootFlow2.K;
                        creditCardAutopaySettingsFlowContract$InputData.getClass();
                        return new j0(a3Var, creditCardAutopaySettingsRootFlow2, creditCardAutopaySettingsFlowContract$InputData);
                    default:
                        return (b) ((j0) this.f273283b.Q.getValue()).f176147h.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: tp4.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardAutopaySettingsRootFlow f273283b;

            {
                this.f273283b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (j60.a) ((j0) this.f273283b.Q.getValue()).f.get();
                    case 1:
                        CreditCardAutopaySettingsRootFlow creditCardAutopaySettingsRootFlow = this.f273283b;
                        return czi.c.a(R$id.screen_transparent_container, (b) creditCardAutopaySettingsRootFlow.R.getValue(), creditCardAutopaySettingsRootFlow);
                    case 2:
                        CreditCardAutopaySettingsRootFlow creditCardAutopaySettingsRootFlow2 = this.f273283b;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardAutopaySettingsRootFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardAutopaySettingsFlowContract$InputData creditCardAutopaySettingsFlowContract$InputData = creditCardAutopaySettingsRootFlow2.K;
                        creditCardAutopaySettingsFlowContract$InputData.getClass();
                        return new j0(a3Var, creditCardAutopaySettingsRootFlow2, creditCardAutopaySettingsFlowContract$InputData);
                    default:
                        return (b) ((j0) this.f273283b.Q.getValue()).f176147h.get();
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: tp4.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardAutopaySettingsRootFlow f273283b;

            {
                this.f273283b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return (j60.a) ((j0) this.f273283b.Q.getValue()).f.get();
                    case 1:
                        CreditCardAutopaySettingsRootFlow creditCardAutopaySettingsRootFlow = this.f273283b;
                        return czi.c.a(R$id.screen_transparent_container, (b) creditCardAutopaySettingsRootFlow.R.getValue(), creditCardAutopaySettingsRootFlow);
                    case 2:
                        CreditCardAutopaySettingsRootFlow creditCardAutopaySettingsRootFlow2 = this.f273283b;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardAutopaySettingsRootFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardAutopaySettingsFlowContract$InputData creditCardAutopaySettingsFlowContract$InputData = creditCardAutopaySettingsRootFlow2.K;
                        creditCardAutopaySettingsFlowContract$InputData.getClass();
                        return new j0(a3Var, creditCardAutopaySettingsRootFlow2, creditCardAutopaySettingsFlowContract$InputData);
                    default:
                        return (b) ((j0) this.f273283b.Q.getValue()).f176147h.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j0) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (j0) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (tp4.b) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.L.getValue()).d(v.k((RowDelegate) this.M.getValue(), (TwinHorizontalButtonDelegate) this.N.getValue()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d dVarB = rd0.e.b(((RowDelegate) this.M.getValue()).f53218h);
        ?? r06 = this.N;
        com.revolut.kompot.navigable.a.g2(this, new h(vkm.q.J(dVarB, new f(rd0.e.b(((TwinHorizontalButtonDelegate) r06.getValue()).f53572c.f121375b), 14), new f(rd0.e.b(((TwinHorizontalButtonDelegate) r06.getValue()).d.f121375b), 15)), yx4.b.Companion, 1), null, new ryj.f(2, (tp4.b) this.R.getValue(), tp4.b.class, "onItemClicked", "onItemClicked(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 23), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.P.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.P.getValue();
    }
}
