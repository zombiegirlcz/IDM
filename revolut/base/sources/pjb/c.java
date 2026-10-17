package pjb;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f236722a;

    public c(ArrayList upgradedRates) {
        Intrinsics.checkNotNullParameter(upgradedRates, "upgradedRates");
        this.f236722a = upgradedRates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f236722a.equals(((c) obj2).f236722a);
    }

    public final int hashCode() {
        return this.f236722a.hashCode();
    }
}
