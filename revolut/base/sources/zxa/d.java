package zxa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f326094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f326095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f326096c;

    public d(long j2, dj0.d amount, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f326094a = id10;
        this.f326095b = j2;
        this.f326096c = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f326094a, dVar.f326094a) && this.f326095b == dVar.f326095b && Intrinsics.f(this.f326096c, dVar.f326096c);
    }

    public final int hashCode() {
        return this.f326096c.hashCode() + a0.d.c(this.f326094a.hashCode() * 31, 31, this.f326095b);
    }
}
