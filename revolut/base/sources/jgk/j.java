package jgk;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f174078a;

    public j(Date nextBillingDate) {
        Intrinsics.checkNotNullParameter(nextBillingDate, "nextBillingDate");
        this.f174078a = nextBillingDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f174078a, ((j) obj2).f174078a);
    }

    public final int hashCode() {
        return this.f174078a.hashCode();
    }
}
