package gk2;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f144309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f144310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f144311c;
    public final long d;

    public e(dj0.d moneyLimit, dj0.d moneyUsage, long j2, long j3) {
        Intrinsics.checkNotNullParameter(moneyLimit, "moneyLimit");
        Intrinsics.checkNotNullParameter(moneyUsage, "moneyUsage");
        this.f144309a = moneyLimit;
        this.f144310b = moneyUsage;
        this.f144311c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f144309a, eVar.f144309a) && Intrinsics.f(this.f144310b, eVar.f144310b) && this.f144311c == eVar.f144311c && this.d == eVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + a0.d.c(v7.c(this.f144309a.hashCode() * 31, 31, this.f144310b), 31, this.f144311c);
    }
}
