package k5l;

import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f181584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f181585b;

    public m(List transactions, q extraData) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f181584a = transactions;
        this.f181585b = extraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f181584a, mVar.f181584a) && Intrinsics.f(this.f181585b, mVar.f181585b);
    }

    public final int hashCode() {
        return this.f181585b.hashCode() + (this.f181584a.hashCode() * 31);
    }
}
