package b0h;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Duration f11669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f11670c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f11671g;

    public a(String collectionName, Duration insuranceDuration, Map investmentLimits, String campaignId, String headerImage, String promotionType, LocalDate campaignReimbursementDate) {
        Intrinsics.checkNotNullParameter(collectionName, "collectionName");
        Intrinsics.checkNotNullParameter(insuranceDuration, "insuranceDuration");
        Intrinsics.checkNotNullParameter(investmentLimits, "investmentLimits");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(headerImage, "headerImage");
        Intrinsics.checkNotNullParameter(promotionType, "promotionType");
        Intrinsics.checkNotNullParameter(campaignReimbursementDate, "campaignReimbursementDate");
        this.f11668a = collectionName;
        this.f11669b = insuranceDuration;
        this.f11670c = investmentLimits;
        this.d = campaignId;
        this.e = headerImage;
        this.f = promotionType;
        this.f11671g = campaignReimbursementDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f11668a, aVar.f11668a) && Intrinsics.f(this.f11669b, aVar.f11669b) && Intrinsics.f(this.f11670c, aVar.f11670c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f11671g, aVar.f11671g);
    }

    public final int hashCode() {
        return this.f11671g.hashCode() + p.a.c(p.a.c(p.a.c(p.a.e((this.f11669b.hashCode() + (this.f11668a.hashCode() * 31)) * 31, 31, this.f11670c), 31, this.d), 31, this.e), 31, this.f);
    }
}
