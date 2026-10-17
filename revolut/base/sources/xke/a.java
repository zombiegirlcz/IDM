package xke;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f306661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthAccount f306662b;

    public a(dj0.d dVar, WealthAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f306661a = dVar;
        this.f306662b = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f306661a, aVar.f306661a) && Intrinsics.f(this.f306662b, aVar.f306662b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f306661a;
        return this.f306662b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }
}
