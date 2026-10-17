package aw0;

import com.revolut.core.ui_kit.models.TimeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeClause f10227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeClause f10228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeClause f10229c;

    public a4(TimeClause graphStartLegend, TimeClause graphEndLegend, TimeClause forecastLegend) {
        Intrinsics.checkNotNullParameter(graphStartLegend, "graphStartLegend");
        Intrinsics.checkNotNullParameter(graphEndLegend, "graphEndLegend");
        Intrinsics.checkNotNullParameter(forecastLegend, "forecastLegend");
        this.f10227a = graphStartLegend;
        this.f10228b = graphEndLegend;
        this.f10229c = forecastLegend;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj2;
        return this.f10227a.equals(a4Var.f10227a) && this.f10228b.equals(a4Var.f10228b) && this.f10229c.equals(a4Var.f10229c);
    }

    public final int hashCode() {
        return this.f10229c.hashCode() + h30.l.d(this.f10228b, this.f10227a.hashCode() * 31, 31);
    }
}
