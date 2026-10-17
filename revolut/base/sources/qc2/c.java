package qc2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a12.c f244518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a12.f f244519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a12.m f244520c;

    public c(a12.c contactsInfo, a12.f draftsInfo, a12.m transactionsInfo) {
        Intrinsics.checkNotNullParameter(contactsInfo, "contactsInfo");
        Intrinsics.checkNotNullParameter(draftsInfo, "draftsInfo");
        Intrinsics.checkNotNullParameter(transactionsInfo, "transactionsInfo");
        this.f244518a = contactsInfo;
        this.f244519b = draftsInfo;
        this.f244520c = transactionsInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f244518a, cVar.f244518a) && Intrinsics.f(this.f244519b, cVar.f244519b) && Intrinsics.f(this.f244520c, cVar.f244520c);
    }

    public final int hashCode() {
        return this.f244520c.hashCode() + ((this.f244519b.hashCode() + (this.f244518a.f468a.hashCode() * 31)) * 31);
    }
}
