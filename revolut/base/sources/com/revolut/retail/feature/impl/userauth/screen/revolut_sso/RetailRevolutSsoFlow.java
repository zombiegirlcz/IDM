package com.revolut.retail.feature.impl.userauth.screen.revolut_sso;

import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.RetailRevolutSsoFlow;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.RetailRevolutSsoFlowContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.f;
import ywj.g;
import ywj.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lywj/h;", "Lyki/f;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RetailRevolutSsoFlow extends ViewController<h> implements f {
    public final RetailRevolutSsoFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public RetailRevolutSsoFlow(RetailRevolutSsoFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ywj.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RetailRevolutSsoFlow f317474b;

            {
                this.f317474b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        RetailRevolutSsoFlow retailRevolutSsoFlow = this.f317474b;
                        phm.a aVar = (phm.a) ue0.e.j(retailRevolutSsoFlow.m2()).a().get(e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", e.class, " is not found"));
                        }
                        b bVar = ((b) aVar2.b()).o;
                        RetailRevolutSsoFlowContract$InputData retailRevolutSsoFlowContract$InputData = retailRevolutSsoFlow.K;
                        retailRevolutSsoFlowContract$InputData.getClass();
                        return new c(bVar, retailRevolutSsoFlowContract$InputData);
                    case 1:
                        return (g) ((c) this.f317474b.M.getValue()).f317462b.get();
                    default:
                        RetailRevolutSsoFlow retailRevolutSsoFlow2 = this.f317474b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, retailRevolutSsoFlow2, (g) retailRevolutSsoFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ywj.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RetailRevolutSsoFlow f317474b;

            {
                this.f317474b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        RetailRevolutSsoFlow retailRevolutSsoFlow = this.f317474b;
                        phm.a aVar = (phm.a) ue0.e.j(retailRevolutSsoFlow.m2()).a().get(e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", e.class, " is not found"));
                        }
                        b bVar = ((b) aVar2.b()).o;
                        RetailRevolutSsoFlowContract$InputData retailRevolutSsoFlowContract$InputData = retailRevolutSsoFlow.K;
                        retailRevolutSsoFlowContract$InputData.getClass();
                        return new c(bVar, retailRevolutSsoFlowContract$InputData);
                    case 1:
                        return (g) ((c) this.f317474b.M.getValue()).f317462b.get();
                    default:
                        RetailRevolutSsoFlow retailRevolutSsoFlow2 = this.f317474b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, retailRevolutSsoFlow2, (g) retailRevolutSsoFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: ywj.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RetailRevolutSsoFlow f317474b;

            {
                this.f317474b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        RetailRevolutSsoFlow retailRevolutSsoFlow = this.f317474b;
                        phm.a aVar = (phm.a) ue0.e.j(retailRevolutSsoFlow.m2()).a().get(e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", e.class, " is not found"));
                        }
                        b bVar = ((b) aVar2.b()).o;
                        RetailRevolutSsoFlowContract$InputData retailRevolutSsoFlowContract$InputData = retailRevolutSsoFlow.K;
                        retailRevolutSsoFlowContract$InputData.getClass();
                        return new c(bVar, retailRevolutSsoFlowContract$InputData);
                    case 1:
                        return (g) ((c) this.f317474b.M.getValue()).f317462b.get();
                    default:
                        RetailRevolutSsoFlow retailRevolutSsoFlow2 = this.f317474b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, retailRevolutSsoFlow2, (g) retailRevolutSsoFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ywj.c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (ywj.c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
