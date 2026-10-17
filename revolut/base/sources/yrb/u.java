package yrb;

import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Asset f316246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f316247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qrb.k f316248c;

    public u(Asset asset, int i, qrb.k tradeInstrumentData) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        this.f316246a = asset;
        this.f316247b = i;
        this.f316248c = tradeInstrumentData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f316246a, uVar.f316246a) && this.f316247b == uVar.f316247b && Intrinsics.f(this.f316248c, uVar.f316248c);
    }

    public final int hashCode() {
        return this.f316248c.hashCode() + j6.a.b(this.f316247b, this.f316246a.hashCode() * 31, 31);
    }
}
