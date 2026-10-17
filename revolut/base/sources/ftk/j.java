package ftk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f138043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f138044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f138045c;
    public final Data d;
    public final Data e;

    public j(Data insights, Data analystRatings, Data technicals, Data currentPrice, Data data) {
        Intrinsics.checkNotNullParameter(insights, "insights");
        Intrinsics.checkNotNullParameter(analystRatings, "analystRatings");
        Intrinsics.checkNotNullParameter(technicals, "technicals");
        Intrinsics.checkNotNullParameter(currentPrice, "currentPrice");
        this.f138043a = insights;
        this.f138044b = analystRatings;
        this.f138045c = technicals;
        this.d = currentPrice;
        this.e = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f138043a, jVar.f138043a) && Intrinsics.f(this.f138044b, jVar.f138044b) && Intrinsics.f(this.f138045c, jVar.f138045c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.d, kii.e.c(this.f138045c, kii.e.c(this.f138044b, this.f138043a.hashCode() * 31, 31), 31), 31);
        Data data = this.e;
        return iC + (data == null ? 0 : data.hashCode());
    }
}
