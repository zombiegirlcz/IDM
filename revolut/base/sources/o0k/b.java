package o0k;

import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthNewsCategory f221251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f221252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f221253c;
    public final DateTime d;
    public final String e;
    public final Integer f;

    public b(WealthNewsCategory category, List assetsFilters, DateTime dateTime, DateTime dateTime2, String str, Integer num) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(assetsFilters, "assetsFilters");
        this.f221251a = category;
        this.f221252b = assetsFilters;
        this.f221253c = dateTime;
        this.d = dateTime2;
        this.e = str;
        this.f = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f221251a, bVar.f221251a) && Intrinsics.f(this.f221252b, bVar.f221252b) && Intrinsics.f(this.f221253c, bVar.f221253c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f221251a.hashCode() * 31, 31, this.f221252b);
        DateTime dateTime = this.f221253c;
        int iHashCode = (iD + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.d;
        int iHashCode2 = (iHashCode + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        String str = this.e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public b(WealthNewsCategory wealthNewsCategory, DateTime dateTime, DateTime dateTime2, String str, Integer num) {
        this(wealthNewsCategory, f0.f322471a, dateTime, dateTime2, str, num);
    }
}
