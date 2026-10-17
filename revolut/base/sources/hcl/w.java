package hcl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b!\u0010%¨\u0006'"}, d2 = {"Lhcl/w;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "fundLifetime", "b", "h", "name", "c", "d", "description", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "g", "()Ljava/time/LocalDate;", "launchDate", "", "Lhcl/w$a;", "Ljava/util/List;", "f", "()Ljava/util/List;", "highlights", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "aum", "j", "targetCompanySize", "dealSourcing", "i", "controlType", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "risk", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("fundLifetime")
    private final String fundLifetime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("launchDate")
    private final LocalDate launchDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("highlights")
    private final List<a> highlights;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("aum")
    private final jo3.b aum;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("targetCompanySize")
    private final String targetCompanySize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("dealSourcing")
    private final String dealSourcing;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("controlType")
    private final String controlType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("risk")
    private final Integer risk;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\f"}, d2 = {"Lhcl/w$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "subtitle", "icon", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        @NotNull
        private final String subtitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("icon")
        private final String icon;

        public a(String title, String subtitle, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.title = title;
            this.subtitle = subtitle;
            this.icon = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.subtitle, aVar.subtitle) && Intrinsics.f(this.icon, aVar.icon);
        }

        public final int hashCode() {
            int iC = p.a.c(this.title.hashCode() * 31, 31, this.subtitle);
            String str = this.icon;
            return iC + (str == null ? 0 : str.hashCode());
        }
    }

    public w(String str, String str2, String str3, LocalDate localDate, ArrayList arrayList, jo3.b bVar, String str4, String str5, String str6, Integer num) {
        this.fundLifetime = str;
        this.name = str2;
        this.description = str3;
        this.launchDate = localDate;
        this.highlights = arrayList;
        this.aum = bVar;
        this.targetCompanySize = str4;
        this.dealSourcing = str5;
        this.controlType = str6;
        this.risk = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getAum() {
        return this.aum;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getControlType() {
        return this.controlType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDealSourcing() {
        return this.dealSourcing;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFundLifetime() {
        return this.fundLifetime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.fundLifetime, wVar.fundLifetime) && Intrinsics.f(this.name, wVar.name) && Intrinsics.f(this.description, wVar.description) && Intrinsics.f(this.launchDate, wVar.launchDate) && Intrinsics.f(this.highlights, wVar.highlights) && Intrinsics.f(this.aum, wVar.aum) && Intrinsics.f(this.targetCompanySize, wVar.targetCompanySize) && Intrinsics.f(this.dealSourcing, wVar.dealSourcing) && Intrinsics.f(this.controlType, wVar.controlType) && Intrinsics.f(this.risk, wVar.risk);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getHighlights() {
        return this.highlights;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LocalDate getLaunchDate() {
        return this.launchDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        String str = this.fundLifetime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LocalDate localDate = this.launchDate;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        List<a> list = this.highlights;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        jo3.b bVar = this.aum;
        int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str4 = this.targetCompanySize;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dealSourcing;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.controlType;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.risk;
        return iHashCode9 + (num != null ? num.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getRisk() {
        return this.risk;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTargetCompanySize() {
        return this.targetCompanySize;
    }
}
