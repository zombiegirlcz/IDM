package lmh;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.f f197078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f197079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f197080c;
    public final Data d;
    public final ScreenerSortingOptions e;
    public final boolean f;

    public e(zel.f instrumentGroup, Data data, Data data2, Data swipeableAssets, ScreenerSortingOptions screenerSortingOptions, boolean z) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        Intrinsics.checkNotNullParameter(swipeableAssets, "swipeableAssets");
        this.f197078a = instrumentGroup;
        this.f197079b = data;
        this.f197080c = data2;
        this.d = swipeableAssets;
        this.e = screenerSortingOptions;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f197078a == eVar.f197078a && Intrinsics.f(this.f197079b, eVar.f197079b) && Intrinsics.f(this.f197080c, eVar.f197080c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && this.f == eVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.f197078a.hashCode() * 31;
        Data data = this.f197079b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f197080c;
        int iC = kii.e.c(this.d, (iHashCode2 + (data2 == null ? 0 : data2.hashCode())) * 31, 31);
        ScreenerSortingOptions screenerSortingOptions = this.e;
        return Boolean.hashCode(this.f) + ((iC + (screenerSortingOptions != null ? screenerSortingOptions.hashCode() : 0)) * 31);
    }
}
