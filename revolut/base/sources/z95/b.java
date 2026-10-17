package z95;

import ip0.v7;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f320310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f320311c;
    public final a d;

    public b(String name, LocalDateTime expirationDate, String applicationId, a flowType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f320309a = name;
        this.f320310b = expirationDate;
        this.f320311c = applicationId;
        this.d = flowType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f320309a, bVar.f320309a) && Intrinsics.f(this.f320310b, bVar.f320310b) && Intrinsics.f(this.f320311c, bVar.f320311c) && this.d == bVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(v7.i(this.f320310b, this.f320309a.hashCode() * 31, 31), 31, this.f320311c);
    }
}
