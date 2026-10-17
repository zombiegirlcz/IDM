package doh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f116564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f116565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f116566c;

    public e(Data popularFirstBuyPerformanceAssets, Data data, boolean z) {
        Intrinsics.checkNotNullParameter(popularFirstBuyPerformanceAssets, "popularFirstBuyPerformanceAssets");
        this.f116564a = z;
        this.f116565b = popularFirstBuyPerformanceAssets;
        this.f116566c = data;
    }

    public static e a(e eVar, boolean z, Data popularFirstBuyPerformanceAssets, Data data, int i) {
        if ((i & 1) != 0) {
            z = eVar.f116564a;
        }
        if ((i & 2) != 0) {
            popularFirstBuyPerformanceAssets = eVar.f116565b;
        }
        if ((i & 4) != 0) {
            data = eVar.f116566c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(popularFirstBuyPerformanceAssets, "popularFirstBuyPerformanceAssets");
        return new e(popularFirstBuyPerformanceAssets, data, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f116564a == eVar.f116564a && Intrinsics.f(this.f116565b, eVar.f116565b) && Intrinsics.f(this.f116566c, eVar.f116566c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f116565b, Boolean.hashCode(this.f116564a) * 31, 31);
        Data data = this.f116566c;
        return iC + (data == null ? 0 : data.hashCode());
    }
}
