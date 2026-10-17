package nu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f219203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f219204c;

    public f(long j2, Integer num, String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f219202a = planId;
        this.f219203b = j2;
        this.f219204c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f219202a, fVar.f219202a) && this.f219203b == fVar.f219203b && Intrinsics.f(this.f219204c, fVar.f219204c);
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f219202a.hashCode() * 31, 31, this.f219203b);
        Integer num = this.f219204c;
        return iC + (num == null ? 0 : num.hashCode());
    }
}
