package ba0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f13868c;

    public e(long j2, ArrayList transactionIds, boolean z) {
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        this.f13866a = z;
        this.f13867b = j2;
        this.f13868c = transactionIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f13866a == eVar.f13866a && this.f13867b == eVar.f13867b && this.f13868c.equals(eVar.f13868c);
    }

    public final int hashCode() {
        return this.f13868c.hashCode() + a0.d.c(Boolean.hashCode(this.f13866a) * 31, 31, this.f13867b);
    }
}
