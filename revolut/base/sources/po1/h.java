package po1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237879a;

    public h(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f237879a = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f237879a, ((h) obj2).f237879a);
    }

    public final int hashCode() {
        return this.f237879a.hashCode();
    }
}
