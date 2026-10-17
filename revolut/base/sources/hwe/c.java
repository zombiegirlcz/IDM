package hwe;

import com.revolut.domain.models.topup.methods.TopupMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopupMethod.OtherMethod f156132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f156134c;

    public c(TopupMethod.OtherMethod method, String str, String currency) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f156132a = method;
        this.f156133b = str;
        this.f156134c = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f156132a, cVar.f156132a) && Intrinsics.f(this.f156133b, cVar.f156133b) && Intrinsics.f(this.f156134c, cVar.f156134c);
    }

    public final int hashCode() {
        int iHashCode = this.f156132a.hashCode() * 31;
        String str = this.f156133b;
        return this.f156134c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
