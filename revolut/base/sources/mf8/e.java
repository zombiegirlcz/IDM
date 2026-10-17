package mf8;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Serializable {

    @NotNull
    public static final a Companion = new a();
    public static final e e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f204961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f204962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f204963c;
    public final d d;

    static {
        d dVar = d.PASSED;
        e = new e(dVar, null, f0.f322471a, dVar);
    }

    public e(d status, c cVar, List missingDataPoints, d identityStatus) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(missingDataPoints, "missingDataPoints");
        Intrinsics.checkNotNullParameter(identityStatus, "identityStatus");
        this.f204961a = status;
        this.f204962b = cVar;
        this.f204963c = missingDataPoints;
        this.d = identityStatus;
    }

    public final List a() {
        return this.f204963c;
    }

    public final c b() {
        return this.f204962b;
    }

    public final d c() {
        return this.f204961a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f204961a == eVar.f204961a && this.f204962b == eVar.f204962b && Intrinsics.f(this.f204963c, eVar.f204963c) && this.d == eVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f204961a.hashCode() * 31;
        c cVar = this.f204962b;
        return this.d.hashCode() + p.a.d((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f204963c);
    }
}
