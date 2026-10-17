package gfk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\t\u0010\u0016R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0005\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u001a\u0010-\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010*\u001a\u0004\b\f\u0010+R\u001c\u00101\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b\u000f\u00100R\"\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u001a\u00108\u001a\u0002048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107¨\u00069"}, d2 = {"Lgfk/v;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "id", "b", "e", "code", "c", "g", "displayCode", "d", "f", "currencyCode", "", "Lgfk/e;", "Ljava/util/List;", "h", "()Ljava/util/List;", "featureGroups", "Lb93/c;", "cardDesigns", "Lgfk/s;", "billing", "Lgfk/a0;", "m", "products", "i", "k", "minPeriod", "o", "state", "", "Ljava/lang/Integer;", "n", "()Ljava/lang/Integer;", "queuePosition", "l", "I", "()I", "priority", "cardTier", "Ljfk/c;", "Ljfk/c;", "()Ljfk/c;", "cashback", "Lgfk/j;", "featureToggles", "", "p", "Z", "()Z", "isDefault", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("displayCode")
    private final String displayCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currencyCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("featureGroups")
    @NotNull
    private final List<e> featureGroups;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("cardDesigns")
    @NotNull
    private final List<b93.c> cardDesigns;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("billing")
    private final List<s> billing;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("products")
    @NotNull
    private final List<a0> products;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("minPeriod")
    private final String minPeriod;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    private final String state;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("queuePosition")
    private final Integer queuePosition;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("priority")
    private final int priority;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardTier")
    private final int cardTier;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashback")
    private final jfk.c cashback;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("featureToggles")
    private final List<j> featureToggles;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("isDefault")
    private final boolean isDefault;

    public v(String id10, String code, String str, String currencyCode, ArrayList featureGroups, ArrayList cardDesigns, ArrayList arrayList, ArrayList products, String str2, String str3, Integer num, int i, int i2, jfk.c cVar, ArrayList arrayList2, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(featureGroups, "featureGroups");
        Intrinsics.checkNotNullParameter(cardDesigns, "cardDesigns");
        Intrinsics.checkNotNullParameter(products, "products");
        this.id = id10;
        this.code = code;
        this.displayCode = str;
        this.currencyCode = currencyCode;
        this.featureGroups = featureGroups;
        this.cardDesigns = cardDesigns;
        this.billing = arrayList;
        this.products = products;
        this.minPeriod = str2;
        this.state = str3;
        this.queuePosition = num;
        this.priority = i;
        this.cardTier = i2;
        this.cashback = cVar;
        this.featureToggles = arrayList2;
        this.isDefault = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getBilling() {
        return this.billing;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getCardDesigns() {
        return this.cardDesigns;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCardTier() {
        return this.cardTier;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jfk.c getCashback() {
        return this.cashback;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.id, vVar.id) && Intrinsics.f(this.code, vVar.code) && Intrinsics.f(this.displayCode, vVar.displayCode) && Intrinsics.f(this.currencyCode, vVar.currencyCode) && Intrinsics.f(this.featureGroups, vVar.featureGroups) && Intrinsics.f(this.cardDesigns, vVar.cardDesigns) && Intrinsics.f(this.billing, vVar.billing) && Intrinsics.f(this.products, vVar.products) && Intrinsics.f(this.minPeriod, vVar.minPeriod) && Intrinsics.f(this.state, vVar.state) && Intrinsics.f(this.queuePosition, vVar.queuePosition) && this.priority == vVar.priority && this.cardTier == vVar.cardTier && Intrinsics.f(this.cashback, vVar.cashback) && Intrinsics.f(this.featureToggles, vVar.featureToggles) && this.isDefault == vVar.isDefault;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDisplayCode() {
        return this.displayCode;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getFeatureGroups() {
        return this.featureGroups;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.code);
        String str = this.displayCode;
        int iD = p.a.d(p.a.d(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.currencyCode), 31, this.featureGroups), 31, this.cardDesigns);
        List<s> list = this.billing;
        int iD2 = p.a.d((iD + (list == null ? 0 : list.hashCode())) * 31, 31, this.products);
        String str2 = this.minPeriod;
        int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.state;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.queuePosition;
        int iB = j6.a.b(this.cardTier, j6.a.b(this.priority, (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
        jfk.c cVar = this.cashback;
        int iHashCode3 = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        List<j> list2 = this.featureToggles;
        return Boolean.hashCode(this.isDefault) + ((iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getFeatureToggles() {
        return this.featureToggles;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getMinPeriod() {
        return this.minPeriod;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final List getProducts() {
        return this.products;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Integer getQueuePosition() {
        return this.queuePosition;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }
}
