package wbl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f296264b;

    public g(String ref2, LocalDate payDate) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(payDate, "payDate");
        this.f296263a = ref2;
        this.f296264b = payDate;
    }

    @Override // wbl.b
    public final LocalDate a() {
        return this.f296264b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f296263a, gVar.f296263a) && Intrinsics.f(this.f296264b, gVar.f296264b);
    }

    public final int hashCode() {
        return this.f296264b.hashCode() + (this.f296263a.hashCode() * 31);
    }

    @Override // wbl.b
    public final String i() {
        return this.f296263a;
    }
}
