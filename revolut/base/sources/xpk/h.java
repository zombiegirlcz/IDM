package xpk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f307986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f307987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconNavBarMenuItem f307988c;
    public final boolean d;
    public final List e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f307989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f307990h;

    public h() {
        this(null, 511);
    }

    public static h a(h hVar, boolean z, boolean z3, boolean z4, List list, Data data, Clause clause, boolean z6, int i) {
        if ((i & 1) != 0) {
            z = hVar.f307986a;
        }
        boolean z11 = z;
        if ((i & 2) != 0) {
            z3 = hVar.f307987b;
        }
        boolean z12 = z3;
        IconNavBarMenuItem iconNavBarMenuItem = hVar.f307988c;
        if ((i & 8) != 0) {
            z4 = hVar.d;
        }
        boolean z29 = z4;
        hVar.getClass();
        if ((i & 32) != 0) {
            list = hVar.e;
        }
        List chart = list;
        if ((i & 64) != 0) {
            data = hVar.f;
        }
        Data chartHeaderData = data;
        if ((i & 128) != 0) {
            clause = hVar.f307989g;
        }
        Clause clause2 = clause;
        boolean z31 = (i & 256) != 0 ? hVar.f307990h : z6;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(chartHeaderData, "chartHeaderData");
        return new h(z11, z12, iconNavBarMenuItem, z29, chart, chartHeaderData, clause2, z31);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f307986a == hVar.f307986a && this.f307987b == hVar.f307987b && Intrinsics.f(this.f307988c, hVar.f307988c) && this.d == hVar.d && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f307989g, hVar.f307989g) && this.f307990h == hVar.f307990h;
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f307986a) * 31, 31, this.f307987b);
        IconNavBarMenuItem iconNavBarMenuItem = this.f307988c;
        int iC2 = kii.e.c(this.f, p.a.d(j6.a.c((iC + (iconNavBarMenuItem == null ? 0 : iconNavBarMenuItem.hashCode())) * 31, 961, this.d), 31, this.e), 31);
        Clause clause = this.f307989g;
        return Boolean.hashCode(this.f307990h) + ((iC2 + (clause != null ? clause.hashCode() : 0)) * 31);
    }

    public h(boolean z, boolean z3, IconNavBarMenuItem iconNavBarMenuItem, boolean z4, List chart, Data chartHeaderData, Clause clause, boolean z6) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(chartHeaderData, "chartHeaderData");
        this.f307986a = z;
        this.f307987b = z3;
        this.f307988c = iconNavBarMenuItem;
        this.d = z4;
        this.e = chart;
        this.f = chartHeaderData;
        this.f307989g = clause;
        this.f307990h = z6;
    }

    public h(IconNavBarMenuItem iconNavBarMenuItem, int i) {
        this(false, false, (i & 4) != 0 ? null : iconNavBarMenuItem, false, f0.f322471a, new Data(null, null, true, 3, null), null, false);
    }
}
