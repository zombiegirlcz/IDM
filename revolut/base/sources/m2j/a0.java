package m2j;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorBankingProfile f202011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f202012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f202013c;

    public a0(JuniorBankingProfile profile, boolean z, String str) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        this.f202011a = profile;
        this.f202012b = z;
        this.f202013c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f202011a, a0Var.f202011a) && this.f202012b == a0Var.f202012b && Intrinsics.f(this.f202013c, a0Var.f202013c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f202011a.hashCode() * 31, 31, this.f202012b);
        String str = this.f202013c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
