package qeg;

import aii.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f245152a;

    public f(Set selectedOptionIds) {
        Intrinsics.checkNotNullParameter(selectedOptionIds, "selectedOptionIds");
        this.f245152a = selectedOptionIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f245152a, ((f) obj2).f245152a);
    }

    public final int hashCode() {
        return this.f245152a.hashCode();
    }
}
