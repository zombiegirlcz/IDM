package gok;

import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$BottomSheet;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$ProductIntro;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145191c;
    public final String d;
    public final List e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PricingPlanWaitlistLayout$BottomSheet f145192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PricingPlanWaitlistLayout$ProductIntro f145193h;

    public f(String title, String subtitle, String str, String str2, List buttons, d dVar, PricingPlanWaitlistLayout$BottomSheet pricingPlanWaitlistLayout$BottomSheet, PricingPlanWaitlistLayout$ProductIntro pricingPlanWaitlistLayout$ProductIntro) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f145189a = title;
        this.f145190b = subtitle;
        this.f145191c = str;
        this.d = str2;
        this.e = buttons;
        this.f = dVar;
        this.f145192g = pricingPlanWaitlistLayout$BottomSheet;
        this.f145193h = pricingPlanWaitlistLayout$ProductIntro;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f145189a, fVar.f145189a) && Intrinsics.f(this.f145190b, fVar.f145190b) && Intrinsics.f(this.f145191c, fVar.f145191c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f145192g, fVar.f145192g) && Intrinsics.f(this.f145193h, fVar.f145193h);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f145189a.hashCode() * 31, 31, this.f145190b);
        String str = this.f145191c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iD = p.a.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        d dVar = this.f;
        int iHashCode2 = (iD + (dVar == null ? 0 : dVar.hashCode())) * 31;
        PricingPlanWaitlistLayout$BottomSheet pricingPlanWaitlistLayout$BottomSheet = this.f145192g;
        int iHashCode3 = (iHashCode2 + (pricingPlanWaitlistLayout$BottomSheet == null ? 0 : pricingPlanWaitlistLayout$BottomSheet.hashCode())) * 31;
        PricingPlanWaitlistLayout$ProductIntro pricingPlanWaitlistLayout$ProductIntro = this.f145193h;
        return iHashCode3 + (pricingPlanWaitlistLayout$ProductIntro != null ? pricingPlanWaitlistLayout$ProductIntro.hashCode() : 0);
    }
}
