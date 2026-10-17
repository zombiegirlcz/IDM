package zf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f321832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321834c;
    public final String d;
    public final String e;

    public c(String str, String lastTimeUpdated, String localeLang, wi0.b userCountry) {
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(lastTimeUpdated, "lastTimeUpdated");
        Intrinsics.checkNotNullParameter(localeLang, "localeLang");
        this.f321832a = userCountry;
        this.f321833b = str;
        this.f321834c = lastTimeUpdated;
        this.d = localeLang;
        this.e = str;
    }

    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f321832a, cVar.f321832a) && Intrinsics.f(this.f321833b, cVar.f321833b) && Intrinsics.f(this.f321834c, cVar.f321834c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f321832a.f297794a.hashCode() * 31;
        String str = this.f321833b;
        return this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f321834c);
    }
}
