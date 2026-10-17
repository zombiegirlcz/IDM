package t6e;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f268325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f268326b;

    public q(dj0.d money, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        Intrinsics.checkNotNullParameter(money, "money");
        this.f268325a = dateTime;
        this.f268326b = money;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f268325a, qVar.f268325a) && Intrinsics.f(this.f268326b, qVar.f268326b);
    }

    public final int hashCode() {
        return this.f268326b.hashCode() + (this.f268325a.hashCode() * 31);
    }
}
