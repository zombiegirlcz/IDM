package fue;

import com.revolut.domain.models.topup.methods.TopupMethod;
import io3.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R(\u0010(\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b\u0005\u0010'¨\u0006)"}, d2 = {"Lfue/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "l", "type", "b", "k", "title", "c", "d", "description", "Lque/a;", "Lque/a;", "g", "()Lque/a;", "logo", "e", "f", "id", "h", "state", "", "Ljava/util/List;", "i", "()Ljava/util/List;", "supportedCurrencyCodes", "currency", "j", "tags", "fundsArrivalTimeDescription", "cardholderVerificationStatus", "", "Lio3/l;", "Lcom/revolut/domain/models/topup/methods/TopupMethod$AutoTopUpState;", "Ljava/util/Map;", "()Ljava/util/Map;", "autoTopupState", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

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
    @lg.b("id")
    private final String id;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("state")
    private final String state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("supportedCurrencyCodes")
    @NotNull
    private final List<String> supportedCurrencyCodes;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    private final String currency;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("tags")
    private final List<String> tags;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("fundsArrivalTimeDescription")
    private final String fundsArrivalTimeDescription;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("cardholderVerificationStatus")
    private final String cardholderVerificationStatus;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("autoTopupState")
    private final Map<l, TopupMethod.AutoTopUpState> autoTopupState;

    public a(String type, String title, String str, que.a aVar, String str2, String str3, List supportedCurrencyCodes, String str4, ArrayList arrayList, String str5, String str6, Map map) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
        this.type = type;
        this.title = title;
        this.description = str;
        this.logo = aVar;
        this.id = str2;
        this.state = str3;
        this.supportedCurrencyCodes = supportedCurrencyCodes;
        this.currency = str4;
        this.tags = arrayList;
        this.fundsArrivalTimeDescription = str5;
        this.cardholderVerificationStatus = str6;
        this.autoTopupState = map;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getAutoTopupState() {
        return this.autoTopupState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCardholderVerificationStatus() {
        return this.cardholderVerificationStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFundsArrivalTimeDescription() {
        return this.fundsArrivalTimeDescription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.logo, aVar.logo) && Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.state, aVar.state) && Intrinsics.f(this.supportedCurrencyCodes, aVar.supportedCurrencyCodes) && Intrinsics.f(this.currency, aVar.currency) && Intrinsics.f(this.tags, aVar.tags) && Intrinsics.f(this.fundsArrivalTimeDescription, aVar.fundsArrivalTimeDescription) && Intrinsics.f(this.cardholderVerificationStatus, aVar.cardholderVerificationStatus) && Intrinsics.f(this.autoTopupState, aVar.autoTopupState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final que.a getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final int hashCode() {
        int iC = p.a.c(this.type.hashCode() * 31, 31, this.title);
        String str = this.description;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        que.a aVar = this.logo;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.id;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.state;
        int iD = p.a.d((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.supportedCurrencyCodes);
        String str4 = this.currency;
        int iHashCode4 = (iD + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.tags;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.fundsArrivalTimeDescription;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardholderVerificationStatus;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map<l, TopupMethod.AutoTopUpState> map = this.autoTopupState;
        return iHashCode7 + (map != null ? map.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getSupportedCurrencyCodes() {
        return this.supportedCurrencyCodes;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getTags() {
        return this.tags;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
