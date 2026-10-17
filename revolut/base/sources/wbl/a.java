package wbl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f296251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f296252c;

    public a(String ref2, LocalDate payDate, dj0.d total) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(payDate, "payDate");
        Intrinsics.checkNotNullParameter(total, "total");
        this.f296250a = ref2;
        this.f296251b = payDate;
        this.f296252c = total;
    }

    @Override // wbl.b
    public final LocalDate a() {
        return this.f296251b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f296250a, aVar.f296250a) && Intrinsics.f(this.f296251b, aVar.f296251b) && Intrinsics.f(this.f296252c, aVar.f296252c);
    }

    public final int hashCode() {
        return this.f296252c.hashCode() + y.a(this.f296250a.hashCode() * 31, 31, this.f296251b);
    }

    @Override // wbl.b
    public final String i() {
        return this.f296250a;
    }
}
