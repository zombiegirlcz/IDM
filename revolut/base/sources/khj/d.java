package khj;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f184148a;

    public d(i selectedOption) {
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        this.f184148a = selectedOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f184148a, ((d) obj2).f184148a);
    }

    public final int hashCode() {
        return this.f184148a.hashCode();
    }
}
