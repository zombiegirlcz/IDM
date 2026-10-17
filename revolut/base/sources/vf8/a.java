package vf8;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import kotlin.jvm.internal.Intrinsics;
import sf8.h;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorBankingProfile f288532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f288533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f288534c;
    public final boolean d;

    public a(JuniorBankingProfile profile, h accountUiState, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(accountUiState, "accountUiState");
        this.f288532a = profile;
        this.f288533b = accountUiState;
        this.f288534c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f288532a, aVar.f288532a) && Intrinsics.f(this.f288533b, aVar.f288533b) && this.f288534c == aVar.f288534c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c((this.f288533b.hashCode() + (this.f288532a.hashCode() * 31)) * 31, 31, this.f288534c);
    }
}
