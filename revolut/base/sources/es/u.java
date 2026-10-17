package es;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f128773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f128774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f128775c;

    public u(Map properties, v status, long j2) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f128773a = properties;
        this.f128774b = status;
        this.f128775c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f128773a, uVar.f128773a) && this.f128774b == uVar.f128774b && this.f128775c == uVar.f128775c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f128775c) + ((this.f128774b.hashCode() + (this.f128773a.hashCode() * 31)) * 31);
    }
}
