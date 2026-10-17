package bs3;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f18036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f18038c;
    public final Instant d;
    public final String e;

    public h(g provider, String token, Instant startDate, Instant endDate, String str) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f18036a = provider;
        this.f18037b = token;
        this.f18038c = startDate;
        this.d = endDate;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f18036a == hVar.f18036a && Intrinsics.f(this.f18037b, hVar.f18037b) && Intrinsics.f(this.f18038c, hVar.f18038c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iC = r6.b.c(r6.b.c(p.a.c(this.f18036a.hashCode() * 31, 31, this.f18037b), 31, this.f18038c), 31, this.d);
        String str = this.e;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
