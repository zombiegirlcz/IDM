package wbl;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f296255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kel.n f296256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InstrumentTicker f296257c;

    public d(f asset, kel.n holding, InstrumentTicker ticker) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(holding, "holding");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        this.f296255a = asset;
        this.f296256b = holding;
        this.f296257c = ticker;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f296255a, dVar.f296255a) && Intrinsics.f(this.f296256b, dVar.f296256b) && Intrinsics.f(this.f296257c, dVar.f296257c);
    }

    public final int hashCode() {
        return this.f296257c.hashCode() + ((this.f296256b.hashCode() + (this.f296255a.hashCode() * 31)) * 31);
    }
}
