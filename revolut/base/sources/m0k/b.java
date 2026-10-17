package m0k;

import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import kotlin.jvm.internal.Intrinsics;
import lk0.f;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthNewsCategory f201155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f201156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f201157c;
    public final DateTime d;

    public b(WealthNewsCategory category, boolean z, DateTime publishedBefore, DateTime publishedAfter) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(publishedBefore, "publishedBefore");
        Intrinsics.checkNotNullParameter(publishedAfter, "publishedAfter");
        this.f201155a = category;
        this.f201156b = z;
        this.f201157c = publishedBefore;
        this.d = publishedAfter;
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a */
    public final int getF84104a() {
        return 40;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f201155a, bVar.f201155a) && this.f201156b == bVar.f201156b && Intrinsics.f(this.f201157c, bVar.f201157c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + m72.b.f(this.f201157c, j6.a.c(this.f201155a.hashCode() * 31, 31, this.f201156b), 31);
    }
}
