package yvk;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f317217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingLegalEntityInformation f317218b;

    public f() {
        this(0);
    }

    public static f a(f fVar, Data assetStatsIds, TradingLegalEntityInformation tradingLegalEntityInformation, int i) {
        if ((i & 1) != 0) {
            assetStatsIds = fVar.f317217a;
        }
        if ((i & 2) != 0) {
            tradingLegalEntityInformation = fVar.f317218b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(assetStatsIds, "assetStatsIds");
        return new f(assetStatsIds, tradingLegalEntityInformation);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f317217a, fVar.f317217a) && Intrinsics.f(this.f317218b, fVar.f317218b);
    }

    public final int hashCode() {
        int iHashCode = this.f317217a.hashCode() * 31;
        TradingLegalEntityInformation tradingLegalEntityInformation = this.f317218b;
        return iHashCode + (tradingLegalEntityInformation == null ? 0 : tradingLegalEntityInformation.hashCode());
    }

    public f(Data assetStatsIds, TradingLegalEntityInformation tradingLegalEntityInformation) {
        Intrinsics.checkNotNullParameter(assetStatsIds, "assetStatsIds");
        this.f317217a = assetStatsIds;
        this.f317218b = tradingLegalEntityInformation;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null), null);
    }
}
