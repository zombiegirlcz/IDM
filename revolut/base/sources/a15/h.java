package a15;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreDetails;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditScoreDetails f534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f536c;

    public h(CreditScoreDetails details, LocalDate selectedDate, Data insights) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(insights, "insights");
        this.f534a = details;
        this.f535b = selectedDate;
        this.f536c = insights;
    }

    public static h a(h hVar, LocalDate selectedDate, Data insights, int i) {
        CreditScoreDetails details = hVar.f534a;
        if ((i & 2) != 0) {
            selectedDate = hVar.f535b;
        }
        if ((i & 4) != 0) {
            insights = hVar.f536c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(insights, "insights");
        return new h(details, selectedDate, insights);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f534a, hVar.f534a) && Intrinsics.f(this.f535b, hVar.f535b) && Intrinsics.f(this.f536c, hVar.f536c);
    }

    public final int hashCode() {
        return this.f536c.hashCode() + y.a(this.f534a.hashCode() * 31, 31, this.f535b);
    }
}
