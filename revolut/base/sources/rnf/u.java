package rnf;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f255687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f255688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f255689c;
    public final Data d;

    public u(a3 transaction, f0 warrantBannerWidget, f0 multiCurrencyWidget, Data geoMapData) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(warrantBannerWidget, "warrantBannerWidget");
        Intrinsics.checkNotNullParameter(multiCurrencyWidget, "multiCurrencyWidget");
        Intrinsics.checkNotNullParameter(geoMapData, "geoMapData");
        this.f255687a = transaction;
        this.f255688b = warrantBannerWidget;
        this.f255689c = multiCurrencyWidget;
        this.d = geoMapData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f255687a.equals(uVar.f255687a) && Intrinsics.f(this.f255688b, uVar.f255688b) && Intrinsics.f(this.f255689c, uVar.f255689c) && this.d.equals(uVar.d);
    }

    public final int hashCode() {
        return kii.e.c(this.d, p.a.d(p.a.d(this.f255687a.hashCode() * 31, 31, this.f255688b), 31, this.f255689c), 887503681);
    }
}
