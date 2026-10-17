package t2e;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f267544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f267545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f267546c;
    public final Set d;
    public final Instant e;
    public final Clause f;

    public g() {
        this(null, 63);
    }

    public static g a(g gVar, Data data, Data data2, f fVar, LinkedHashSet linkedHashSet, Instant instant, Clause clause, int i) {
        if ((i & 1) != 0) {
            data = gVar.f267544a;
        }
        Data megaOffer = data;
        if ((i & 2) != 0) {
            data2 = gVar.f267545b;
        }
        Data campaigns = data2;
        if ((i & 4) != 0) {
            fVar = gVar.f267546c;
        }
        f selectedCampaignTab = fVar;
        Set set = linkedHashSet;
        if ((i & 8) != 0) {
            set = gVar.d;
        }
        Set expandedInstructionCardIds = set;
        if ((i & 16) != 0) {
            instant = gVar.e;
        }
        Instant instant2 = instant;
        if ((i & 32) != 0) {
            clause = gVar.f;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(megaOffer, "megaOffer");
        Intrinsics.checkNotNullParameter(campaigns, "campaigns");
        Intrinsics.checkNotNullParameter(selectedCampaignTab, "selectedCampaignTab");
        Intrinsics.checkNotNullParameter(expandedInstructionCardIds, "expandedInstructionCardIds");
        return new g(megaOffer, campaigns, selectedCampaignTab, expandedInstructionCardIds, instant2, clause);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f267544a, gVar.f267544a) && Intrinsics.f(this.f267545b, gVar.f267545b) && this.f267546c == gVar.f267546c && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        int iF = p.a.f((this.f267546c.hashCode() + kii.e.c(this.f267545b, this.f267544a.hashCode() * 31, 31)) * 31, 31, this.d);
        Instant instant = this.e;
        int iHashCode = (iF + (instant == null ? 0 : instant.hashCode())) * 31;
        Clause clause = this.f;
        return iHashCode + (clause != null ? clause.hashCode() : 0);
    }

    public g(Data megaOffer, Data campaigns, f selectedCampaignTab, Set expandedInstructionCardIds, Instant instant, Clause clause) {
        Intrinsics.checkNotNullParameter(megaOffer, "megaOffer");
        Intrinsics.checkNotNullParameter(campaigns, "campaigns");
        Intrinsics.checkNotNullParameter(selectedCampaignTab, "selectedCampaignTab");
        Intrinsics.checkNotNullParameter(expandedInstructionCardIds, "expandedInstructionCardIds");
        this.f267544a = megaOffer;
        this.f267545b = campaigns;
        this.f267546c = selectedCampaignTab;
        this.d = expandedInstructionCardIds;
        this.e = instant;
        this.f = clause;
    }

    public g(Data data, int i) {
        this((i & 1) != 0 ? new Data(null, null, true, 3, null) : data, new Data(null, null, true, 3, null), f.NONE, h0.f322473a, null, null);
    }
}
