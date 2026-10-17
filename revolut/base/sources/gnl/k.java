package gnl;

import com.revolut.sso.impl.domain.models.Identifier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Identifier f145039a;

    public k(Identifier identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f145039a = identifier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f145039a, ((k) obj2).f145039a);
    }

    public final int hashCode() {
        return this.f145039a.hashCode();
    }
}
