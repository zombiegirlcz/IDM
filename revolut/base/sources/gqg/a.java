package gqg;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f145719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145720b;

    public a(String str, Set currencies) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.f145719a = currencies;
        this.f145720b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f145719a, aVar.f145719a) && Intrinsics.f(this.f145720b, aVar.f145720b);
    }

    public final int hashCode() {
        int iHashCode = this.f145719a.hashCode() * 31;
        String str = this.f145720b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
