package qxh;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import nxh.f;
import r6.b;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f250095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f250096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f250097c;

    public a(String token, Instant startDate, Instant endDate) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f250095a = token;
        this.f250096b = startDate;
        this.f250097c = endDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f250095a, aVar.f250095a) && Intrinsics.f(this.f250096b, aVar.f250096b) && Intrinsics.f(this.f250097c, aVar.f250097c);
    }

    public final int hashCode() {
        return this.f250097c.hashCode() + b.c(this.f250095a.hashCode() * 31, 31, this.f250096b);
    }
}
