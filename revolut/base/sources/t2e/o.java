package t2e;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.store.api.model.StoreCampaignOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreCampaignOffer f267555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f267556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f267557c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextLocalisedClause f267558g;

    public o(StoreCampaignOffer campaign, String rateListId, String descriptionListId, String availabilityListId, String countriesListId, String statusListId, TextLocalisedClause availabilityText) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Intrinsics.checkNotNullParameter(rateListId, "rateListId");
        Intrinsics.checkNotNullParameter(descriptionListId, "descriptionListId");
        Intrinsics.checkNotNullParameter(availabilityListId, "availabilityListId");
        Intrinsics.checkNotNullParameter(countriesListId, "countriesListId");
        Intrinsics.checkNotNullParameter(statusListId, "statusListId");
        Intrinsics.checkNotNullParameter(availabilityText, "availabilityText");
        this.f267555a = campaign;
        this.f267556b = rateListId;
        this.f267557c = descriptionListId;
        this.d = availabilityListId;
        this.e = countriesListId;
        this.f = statusListId;
        this.f267558g = availabilityText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f267555a, oVar.f267555a) && Intrinsics.f(this.f267556b, oVar.f267556b) && Intrinsics.f(this.f267557c, oVar.f267557c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f267558g, oVar.f267558g);
    }

    public final int hashCode() {
        return this.f267558g.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f267555a.hashCode() * 31, 31, this.f267556b), 31, this.f267557c), 31, this.d), 31, this.e), 31, this.f);
    }
}
