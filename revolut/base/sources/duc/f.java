package duc;

import aii.r;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f117962a;

    public f(f0 revolutCard) {
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        this.f117962a = revolutCard;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f117962a, ((f) obj2).f117962a);
    }

    public final int hashCode() {
        return this.f117962a.hashCode();
    }
}
