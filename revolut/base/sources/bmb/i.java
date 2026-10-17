package bmb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f16791a;

    public i(l selectedOption) {
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        this.f16791a = selectedOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f16791a, ((i) obj2).f16791a);
    }

    public final int hashCode() {
        return this.f16791a.hashCode();
    }
}
