package uzf;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rzf.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0005\u0010\u001fR \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u000e\u0010\u001aR\u001c\u0010&\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b\u0017\u0010%R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004¨\u0006("}, d2 = {"Luzf/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "e", "name", "description", "La0g/b;", "d", "La0g/b;", "h", "()La0g/b;", "pricing", "i", "pricingInRequestedCurrency", "", "Luzf/a;", "f", "Ljava/util/List;", "j", "()Ljava/util/List;", "times", "Llzf/a;", "g", "Llzf/a;", "()Llzf/a;", "cashback", "Lrzf/o;", "languages", "Lwzf/a;", "Lwzf/a;", "()Lwzf/a;", "pointsOption", "pointsReward", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pricing")
    @NotNull
    private final a0g.b pricing;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pricingInRequestedCurrency")
    @NotNull
    private final a0g.b pricingInRequestedCurrency;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("times")
    @NotNull
    private final List<a> times;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashback")
    @NotNull
    private final lzf.a cashback;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("languages")
    @NotNull
    private final List<o> languages;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("pointsOption")
    private final wzf.a pointsOption;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsReward")
    private final String pointsReward;

    public b(String id10, String name, String description, a0g.b pricing, a0g.b pricingInRequestedCurrency, ArrayList times, lzf.a cashback, ArrayList languages, wzf.a aVar, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        Intrinsics.checkNotNullParameter(pricingInRequestedCurrency, "pricingInRequestedCurrency");
        Intrinsics.checkNotNullParameter(times, "times");
        Intrinsics.checkNotNullParameter(cashback, "cashback");
        Intrinsics.checkNotNullParameter(languages, "languages");
        this.id = id10;
        this.name = name;
        this.description = description;
        this.pricing = pricing;
        this.pricingInRequestedCurrency = pricingInRequestedCurrency;
        this.times = times;
        this.cashback = cashback;
        this.languages = languages;
        this.pointsOption = aVar;
        this.pointsReward = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final lzf.a getCashback() {
        return this.cashback;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getLanguages() {
        return this.languages;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.description, bVar.description) && Intrinsics.f(this.pricing, bVar.pricing) && Intrinsics.f(this.pricingInRequestedCurrency, bVar.pricingInRequestedCurrency) && Intrinsics.f(this.times, bVar.times) && Intrinsics.f(this.cashback, bVar.cashback) && Intrinsics.f(this.languages, bVar.languages) && Intrinsics.f(this.pointsOption, bVar.pointsOption) && Intrinsics.f(this.pointsReward, bVar.pointsReward);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final wzf.a getPointsOption() {
        return this.pointsOption;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPointsReward() {
        return this.pointsReward;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final a0g.b getPricing() {
        return this.pricing;
    }

    public final int hashCode() {
        int iD = p.a.d((this.cashback.hashCode() + p.a.d((this.pricingInRequestedCurrency.hashCode() + ((this.pricing.hashCode() + p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.description)) * 31)) * 31, 31, this.times)) * 31, 31, this.languages);
        wzf.a aVar = this.pointsOption;
        int iHashCode = (iD + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.pointsReward;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final a0g.b getPricingInRequestedCurrency() {
        return this.pricingInRequestedCurrency;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getTimes() {
        return this.times;
    }
}
