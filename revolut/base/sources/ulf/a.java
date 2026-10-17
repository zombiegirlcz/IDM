package ulf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1j.a f280960b;

    public a(String balanceId, k1j.a type) {
        Intrinsics.checkNotNullParameter(balanceId, "balanceId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f280959a = balanceId;
        this.f280960b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f280959a, aVar.f280959a) && this.f280960b == aVar.f280960b;
    }

    public final int hashCode() {
        return this.f280960b.hashCode() + (this.f280959a.hashCode() * 31);
    }
}
