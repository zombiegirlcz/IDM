package soh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilterInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.g f264833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f264834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenerFilterInfo.Dialog f264835c;
    public final f d;
    public final List e;

    public d(zel.g metric, TextLocalisedClause title, ScreenerFilterInfo.Dialog infoDialog, f limits, List explainers) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(infoDialog, "infoDialog");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(explainers, "explainers");
        this.f264833a = metric;
        this.f264834b = title;
        this.f264835c = infoDialog;
        this.d = limits;
        this.e = explainers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f264833a == dVar.f264833a && this.f264834b.equals(dVar.f264834b) && this.f264835c.equals(dVar.f264835c) && this.d.equals(dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f264835c.hashCode() + t61.a.a(this.f264833a.hashCode() * 31, 31, this.f264834b)) * 31)) * 31);
    }
}
