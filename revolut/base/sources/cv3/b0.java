package cv3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f109237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f109238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f109239c;
    public final mu3.b d;
    public final fu3.c e;
    public final mv3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hu3.a f109240g;

    public b0(d0 d0Var, s sVar, a aVar, mu3.b bVar, fu3.c cVar, mv3.a aVar2, hu3.a aVar3) {
        this.f109237a = d0Var;
        this.f109238b = sVar;
        this.f109239c = aVar;
        this.d = bVar;
        this.e = cVar;
        this.f = aVar2;
        this.f109240g = aVar3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f109237a, b0Var.f109237a) && Intrinsics.f(this.f109238b, b0Var.f109238b) && Intrinsics.f(this.f109239c, b0Var.f109239c) && Intrinsics.f(this.d, b0Var.d) && Intrinsics.f(this.e, b0Var.e) && Intrinsics.f(this.f, b0Var.f) && Intrinsics.f(this.f109240g, b0Var.f109240g);
    }

    public final int hashCode() {
        d0 d0Var = this.f109237a;
        int iHashCode = (d0Var == null ? 0 : d0Var.hashCode()) * 31;
        s sVar = this.f109238b;
        int iHashCode2 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        a aVar = this.f109239c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        mu3.b bVar = this.d;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        fu3.c cVar = this.e;
        int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        mv3.a aVar2 = this.f;
        int iHashCode6 = (iHashCode5 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        hu3.a aVar3 = this.f109240g;
        return iHashCode6 + (aVar3 != null ? aVar3.hashCode() : 0);
    }
}
