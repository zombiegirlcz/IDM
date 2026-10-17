package n7f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f213082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f213083b;

    public d(List investorUpdates, String str) {
        Intrinsics.checkNotNullParameter(investorUpdates, "investorUpdates");
        this.f213082a = investorUpdates;
        this.f213083b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f213082a, dVar.f213082a) && Intrinsics.f(this.f213083b, dVar.f213083b);
    }

    public final int hashCode() {
        int iHashCode = this.f213082a.hashCode() * 31;
        String str = this.f213083b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
