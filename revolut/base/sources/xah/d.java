package xah;

import f1h.f;
import kotlin.jvm.internal.Intrinsics;
import x8h.y;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements f1h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugc.a f303888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f303889b;

    public d(ugc.a transactionsCommonNavigationProvider, y investTransactionsPagerInteractor) {
        Intrinsics.checkNotNullParameter(transactionsCommonNavigationProvider, "transactionsCommonNavigationProvider");
        Intrinsics.checkNotNullParameter(investTransactionsPagerInteractor, "investTransactionsPagerInteractor");
        this.f303888a = transactionsCommonNavigationProvider;
        this.f303889b = investTransactionsPagerInteractor;
    }

    @Override // f1h.c
    public final f1h.b a() {
        return new c(this.f303888a, this.f303889b);
    }

    @Override // f1h.c
    public final f1h.a b(f screen, f1h.b controllerModelExtension) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return new b(screen, controllerModelExtension);
    }
}
