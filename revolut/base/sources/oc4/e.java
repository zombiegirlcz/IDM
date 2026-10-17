package oc4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224095a;

    public e(String selectedInsurance) {
        Intrinsics.checkNotNullParameter(selectedInsurance, "selectedInsurance");
        this.f224095a = selectedInsurance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f224095a, ((e) obj2).f224095a);
    }

    public final int hashCode() {
        return this.f224095a.hashCode();
    }
}
