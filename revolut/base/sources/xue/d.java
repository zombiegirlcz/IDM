package xue;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0005\t\f\u000f\u0005\u0015J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001c\u0010&\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b-\u0010*R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R(\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u000201\u0018\u0001008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b\u0005\u00103R\u001c\u00109\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108¨\u0006:"}, d2 = {"Lxue/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "n", "type", "b", "m", "title", "c", "description", "Lque/a;", "d", "Lque/a;", "f", "()Lque/a;", "logo", "Lxue/d$b;", "e", "Lxue/d$b;", "g", "()Lxue/d$b;", "logoBadge", "id", "j", "state", "Lxue/d$c;", "h", "Lxue/d$c;", "()Lxue/d$c;", "outage", "Lxue/d$d;", "i", "Lxue/d$d;", "()Lxue/d$d;", "restrictions", "", "Ljava/util/List;", "k", "()Ljava/util/List;", "supportedCurrencyCodes", "currency", "l", "tags", "fundsArrivalTimeDescription", "", "Lxue/d$a;", "Ljava/util/Map;", "()Ljava/util/Map;", "autoTopUps", "Lxue/d$e;", "o", "Lxue/d$e;", "()Lxue/d$e;", "verification", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("logo")
    private final que.a logo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("logoBadge")
    private final b logoBadge;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("outage")
    private final c outage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("restrictions")
    private final C1712d restrictions;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("supportedCurrencies")
    @NotNull
    private final List<String> supportedCurrencyCodes;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("currency")
    private final String currency;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("tags")
    private final List<String> tags;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("fundsArrivalTimeDescription")
    private final String fundsArrivalTimeDescription;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("autoTopups")
    private final Map<String, a> autoTopUps;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("verification")
    private final e verification;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lxue/d$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "autoTopUp", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("autoTopup")
        @NotNull
        private final String autoTopUp;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAutoTopUp() {
            return this.autoTopUp;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.autoTopUp, ((a) obj2).autoTopUp);
        }

        public final int hashCode() {
            return this.autoTopUp.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lxue/d$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "icon", "b", "style", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("icon")
        @NotNull
        private final String icon;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("style")
        @NotNull
        private final String style;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.icon, bVar.icon) && Intrinsics.f(this.style, bVar.style);
        }

        public final int hashCode() {
            return this.style.hashCode() + (this.icon.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lxue/d$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "message", "summary", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("message")
        @NotNull
        private final String message;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("summary")
        @NotNull
        private final String summary;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.message, cVar.message) && Intrinsics.f(this.summary, cVar.summary);
        }

        public final int hashCode() {
            return this.summary.hashCode() + p.a.c(this.title.hashCode() * 31, 31, this.message);
        }
    }

    /* JADX INFO: renamed from: xue.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\f"}, d2 = {"Lxue/d$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "errorSummary", "errorMessage", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1712d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("errorSummary")
        @NotNull
        private final String errorSummary;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("errorMessage")
        @NotNull
        private final String errorMessage;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getErrorSummary() {
            return this.errorSummary;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1712d)) {
                return false;
            }
            C1712d c1712d = (C1712d) obj2;
            return Intrinsics.f(this.title, c1712d.title) && Intrinsics.f(this.errorSummary, c1712d.errorSummary) && Intrinsics.f(this.errorMessage, c1712d.errorMessage);
        }

        public final int hashCode() {
            return this.errorMessage.hashCode() + p.a.c(this.title.hashCode() * 31, 31, this.errorSummary);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lxue/d$e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "status", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("status")
        @NotNull
        private final String status;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof e) && Intrinsics.f(this.status, ((e) obj2).status);
        }

        public final int hashCode() {
            return this.status.hashCode();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getAutoTopUps() {
        return this.autoTopUps;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFundsArrivalTimeDescription() {
        return this.fundsArrivalTimeDescription;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.type, dVar.type) && Intrinsics.f(this.title, dVar.title) && Intrinsics.f(this.description, dVar.description) && Intrinsics.f(this.logo, dVar.logo) && Intrinsics.f(this.logoBadge, dVar.logoBadge) && Intrinsics.f(this.id, dVar.id) && Intrinsics.f(this.state, dVar.state) && Intrinsics.f(this.outage, dVar.outage) && Intrinsics.f(this.restrictions, dVar.restrictions) && Intrinsics.f(this.supportedCurrencyCodes, dVar.supportedCurrencyCodes) && Intrinsics.f(this.currency, dVar.currency) && Intrinsics.f(this.tags, dVar.tags) && Intrinsics.f(this.fundsArrivalTimeDescription, dVar.fundsArrivalTimeDescription) && Intrinsics.f(this.autoTopUps, dVar.autoTopUps) && Intrinsics.f(this.verification, dVar.verification);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final que.a getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getLogoBadge() {
        return this.logoBadge;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final c getOutage() {
        return this.outage;
    }

    public final int hashCode() {
        int iC = p.a.c(this.type.hashCode() * 31, 31, this.title);
        String str = this.description;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        que.a aVar = this.logo;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.logoBadge;
        int iC2 = p.a.c(p.a.c((iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.id), 31, this.state);
        c cVar = this.outage;
        int iHashCode3 = (iC2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C1712d c1712d = this.restrictions;
        int iD = p.a.d((iHashCode3 + (c1712d == null ? 0 : c1712d.hashCode())) * 31, 31, this.supportedCurrencyCodes);
        String str2 = this.currency;
        int iHashCode4 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.tags;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.fundsArrivalTimeDescription;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, a> map = this.autoTopUps;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        e eVar = this.verification;
        return iHashCode7 + (eVar != null ? eVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C1712d getRestrictions() {
        return this.restrictions;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getSupportedCurrencyCodes() {
        return this.supportedCurrencyCodes;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final List getTags() {
        return this.tags;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final e getVerification() {
        return this.verification;
    }
}
