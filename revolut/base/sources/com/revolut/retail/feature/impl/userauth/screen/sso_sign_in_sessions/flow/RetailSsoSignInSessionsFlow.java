package com.revolut.retail.feature.impl.userauth.screen.sso_sign_in_sessions.flow;

import a0.d;
import a2d.k;
import aii.q;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.impl.userauth.R$id;
import com.revolut.retail.feature.impl.userauth.R$layout;
import com.revolut.retail.feature.impl.userauth.screen.sso_sign_in_sessions.flow.RetailSsoSignInSessionsFlow;
import cxj.b;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import no.d1;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/sso_sign_in_sessions/flow/RetailSsoSignInSessionsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "Lno/d1;", "<init>", "()V", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RetailSsoSignInSessionsFlow extends ViewController<q> implements f, d1 {
    public final Object K;
    public final int L = R$layout.flow_retail_sso_sign_in_sessions;
    public final boolean M = true;
    public final Object N;
    public final Object O;

    public RetailSsoSignInSessionsFlow() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: dxj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RetailSsoSignInSessionsFlow f120951b;

            {
                this.f120951b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f120951b.m2()).a().get(cxj.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", cxj.a.class, " is not found"));
                        }
                        cxj.a aVar3 = ((cxj.a) aVar2.b()).f109995b;
                        cxj.b bVar = new cxj.b();
                        bVar.f109996a = e4m.b.b(new k(aVar3, 29));
                        return bVar;
                    case 1:
                        return (b) ((cxj.b) this.f120951b.K.getValue()).f109996a.get();
                    default:
                        int i2 = R$id.retailSsoSignInSessions_container;
                        RetailSsoSignInSessionsFlow retailSsoSignInSessionsFlow = this.f120951b;
                        return c.d(i2, 4, null, retailSsoSignInSessionsFlow, (b) retailSsoSignInSessionsFlow.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: dxj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RetailSsoSignInSessionsFlow f120951b;

            {
                this.f120951b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f120951b.m2()).a().get(cxj.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", cxj.a.class, " is not found"));
                        }
                        cxj.a aVar3 = ((cxj.a) aVar2.b()).f109995b;
                        cxj.b bVar = new cxj.b();
                        bVar.f109996a = e4m.b.b(new k(aVar3, 29));
                        return bVar;
                    case 1:
                        return (b) ((cxj.b) this.f120951b.K.getValue()).f109996a.get();
                    default:
                        int i22 = R$id.retailSsoSignInSessions_container;
                        RetailSsoSignInSessionsFlow retailSsoSignInSessionsFlow = this.f120951b;
                        return c.d(i22, 4, null, retailSsoSignInSessionsFlow, (b) retailSsoSignInSessionsFlow.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: dxj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RetailSsoSignInSessionsFlow f120951b;

            {
                this.f120951b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f120951b.m2()).a().get(cxj.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", cxj.a.class, " is not found"));
                        }
                        cxj.a aVar3 = ((cxj.a) aVar2.b()).f109995b;
                        cxj.b bVar = new cxj.b();
                        bVar.f109996a = e4m.b.b(new k(aVar3, 29));
                        return bVar;
                    case 1:
                        return (b) ((cxj.b) this.f120951b.K.getValue()).f109996a.get();
                    default:
                        int i22 = R$id.retailSsoSignInSessions_container;
                        RetailSsoSignInSessionsFlow retailSsoSignInSessionsFlow = this.f120951b;
                        return c.d(i22, 4, null, retailSsoSignInSessionsFlow, (b) retailSsoSignInSessionsFlow.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b k3() {
        return (dxj.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
