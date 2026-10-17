package ez3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f130889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f130890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f130891c;

    public c(b details, a address, m successPopup) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(successPopup, "successPopup");
        this.f130889a = details;
        this.f130890b = address;
        this.f130891c = successPopup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f130889a, cVar.f130889a) && Intrinsics.f(this.f130890b, cVar.f130890b) && Intrinsics.f(this.f130891c, cVar.f130891c);
    }

    public final int hashCode() {
        return this.f130891c.hashCode() + ((this.f130890b.hashCode() + (this.f130889a.hashCode() * 31)) * 31);
    }
}
