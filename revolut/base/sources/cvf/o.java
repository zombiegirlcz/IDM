package cvf;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\t\u0010\u0015R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010$\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b \u0010\u0004R\u001a\u0010(\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010-\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u001a\u00102\u001a\u00020.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b'\u00101R\u001a\u00107\u001a\u0002038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b\r\u00106R\u001c\u0010;\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00109\u001a\u0004\b\u0013\u0010:R \u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b%\u0010\u001bR \u0010>\u001a\b\u0012\u0004\u0012\u00020<0\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u001a\u0010?\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b/\u0010#R\u001c\u0010B\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010@\u001a\u0004\b4\u0010A¨\u0006C"}, d2 = {"Lcvf/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "o", "title", "Lcvf/z;", "c", "Lcvf/z;", "n", "()Lcvf/z;", "ticketType", "Lcvf/n;", "d", "Lcvf/n;", "()Lcvf/n;", "descriptions", "", "e", "Ljava/util/List;", "p", "()Ljava/util/List;", "zones", "m", "tags", "", "g", "Z", "q", "()Z", "isDiscounted", "h", "locationName", "i", "countryCode", "Lzuf/b;", "j", "Lzuf/b;", "()Lzuf/b;", "provider", "Ljo3/a;", "k", "Ljo3/a;", "()Ljo3/a;", "price", "", "l", "I", "()I", "displayOrder", "Lcvf/p;", "Lcvf/p;", "()Lcvf/p;", "eligibility", "Lavf/d;", "passengerInputs", "generalInputs", "requiresActivation", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "requiresReconfirmation", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketType")
    @NotNull
    private final z ticketType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("descriptions")
    @NotNull
    private final n descriptions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("zones")
    @NotNull
    private final List<String> zones;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("tags")
    @NotNull
    private final List<String> tags;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("isDiscounted")
    private final boolean isDiscounted;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("locationName")
    @NotNull
    private final String locationName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("countryCode")
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("provider")
    @NotNull
    private final zuf.b provider;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("price")
    @NotNull
    private final jo3.a price;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("displayOrder")
    private final int displayOrder;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("eligibility")
    private final p eligibility;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("passengerInputs")
    @NotNull
    private final List<avf.d> passengerInputs;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("generalInputs")
    @NotNull
    private final List<avf.d> generalInputs;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("requiresActivation")
    private final boolean requiresActivation;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("requiresReconfirmation")
    private final Boolean requiresReconfirmation;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final n getDescriptions() {
        return this.descriptions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final p getEligibility() {
        return this.eligibility;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getGeneralInputs() {
        return this.generalInputs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.id, oVar.id) && Intrinsics.f(this.title, oVar.title) && Intrinsics.f(this.ticketType, oVar.ticketType) && Intrinsics.f(this.descriptions, oVar.descriptions) && Intrinsics.f(this.zones, oVar.zones) && Intrinsics.f(this.tags, oVar.tags) && this.isDiscounted == oVar.isDiscounted && Intrinsics.f(this.locationName, oVar.locationName) && Intrinsics.f(this.countryCode, oVar.countryCode) && Intrinsics.f(this.provider, oVar.provider) && Intrinsics.f(this.price, oVar.price) && this.displayOrder == oVar.displayOrder && Intrinsics.f(this.eligibility, oVar.eligibility) && Intrinsics.f(this.passengerInputs, oVar.passengerInputs) && Intrinsics.f(this.generalInputs, oVar.generalInputs) && this.requiresActivation == oVar.requiresActivation && Intrinsics.f(this.requiresReconfirmation, oVar.requiresReconfirmation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLocationName() {
        return this.locationName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getPassengerInputs() {
        return this.passengerInputs;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.displayOrder, v7.j(this.price, (this.provider.hashCode() + p.a.c(p.a.c(j6.a.c(p.a.d(p.a.d((this.descriptions.hashCode() + ((this.ticketType.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.title)) * 31)) * 31, 31, this.zones), 31, this.tags), 31, this.isDiscounted), 31, this.locationName), 31, this.countryCode)) * 31, 31), 31);
        p pVar = this.eligibility;
        int iC = j6.a.c(p.a.d(p.a.d((iB + (pVar == null ? 0 : pVar.hashCode())) * 31, 31, this.passengerInputs), 31, this.generalInputs), 31, this.requiresActivation);
        Boolean bool = this.requiresReconfirmation;
        return iC + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.a getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final zuf.b getProvider() {
        return this.provider;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getRequiresActivation() {
        return this.requiresActivation;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Boolean getRequiresReconfirmation() {
        return this.requiresReconfirmation;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final List getTags() {
        return this.tags;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final z getTicketType() {
        return this.ticketType;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final List getZones() {
        return this.zones;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsDiscounted() {
        return this.isDiscounted;
    }
}
