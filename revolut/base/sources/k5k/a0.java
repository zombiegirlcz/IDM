package k5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f181526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f181528c;
    public final wi0.b d;

    public a0(dj0.d amount, String str, String str2, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f181526a = amount;
        this.f181527b = str;
        this.f181528c = str2;
        this.d = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f181526a, a0Var.f181526a) && Intrinsics.f(this.f181527b, a0Var.f181527b) && Intrinsics.f(this.f181528c, a0Var.f181528c) && Intrinsics.f(this.d, a0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f181526a.hashCode() * 31;
        String str = this.f181527b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f181528c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        wi0.b bVar = this.d;
        return iHashCode3 + (bVar != null ? bVar.f297794a.hashCode() : 0);
    }
}
