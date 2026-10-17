package csd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f108467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f108468b;

    public a(Long l2, long j2) {
        this.f108467a = l2;
        this.f108468b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f108467a, aVar.f108467a) && this.f108468b == aVar.f108468b;
    }

    public final int hashCode() {
        Long l2 = this.f108467a;
        return Long.hashCode(this.f108468b) + ((l2 == null ? 0 : l2.hashCode()) * 31);
    }
}
