package chf;

import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSorter f24211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f24212b;

    public d(IncomeSorter incomeSorter, a3 transaction) {
        Intrinsics.checkNotNullParameter(incomeSorter, "incomeSorter");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f24211a = incomeSorter;
        this.f24212b = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f24211a, dVar.f24211a) && Intrinsics.f(this.f24212b, dVar.f24212b);
    }

    public final int hashCode() {
        return this.f24212b.hashCode() + (this.f24211a.hashCode() * 31);
    }
}
