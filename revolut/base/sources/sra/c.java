package sra;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f265157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f265158c;

    public c(String id10, int i, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f265156a = id10;
        this.f265157b = i;
        this.f265158c = j2;
    }

    public static c a(c cVar, long j2) {
        String id10 = cVar.f265156a;
        int i = cVar.f265157b;
        Intrinsics.checkNotNullParameter(id10, "id");
        return new c(id10, i, j2);
    }

    public final String b() {
        return this.f265156a;
    }

    public final long c() {
        return this.f265158c;
    }

    public final int d() {
        return this.f265157b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f265156a, cVar.f265156a) && this.f265157b == cVar.f265157b && this.f265158c == cVar.f265158c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f265158c) + j6.a.b(this.f265157b, this.f265156a.hashCode() * 31, 31);
    }

    public /* synthetic */ c(String str) {
        this(str, 0, 0L);
    }
}
