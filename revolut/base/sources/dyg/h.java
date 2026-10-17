package dyg;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import com.revolut.shared.feature.wealth.models.config.Links;
import ip0.wi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetisedAnalyticsType f121109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f121110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DisclaimerParams f121111c;
    public final vyg.a d;
    public final Data e;
    public final xi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wi f121112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f121113h;
    public final Links i;

    public h(WidgetisedAnalyticsType analyticsType, hel.b bVar, DisclaimerParams disclaimerParams, vyg.a allocationCategory, Data currentAllocation, xi0.b baseCurrency, wi wiVar, List allocationCategories, Links links) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(allocationCategory, "allocationCategory");
        Intrinsics.checkNotNullParameter(currentAllocation, "currentAllocation");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(allocationCategories, "allocationCategories");
        this.f121109a = analyticsType;
        this.f121110b = bVar;
        this.f121111c = disclaimerParams;
        this.d = allocationCategory;
        this.e = currentAllocation;
        this.f = baseCurrency;
        this.f121112g = wiVar;
        this.f121113h = allocationCategories;
        this.i = links;
    }

    public static h a(h hVar, DisclaimerParams disclaimerParams, vyg.a aVar, Data data, xi0.b bVar, wi wiVar, int i) {
        WidgetisedAnalyticsType analyticsType = hVar.f121109a;
        hel.b bVar2 = hVar.f121110b;
        if ((i & 4) != 0) {
            disclaimerParams = hVar.f121111c;
        }
        DisclaimerParams disclaimerParams2 = disclaimerParams;
        if ((i & 8) != 0) {
            aVar = hVar.d;
        }
        vyg.a allocationCategory = aVar;
        if ((i & 16) != 0) {
            data = hVar.e;
        }
        Data currentAllocation = data;
        if ((i & 32) != 0) {
            bVar = hVar.f;
        }
        xi0.b baseCurrency = bVar;
        if ((i & 64) != 0) {
            wiVar = hVar.f121112g;
        }
        List allocationCategories = hVar.f121113h;
        Links links = hVar.i;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(allocationCategory, "allocationCategory");
        Intrinsics.checkNotNullParameter(currentAllocation, "currentAllocation");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(allocationCategories, "allocationCategories");
        return new h(analyticsType, bVar2, disclaimerParams2, allocationCategory, currentAllocation, baseCurrency, wiVar, allocationCategories, links);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f121109a, hVar.f121109a) && this.f121110b == hVar.f121110b && Intrinsics.f(this.f121111c, hVar.f121111c) && this.d == hVar.d && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f121112g, hVar.f121112g) && Intrinsics.f(this.f121113h, hVar.f121113h) && Intrinsics.f(this.i, hVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f121109a.hashCode() * 31;
        hel.b bVar = this.f121110b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        DisclaimerParams disclaimerParams = this.f121111c;
        int iJ = h30.l.j(this.f, kii.e.c(this.e, (this.d.hashCode() + ((iHashCode2 + (disclaimerParams == null ? 0 : disclaimerParams.hashCode())) * 31)) * 31, 31), 31);
        wi wiVar = this.f121112g;
        int iD = p.a.d((iJ + (wiVar == null ? 0 : wiVar.hashCode())) * 31, 31, this.f121113h);
        Links links = this.i;
        return iD + (links != null ? links.hashCode() : 0);
    }
}
