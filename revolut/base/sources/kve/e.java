package kve;

import com.revolut.domain.models.topup.methods.TopupMethod;
import io3.l;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u0004R\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b \u0010\u0004R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u0013\u0010\u0004R\"\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b(\u0010%R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\f\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b\u000f\u0010\u0004R(\u00101\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b\u000b\u00100¨\u00062"}, d2 = {"Lkve/e;", "", "", "toString", "()Ljava/lang/String;", "Lkve/f;", "a", "Lkve/f;", "n", "()Lkve/f;", "type", "b", "Ljava/lang/String;", "m", "title", "c", "e", "description", "Lque/a;", "d", "Lque/a;", "h", "()Lque/a;", "logo", "Lkve/e$a;", "Lkve/e$a;", "i", "()Lkve/e$a;", "logoBadge", "f", "g", "id", "j", "state", "", "Ljava/util/List;", "k", "()Ljava/util/List;", "supportedCurrencyCodes", "currency", "l", "tags", "fundsArrivalTimeDescription", "cardholderVerificationStatus", "", "Lio3/l;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$AutoTopUpState;", "Ljava/util/Map;", "()Ljava/util/Map;", "autoTopupState", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final f type;

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
    private final a logoBadge;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("supportedCurrencyCodes")
    @NotNull
    private final List<String> supportedCurrencyCodes;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("currency")
    private final String currency;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("tags")
    private final List<String> tags;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("fundsArrivalTimeDescription")
    private final String fundsArrivalTimeDescription;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardholderVerificationStatus")
    private final String cardholderVerificationStatus;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("autoTopupState")
    private final Map<l, TopupMethod.AutoTopUpState> autoTopupState;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lkve/e$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "icon", "b", "style", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("icon")
        @NotNull
        private final String icon;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("style")
        @NotNull
        private final String style;

        public a(String icon, String style) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(style, "style");
            this.icon = icon;
            this.style = style;
        }

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
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.icon, aVar.icon) && Intrinsics.f(this.style, aVar.style);
        }

        public final int hashCode() {
            return this.style.hashCode() + (this.icon.hashCode() * 31);
        }
    }

    public e(f type, String title, String str, que.a aVar, a aVar2, String id10, String state, List supportedCurrencyCodes, String str2, List list, String str3, String str4, Map map) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
        this.type = type;
        this.title = title;
        this.description = str;
        this.logo = aVar;
        this.logoBadge = aVar2;
        this.id = id10;
        this.state = state;
        this.supportedCurrencyCodes = supportedCurrencyCodes;
        this.currency = str2;
        this.tags = list;
        this.fundsArrivalTimeDescription = str3;
        this.cardholderVerificationStatus = str4;
        this.autoTopupState = map;
    }

    public static e a(e eVar, String str) {
        f type = eVar.type;
        String title = eVar.title;
        que.a aVar = eVar.logo;
        a aVar2 = eVar.logoBadge;
        String id10 = eVar.id;
        String state = eVar.state;
        List<String> supportedCurrencyCodes = eVar.supportedCurrencyCodes;
        String str2 = eVar.currency;
        List<String> list = eVar.tags;
        String str3 = eVar.fundsArrivalTimeDescription;
        String str4 = eVar.cardholderVerificationStatus;
        Map<l, TopupMethod.AutoTopUpState> map = eVar.autoTopupState;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
        return new e(type, title, str, aVar, aVar2, id10, state, supportedCurrencyCodes, str2, list, str3, str4, map);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Map getAutoTopupState() {
        return this.autoTopupState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCardholderVerificationStatus() {
        return this.cardholderVerificationStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.type == eVar.type && Intrinsics.f(this.title, eVar.title) && Intrinsics.f(this.description, eVar.description) && Intrinsics.f(this.logo, eVar.logo) && Intrinsics.f(this.logoBadge, eVar.logoBadge) && Intrinsics.f(this.id, eVar.id) && Intrinsics.f(this.state, eVar.state) && Intrinsics.f(this.supportedCurrencyCodes, eVar.supportedCurrencyCodes) && Intrinsics.f(this.currency, eVar.currency) && Intrinsics.f(this.tags, eVar.tags) && Intrinsics.f(this.fundsArrivalTimeDescription, eVar.fundsArrivalTimeDescription) && Intrinsics.f(this.cardholderVerificationStatus, eVar.cardholderVerificationStatus) && Intrinsics.f(this.autoTopupState, eVar.autoTopupState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFundsArrivalTimeDescription() {
        return this.fundsArrivalTimeDescription;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final que.a getLogo() {
        return this.logo;
    }

    public final int hashCode() {
        int iC = p.a.c(this.type.hashCode() * 31, 31, this.title);
        String str = this.description;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        que.a aVar = this.logo;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.logoBadge;
        int iD = p.a.d(p.a.c(p.a.c((iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.id), 31, this.state), 31, this.supportedCurrencyCodes);
        String str2 = this.currency;
        int iHashCode3 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.tags;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.fundsArrivalTimeDescription;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardholderVerificationStatus;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<l, TopupMethod.AutoTopUpState> map = this.autoTopupState;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final a getLogoBadge() {
        return this.logoBadge;
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
    public final f getType() {
        return this.type;
    }
}
