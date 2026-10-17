package dn3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116209a;

    public a(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f116209a = requestId;
    }

    @Override // dn3.d
    public final String a() {
        return this.f116209a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f116209a, ((a) obj2).f116209a);
    }

    public final int hashCode() {
        return this.f116209a.hashCode();
    }
}
