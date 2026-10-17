package aei;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3593a;

    public a(List thresholds) {
        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
        this.f3593a = thresholds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f3593a, ((a) obj2).f3593a);
    }

    public final int hashCode() {
        return this.f3593a.hashCode();
    }
}
