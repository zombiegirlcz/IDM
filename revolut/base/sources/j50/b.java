package j50;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f171424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f171425b;

    public b(UUID referenceId, boolean z) {
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        this.f171424a = referenceId;
        this.f171425b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f171424a.equals(bVar.f171424a) && this.f171425b == bVar.f171425b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f171425b) + (this.f171424a.hashCode() * 31);
    }
}
