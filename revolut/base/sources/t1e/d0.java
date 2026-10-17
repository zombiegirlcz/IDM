package t1e;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f267254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f267255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f267256c;

    public d0(String str, String str2, Instant instant) {
        this.f267254a = str;
        this.f267255b = str2;
        this.f267256c = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f267254a, d0Var.f267254a) && Intrinsics.f(this.f267255b, d0Var.f267255b) && Intrinsics.f(this.f267256c, d0Var.f267256c);
    }

    public final int hashCode() {
        String str = this.f267254a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f267255b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Instant instant = this.f267256c;
        return iHashCode2 + (instant != null ? instant.hashCode() : 0);
    }
}
