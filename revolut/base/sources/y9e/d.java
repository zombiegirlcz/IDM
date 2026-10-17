package y9e;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f311844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fva.e f311845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f311846c;

    public d(fva.e selectedFrequency, List availableFrequencies, p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        Intrinsics.checkNotNullParameter(availableFrequencies, "availableFrequencies");
        this.f311844a = subscription;
        this.f311845b = selectedFrequency;
        this.f311846c = availableFrequencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f311844a, dVar.f311844a) && this.f311845b == dVar.f311845b && Intrinsics.f(this.f311846c, dVar.f311846c);
    }

    public final int hashCode() {
        return this.f311846c.hashCode() + ((this.f311845b.hashCode() + (this.f311844a.hashCode() * 31)) * 31);
    }
}
