package lg8;

import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutSsoApi$DefaultIdentifier f195085a;

    public c(RevolutSsoApi$DefaultIdentifier identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f195085a = identifier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f195085a, ((c) obj2).f195085a);
    }

    public final int hashCode() {
        return this.f195085a.hashCode();
    }
}
