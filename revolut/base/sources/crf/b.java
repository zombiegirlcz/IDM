package crf;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.t3;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f108358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t3 f108359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qv0.i f108360c;
    public final String d;
    public final Long e;

    public b(a3 transaction, t3 transactionDetails, qv0.i transactionHeader, String source, Long l2) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
        Intrinsics.checkNotNullParameter(transactionHeader, "transactionHeader");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f108358a = transaction;
        this.f108359b = transactionDetails;
        this.f108360c = transactionHeader;
        this.d = source;
        this.e = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f108358a, bVar.f108358a) && Intrinsics.f(this.f108359b, bVar.f108359b) && Intrinsics.f(this.f108360c, bVar.f108360c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f108360c.hashCode() + ((this.f108359b.hashCode() + (this.f108358a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        Long l2 = this.e;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }
}
