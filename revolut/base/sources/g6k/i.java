package g6k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final krf.c f140992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140993b;

    public i(krf.c cVar, String rejectReason) {
        Intrinsics.checkNotNullParameter(rejectReason, "rejectReason");
        this.f140992a = cVar;
        this.f140993b = rejectReason;
    }

    public static i a(i iVar, krf.c cVar, String rejectReason, int i) {
        if ((i & 1) != 0) {
            cVar = iVar.f140992a;
        }
        if ((i & 2) != 0) {
            rejectReason = iVar.f140993b;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(rejectReason, "rejectReason");
        return new i(cVar, rejectReason);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f140992a, iVar.f140992a) && Intrinsics.f(this.f140993b, iVar.f140993b);
    }

    public final int hashCode() {
        krf.c cVar = this.f140992a;
        return this.f140993b.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31);
    }
}
