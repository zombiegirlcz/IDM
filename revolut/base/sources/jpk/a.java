package jpk;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f177306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f177307c;
    public final DateTime d;
    public final jo3.b e;
    public final jo3.b f;

    public a(String symbol, String duration, DateTime from, DateTime to6, jo3.b startClose, jo3.b endClose) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(startClose, "startClose");
        Intrinsics.checkNotNullParameter(endClose, "endClose");
        this.f177305a = symbol;
        this.f177306b = duration;
        this.f177307c = from;
        this.d = to6;
        this.e = startClose;
        this.f = endClose;
    }

    public final String a() {
        return this.f177306b;
    }

    public final jo3.b b() {
        return this.f;
    }

    public final DateTime c() {
        return this.f177307c;
    }

    public final jo3.b d() {
        return this.e;
    }

    public final String e() {
        return this.f177305a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f177305a, aVar.f177305a) && Intrinsics.f(this.f177306b, aVar.f177306b) && Intrinsics.f(this.f177307c, aVar.f177307c) && Intrinsics.f(this.d, aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f);
    }

    public final DateTime f() {
        return this.d;
    }

    public final int hashCode() {
        return this.f.hashCode() + y.e(this.e, m72.b.f(this.d, m72.b.f(this.f177307c, p.a.c(p.a.c(Long.hashCode(0L) * 31, 31, this.f177305a), 31, this.f177306b), 31), 31), 31);
    }
}
