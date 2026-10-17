package bq2;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wn2.d f17669a;

    public c(wn2.d switchPreference) {
        Intrinsics.checkNotNullParameter(switchPreference, "switchPreference");
        this.f17669a = switchPreference;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f17669a == ((c) obj2).f17669a;
    }

    public final int hashCode() {
        return this.f17669a.hashCode();
    }
}
