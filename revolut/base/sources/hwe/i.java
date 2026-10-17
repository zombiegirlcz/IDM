package hwe;

import com.revolut.domain.models.topup.methods.TopupMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopupMethod f156142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156143b;

    public i(TopupMethod method, String currency) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f156142a = method;
        this.f156143b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f156142a, iVar.f156142a) && Intrinsics.f(this.f156143b, iVar.f156143b);
    }

    public final int hashCode() {
        return this.f156143b.hashCode() + (this.f156142a.hashCode() * 31);
    }
}
