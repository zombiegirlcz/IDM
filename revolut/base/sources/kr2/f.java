package kr2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188649b;

    public f(String transactionGroupId, String merchantBlockageId) {
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
        Intrinsics.checkNotNullParameter(merchantBlockageId, "merchantBlockageId");
        this.f188648a = transactionGroupId;
        this.f188649b = merchantBlockageId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f188648a, fVar.f188648a) && Intrinsics.f(this.f188649b, fVar.f188649b);
    }

    public final int hashCode() {
        return this.f188649b.hashCode() + (this.f188648a.hashCode() * 31);
    }
}
