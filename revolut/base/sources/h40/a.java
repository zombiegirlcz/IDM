package h40;

import com.revolut.data.model.Data;
import com.revolut.feature.feedback.api.domain.Feedback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f149255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f149256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f149257c;
    public final String d;
    public final Feedback e;

    public a(Data archivedFeeds, Data resolvedTickets, Data pricingPlan, String str, Feedback feedback) {
        Intrinsics.checkNotNullParameter(archivedFeeds, "archivedFeeds");
        Intrinsics.checkNotNullParameter(resolvedTickets, "resolvedTickets");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        this.f149255a = archivedFeeds;
        this.f149256b = resolvedTickets;
        this.f149257c = pricingPlan;
        this.d = str;
        this.e = feedback;
    }

    public static a a(a aVar, Data data, Data data2, Data data3, String str, Feedback feedback, int i) {
        if ((i & 1) != 0) {
            data = aVar.f149255a;
        }
        Data archivedFeeds = data;
        if ((i & 2) != 0) {
            data2 = aVar.f149256b;
        }
        Data resolvedTickets = data2;
        if ((i & 4) != 0) {
            data3 = aVar.f149257c;
        }
        Data pricingPlan = data3;
        if ((i & 8) != 0) {
            str = aVar.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            feedback = aVar.e;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(archivedFeeds, "archivedFeeds");
        Intrinsics.checkNotNullParameter(resolvedTickets, "resolvedTickets");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        return new a(archivedFeeds, resolvedTickets, pricingPlan, str2, feedback);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f149255a, aVar.f149255a) && Intrinsics.f(this.f149256b, aVar.f149256b) && Intrinsics.f(this.f149257c, aVar.f149257c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f149257c, kii.e.c(this.f149256b, this.f149255a.hashCode() * 31, 31), 31);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Feedback feedback = this.e;
        return iHashCode + (feedback != null ? feedback.hashCode() : 0);
    }
}
