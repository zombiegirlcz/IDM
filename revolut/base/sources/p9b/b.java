package p9b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f234290b;

    public b(String registeredIdentityId, a bottomSheetItemAction) {
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        Intrinsics.checkNotNullParameter(bottomSheetItemAction, "bottomSheetItemAction");
        this.f234289a = registeredIdentityId;
        this.f234290b = bottomSheetItemAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f234289a, bVar.f234289a) && this.f234290b == bVar.f234290b;
    }

    public final int hashCode() {
        return this.f234290b.hashCode() + (this.f234289a.hashCode() * 31);
    }
}
