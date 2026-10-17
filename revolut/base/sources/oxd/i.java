package oxd;

import com.revolut.domain.models.topup.methods.TopupMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopupMethod.StoredMethod f230775a;

    public i(TopupMethod.StoredMethod method) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.f230775a = method;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f230775a, ((i) obj2).f230775a);
    }

    public final int hashCode() {
        return this.f230775a.hashCode();
    }
}
