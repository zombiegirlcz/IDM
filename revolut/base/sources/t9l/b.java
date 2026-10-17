package t9l;

import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f269052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f269053b;

    public b(List transactions, q extraData) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f269052a = transactions;
        this.f269053b = extraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f269052a, bVar.f269052a) && Intrinsics.f(this.f269053b, bVar.f269053b);
    }

    public final int hashCode() {
        return this.f269053b.hashCode() + (this.f269052a.hashCode() * 31);
    }
}
