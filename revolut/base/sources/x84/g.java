package x84;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f303280a;

    public g(Data debts) {
        Intrinsics.checkNotNullParameter(debts, "debts");
        this.f303280a = debts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f303280a, ((g) obj2).f303280a);
    }

    public final int hashCode() {
        return this.f303280a.hashCode();
    }
}
