package bse;

import com.revolut.data.model.Data;
import com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f18181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AddMoneyMethod f18182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18183c;

    public g(Data addMoneyMethods, AddMoneyMethod addMoneyMethod, boolean z) {
        Intrinsics.checkNotNullParameter(addMoneyMethods, "addMoneyMethods");
        this.f18181a = addMoneyMethods;
        this.f18182b = addMoneyMethod;
        this.f18183c = z;
    }

    public static g a(g gVar, Data addMoneyMethods, boolean z, int i) {
        if ((i & 1) != 0) {
            addMoneyMethods = gVar.f18181a;
        }
        AddMoneyMethod addMoneyMethod = gVar.f18182b;
        if ((i & 4) != 0) {
            z = gVar.f18183c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(addMoneyMethods, "addMoneyMethods");
        return new g(addMoneyMethods, addMoneyMethod, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f18181a, gVar.f18181a) && Intrinsics.f(this.f18182b, gVar.f18182b) && this.f18183c == gVar.f18183c;
    }

    public final int hashCode() {
        int iHashCode = this.f18181a.hashCode() * 31;
        AddMoneyMethod addMoneyMethod = this.f18182b;
        return Boolean.hashCode(this.f18183c) + ((iHashCode + (addMoneyMethod == null ? 0 : addMoneyMethod.hashCode())) * 31);
    }
}
