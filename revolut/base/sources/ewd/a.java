package ewd;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import wtd.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f130163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f130164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f130165c;
    public final DateTime d;

    public a(DateTime unstakingStartDate, b state, String productId, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(unstakingStartDate, "unstakingStartDate");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f130163a = unstakingStartDate;
        this.f130164b = state;
        this.f130165c = productId;
        this.d = dateTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f130163a, aVar.f130163a) && this.f130164b == aVar.f130164b && Intrinsics.f(this.f130165c, aVar.f130165c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f130164b.hashCode() + (this.f130163a.hashCode() * 31)) * 31, 31, this.f130165c);
        DateTime dateTime = this.d;
        return iC + (dateTime == null ? 0 : dateTime.hashCode());
    }
}
