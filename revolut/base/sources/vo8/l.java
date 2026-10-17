package vo8;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f290890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f290891b;

    public l(Map consents, o marketingConsentsState) {
        Intrinsics.checkNotNullParameter(consents, "consents");
        Intrinsics.checkNotNullParameter(marketingConsentsState, "marketingConsentsState");
        this.f290890a = consents;
        this.f290891b = marketingConsentsState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f290890a, lVar.f290890a) && Intrinsics.f(this.f290891b, lVar.f290891b);
    }

    public final int hashCode() {
        return this.f290891b.hashCode() + (this.f290890a.hashCode() * 31);
    }
}
