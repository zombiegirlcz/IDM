package pvk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f240297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f240298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f240299c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f240300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b1h.d f240301h;
    public final Data i;

    public p() {
        this(0);
    }

    public static p a(p pVar, Data data, Data data2, dj0.d dVar, Data data3, Data data4, Data data5, Data data6, b1h.d dVar2, Data data7, int i) {
        if ((i & 1) != 0) {
            data = pVar.f240297a;
        }
        Data insights = data;
        if ((i & 2) != 0) {
            data2 = pVar.f240298b;
        }
        Data analystRatingsInsight = data2;
        if ((i & 4) != 0) {
            dVar = pVar.f240299c;
        }
        dj0.d dVar3 = dVar;
        if ((i & 8) != 0) {
            data3 = pVar.d;
        }
        Data technicalInsights = data3;
        if ((i & 16) != 0) {
            data4 = pVar.e;
        }
        Data indexMarketSentiment = data4;
        Data actions = (i & 32) != 0 ? pVar.f : data5;
        Data referenceIndexName = (i & 64) != 0 ? pVar.f240300g : data6;
        b1h.d dVar4 = (i & 128) != 0 ? pVar.f240301h : dVar2;
        Data data8 = (i & 256) != 0 ? pVar.i : data7;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(insights, "insights");
        Intrinsics.checkNotNullParameter(analystRatingsInsight, "analystRatingsInsight");
        Intrinsics.checkNotNullParameter(technicalInsights, "technicalInsights");
        Intrinsics.checkNotNullParameter(indexMarketSentiment, "indexMarketSentiment");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(referenceIndexName, "referenceIndexName");
        return new p(insights, analystRatingsInsight, dVar3, technicalInsights, indexMarketSentiment, actions, referenceIndexName, dVar4, data8);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f240297a, pVar.f240297a) && Intrinsics.f(this.f240298b, pVar.f240298b) && Intrinsics.f(this.f240299c, pVar.f240299c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f240300g, pVar.f240300g) && Intrinsics.f(this.f240301h, pVar.f240301h) && Intrinsics.f(this.i, pVar.i);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f240298b, this.f240297a.hashCode() * 31, 31);
        dj0.d dVar = this.f240299c;
        int iC2 = kii.e.c(this.f240300g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, (iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31), 31), 31);
        b1h.d dVar2 = this.f240301h;
        int iHashCode = (iC2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        Data data = this.i;
        return iHashCode + (data != null ? data.hashCode() : 0);
    }

    public p(Data insights, Data analystRatingsInsight, dj0.d dVar, Data technicalInsights, Data indexMarketSentiment, Data actions, Data referenceIndexName, b1h.d dVar2, Data data) {
        Intrinsics.checkNotNullParameter(insights, "insights");
        Intrinsics.checkNotNullParameter(analystRatingsInsight, "analystRatingsInsight");
        Intrinsics.checkNotNullParameter(technicalInsights, "technicalInsights");
        Intrinsics.checkNotNullParameter(indexMarketSentiment, "indexMarketSentiment");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(referenceIndexName, "referenceIndexName");
        this.f240297a = insights;
        this.f240298b = analystRatingsInsight;
        this.f240299c = dVar;
        this.d = technicalInsights;
        this.e = indexMarketSentiment;
        this.f = actions;
        this.f240300g = referenceIndexName;
        this.f240301h = dVar2;
        this.i = data;
    }

    public /* synthetic */ p(int i) {
        this(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), null, new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), null, null);
    }
}
