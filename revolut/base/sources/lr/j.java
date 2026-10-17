package lr;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f199345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f199346b;

    public j(long j2, ArrayList flows) {
        Intrinsics.checkNotNullParameter(flows, "flows");
        this.f199345a = flows;
        this.f199346b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f199345a.equals(jVar.f199345a) && this.f199346b == jVar.f199346b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f199346b) + (this.f199345a.hashCode() * 31);
    }
}
