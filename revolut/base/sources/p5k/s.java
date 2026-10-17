package p5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f233181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f233182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f233183c;
    public final wi0.b d;

    public s(dj0.d amount, String str, String str2, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f233181a = amount;
        this.f233182b = str;
        this.f233183c = str2;
        this.d = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f233181a, sVar.f233181a) && Intrinsics.f(this.f233182b, sVar.f233182b) && Intrinsics.f(this.f233183c, sVar.f233183c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f233181a.hashCode() * 31;
        String str = this.f233182b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f233183c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        wi0.b bVar = this.d;
        return iHashCode3 + (bVar != null ? bVar.f297794a.hashCode() : 0);
    }
}
