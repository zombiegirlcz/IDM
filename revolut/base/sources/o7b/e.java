package o7b;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f222738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222739b;

    public e(Data availableRewardsData, String str) {
        Intrinsics.checkNotNullParameter(availableRewardsData, "availableRewardsData");
        this.f222738a = availableRewardsData;
        this.f222739b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f222738a, eVar.f222738a) && Intrinsics.f(this.f222739b, eVar.f222739b);
    }

    public final int hashCode() {
        int iHashCode = this.f222738a.hashCode() * 31;
        String str = this.f222739b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
