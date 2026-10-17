package u2e;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f276606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f276607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f276608c;

    public e() {
        this(null, 7);
    }

    public static e a(e eVar, Data megaOffer, Data msiCampaign, Clause clause, int i) {
        if ((i & 1) != 0) {
            megaOffer = eVar.f276606a;
        }
        if ((i & 2) != 0) {
            msiCampaign = eVar.f276607b;
        }
        if ((i & 4) != 0) {
            clause = eVar.f276608c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(megaOffer, "megaOffer");
        Intrinsics.checkNotNullParameter(msiCampaign, "msiCampaign");
        return new e(megaOffer, msiCampaign, clause);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f276606a, eVar.f276606a) && Intrinsics.f(this.f276607b, eVar.f276607b) && Intrinsics.f(this.f276608c, eVar.f276608c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f276607b, this.f276606a.hashCode() * 31, 31);
        Clause clause = this.f276608c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }

    public e(Data megaOffer, Data msiCampaign, Clause clause) {
        Intrinsics.checkNotNullParameter(megaOffer, "megaOffer");
        Intrinsics.checkNotNullParameter(msiCampaign, "msiCampaign");
        this.f276606a = megaOffer;
        this.f276607b = msiCampaign;
        this.f276608c = clause;
    }

    public /* synthetic */ e(Data data, int i) {
        this((i & 1) != 0 ? new Data(null, null, true, 3, null) : data, new Data(null, null, true, 3, null), null);
    }
}
