package uef;

import com.revolut.data.model.Data;
import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionRecogniserDetails f279352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f279353b;

    public e(TransactionRecogniserDetails recogniserDetails, Data beforeAfterTransactions) {
        Intrinsics.checkNotNullParameter(recogniserDetails, "recogniserDetails");
        Intrinsics.checkNotNullParameter(beforeAfterTransactions, "beforeAfterTransactions");
        this.f279352a = recogniserDetails;
        this.f279353b = beforeAfterTransactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f279352a, eVar.f279352a) && Intrinsics.f(this.f279353b, eVar.f279353b);
    }

    public final int hashCode() {
        return this.f279353b.hashCode() + (this.f279352a.hashCode() * 31);
    }
}
