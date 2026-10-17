package ri6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f254562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f254563b;

    public d(io3.d pocket, boolean z) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f254562a = pocket;
        this.f254563b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f254562a.equals(dVar.f254562a) && this.f254563b == dVar.f254563b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f254563b) + (this.f254562a.hashCode() * 31);
    }
}
