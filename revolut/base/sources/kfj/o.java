package kfj;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0005\u0010\u001eR\u001c\u0010!\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u0013\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\f\u0010\u001eR\u001c\u0010(\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\t\u0010'R\u001c\u0010*\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b\u0018\u0010'R\u001c\u0010,\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b\u000f\u0010'R\u001c\u0010.\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u001d\u001a\u0004\b\"\u0010\u001eR\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b/\u0010\u0004R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\u0004R\u001a\u00105\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b-\u0010\u0004R\u001a\u00106\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b+\u0010\u0004R\"\u0010=\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010A\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b \u0010@R\u001c\u0010E\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\b>\u0010DR \u0010G\u001a\b\u0012\u0004\u0012\u00020\u0002088\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010:\u001a\u0004\b)\u0010<R\u001c\u0010K\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010I\u001a\u0004\b\u001c\u0010JR\u001c\u0010O\u001a\u0004\u0018\u00010L8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010M\u001a\u0004\b1\u0010NR\u001c\u0010S\u001a\u0004\u0018\u00010P8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010Q\u001a\u0004\b4\u0010RR\u001c\u0010X\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bU\u0010WR\u001c\u0010\\\u001a\u0004\u0018\u00010Y8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010Z\u001a\u0004\bF\u0010[¨\u0006]"}, d2 = {"Lkfj/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "q", "id", "b", "A", "type", "c", "y", "subtype", "d", "s", "name", "Ljo3/a;", "e", "Ljo3/a;", "u", "()Ljo3/a;", "price", "f", "n", "duration", "", "g", "Ljava/lang/Long;", "()Ljava/lang/Long;", "allowanceBytes", "h", "allowanceVoiceSeconds", "i", "allowanceSmsCount", "", "j", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "allowanceBytesUnlimited", "k", "allowanceVoiceSecondsUnlimited", "l", "allowanceSmsCountUnlimited", "m", "bandwidthBitsPerSecond", "w", "recurringPeriod", "o", "r", "minimumPeriod", "p", "coverageType", "coverageCode", "coverageName", "", "Lkfj/q;", "Ljava/util/List;", "x", "()Ljava/util/List;", "roamingAllowances", "t", "Z", "()Z", "autoRenewable", "Lkfj/p;", "Lkfj/p;", "()Lkfj/p;", "offer", "v", "coverageCountries", "Lkfj/n;", "Lkfj/n;", "()Lkfj/n;", "attributes", "Lkfj/t0;", "Lkfj/t0;", "()Lkfj/t0;", "highestPointsOption", "Lkfj/p0;", "Lkfj/p0;", "()Lkfj/p0;", "highlights", "Lkfj/v0;", "z", "Lkfj/v0;", "()Lkfj/v0;", "summary", "Lkfj/q0;", "Lkfj/q0;", "()Lkfj/q0;", "provider", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("provider")
    private final q0 provider;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtype")
    private final String subtype;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("price")
    @NotNull
    private final jo3.a price;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("duration")
    @NotNull
    private final String duration;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowanceBytes")
    private final Long allowanceBytes;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowanceVoiceSeconds")
    private final Long allowanceVoiceSeconds;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("allowanceSmsCount")
    private final Long allowanceSmsCount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowanceBytesUnlimited")
    private final Boolean allowanceBytesUnlimited;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("allowanceVoiceSecondsUnlimited")
    private final Boolean allowanceVoiceSecondsUnlimited;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowanceSmsCountUnlimited")
    private final Boolean allowanceSmsCountUnlimited;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("bandwidthBitsPerSecond")
    private final Long bandwidthBitsPerSecond;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("recurringPeriod")
    private final String recurringPeriod;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("minimumPeriod")
    private final String minimumPeriod;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("coverageType")
    @NotNull
    private final String coverageType;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("coverageCode")
    @NotNull
    private final String coverageCode;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("coverageName")
    private final String coverageName;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("roamingAllowances")
    private final List<q> roamingAllowances;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("autoRenewable")
    private final boolean autoRenewable;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("offer")
    private final p offer;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("coverageCountries")
    @NotNull
    private final List<String> coverageCountries;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("attributes")
    private final n attributes;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("highestPointsOption")
    private final t0 highestPointsOption;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("highlights")
    private final p0 highlights;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("summary")
    private final v0 summary;

    public o(String id10, String str, String str2, String str3, jo3.a price, String duration, Long l2, Long l3, Long l4, Boolean bool, Boolean bool2, Boolean bool3, Long l5, String str4, String str5, String coverageType, String coverageCode, String str6, ArrayList arrayList, boolean z, p pVar, ArrayList coverageCountries, n nVar, t0 t0Var, p0 p0Var, v0 v0Var, q0 q0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(coverageType, "coverageType");
        Intrinsics.checkNotNullParameter(coverageCode, "coverageCode");
        Intrinsics.checkNotNullParameter(coverageCountries, "coverageCountries");
        this.id = id10;
        this.type = str;
        this.subtype = str2;
        this.name = str3;
        this.price = price;
        this.duration = duration;
        this.allowanceBytes = l2;
        this.allowanceVoiceSeconds = l3;
        this.allowanceSmsCount = l4;
        this.allowanceBytesUnlimited = bool;
        this.allowanceVoiceSecondsUnlimited = bool2;
        this.allowanceSmsCountUnlimited = bool3;
        this.bandwidthBitsPerSecond = l5;
        this.recurringPeriod = str4;
        this.minimumPeriod = str5;
        this.coverageType = coverageType;
        this.coverageCode = coverageCode;
        this.coverageName = str6;
        this.roamingAllowances = arrayList;
        this.autoRenewable = z;
        this.offer = pVar;
        this.coverageCountries = coverageCountries;
        this.attributes = nVar;
        this.highestPointsOption = t0Var;
        this.highlights = p0Var;
        this.summary = v0Var;
        this.provider = q0Var;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getAllowanceBytes() {
        return this.allowanceBytes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getAllowanceBytesUnlimited() {
        return this.allowanceBytesUnlimited;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getAllowanceSmsCount() {
        return this.allowanceSmsCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getAllowanceSmsCountUnlimited() {
        return this.allowanceSmsCountUnlimited;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getAllowanceVoiceSeconds() {
        return this.allowanceVoiceSeconds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.id, oVar.id) && Intrinsics.f(this.type, oVar.type) && Intrinsics.f(this.subtype, oVar.subtype) && Intrinsics.f(this.name, oVar.name) && Intrinsics.f(this.price, oVar.price) && Intrinsics.f(this.duration, oVar.duration) && Intrinsics.f(this.allowanceBytes, oVar.allowanceBytes) && Intrinsics.f(this.allowanceVoiceSeconds, oVar.allowanceVoiceSeconds) && Intrinsics.f(this.allowanceSmsCount, oVar.allowanceSmsCount) && Intrinsics.f(this.allowanceBytesUnlimited, oVar.allowanceBytesUnlimited) && Intrinsics.f(this.allowanceVoiceSecondsUnlimited, oVar.allowanceVoiceSecondsUnlimited) && Intrinsics.f(this.allowanceSmsCountUnlimited, oVar.allowanceSmsCountUnlimited) && Intrinsics.f(this.bandwidthBitsPerSecond, oVar.bandwidthBitsPerSecond) && Intrinsics.f(this.recurringPeriod, oVar.recurringPeriod) && Intrinsics.f(this.minimumPeriod, oVar.minimumPeriod) && Intrinsics.f(this.coverageType, oVar.coverageType) && Intrinsics.f(this.coverageCode, oVar.coverageCode) && Intrinsics.f(this.coverageName, oVar.coverageName) && Intrinsics.f(this.roamingAllowances, oVar.roamingAllowances) && this.autoRenewable == oVar.autoRenewable && Intrinsics.f(this.offer, oVar.offer) && Intrinsics.f(this.coverageCountries, oVar.coverageCountries) && Intrinsics.f(this.attributes, oVar.attributes) && Intrinsics.f(this.highestPointsOption, oVar.highestPointsOption) && Intrinsics.f(this.highlights, oVar.highlights) && Intrinsics.f(this.summary, oVar.summary) && Intrinsics.f(this.provider, oVar.provider);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getAllowanceVoiceSecondsUnlimited() {
        return this.allowanceVoiceSecondsUnlimited;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final n getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getAutoRenewable() {
        return this.autoRenewable;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtype;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iC = p.a.c(v7.j(this.price, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.duration);
        Long l2 = this.allowanceBytes;
        int iHashCode4 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.allowanceVoiceSeconds;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.allowanceSmsCount;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool = this.allowanceBytesUnlimited;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.allowanceVoiceSecondsUnlimited;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.allowanceSmsCountUnlimited;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l5 = this.bandwidthBitsPerSecond;
        int iHashCode10 = (iHashCode9 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str4 = this.recurringPeriod;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.minimumPeriod;
        int iC2 = p.a.c(p.a.c((iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.coverageType), 31, this.coverageCode);
        String str6 = this.coverageName;
        int iHashCode12 = (iC2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<q> list = this.roamingAllowances;
        int iC3 = j6.a.c((iHashCode12 + (list == null ? 0 : list.hashCode())) * 31, 31, this.autoRenewable);
        p pVar = this.offer;
        int iD = p.a.d((iC3 + (pVar == null ? 0 : pVar.hashCode())) * 31, 31, this.coverageCountries);
        n nVar = this.attributes;
        int iHashCode13 = (iD + (nVar == null ? 0 : nVar.hashCode())) * 31;
        t0 t0Var = this.highestPointsOption;
        int iHashCode14 = (iHashCode13 + (t0Var == null ? 0 : t0Var.hashCode())) * 31;
        p0 p0Var = this.highlights;
        int iHashCode15 = (iHashCode14 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        v0 v0Var = this.summary;
        int iHashCode16 = (iHashCode15 + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        q0 q0Var = this.provider;
        return iHashCode16 + (q0Var != null ? q0Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getBandwidthBitsPerSecond() {
        return this.bandwidthBitsPerSecond;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getCoverageCode() {
        return this.coverageCode;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getCoverageCountries() {
        return this.coverageCountries;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getCoverageName() {
        return this.coverageName;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getCoverageType() {
        return this.coverageType;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final t0 getHighestPointsOption() {
        return this.highestPointsOption;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final p0 getHighlights() {
        return this.highlights;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getMinimumPeriod() {
        return this.minimumPeriod;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final p getOffer() {
        return this.offer;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final jo3.a getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final q0 getProvider() {
        return this.provider;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getRecurringPeriod() {
        return this.recurringPeriod;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final List getRoamingAllowances() {
        return this.roamingAllowances;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final v0 getSummary() {
        return this.summary;
    }
}
