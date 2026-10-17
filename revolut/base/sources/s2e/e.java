package s2e;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f259291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f259292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f259293c;

    public e() {
        this(null, 7);
    }

    public static e a(e eVar, Data megaOffer, Data discountCampaign, Clause clause, int i) {
        if ((i & 1) != 0) {
            megaOffer = eVar.f259291a;
        }
        if ((i & 2) != 0) {
            discountCampaign = eVar.f259292b;
        }
        if ((i & 4) != 0) {
            clause = eVar.f259293c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(megaOffer, "megaOffer");
        Intrinsics.checkNotNullParameter(discountCampaign, "discountCampaign");
        return new e(megaOffer, discountCampaign, clause);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f259291a, eVar.f259291a) && Intrinsics.f(this.f259292b, eVar.f259292b) && Intrinsics.f(this.f259293c, eVar.f259293c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f259292b, this.f259291a.hashCode() * 31, 31);
        Clause clause = this.f259293c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }

    public e(Data megaOffer, Data discountCampaign, Clause clause) {
        Intrinsics.checkNotNullParameter(megaOffer, "megaOffer");
        Intrinsics.checkNotNullParameter(discountCampaign, "discountCampaign");
        this.f259291a = megaOffer;
        this.f259292b = discountCampaign;
        this.f259293c = clause;
    }

    public /* synthetic */ e(Data data, int i) {
        this((i & 1) != 0 ? new Data(null, null, true, 3, null) : data, new Data(null, null, true, 3, null), null);
    }
}
