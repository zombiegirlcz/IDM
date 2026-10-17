package ez3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f130892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f130893b;

    public d(j details, m successPopup) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(successPopup, "successPopup");
        this.f130892a = details;
        this.f130893b = successPopup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f130892a, dVar.f130892a) && Intrinsics.f(this.f130893b, dVar.f130893b);
    }

    public final int hashCode() {
        return this.f130893b.hashCode() + (this.f130892a.hashCode() * 31);
    }
}
