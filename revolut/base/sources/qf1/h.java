package qf1;

import aii.u;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f245217a;

    public h(ParcelableDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f245217a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f245217a, ((h) obj2).f245217a);
    }

    public final int hashCode() {
        return this.f245217a.hashCode();
    }
}
