package qll;

import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutSsoApi$DefaultIdentifier f247607a;

    public y(RevolutSsoApi$DefaultIdentifier.Preferred identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f247607a = identifier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f247607a, ((y) obj2).f247607a);
    }

    public final int hashCode() {
        return this.f247607a.hashCode();
    }
}
