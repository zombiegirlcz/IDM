package pxc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f240601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240602c;

    public c(String ticketId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        this.f240600a = ticketId;
        this.f240601b = z;
        this.f240602c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f240600a, cVar.f240600a) && this.f240601b == cVar.f240601b && Intrinsics.f(this.f240602c, cVar.f240602c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f240600a.hashCode() * 31, 31, this.f240601b);
        String str = this.f240602c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
