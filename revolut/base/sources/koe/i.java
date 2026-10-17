package koe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f186317a;

    public i(List existingTaxResidencies) {
        Intrinsics.checkNotNullParameter(existingTaxResidencies, "existingTaxResidencies");
        this.f186317a = existingTaxResidencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f186317a, ((i) obj2).f186317a);
    }

    public final int hashCode() {
        return this.f186317a.hashCode();
    }
}
