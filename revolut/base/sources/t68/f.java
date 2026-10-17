package t68;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorBankingProfile f268267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268268b;

    public /* synthetic */ f(int i, JuniorBankingProfile juniorBankingProfile, String str) {
        if (3 != (i & 3)) {
            j1.f(d.f268266a.getDescriptor(), i, 3);
            throw null;
        }
        this.f268267a = juniorBankingProfile;
        this.f268268b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f268267a, fVar.f268267a) && Intrinsics.f(this.f268268b, fVar.f268268b);
    }

    public final int hashCode() {
        return this.f268268b.hashCode() + (this.f268267a.hashCode() * 31);
    }

    public f(JuniorBankingProfile juniorProfile, String walletId) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        this.f268267a = juniorProfile;
        this.f268268b = walletId;
    }
}
