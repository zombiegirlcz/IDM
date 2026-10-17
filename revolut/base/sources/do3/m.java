package do3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f116406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116407b;

    public m(l state, String email) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(email, "email");
        this.f116406a = state;
        this.f116407b = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f116406a == mVar.f116406a && Intrinsics.f(this.f116407b, mVar.f116407b);
    }

    public final int hashCode() {
        return this.f116407b.hashCode() + (this.f116406a.hashCode() * 31);
    }
}
