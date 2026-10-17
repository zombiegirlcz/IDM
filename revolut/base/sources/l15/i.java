package l15;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f191464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f191465c;
    public final String d;

    public i(String title, a contactSection, c cVar, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contactSection, "contactSection");
        this.f191463a = title;
        this.f191464b = contactSection;
        this.f191465c = cVar;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f191463a, iVar.f191463a) && Intrinsics.f(this.f191464b, iVar.f191464b) && Intrinsics.f(this.f191465c, iVar.f191465c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f191464b.hashCode() + (this.f191463a.hashCode() * 31)) * 31;
        c cVar = this.f191465c;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
