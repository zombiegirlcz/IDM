package com.revolut.feature.junior.isa.impl.ui.trading_account_picker.flow;

import com.revolut.feature.junior.isa.impl.ui.trading_account_picker.flow.JuniorTradingAccountPickerFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import qji.b;
import t98.d;
import te0.w;
import ue0.e;
import x98.o;
import x98.p;
import yki.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/trading_account_picker/flow/JuniorTradingAccountPickerFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lt98/d;", "Lyki/f;", "<init>", "()V", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorTradingAccountPickerFlow extends ViewController<d> implements f {
    public final int K = R$layout.screen_transparent;
    public final Object L;
    public final Object M;
    public final Object N;

    public JuniorTradingAccountPickerFlow() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: xa8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorTradingAccountPickerFlow f303781b;

            {
                this.f303781b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        JuniorTradingAccountPickerFlow juniorTradingAccountPickerFlow = this.f303781b;
                        return c.d(R$id.screen_transparent_container, 4, null, juniorTradingAccountPickerFlow, (b) juniorTradingAccountPickerFlow.N.getValue());
                    case 1:
                        phm.a aVar = (phm.a) e.j(this.f303781b.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new p(((o) aVar2.b()).f303638q);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                    default:
                        return (b) ((p) this.f303781b.M.getValue()).f303640b.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: xa8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorTradingAccountPickerFlow f303781b;

            {
                this.f303781b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        JuniorTradingAccountPickerFlow juniorTradingAccountPickerFlow = this.f303781b;
                        return c.d(R$id.screen_transparent_container, 4, null, juniorTradingAccountPickerFlow, (b) juniorTradingAccountPickerFlow.N.getValue());
                    case 1:
                        phm.a aVar = (phm.a) e.j(this.f303781b.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new p(((o) aVar2.b()).f303638q);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                    default:
                        return (b) ((p) this.f303781b.M.getValue()).f303640b.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: xa8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorTradingAccountPickerFlow f303781b;

            {
                this.f303781b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        JuniorTradingAccountPickerFlow juniorTradingAccountPickerFlow = this.f303781b;
                        return c.d(R$id.screen_transparent_container, 4, null, juniorTradingAccountPickerFlow, (b) juniorTradingAccountPickerFlow.N.getValue());
                    case 1:
                        phm.a aVar = (phm.a) e.j(this.f303781b.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new p(((o) aVar2.b()).f303638q);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                    default:
                        return (b) ((p) this.f303781b.M.getValue()).f303640b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (p) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (xa8.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
