package sdg;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f261879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f261880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lk0.g f261881c;
    public final List d;

    public g() {
        this(0);
    }

    public static g a(g gVar, Data user, Data ratings, lk0.g guestsReviewsPagedData, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            user = gVar.f261879a;
        }
        if ((i & 2) != 0) {
            ratings = gVar.f261880b;
        }
        if ((i & 4) != 0) {
            guestsReviewsPagedData = gVar.f261881c;
        }
        List expandedCardsIds = arrayList;
        if ((i & 8) != 0) {
            expandedCardsIds = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        Intrinsics.checkNotNullParameter(guestsReviewsPagedData, "guestsReviewsPagedData");
        Intrinsics.checkNotNullParameter(expandedCardsIds, "expandedCardsIds");
        return new g(user, ratings, guestsReviewsPagedData, expandedCardsIds);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f261879a, gVar.f261879a) && Intrinsics.f(this.f261880b, gVar.f261880b) && Intrinsics.f(this.f261881c, gVar.f261881c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(kii.e.c(this.f261880b, this.f261879a.hashCode() * 31, 31), 31, this.f261881c.f196174a);
    }

    public g(Data user, Data ratings, lk0.g guestsReviewsPagedData, List expandedCardsIds) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        Intrinsics.checkNotNullParameter(guestsReviewsPagedData, "guestsReviewsPagedData");
        Intrinsics.checkNotNullParameter(expandedCardsIds, "expandedCardsIds");
        this.f261879a = user;
        this.f261880b = ratings;
        this.f261881c = guestsReviewsPagedData;
        this.d = expandedCardsIds;
    }

    public g(int i) {
        Data data = new Data(null, null, false, 7, null);
        Data data2 = new Data(null, null, false, 7, null);
        f0 f0Var = f0.f322471a;
        this(data, data2, new lk0.g(f0Var), f0Var);
    }
}
