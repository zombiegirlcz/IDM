package od3;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f224311a;

    public w(Data transactionsData) {
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        this.f224311a = transactionsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f224311a, ((w) obj2).f224311a);
    }

    public final int hashCode() {
        return this.f224311a.hashCode();
    }
}
