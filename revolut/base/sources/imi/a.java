package imi;

import a0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f162494c;
    public final String d;

    public a(long j2, String accessToken, String refreshCode, String ownerId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshCode, "refreshCode");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.f162492a = accessToken;
        this.f162493b = refreshCode;
        this.f162494c = j2;
        this.d = ownerId;
    }

    public final String a() {
        return this.f162492a;
    }

    public final long b() {
        return this.f162494c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f162493b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f162492a, aVar.f162492a) && Intrinsics.f(this.f162493b, aVar.f162493b) && this.f162494c == aVar.f162494c && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + d.c(p.a.c(this.f162492a.hashCode() * 31, 31, this.f162493b), 31, this.f162494c);
    }
}
