package nof;

import com.revolut.core.ui_kit.models.Clause;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f218028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f218029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f218030c;
    public final i7 d;

    public e(int i, dj0.d receivedAmount, Clause sourceName, i7 filter) {
        Intrinsics.checkNotNullParameter(receivedAmount, "receivedAmount");
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f218028a = i;
        this.f218029b = receivedAmount;
        this.f218030c = sourceName;
        this.d = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f218028a == eVar.f218028a && Intrinsics.f(this.f218029b, eVar.f218029b) && this.f218030c.equals(eVar.f218030c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.b(v7.c(Integer.hashCode(this.f218028a) * 31, 31, this.f218029b), 31, this.f218030c);
    }
}
