package gpf;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145449a;

    public a(String reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        this.f145449a = reference;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f145449a, ((a) obj2).f145449a);
    }

    public final int hashCode() {
        return this.f145449a.hashCode();
    }
}
