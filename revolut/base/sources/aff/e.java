package aff;

import ce9.p;
import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionRecogniserDetails f4036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f4037b;

    public e(TransactionRecogniserDetails recogniserDetails, p merchantTransactions) {
        Intrinsics.checkNotNullParameter(recogniserDetails, "recogniserDetails");
        Intrinsics.checkNotNullParameter(merchantTransactions, "merchantTransactions");
        this.f4036a = recogniserDetails;
        this.f4037b = merchantTransactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f4036a, eVar.f4036a) && Intrinsics.f(this.f4037b, eVar.f4037b);
    }

    public final int hashCode() {
        return this.f4037b.hashCode() + (this.f4036a.hashCode() * 31);
    }
}
