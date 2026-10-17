package cul;

import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Asset f109165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aul.f f109167c;

    public s(Asset asset, int i, aul.f inputUnits) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(inputUnits, "inputUnits");
        this.f109165a = asset;
        this.f109166b = i;
        this.f109167c = inputUnits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f109165a, sVar.f109165a) && this.f109166b == sVar.f109166b && Intrinsics.f(this.f109167c, sVar.f109167c);
    }

    public final int hashCode() {
        return this.f109167c.hashCode() + j6.a.b(this.f109166b, this.f109165a.hashCode() * 31, 31);
    }
}
