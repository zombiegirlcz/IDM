package tr4;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f273735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f273736b;

    public i(Set transactionIds, ArrayList documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        this.f273735a = documents;
        this.f273736b = transactionIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f273735a.equals(iVar.f273735a) && Intrinsics.f(this.f273736b, iVar.f273736b);
    }

    public final int hashCode() {
        return this.f273736b.hashCode() + (this.f273735a.hashCode() * 31);
    }
}
