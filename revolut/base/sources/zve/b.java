package zve;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f325669b;

    public b(String transactionId, a aVar) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f325668a = transactionId;
        this.f325669b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f325668a, bVar.f325668a) && Intrinsics.f(this.f325669b, bVar.f325669b);
    }

    public final int hashCode() {
        int iHashCode = this.f325668a.hashCode() * 31;
        a aVar = this.f325669b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
