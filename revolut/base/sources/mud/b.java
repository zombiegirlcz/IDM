package mud;

import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.b f209021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f209022c;

    public b(String pocketId, jo3.b balance, Integer num) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f209020a = pocketId;
        this.f209021b = balance;
        this.f209022c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f209020a, bVar.f209020a) && Intrinsics.f(this.f209021b, bVar.f209021b) && Intrinsics.f(this.f209022c, bVar.f209022c);
    }

    public final int hashCode() {
        int iE = y.e(this.f209021b, this.f209020a.hashCode() * 31, 31);
        Integer num = this.f209022c;
        return iE + (num == null ? 0 : num.hashCode());
    }
}
