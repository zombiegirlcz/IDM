package an0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements if0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cn0.h f6543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xm0.a f6544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f6545c;
    public final zm0.b d;

    public h(cn0.h twoFactorCodeProvider, xm0.a secureCardsDetailsController, ue0.c databaseSessionStorage, zm0.b sessionController) {
        Intrinsics.checkNotNullParameter(twoFactorCodeProvider, "twoFactorCodeProvider");
        Intrinsics.checkNotNullParameter(secureCardsDetailsController, "secureCardsDetailsController");
        Intrinsics.checkNotNullParameter(databaseSessionStorage, "databaseSessionStorage");
        Intrinsics.checkNotNullParameter(sessionController, "sessionController");
        this.f6543a = twoFactorCodeProvider;
        this.f6544b = secureCardsDetailsController;
        this.f6545c = databaseSessionStorage;
        this.d = sessionController;
    }

    @Override // od0.e
    public final void clear() {
        this.f6543a.clear();
        this.f6544b.clear();
        this.f6545c.clear();
        ((cn0.g) this.d).clear();
    }
}
