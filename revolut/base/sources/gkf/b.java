package gkf;

import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecurringSplit f144378a;

    public b(RecurringSplit recurringSplit) {
        Intrinsics.checkNotNullParameter(recurringSplit, "recurringSplit");
        this.f144378a = recurringSplit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f144378a, ((b) obj2).f144378a);
    }

    public final int hashCode() {
        return this.f144378a.hashCode();
    }
}
