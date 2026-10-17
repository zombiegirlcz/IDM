package u68;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f277500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f277501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f277502c;

    public a(List profilesWithWalletId, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(profilesWithWalletId, "profilesWithWalletId");
        this.f277500a = profilesWithWalletId;
        this.f277501b = num;
        this.f277502c = num2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f277500a, aVar.f277500a) && Intrinsics.f(this.f277501b, aVar.f277501b) && Intrinsics.f(this.f277502c, aVar.f277502c);
    }

    public final int hashCode() {
        int iHashCode = this.f277500a.hashCode() * 31;
        Integer num = this.f277501b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f277502c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
