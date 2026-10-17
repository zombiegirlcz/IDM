package pxh;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import nxh.f;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f240622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f240623c;

    public a(String token, Instant startDate, Instant endDate) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f240621a = token;
        this.f240622b = startDate;
        this.f240623c = endDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f240621a, aVar.f240621a) && Intrinsics.f(this.f240622b, aVar.f240622b) && Intrinsics.f(this.f240623c, aVar.f240623c);
    }

    public final int hashCode() {
        return this.f240623c.hashCode() + r6.b.c(this.f240621a.hashCode() * 31, 31, this.f240622b);
    }
}
