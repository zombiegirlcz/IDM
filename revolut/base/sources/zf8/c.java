package zf8;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fo3.c f321887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f321888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final psg.a f321889c;
    public final JuniorBankingProfile d;
    public final sf8.h e;

    public c(fo3.c wallet, List pockets, psg.a walletProfile, JuniorBankingProfile profile, sf8.h uiState) {
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(walletProfile, "walletProfile");
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        this.f321887a = wallet;
        this.f321888b = pockets;
        this.f321889c = walletProfile;
        this.d = profile;
        this.e = uiState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f321887a, cVar.f321887a) && Intrinsics.f(this.f321888b, cVar.f321888b) && Intrinsics.f(this.f321889c, cVar.f321889c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f321889c.hashCode() + p.a.d(this.f321887a.hashCode() * 31, 31, this.f321888b)) * 31)) * 31);
    }
}
