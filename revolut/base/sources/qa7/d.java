package qa7;

import com.revolut.feature.hidden_accounts.api.domain.HiddenAccountsConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HiddenAccountsConfig f243973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final na7.b f243974b;

    public d(HiddenAccountsConfig config, na7.b accountType) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f243973a = config;
        this.f243974b = accountType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f243973a, dVar.f243973a) && this.f243974b == dVar.f243974b;
    }

    public final int hashCode() {
        return this.f243974b.hashCode() + (this.f243973a.hashCode() * 31);
    }

    public /* synthetic */ d(HiddenAccountsConfig hiddenAccountsConfig) {
        this(hiddenAccountsConfig, na7.b.HIDDEN);
    }
}
