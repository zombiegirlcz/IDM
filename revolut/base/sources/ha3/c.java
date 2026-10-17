package ha3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o93.a f150397a;

    public c(o93.a cardPromotionsRepository) {
        Intrinsics.checkNotNullParameter(cardPromotionsRepository, "cardPromotionsRepository");
        this.f150397a = cardPromotionsRepository;
    }

    public final efm.r a(String walletId, boolean z) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        ba3.d dVar = (ba3.d) this.f150397a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        return dVar.d.f(walletId, z);
    }
}
