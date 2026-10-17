package c96;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f22308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f22309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f22310c;
    public final String d;

    public c(a accountInformation, Map amount, b authorization, String str) {
        Intrinsics.checkNotNullParameter(accountInformation, "accountInformation");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        this.f22308a = accountInformation;
        this.f22309b = amount;
        this.f22310c = authorization;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f22308a, cVar.f22308a) && Intrinsics.f(this.f22309b, cVar.f22309b) && Intrinsics.f(this.f22310c, cVar.f22310c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f22310c.hashCode() + p.a.e(this.f22308a.hashCode() * 31, 31, this.f22309b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
