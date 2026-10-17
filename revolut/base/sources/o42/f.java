package o42;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import whf.p;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f221980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f221981b;

    public f(List moneyRequests, p pVar) {
        Intrinsics.checkNotNullParameter(moneyRequests, "moneyRequests");
        this.f221980a = moneyRequests;
        this.f221981b = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f221980a, fVar.f221980a) && Intrinsics.f(this.f221981b, fVar.f221981b);
    }

    public final int hashCode() {
        int iHashCode = this.f221980a.hashCode() * 31;
        p pVar = this.f221981b;
        return iHashCode + (pVar == null ? 0 : pVar.hashCode());
    }
}
