package z0f;

import com.revolut.domain.models.topup.methods.TopupMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopupMethod f318287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318288b;

    public w(TopupMethod method, String currencyCode) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f318287a = method;
        this.f318288b = currencyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f318287a, wVar.f318287a) && Intrinsics.f(this.f318288b, wVar.f318288b);
    }

    public final int hashCode() {
        return this.f318288b.hashCode() + (this.f318287a.hashCode() * 31);
    }
}
