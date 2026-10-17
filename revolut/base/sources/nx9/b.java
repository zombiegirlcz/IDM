package nx9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f220484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f220485c;
    public final a d;
    public final int e;
    public final long f;

    public b(String recipientId, d recipientType, String itemId, a itemType, int i, long j2) {
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        Intrinsics.checkNotNullParameter(recipientType, "recipientType");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        this.f220483a = recipientId;
        this.f220484b = recipientType;
        this.f220485c = itemId;
        this.d = itemType;
        this.e = i;
        this.f = j2;
    }

    public final String a() {
        return this.f220485c;
    }

    public final a b() {
        return this.d;
    }

    public final String c() {
        return this.f220483a;
    }

    public final d d() {
        return this.f220484b;
    }

    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f220483a, bVar.f220483a) && this.f220484b == bVar.f220484b && Intrinsics.f(this.f220485c, bVar.f220485c) && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f;
    }

    public final long f() {
        return this.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + j6.a.b(this.e, (this.d.hashCode() + p.a.c((this.f220484b.hashCode() + (this.f220483a.hashCode() * 31)) * 31, 31, this.f220485c)) * 31, 31);
    }
}
