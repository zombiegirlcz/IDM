package fo3;

import h30.l;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f136802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136803c;
    public final xi0.b d;
    public final long e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f136804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f136805h;

    public c(String id10, e state, String str, xi0.b baseCurrency, long j2, Long l2, LocalDate localDate, String ownerId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.f136801a = id10;
        this.f136802b = state;
        this.f136803c = str;
        this.d = baseCurrency;
        this.e = j2;
        this.f = l2;
        this.f136804g = localDate;
        this.f136805h = ownerId;
    }

    public final xi0.b a() {
        return this.d;
    }

    public final String b() {
        return this.f136801a;
    }

    public final String c() {
        return this.f136805h;
    }

    public final String d() {
        return this.f136803c;
    }

    public final e e() {
        return this.f136802b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f136801a, cVar.f136801a) && this.f136802b == cVar.f136802b && Intrinsics.f(this.f136803c, cVar.f136803c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f136804g, cVar.f136804g) && Intrinsics.f(this.f136805h, cVar.f136805h);
    }

    public final Long f() {
        return this.f;
    }

    public final LocalDate g() {
        return this.f136804g;
    }

    public final long h() {
        Long l2 = this.f;
        if (l2 != null) {
            return l2.longValue();
        }
        return Long.MAX_VALUE;
    }

    public final int hashCode() {
        int iHashCode = (this.f136802b.hashCode() + (this.f136801a.hashCode() * 31)) * 31;
        String str = this.f136803c;
        int iC = a0.d.c(l.j(this.d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e);
        Long l2 = this.f;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        LocalDate localDate = this.f136804g;
        return this.f136805h.hashCode() + ((iHashCode2 + (localDate != null ? localDate.hashCode() : 0)) * 31);
    }

    public final long i() {
        return this.e;
    }
}
