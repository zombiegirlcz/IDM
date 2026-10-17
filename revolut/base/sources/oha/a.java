package oha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f225324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f225325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f225326c;
    public final Long d;
    public final boolean e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f225327g;

    public a(c code, e type, double d, Long l2, boolean z, dj0.d dVar, dj0.d dVar2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f225324a = code;
        this.f225325b = type;
        this.f225326c = d;
        this.d = l2;
        this.e = z;
        this.f = dVar;
        this.f225327g = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f225324a, aVar.f225324a) && Intrinsics.f(this.f225325b, aVar.f225325b) && Double.compare(this.f225326c, aVar.f225326c) == 0 && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f225327g, aVar.f225327g);
    }

    public final int hashCode() {
        int iC = m72.b.c(p.a.c(this.f225324a.f225329a.hashCode() * 31, 31, this.f225325b.f225332a), this.f225326c, 31);
        Long l2 = this.d;
        int iC2 = j6.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.e);
        dj0.d dVar = this.f;
        int iHashCode = (iC2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f225327g;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
