package hyc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f156778c;

    public b(String payerId, String payerName, String transactionId) {
        Intrinsics.checkNotNullParameter(payerId, "payerId");
        Intrinsics.checkNotNullParameter(payerName, "payerName");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f156776a = payerId;
        this.f156777b = payerName;
        this.f156778c = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f156776a, bVar.f156776a) && Intrinsics.f(this.f156777b, bVar.f156777b) && Intrinsics.f(this.f156778c, bVar.f156778c);
    }

    public final int hashCode() {
        return this.f156778c.hashCode() + p.a.c(this.f156776a.hashCode() * 31, 31, this.f156777b);
    }
}
