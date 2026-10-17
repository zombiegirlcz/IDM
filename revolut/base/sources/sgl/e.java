package sgl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f262676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262677b;

    public e(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f262676a = j2;
        this.f262677b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f262676a == eVar.f262676a && Intrinsics.f(this.f262677b, eVar.f262677b);
    }

    public final int hashCode() {
        return this.f262677b.hashCode() + (Long.hashCode(this.f262676a) * 31);
    }
}
