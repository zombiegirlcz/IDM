package myf;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePricingFilter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f210476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperiencePricingFilter f210477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f210478c;
    public final List d;

    public k(ArrayList categories, TravelExperiencePricingFilter pricing, ArrayList popular, List durations) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        Intrinsics.checkNotNullParameter(popular, "popular");
        Intrinsics.checkNotNullParameter(durations, "durations");
        this.f210476a = categories;
        this.f210477b = pricing;
        this.f210478c = popular;
        this.d = durations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f210476a.equals(kVar.f210476a) && this.f210477b.equals(kVar.f210477b) && this.f210478c.equals(kVar.f210478c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f210478c, (this.f210477b.hashCode() + (this.f210476a.hashCode() * 31)) * 31, 31);
    }
}
