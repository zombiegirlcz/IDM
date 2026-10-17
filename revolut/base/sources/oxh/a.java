package oxh;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import nxh.f;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f230840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f230841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f230842c;
    public final Instant d;

    public a(String token, String uploadToken, Instant startDate, Instant endDate) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(uploadToken, "uploadToken");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f230840a = token;
        this.f230841b = uploadToken;
        this.f230842c = startDate;
        this.d = endDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f230840a, aVar.f230840a) && Intrinsics.f(this.f230841b, aVar.f230841b) && Intrinsics.f(this.f230842c, aVar.f230842c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r6.b.c(p.a.c(this.f230840a.hashCode() * 31, 31, this.f230841b), 31, this.f230842c);
    }
}
