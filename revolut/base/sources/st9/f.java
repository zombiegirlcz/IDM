package st9;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f265549c;
    public final Instant d;

    public f(String code, String joinUri, String groupId, Instant expiryDate) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(joinUri, "joinUri");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        this.f265547a = code;
        this.f265548b = joinUri;
        this.f265549c = groupId;
        this.d = expiryDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f265547a, fVar.f265547a) && Intrinsics.f(this.f265548b, fVar.f265548b) && Intrinsics.f(this.f265549c, fVar.f265549c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f265547a.hashCode() * 31, 31, this.f265548b), 31, this.f265549c);
    }
}
