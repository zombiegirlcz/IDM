package qll;

import com.revolut.sso.impl.domain.models.Identifier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class z implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Identifier f247608a;

    public z(Identifier identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f247608a = identifier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f247608a, ((z) obj2).f247608a);
    }

    public final int hashCode() {
        return this.f247608a.hashCode();
    }
}
