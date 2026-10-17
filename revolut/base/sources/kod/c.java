package kod;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f186300a;

    public c(b selectedOption) {
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        this.f186300a = selectedOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f186300a == ((c) obj2).f186300a;
    }

    public final int hashCode() {
        return this.f186300a.hashCode();
    }
}
