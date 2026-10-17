package tma;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f272169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f272171c;
    public final boolean d;

    public e(String email, int i, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f272169a = j2;
        this.f272170b = email;
        this.f272171c = i;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f272169a == eVar.f272169a && Intrinsics.f(this.f272170b, eVar.f272170b) && this.f272171c == eVar.f272171c && this.d == eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.b(this.f272171c, p.a.c(Long.hashCode(this.f272169a) * 31, 31, this.f272170b), 31);
    }
}
