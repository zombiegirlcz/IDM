package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation;

import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.JuniorPersonalDataCreationFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import qh8.k;
import qh8.l;
import te0.w;
import yki.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lei8/c;", "Lyki/f;", "<init>", "()V", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorPersonalDataCreationFlow extends ViewController<ei8.c> implements f {
    public final int K = R$layout.screen_transparent;
    public final Object L;
    public final Object M;
    public final Object N;

    public JuniorPersonalDataCreationFlow() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ei8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPersonalDataCreationFlow f126449b;

            {
                this.f126449b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        JuniorPersonalDataCreationFlow juniorPersonalDataCreationFlow = this.f126449b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, juniorPersonalDataCreationFlow, (b) juniorPersonalDataCreationFlow.N.getValue());
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(this.f126449b.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new l(((k) aVar2.b()).f246539n);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                    default:
                        return (b) ((l) this.f126449b.M.getValue()).f246542c.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ei8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPersonalDataCreationFlow f126449b;

            {
                this.f126449b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        JuniorPersonalDataCreationFlow juniorPersonalDataCreationFlow = this.f126449b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, juniorPersonalDataCreationFlow, (b) juniorPersonalDataCreationFlow.N.getValue());
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(this.f126449b.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new l(((k) aVar2.b()).f246539n);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                    default:
                        return (b) ((l) this.f126449b.M.getValue()).f246542c.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ei8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPersonalDataCreationFlow f126449b;

            {
                this.f126449b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        JuniorPersonalDataCreationFlow juniorPersonalDataCreationFlow = this.f126449b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, juniorPersonalDataCreationFlow, (b) juniorPersonalDataCreationFlow.N.getValue());
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(this.f126449b.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new l(((k) aVar2.b()).f246539n);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                    default:
                        return (b) ((l) this.f126449b.M.getValue()).f246542c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (l) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ei8.b) this.N.getValue();
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
