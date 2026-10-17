package com.feature.feature_meta_sso_impl.flow;

import android.app.Activity;
import ba.b;
import ca.d;
import com.feature.feature_meta_sso_api.navigation.OutputData;
import com.feature.feature_meta_sso_impl.flow.MetaSsoFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/feature/feature_meta_sso_impl/flow/MetaSsoFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/feature/feature_meta_sso_api/navigation/OutputData;", "Lyki/f;", "<init>", "()V", "feature_meta_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MetaSsoFlow extends ViewController<OutputData> implements f {
    public final int K = R$layout.screen_transparent;
    public final Object L;
    public final Object M;
    public final Object N;

    public MetaSsoFlow() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MetaSsoFlow f22508b;

            {
                this.f22508b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MetaSsoFlow metaSsoFlow = this.f22508b;
                        phm.a aVar = (phm.a) e.j(metaSsoFlow.m2()).a().get(ba.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ba.a.class, " is not found"));
                        }
                        ba.a aVar3 = ((ba.a) aVar2.b()).f13854b;
                        Activity activityM2 = metaSsoFlow.m2();
                        activityM2.getClass();
                        return new ba.b(aVar3, activityM2);
                    case 1:
                        return (d) ((ba.b) this.f22508b.L.getValue()).f13857b.get();
                    default:
                        MetaSsoFlow metaSsoFlow2 = this.f22508b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, metaSsoFlow2, (d) metaSsoFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MetaSsoFlow f22508b;

            {
                this.f22508b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        MetaSsoFlow metaSsoFlow = this.f22508b;
                        phm.a aVar = (phm.a) e.j(metaSsoFlow.m2()).a().get(ba.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ba.a.class, " is not found"));
                        }
                        ba.a aVar3 = ((ba.a) aVar2.b()).f13854b;
                        Activity activityM2 = metaSsoFlow.m2();
                        activityM2.getClass();
                        return new ba.b(aVar3, activityM2);
                    case 1:
                        return (d) ((ba.b) this.f22508b.L.getValue()).f13857b.get();
                    default:
                        MetaSsoFlow metaSsoFlow2 = this.f22508b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, metaSsoFlow2, (d) metaSsoFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MetaSsoFlow f22508b;

            {
                this.f22508b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        MetaSsoFlow metaSsoFlow = this.f22508b;
                        phm.a aVar = (phm.a) e.j(metaSsoFlow.m2()).a().get(ba.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ba.a.class, " is not found"));
                        }
                        ba.a aVar3 = ((ba.a) aVar2.b()).f13854b;
                        Activity activityM2 = metaSsoFlow.m2();
                        activityM2.getClass();
                        return new ba.b(aVar3, activityM2);
                    case 1:
                        return (d) ((ba.b) this.f22508b.L.getValue()).f13857b.get();
                    default:
                        MetaSsoFlow metaSsoFlow2 = this.f22508b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, metaSsoFlow2, (d) metaSsoFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
