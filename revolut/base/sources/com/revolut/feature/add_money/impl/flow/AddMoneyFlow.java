package com.revolut.feature.add_money.impl.flow;

import aii.q;
import com.revolut.feature.add_money.api.navigation.AddMoneyInputData;
import com.revolut.feature.add_money.impl.flow.AddMoneyFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/add_money/impl/flow/AddMoneyFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_add_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddMoneyFlow extends ViewController<q> implements f {
    public final AddMoneyInputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public AddMoneyFlow(AddMoneyInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: mh1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddMoneyFlow f205347b;

            {
                this.f205347b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AddMoneyFlow addMoneyFlow = this.f205347b;
                        phm.a aVar = (phm.a) ue0.e.j(addMoneyFlow.m2()).a().get(lh1.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lh1.a.class, " is not found"));
                        }
                        lh1.a aVar3 = ((lh1.a) aVar2.b()).i;
                        AddMoneyInputData addMoneyInputData = addMoneyFlow.K;
                        addMoneyInputData.getClass();
                        return new lh1.b(aVar3, addMoneyInputData);
                    case 1:
                        return (c) ((lh1.b) this.f205347b.L.getValue()).f195146c.get();
                    default:
                        AddMoneyFlow addMoneyFlow2 = this.f205347b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, addMoneyFlow2, (c) addMoneyFlow2.N.getValue());
                }
            }
        });
        this.M = R$layout.screen_transparent;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: mh1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddMoneyFlow f205347b;

            {
                this.f205347b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AddMoneyFlow addMoneyFlow = this.f205347b;
                        phm.a aVar = (phm.a) ue0.e.j(addMoneyFlow.m2()).a().get(lh1.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lh1.a.class, " is not found"));
                        }
                        lh1.a aVar3 = ((lh1.a) aVar2.b()).i;
                        AddMoneyInputData addMoneyInputData = addMoneyFlow.K;
                        addMoneyInputData.getClass();
                        return new lh1.b(aVar3, addMoneyInputData);
                    case 1:
                        return (c) ((lh1.b) this.f205347b.L.getValue()).f195146c.get();
                    default:
                        AddMoneyFlow addMoneyFlow2 = this.f205347b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, addMoneyFlow2, (c) addMoneyFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: mh1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddMoneyFlow f205347b;

            {
                this.f205347b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AddMoneyFlow addMoneyFlow = this.f205347b;
                        phm.a aVar = (phm.a) ue0.e.j(addMoneyFlow.m2()).a().get(lh1.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lh1.a.class, " is not found"));
                        }
                        lh1.a aVar3 = ((lh1.a) aVar2.b()).i;
                        AddMoneyInputData addMoneyInputData = addMoneyFlow.K;
                        addMoneyInputData.getClass();
                        return new lh1.b(aVar3, addMoneyInputData);
                    case 1:
                        return (c) ((lh1.b) this.f205347b.L.getValue()).f195146c.get();
                    default:
                        AddMoneyFlow addMoneyFlow2 = this.f205347b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, addMoneyFlow2, (c) addMoneyFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (lh1.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (lh1.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (mh1.c) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
