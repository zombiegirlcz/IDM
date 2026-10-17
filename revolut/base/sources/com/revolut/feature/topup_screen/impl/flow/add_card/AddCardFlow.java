package com.revolut.feature.topup_screen.impl.flow.add_card;

import com.revolut.feature.topup_screen.impl.flow.add_card.AddCardFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import qgk.f1;
import qve.k;
import qve.z;
import sli.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/add_card/AddCardFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsli/b$a;", "Lyki/f;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddCardFlow extends ViewController<b.a> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public AddCardFlow() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: cwe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddCardFlow f109604b;

            {
                this.f109604b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AddCardFlow addCardFlow = this.f109604b;
                        return czi.c.d(0, 6, null, addCardFlow, (b) addCardFlow.M.getValue());
                    case 1:
                        phm.a aVar = (phm.a) e.j(this.f109604b.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).X;
                        qve.a aVar3 = new qve.a();
                        aVar3.f249556a = e4m.b.b(new f1(kVar, 12));
                        return aVar3;
                    default:
                        return (b) ((qve.a) this.f109604b.L.getValue()).f249556a.get();
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: cwe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddCardFlow f109604b;

            {
                this.f109604b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AddCardFlow addCardFlow = this.f109604b;
                        return czi.c.d(0, 6, null, addCardFlow, (b) addCardFlow.M.getValue());
                    case 1:
                        phm.a aVar = (phm.a) e.j(this.f109604b.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).X;
                        qve.a aVar3 = new qve.a();
                        aVar3.f249556a = e4m.b.b(new f1(kVar, 12));
                        return aVar3;
                    default:
                        return (b) ((qve.a) this.f109604b.L.getValue()).f249556a.get();
                }
            }
        });
        final int i3 = 2;
        this.M = w.y0(new Function0(this) { // from class: cwe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddCardFlow f109604b;

            {
                this.f109604b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AddCardFlow addCardFlow = this.f109604b;
                        return czi.c.d(0, 6, null, addCardFlow, (b) addCardFlow.M.getValue());
                    case 1:
                        phm.a aVar = (phm.a) e.j(this.f109604b.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).X;
                        qve.a aVar3 = new qve.a();
                        aVar3.f249556a = e4m.b.b(new f1(kVar, 12));
                        return aVar3;
                    default:
                        return (b) ((qve.a) this.f109604b.L.getValue()).f249556a.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (qve.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (qve.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (cwe.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.K.getValue();
    }
}
