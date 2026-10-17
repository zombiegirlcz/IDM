package snb;

import com.revolut.data.model.Data;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import fab.c;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf8.h;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorBankingProfile f264494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f264495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f264496c;
    public final Data d;
    public final psg.a e;

    public b(JuniorBankingProfile juniorProfile, h juniorAccountUiState, c juniorPricingPlan, Data withdrawalPermission, psg.a walletProfile) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(juniorAccountUiState, "juniorAccountUiState");
        Intrinsics.checkNotNullParameter(juniorPricingPlan, "juniorPricingPlan");
        Intrinsics.checkNotNullParameter(withdrawalPermission, "withdrawalPermission");
        Intrinsics.checkNotNullParameter(walletProfile, "walletProfile");
        this.f264494a = juniorProfile;
        this.f264495b = juniorAccountUiState;
        this.f264496c = juniorPricingPlan;
        this.d = withdrawalPermission;
        this.e = walletProfile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f264494a, bVar.f264494a) && Intrinsics.f(this.f264495b, bVar.f264495b) && Intrinsics.f(this.f264496c, bVar.f264496c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + e.c(this.d, p.a.c((this.f264495b.hashCode() + (this.f264494a.hashCode() * 31)) * 31, 31, this.f264496c.f133274a), 31);
    }
}
