package u0g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f276182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276184c;
    public final String d;
    public final Integer e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f276185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f276186h;

    public b(long j2, String experienceId, String publishedDate, String userName, Integer num, String title, String text, d source) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(publishedDate, "publishedDate");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f276182a = j2;
        this.f276183b = experienceId;
        this.f276184c = publishedDate;
        this.d = userName;
        this.e = num;
        this.f = title;
        this.f276185g = text;
        this.f276186h = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f276182a == bVar.f276182a && Intrinsics.f(this.f276183b, bVar.f276183b) && Intrinsics.f(this.f276184c, bVar.f276184c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f276185g, bVar.f276185g) && Intrinsics.f(this.f276186h, bVar.f276186h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(Long.hashCode(this.f276182a) * 31, 31, this.f276183b), 31, this.f276184c), 31, this.d);
        Integer num = this.e;
        return this.f276186h.hashCode() + p.a.c(p.a.c((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.f), 31, this.f276185g);
    }
}
