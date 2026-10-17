package rwb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f257877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257878b;

    public c(Data voucherProductGroupDetailsContent, String idempotencyKey) {
        Intrinsics.checkNotNullParameter(voucherProductGroupDetailsContent, "voucherProductGroupDetailsContent");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f257877a = voucherProductGroupDetailsContent;
        this.f257878b = idempotencyKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f257877a, cVar.f257877a) && Intrinsics.f(this.f257878b, cVar.f257878b);
    }

    public final int hashCode() {
        return this.f257878b.hashCode() + (this.f257877a.hashCode() * 31);
    }
}
