package i3g;

import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f158209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lk0.g f158210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f158211c;

    public f() {
        this(0);
    }

    public static f a(f fVar, Data ratings, lk0.g reviewsPagedData, LinkedHashSet linkedHashSet, int i) {
        if ((i & 1) != 0) {
            ratings = fVar.f158209a;
        }
        if ((i & 2) != 0) {
            reviewsPagedData = fVar.f158210b;
        }
        Set expandedCardsIds = linkedHashSet;
        if ((i & 4) != 0) {
            expandedCardsIds = fVar.f158211c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        Intrinsics.checkNotNullParameter(reviewsPagedData, "reviewsPagedData");
        Intrinsics.checkNotNullParameter(expandedCardsIds, "expandedCardsIds");
        return new f(ratings, reviewsPagedData, expandedCardsIds);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f158209a, fVar.f158209a) && Intrinsics.f(this.f158210b, fVar.f158210b) && Intrinsics.f(this.f158211c, fVar.f158211c);
    }

    public final int hashCode() {
        return this.f158211c.hashCode() + p.a.d(this.f158209a.hashCode() * 31, 31, this.f158210b.f196174a);
    }

    public f(Data ratings, lk0.g reviewsPagedData, Set expandedCardsIds) {
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        Intrinsics.checkNotNullParameter(reviewsPagedData, "reviewsPagedData");
        Intrinsics.checkNotNullParameter(expandedCardsIds, "expandedCardsIds");
        this.f158209a = ratings;
        this.f158210b = reviewsPagedData;
        this.f158211c = expandedCardsIds;
    }

    public f(int i) {
        this(new Data(null, null, false, 7, null), new lk0.g(f0.f322471a), h0.f322473a);
    }
}
