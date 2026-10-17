package sxj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f266521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f266523c;

    public a(b juniorAppAccessWidgetState, String juniorRegId, String juniorFirstName) {
        Intrinsics.checkNotNullParameter(juniorAppAccessWidgetState, "juniorAppAccessWidgetState");
        Intrinsics.checkNotNullParameter(juniorRegId, "juniorRegId");
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        this.f266521a = juniorAppAccessWidgetState;
        this.f266522b = juniorRegId;
        this.f266523c = juniorFirstName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f266521a == aVar.f266521a && Intrinsics.f(this.f266522b, aVar.f266522b) && Intrinsics.f(this.f266523c, aVar.f266523c);
    }

    public final int hashCode() {
        return this.f266523c.hashCode() + p.a.c(this.f266521a.hashCode() * 31, 31, this.f266522b);
    }
}
