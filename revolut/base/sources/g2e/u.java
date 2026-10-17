package g2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f140033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f140034c;
    public final String d;

    public u(String carouselId, Integer num, String str, Integer num2) {
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        this.f140032a = carouselId;
        this.f140033b = num;
        this.f140034c = num2;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f140032a, uVar.f140032a) && Intrinsics.f(this.f140033b, uVar.f140033b) && Intrinsics.f(this.f140034c, uVar.f140034c) && Intrinsics.f(this.d, uVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f140032a.hashCode() * 31;
        Integer num = this.f140033b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f140034c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }
}
