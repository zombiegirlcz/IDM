package l6c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l6c.b;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f192388c;
    public final String d;

    public c(String paymentId, String paymentToken, List list, String str) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
        this.f192386a = paymentId;
        this.f192387b = paymentToken;
        this.f192388c = list;
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
        return Intrinsics.f(this.f192386a, cVar.f192386a) && Intrinsics.f(this.f192387b, cVar.f192387b) && Intrinsics.f(this.f192388c, cVar.f192388c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f192386a.hashCode() * 31, 31, this.f192387b);
        List list = this.f192388c;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
