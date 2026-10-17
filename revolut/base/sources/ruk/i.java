package ruk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f257599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f257600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final twk.e f257601c;
    public final Data d;
    public final dj0.d e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f257602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f257603h;

    public i() {
        this(0);
    }

    public static i a(i iVar, h hVar, Data data, twk.e eVar, Data data2, dj0.d dVar, Data data3, Data data4, int i, int i2) {
        if ((i2 & 1) != 0) {
            hVar = iVar.f257599a;
        }
        h selectedTab = hVar;
        if ((i2 & 2) != 0) {
            data = iVar.f257600b;
        }
        Data wealthDisclaimersData = data;
        if ((i2 & 4) != 0) {
            eVar = iVar.f257601c;
        }
        twk.e priceTargetMode = eVar;
        if ((i2 & 8) != 0) {
            data2 = iVar.d;
        }
        Data priceTarget = data2;
        if ((i2 & 16) != 0) {
            dVar = iVar.e;
        }
        dj0.d dVar2 = dVar;
        if ((i2 & 32) != 0) {
            data3 = iVar.f;
        }
        Data recommendationConsensus = data3;
        Data historicalRecommendations = (i2 & 64) != 0 ? iVar.f257602g : data4;
        int i3 = (i2 & 128) != 0 ? iVar.f257603h : i;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
        Intrinsics.checkNotNullParameter(priceTargetMode, "priceTargetMode");
        Intrinsics.checkNotNullParameter(priceTarget, "priceTarget");
        Intrinsics.checkNotNullParameter(recommendationConsensus, "recommendationConsensus");
        Intrinsics.checkNotNullParameter(historicalRecommendations, "historicalRecommendations");
        return new i(selectedTab, wealthDisclaimersData, priceTargetMode, priceTarget, dVar2, recommendationConsensus, historicalRecommendations, i3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f257599a == iVar.f257599a && Intrinsics.f(this.f257600b, iVar.f257600b) && this.f257601c == iVar.f257601c && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f257602g, iVar.f257602g) && this.f257603h == iVar.f257603h;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.d, (this.f257601c.hashCode() + kii.e.c(this.f257600b, this.f257599a.hashCode() * 31, 31)) * 31, 31);
        dj0.d dVar = this.e;
        return Integer.hashCode(this.f257603h) + kii.e.c(this.f257602g, kii.e.c(this.f, (iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31);
    }

    public i(h selectedTab, Data wealthDisclaimersData, twk.e priceTargetMode, Data priceTarget, dj0.d dVar, Data recommendationConsensus, Data historicalRecommendations, int i) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
        Intrinsics.checkNotNullParameter(priceTargetMode, "priceTargetMode");
        Intrinsics.checkNotNullParameter(priceTarget, "priceTarget");
        Intrinsics.checkNotNullParameter(recommendationConsensus, "recommendationConsensus");
        Intrinsics.checkNotNullParameter(historicalRecommendations, "historicalRecommendations");
        this.f257599a = selectedTab;
        this.f257600b = wealthDisclaimersData;
        this.f257601c = priceTargetMode;
        this.d = priceTarget;
        this.e = dVar;
        this.f = recommendationConsensus;
        this.f257602g = historicalRecommendations;
        this.f257603h = i;
    }

    public /* synthetic */ i(int i) {
        this(g.f257598a, new Data(null, null, true, 3, null), twk.e.ABS, new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), -1);
    }
}
