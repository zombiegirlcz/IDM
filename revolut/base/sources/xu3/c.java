package xu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f308883a;

    public c(x evidenceTypeSelection) {
        Intrinsics.checkNotNullParameter(evidenceTypeSelection, "evidenceTypeSelection");
        this.f308883a = evidenceTypeSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f308883a, ((c) obj2).f308883a);
    }

    public final int hashCode() {
        return this.f308883a.hashCode();
    }
}
