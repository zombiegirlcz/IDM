package c8i;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final osg.b f22206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k38.c f22207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppg.b f22208c;
    public final rnb.w d;
    public final al4.n e;
    public final ldi.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ybl.d f22209g;

    public m(osg.b walletInteractor, k38.c jointAccountsInteractor, ppg.b vaultsInteractor, rnb.w savingsVaultInteractor, al4.n creditCardInteractor, ldi.f revPointsPocketInteractor, ybl.d portfolioInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(revPointsPocketInteractor, "revPointsPocketInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f22206a = walletInteractor;
        this.f22207b = jointAccountsInteractor;
        this.f22208c = vaultsInteractor;
        this.d = savingsVaultInteractor;
        this.e = creditCardInteractor;
        this.f = revPointsPocketInteractor;
        this.f22209g = portfolioInteractor;
    }

    public static pcd.b a(mri.j jVar) {
        int i = g.f22199a[jVar.ordinal()];
        if (i == 1) {
            return pcd.b.PERSONAL;
        }
        if (i == 2) {
            return pcd.b.PERSONAL_JOINT;
        }
        if (i == 3) {
            return pcd.b.YOUTH;
        }
        if (i == 4) {
            return pcd.b.PERSONAL_UNDER_18;
        }
        throw new NoWhenBranchMatchedException();
    }
}
