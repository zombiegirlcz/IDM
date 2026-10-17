package qgf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import java.time.YearMonth;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f245799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final YearMonth f245800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f245801c;
    public final TransactionsListFilterType.ConfigurableFilter d;
    public final boolean e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f245802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f245803h;

    public h(List months, YearMonth yearMonth, boolean z, TransactionsListFilterType.ConfigurableFilter configurableFilter, boolean z3, Clause title, Clause clause, k titleMode) {
        Intrinsics.checkNotNullParameter(months, "months");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleMode, "titleMode");
        this.f245799a = months;
        this.f245800b = yearMonth;
        this.f245801c = z;
        this.d = configurableFilter;
        this.e = z3;
        this.f = title;
        this.f245802g = clause;
        this.f245803h = titleMode;
    }

    public static h a(h hVar, List list, YearMonth yearMonth, boolean z, TransactionsListFilterType.ConfigurableFilter configurableFilter, boolean z3, Clause clause, Clause clause2, k kVar, int i) {
        if ((i & 1) != 0) {
            list = hVar.f245799a;
        }
        List months = list;
        if ((i & 2) != 0) {
            yearMonth = hVar.f245800b;
        }
        YearMonth yearMonth2 = yearMonth;
        if ((i & 4) != 0) {
            z = hVar.f245801c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            configurableFilter = hVar.d;
        }
        TransactionsListFilterType.ConfigurableFilter configurableFilter2 = configurableFilter;
        if ((i & 16) != 0) {
            z3 = hVar.e;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            clause = hVar.f;
        }
        Clause title = clause;
        Clause clause3 = (i & 64) != 0 ? hVar.f245802g : clause2;
        k titleMode = (i & 128) != 0 ? hVar.f245803h : kVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(months, "months");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleMode, "titleMode");
        return new h(months, yearMonth2, z4, configurableFilter2, z6, title, clause3, titleMode);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f245799a, hVar.f245799a) && Intrinsics.f(this.f245800b, hVar.f245800b) && this.f245801c == hVar.f245801c && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f245802g, hVar.f245802g) && this.f245803h == hVar.f245803h;
    }

    public final int hashCode() {
        int iHashCode = this.f245799a.hashCode() * 31;
        YearMonth yearMonth = this.f245800b;
        int iC = j6.a.c((iHashCode + (yearMonth == null ? 0 : yearMonth.hashCode())) * 31, 31, this.f245801c);
        TransactionsListFilterType.ConfigurableFilter configurableFilter = this.d;
        int iA = p.a.a(j6.a.c((iC + (configurableFilter == null ? 0 : configurableFilter.hashCode())) * 31, 31, this.e), 31, this.f);
        Clause clause = this.f245802g;
        return this.f245803h.hashCode() + ((iA + (clause != null ? clause.hashCode() : 0)) * 31);
    }
}
