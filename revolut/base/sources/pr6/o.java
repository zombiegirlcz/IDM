package pr6;

import ip0.v7;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f238954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f238955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f238956c;
    public final m d;
    public final dj0.d e;
    public final LocalDateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f238957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f238958h;

    public o(LocalDateTime createdAt, LocalDateTime localDateTime, n type, m state, dj0.d reservedAmount, LocalDateTime releaseDate, dj0.d dVar, String str) {
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(reservedAmount, "reservedAmount");
        Intrinsics.checkNotNullParameter(releaseDate, "releaseDate");
        this.f238954a = createdAt;
        this.f238955b = localDateTime;
        this.f238956c = type;
        this.d = state;
        this.e = reservedAmount;
        this.f = releaseDate;
        this.f238957g = dVar;
        this.f238958h = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f238954a, oVar.f238954a) && Intrinsics.f(this.f238955b, oVar.f238955b) && this.f238956c == oVar.f238956c && this.d == oVar.d && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f238957g, oVar.f238957g) && Intrinsics.f(this.f238958h, oVar.f238958h);
    }

    public final int hashCode() {
        int iHashCode = this.f238954a.hashCode() * 31;
        LocalDateTime localDateTime = this.f238955b;
        int i = v7.i(this.f, v7.c((this.d.hashCode() + ((this.f238956c.hashCode() + ((iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31)) * 31)) * 31, 31, this.e), 31);
        dj0.d dVar = this.f238957g;
        int iHashCode2 = (i + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f238958h;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
