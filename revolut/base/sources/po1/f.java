package po1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237878a;

    public f(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f237878a = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f237878a, ((f) obj2).f237878a);
    }

    public final int hashCode() {
        return this.f237878a.hashCode();
    }
}
