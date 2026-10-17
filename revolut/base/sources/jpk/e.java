package jpk;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f177315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f177316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.b f177317c;
    public final jo3.b d;
    public final DateTime e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f177318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.b f177319h;
    public final jo3.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jo3.b f177320j;

    public e(DateTime from, DateTime to6, jo3.b startClose, jo3.b endClose, DateTime timestampStart, DateTime timestampEnd, jo3.b open, jo3.b close, jo3.b high, jo3.b low) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(startClose, "startClose");
        Intrinsics.checkNotNullParameter(endClose, "endClose");
        Intrinsics.checkNotNullParameter(timestampStart, "timestampStart");
        Intrinsics.checkNotNullParameter(timestampEnd, "timestampEnd");
        Intrinsics.checkNotNullParameter(open, "open");
        Intrinsics.checkNotNullParameter(close, "close");
        Intrinsics.checkNotNullParameter(high, "high");
        Intrinsics.checkNotNullParameter(low, "low");
        this.f177315a = from;
        this.f177316b = to6;
        this.f177317c = startClose;
        this.d = endClose;
        this.e = timestampStart;
        this.f = timestampEnd;
        this.f177318g = open;
        this.f177319h = close;
        this.i = high;
        this.f177320j = low;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f177315a, eVar.f177315a) && Intrinsics.f(this.f177316b, eVar.f177316b) && Intrinsics.f(this.f177317c, eVar.f177317c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f177318g, eVar.f177318g) && Intrinsics.f(this.f177319h, eVar.f177319h) && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f177320j, eVar.f177320j);
    }

    public final int hashCode() {
        return this.f177320j.hashCode() + y.e(this.i, y.e(this.f177319h, y.e(this.f177318g, m72.b.f(this.f, m72.b.f(this.e, y.e(this.d, y.e(this.f177317c, m72.b.f(this.f177316b, this.f177315a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
