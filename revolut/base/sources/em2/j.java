package em2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f127591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f127592b;

    public j(List scopes, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f127591a = currency;
        this.f127592b = scopes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f127591a, jVar.f127591a) && Intrinsics.f(this.f127592b, jVar.f127592b);
    }

    public final int hashCode() {
        return this.f127592b.hashCode() + (this.f127591a.hashCode() * 31);
    }
}
