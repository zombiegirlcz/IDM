package com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile;

import aii.q;
import com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.JuniorCardProfileFlow;
import com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.JuniorCardProfileFlowContract$Input;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yi8.c;
import yki.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_payment_links/impl/ui/flow/card_profile/JuniorCardProfileFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_junior_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorCardProfileFlow extends ViewController<q> implements f {
    public final JuniorCardProfileFlowContract$Input K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public JuniorCardProfileFlow(JuniorCardProfileFlowContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: yi8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorCardProfileFlow f314265b;

            {
                this.f314265b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        JuniorCardProfileFlow juniorCardProfileFlow = this.f314265b;
                        phm.a aVar = (phm.a) ue0.e.j(juniorCardProfileFlow.m2()).a().get(wi8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", wi8.e.class, " is not found"));
                        }
                        wi8.e eVar = ((wi8.e) aVar2.b()).f297851h;
                        JuniorCardProfileFlowContract$Input juniorCardProfileFlowContract$Input = juniorCardProfileFlow.K;
                        juniorCardProfileFlowContract$Input.getClass();
                        return new wi8.a(eVar, juniorCardProfileFlowContract$Input);
                    case 1:
                        return (c) ((wi8.a) this.f314265b.M.getValue()).d.get();
                    default:
                        JuniorCardProfileFlow juniorCardProfileFlow2 = this.f314265b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, juniorCardProfileFlow2, (c) juniorCardProfileFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: yi8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorCardProfileFlow f314265b;

            {
                this.f314265b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        JuniorCardProfileFlow juniorCardProfileFlow = this.f314265b;
                        phm.a aVar = (phm.a) ue0.e.j(juniorCardProfileFlow.m2()).a().get(wi8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", wi8.e.class, " is not found"));
                        }
                        wi8.e eVar = ((wi8.e) aVar2.b()).f297851h;
                        JuniorCardProfileFlowContract$Input juniorCardProfileFlowContract$Input = juniorCardProfileFlow.K;
                        juniorCardProfileFlowContract$Input.getClass();
                        return new wi8.a(eVar, juniorCardProfileFlowContract$Input);
                    case 1:
                        return (c) ((wi8.a) this.f314265b.M.getValue()).d.get();
                    default:
                        JuniorCardProfileFlow juniorCardProfileFlow2 = this.f314265b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, juniorCardProfileFlow2, (c) juniorCardProfileFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: yi8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorCardProfileFlow f314265b;

            {
                this.f314265b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        JuniorCardProfileFlow juniorCardProfileFlow = this.f314265b;
                        phm.a aVar = (phm.a) ue0.e.j(juniorCardProfileFlow.m2()).a().get(wi8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", wi8.e.class, " is not found"));
                        }
                        wi8.e eVar = ((wi8.e) aVar2.b()).f297851h;
                        JuniorCardProfileFlowContract$Input juniorCardProfileFlowContract$Input = juniorCardProfileFlow.K;
                        juniorCardProfileFlowContract$Input.getClass();
                        return new wi8.a(eVar, juniorCardProfileFlowContract$Input);
                    case 1:
                        return (c) ((wi8.a) this.f314265b.M.getValue()).d.get();
                    default:
                        JuniorCardProfileFlow juniorCardProfileFlow2 = this.f314265b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, juniorCardProfileFlow2, (c) juniorCardProfileFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (wi8.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (wi8.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b h3() {
        return (c) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
