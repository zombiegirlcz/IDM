package a12;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.p f478b;

    public m(List moneyRequests, whf.p pVar) {
        Intrinsics.checkNotNullParameter(moneyRequests, "moneyRequests");
        this.f477a = moneyRequests;
        this.f478b = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f477a, mVar.f477a) && Intrinsics.f(this.f478b, mVar.f478b);
    }

    public final int hashCode() {
        int iHashCode = this.f477a.hashCode() * 31;
        whf.p pVar = this.f478b;
        return iHashCode + (pVar == null ? 0 : pVar.hashCode());
    }
}
