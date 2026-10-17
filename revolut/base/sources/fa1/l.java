package fa1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f133190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f133191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f133192c;
    public final m d;
    public final y e;

    public l(o paymentStatus, j cardReaderInterface, n paymentState, m mVar, y yVar) {
        Intrinsics.checkNotNullParameter(paymentStatus, "paymentStatus");
        Intrinsics.checkNotNullParameter(cardReaderInterface, "cardReaderInterface");
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        this.f133190a = paymentStatus;
        this.f133191b = cardReaderInterface;
        this.f133192c = paymentState;
        this.d = mVar;
        this.e = yVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f133190a, lVar.f133190a) && this.f133191b == lVar.f133191b && this.f133192c == lVar.f133192c && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f133192c.hashCode() + ((this.f133191b.hashCode() + (this.f133190a.hashCode() * 31)) * 31)) * 31;
        m mVar = this.d;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        y yVar = this.e;
        return iHashCode2 + (yVar != null ? yVar.hashCode() : 0);
    }

    public /* synthetic */ l(o oVar, j jVar, n nVar, int i) {
        this(oVar, (i & 2) != 0 ? j.UNKNOWN : jVar, nVar, null, null);
    }
}
