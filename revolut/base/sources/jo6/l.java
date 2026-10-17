package jo6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f176878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final se6.g f176879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f176880c;

    public l(xi0.b bVar, se6.g crossBorderOpenBankingOperationType, String str) {
        Intrinsics.checkNotNullParameter(crossBorderOpenBankingOperationType, "crossBorderOpenBankingOperationType");
        this.f176878a = bVar;
        this.f176879b = crossBorderOpenBankingOperationType;
        this.f176880c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f176878a, lVar.f176878a) && this.f176879b == lVar.f176879b && Intrinsics.f(this.f176880c, lVar.f176880c);
    }

    public final int hashCode() {
        xi0.b bVar = this.f176878a;
        int iHashCode = (this.f176879b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31)) * 31;
        String str = this.f176880c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
