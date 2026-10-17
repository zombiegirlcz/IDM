package jh2;

import ip0.v7;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f174130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f174131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f174132c;
    public final String d;
    public final ZonedDateTime e;

    public n(String id10, dj0.d money, String link, String str, ZonedDateTime zonedDateTime) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f174130a = id10;
        this.f174131b = money;
        this.f174132c = link;
        this.d = str;
        this.e = zonedDateTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f174130a, nVar.f174130a) && Intrinsics.f(this.f174131b, nVar.f174131b) && Intrinsics.f(this.f174132c, nVar.f174132c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(v7.c(this.f174130a.hashCode() * 31, 31, this.f174131b), 31, this.f174132c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.e;
        return iHashCode + (zonedDateTime != null ? zonedDateTime.hashCode() : 0);
    }
}
