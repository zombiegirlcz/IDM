package com.revolut.feature.crypto.earn.assets.shared.impl.ui.root;

import af5.d;
import aii.q;
import com.revolut.feature.crypto.earn.assets.shared.impl.R$id;
import com.revolut.feature.crypto.earn.assets.shared.impl.R$layout;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.root.EarnAssetsRootScreenController;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/root/EarnAssetsRootScreenController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "<init>", "()V", "feature_crypto_earn_assets_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EarnAssetsRootScreenController extends ViewController<q> implements f {
    public final int K = R$layout.earn_assets_root_screen;
    public final Object L;
    public final Object M;
    public final Object N;

    public EarnAssetsRootScreenController() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: if5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EarnAssetsRootScreenController f160907b;

            {
                this.f160907b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f160907b.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.crypto.earn.assets.shared.impl.di.EarnAssetsSharedComponent");
                        d dVar = ((d) objB).f3897j;
                        af5.b bVar = new af5.b();
                        bVar.f3889a = e4m.b.b(new a0b.c(dVar, 17));
                        return bVar;
                    case 1:
                        return (a) ((af5.b) this.f160907b.L.getValue()).f3889a.get();
                    default:
                        EarnAssetsRootScreenController earnAssetsRootScreenController = this.f160907b;
                        return czi.c.d(R$id.container, 4, null, earnAssetsRootScreenController, (a) earnAssetsRootScreenController.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: if5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EarnAssetsRootScreenController f160907b;

            {
                this.f160907b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f160907b.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.crypto.earn.assets.shared.impl.di.EarnAssetsSharedComponent");
                        d dVar = ((d) objB).f3897j;
                        af5.b bVar = new af5.b();
                        bVar.f3889a = e4m.b.b(new a0b.c(dVar, 17));
                        return bVar;
                    case 1:
                        return (a) ((af5.b) this.f160907b.L.getValue()).f3889a.get();
                    default:
                        EarnAssetsRootScreenController earnAssetsRootScreenController = this.f160907b;
                        return czi.c.d(R$id.container, 4, null, earnAssetsRootScreenController, (a) earnAssetsRootScreenController.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: if5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EarnAssetsRootScreenController f160907b;

            {
                this.f160907b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f160907b.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.crypto.earn.assets.shared.impl.di.EarnAssetsSharedComponent");
                        d dVar = ((d) objB).f3897j;
                        af5.b bVar = new af5.b();
                        bVar.f3889a = e4m.b.b(new a0b.c(dVar, 17));
                        return bVar;
                    case 1:
                        return (a) ((af5.b) this.f160907b.L.getValue()).f3889a.get();
                    default:
                        EarnAssetsRootScreenController earnAssetsRootScreenController = this.f160907b;
                        return czi.c.d(R$id.container, 4, null, earnAssetsRootScreenController, (a) earnAssetsRootScreenController.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (af5.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (af5.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (if5.a) this.M.getValue();
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
