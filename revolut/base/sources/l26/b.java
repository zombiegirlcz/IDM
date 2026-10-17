package l26;

import aw0.q0;
import cli.j;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9l.a f191660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f191661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f191662c;
    public final Data d;
    public final Data e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f191663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q0 f191664h;
    public final Data i;

    public b() {
        this(0);
    }

    public static b a(b bVar, n9l.a aVar, Clause clause, List list, Data data, Data data2, List list2, List list3, q0 q0Var, Data data3, int i) {
        if ((i & 1) != 0) {
            aVar = bVar.f191660a;
        }
        n9l.a aVar2 = aVar;
        if ((i & 2) != 0) {
            clause = bVar.f191661b;
        }
        Clause clause2 = clause;
        if ((i & 4) != 0) {
            list = bVar.f191662c;
        }
        List chart = list;
        if ((i & 8) != 0) {
            data = bVar.d;
        }
        Data chartHeaderData = data;
        if ((i & 16) != 0) {
            data2 = bVar.e;
        }
        Data deFiAssetDetails = data2;
        List statsItems = (i & 32) != 0 ? bVar.f : list2;
        List aboutItems = (i & 64) != 0 ? bVar.f191663g : list3;
        q0 q0Var2 = (i & 128) != 0 ? bVar.f191664h : q0Var;
        Data transactionsData = (i & 256) != 0 ? bVar.i : data3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(chartHeaderData, "chartHeaderData");
        Intrinsics.checkNotNullParameter(deFiAssetDetails, "deFiAssetDetails");
        Intrinsics.checkNotNullParameter(statsItems, "statsItems");
        Intrinsics.checkNotNullParameter(aboutItems, "aboutItems");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        return new b(aVar2, clause2, chart, chartHeaderData, deFiAssetDetails, statsItems, aboutItems, q0Var2, transactionsData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f191660a, bVar.f191660a) && Intrinsics.f(this.f191661b, bVar.f191661b) && Intrinsics.f(this.f191662c, bVar.f191662c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f191663g, bVar.f191663g) && Intrinsics.f(this.f191664h, bVar.f191664h) && Intrinsics.f(this.i, bVar.i);
    }

    public final int hashCode() {
        n9l.a aVar = this.f191660a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        Clause clause = this.f191661b;
        int iD = p.a.d(p.a.d(kii.e.c(this.e, kii.e.c(this.d, p.a.d((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f191662c), 31), 31), 31, this.f), 31, this.f191663g);
        q0 q0Var = this.f191664h;
        return this.i.hashCode() + ((iD + (q0Var != null ? q0Var.hashCode() : 0)) * 31);
    }

    public b(n9l.a aVar, Clause clause, List chart, Data chartHeaderData, Data deFiAssetDetails, List statsItems, List aboutItems, q0 q0Var, Data transactionsData) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(chartHeaderData, "chartHeaderData");
        Intrinsics.checkNotNullParameter(deFiAssetDetails, "deFiAssetDetails");
        Intrinsics.checkNotNullParameter(statsItems, "statsItems");
        Intrinsics.checkNotNullParameter(aboutItems, "aboutItems");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        this.f191660a = aVar;
        this.f191661b = clause;
        this.f191662c = chart;
        this.d = chartHeaderData;
        this.e = deFiAssetDetails;
        this.f = statsItems;
        this.f191663g = aboutItems;
        this.f191664h = q0Var;
        this.i = transactionsData;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(int i) {
        f0 f0Var = f0.f322471a;
        this(null, null, f0Var, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), f0Var, f0Var, null, new Data(null, null, true, 3, null));
    }
}
