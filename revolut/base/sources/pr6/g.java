package pr6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f238951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nr6.b f238952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f238953c;

    public g(e payment, nr6.b bVar, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f238951a = payment;
        this.f238952b = bVar;
        this.f238953c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f238951a, gVar.f238951a) && Intrinsics.f(this.f238952b, gVar.f238952b) && Intrinsics.f(this.f238953c, gVar.f238953c);
    }

    public final int hashCode() {
        int iHashCode = this.f238951a.hashCode() * 31;
        nr6.b bVar = this.f238952b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        dj0.d dVar = this.f238953c;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
