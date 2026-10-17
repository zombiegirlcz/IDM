package vo1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f290842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f290843b;

    public d(b general, b newTransfer) {
        Intrinsics.checkNotNullParameter(general, "general");
        Intrinsics.checkNotNullParameter(newTransfer, "newTransfer");
        this.f290842a = general;
        this.f290843b = newTransfer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f290842a, dVar.f290842a) && Intrinsics.f(this.f290843b, dVar.f290843b);
    }

    public final int hashCode() {
        return this.f290843b.hashCode() + (this.f290842a.hashCode() * 31);
    }
}
