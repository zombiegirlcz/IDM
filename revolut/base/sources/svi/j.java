package svi;

import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f265925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f265926c;
    public final LocalDateTime d;
    public final e e;
    public final p0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f265927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r0 f265928h;

    public j(String id10, int i, x state, LocalDateTime localDateTime, e eVar, p0 p0Var, boolean z, r0 walletStyle) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(walletStyle, "walletStyle");
        this.f265924a = id10;
        this.f265925b = i;
        this.f265926c = state;
        this.d = localDateTime;
        this.e = eVar;
        this.f = p0Var;
        this.f265927g = z;
        this.f265928h = walletStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f265924a, jVar.f265924a) && this.f265925b == jVar.f265925b && this.f265926c == jVar.f265926c && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && this.f265927g == jVar.f265927g && this.f265928h == jVar.f265928h;
    }

    public final int hashCode() {
        int iHashCode = (this.f265926c.hashCode() + j6.a.b(this.f265925b, this.f265924a.hashCode() * 31, 31)) * 31;
        LocalDateTime localDateTime = this.d;
        int iHashCode2 = (iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        e eVar = this.e;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        p0 p0Var = this.f;
        return this.f265928h.hashCode() + j6.a.c((iHashCode3 + (p0Var != null ? p0Var.hashCode() : 0)) * 31, 31, this.f265927g);
    }
}
