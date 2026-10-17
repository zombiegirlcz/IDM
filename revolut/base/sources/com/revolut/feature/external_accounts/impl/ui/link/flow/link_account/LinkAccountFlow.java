package com.revolut.feature.external_accounts.impl.ui.link.flow.link_account;

import android.content.Intent;
import com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlow;
import com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dn6.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xf6.t;
import xf6.z;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldn6/g;", "Lyki/f;", "Lin0/g;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinkAccountFlow extends ViewController<g> implements f, in0.g {
    public final LinkAccountFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public LinkAccountFlow(LinkAccountFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: dn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkAccountFlow f116217b;

            {
                this.f116217b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        LinkAccountFlow linkAccountFlow = this.f116217b;
                        phm.a aVar = (phm.a) ue0.e.j(linkAccountFlow.m2()).a().get(je6.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        LinkAccountFlowContract$InputData linkAccountFlowContract$InputData = linkAccountFlow.K;
                        linkAccountFlowContract$InputData.getClass();
                        return new z(tVar, linkAccountFlowContract$InputData);
                    case 1:
                        return (b) ((z) this.f116217b.M.getValue()).d.get();
                    default:
                        LinkAccountFlow linkAccountFlow2 = this.f116217b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, linkAccountFlow2, (b) linkAccountFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: dn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkAccountFlow f116217b;

            {
                this.f116217b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        LinkAccountFlow linkAccountFlow = this.f116217b;
                        phm.a aVar = (phm.a) ue0.e.j(linkAccountFlow.m2()).a().get(je6.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        LinkAccountFlowContract$InputData linkAccountFlowContract$InputData = linkAccountFlow.K;
                        linkAccountFlowContract$InputData.getClass();
                        return new z(tVar, linkAccountFlowContract$InputData);
                    case 1:
                        return (b) ((z) this.f116217b.M.getValue()).d.get();
                    default:
                        LinkAccountFlow linkAccountFlow2 = this.f116217b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, linkAccountFlow2, (b) linkAccountFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: dn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkAccountFlow f116217b;

            {
                this.f116217b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        LinkAccountFlow linkAccountFlow = this.f116217b;
                        phm.a aVar = (phm.a) ue0.e.j(linkAccountFlow.m2()).a().get(je6.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        LinkAccountFlowContract$InputData linkAccountFlowContract$InputData = linkAccountFlow.K;
                        linkAccountFlowContract$InputData.getClass();
                        return new z(tVar, linkAccountFlowContract$InputData);
                    case 1:
                        return (b) ((z) this.f116217b.M.getValue()).d.get();
                    default:
                        LinkAccountFlow linkAccountFlow2 = this.f116217b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, linkAccountFlow2, (b) linkAccountFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (z) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (dn6.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        d dVar = (d) ((dn6.b) this.N.getValue());
        dVar.getClass();
        dVar.C2(new dn6.d(i, i2));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    @Override // in0.g
    public final boolean p0() {
        return this.K.i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
