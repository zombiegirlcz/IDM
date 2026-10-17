package nyg;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vyg.c f220869a;

    public a(vyg.c selectedTimeframe) {
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        this.f220869a = selectedTimeframe;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f220869a == ((a) obj2).f220869a;
    }

    public final int hashCode() {
        return this.f220869a.hashCode();
    }
}
