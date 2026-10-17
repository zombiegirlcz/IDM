package z0f;

import com.revolut.domain.models.topup.methods.TopupMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopupMethod.StoredMethod f318284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318285b;

    public u(TopupMethod.StoredMethod method, String currencyCode) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f318284a = method;
        this.f318285b = currencyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f318284a, uVar.f318284a) && Intrinsics.f(this.f318285b, uVar.f318285b);
    }

    public final int hashCode() {
        return this.f318285b.hashCode() + (this.f318284a.hashCode() * 31);
    }
}
