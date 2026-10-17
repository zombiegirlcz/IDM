package t87;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eel.c f268846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f268847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f268848c;

    public g(eel.c chartPeriod, int i, Data historicalData) {
        Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
        Intrinsics.checkNotNullParameter(historicalData, "historicalData");
        this.f268846a = chartPeriod;
        this.f268847b = i;
        this.f268848c = historicalData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f268846a == gVar.f268846a && this.f268847b == gVar.f268847b && Intrinsics.f(this.f268848c, gVar.f268848c);
    }

    public final int hashCode() {
        return this.f268848c.hashCode() + j6.a.b(this.f268847b, this.f268846a.hashCode() * 31, 31);
    }
}
