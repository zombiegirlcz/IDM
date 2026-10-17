package pol;

import com.revolut.sso.impl.domain.models.Identifier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Identifier.Phone f238049a;

    public g(Identifier.Phone identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f238049a = identifier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f238049a, ((g) obj2).f238049a);
    }

    public final int hashCode() {
        return this.f238049a.hashCode();
    }
}
