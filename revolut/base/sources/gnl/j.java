package gnl;

import com.revolut.sso.impl.domain.models.Identifier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Identifier f145038a;

    public j(Identifier identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f145038a = identifier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f145038a, ((j) obj2).f145038a);
    }

    public final int hashCode() {
        return this.f145038a.hashCode();
    }
}
