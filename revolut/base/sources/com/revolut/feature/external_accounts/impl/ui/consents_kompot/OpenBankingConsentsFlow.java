package com.revolut.feature.external_accounts.impl.ui.consents_kompot;

import aii.q;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.OpenBankingConsentsFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import te0.w;
import xf6.w2;
import xf6.x2;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/OpenBankingConsentsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OpenBankingConsentsFlow extends ViewController<q> implements f {
    public final int K = R$layout.screen_transparent;
    public final Object L;
    public final Object M;
    public final Object N;

    public OpenBankingConsentsFlow() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: gl6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenBankingConsentsFlow f144563b;

            {
                this.f144563b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f144563b.m2()).a().get(w2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new x2(((w2) aVar2.b()).J);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", w2.class, " is not found"));
                    case 1:
                        return (c) ((x2) this.f144563b.L.getValue()).f305163c.get();
                    default:
                        OpenBankingConsentsFlow openBankingConsentsFlow = this.f144563b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, openBankingConsentsFlow, (c) openBankingConsentsFlow.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: gl6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenBankingConsentsFlow f144563b;

            {
                this.f144563b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f144563b.m2()).a().get(w2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new x2(((w2) aVar2.b()).J);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", w2.class, " is not found"));
                    case 1:
                        return (c) ((x2) this.f144563b.L.getValue()).f305163c.get();
                    default:
                        OpenBankingConsentsFlow openBankingConsentsFlow = this.f144563b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, openBankingConsentsFlow, (c) openBankingConsentsFlow.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: gl6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenBankingConsentsFlow f144563b;

            {
                this.f144563b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f144563b.m2()).a().get(w2.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new x2(((w2) aVar2.b()).J);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", w2.class, " is not found"));
                    case 1:
                        return (c) ((x2) this.f144563b.L.getValue()).f305163c.get();
                    default:
                        OpenBankingConsentsFlow openBankingConsentsFlow = this.f144563b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, openBankingConsentsFlow, (c) openBankingConsentsFlow.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x2) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (x2) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (gl6.c) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
