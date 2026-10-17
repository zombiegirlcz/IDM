package oxd;

import com.revolut.domain.models.topup.methods.TopupMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopupMethod.StoredMethod f230774a;

    public h(TopupMethod.StoredMethod method) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.f230774a = method;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f230774a, ((h) obj2).f230774a);
    }

    public final int hashCode() {
        return this.f230774a.hashCode();
    }
}
