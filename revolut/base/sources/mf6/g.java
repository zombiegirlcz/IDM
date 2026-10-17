package mf6;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qo6.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0005\u000f\u000b\u000e\b\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001aR\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR\u001a\u0010$\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b\u001d\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006&"}, d2 = {"Lmf6/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "consentId", "b", "j", "type", "c", "i", "title", "d", "e", "paymentDescription", "fromPocketId", "Ljo3/a;", "f", "Ljo3/a;", "()Ljo3/a;", "paymentAmount", "Lmf6/g$e;", "g", "Lmf6/g$e;", "()Lmf6/g$e;", "paymentInformation", "", "h", "Ljava/lang/Long;", "()Ljava/lang/Long;", "pixAutomaticoExpirationDate", "Lqo6/s;", "Lqo6/s;", "()Lqo6/s;", "thirdParty", "footerMessage", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("consentId")
    @NotNull
    private final String consentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("paymentDescription")
    @NotNull
    private final String paymentDescription;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("fromPocketId")
    private final String fromPocketId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("paymentAmount")
    private final jo3.a paymentAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentInformation")
    private final e paymentInformation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("pixAutomaticoExpirationDate")
    private final Long pixAutomaticoExpirationDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("thirdParty")
    @NotNull
    private final s thirdParty;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("footerMessage")
    private final String footerMessage;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lmf6/g$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "currentDate", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("current")
        private final String currentDate;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCurrentDate() {
            return this.currentDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.currentDate, aVar.currentDate);
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.currentDate;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lmf6/g$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "currentMoney", "c", "maxValueMoney", "", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "required", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("current")
        private final jo3.a currentMoney;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("maxValue")
        @NotNull
        private final jo3.a maxValueMoney;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("required")
        private final Boolean required;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getCurrentMoney() {
            return this.currentMoney;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getMaxValueMoney() {
            return this.maxValueMoney;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getRequired() {
            return this.required;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.currentMoney, bVar.currentMoney) && Intrinsics.f(this.maxValueMoney, bVar.maxValueMoney) && Intrinsics.f(this.required, bVar.required);
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            jo3.a aVar = this.currentMoney;
            int iJ = v7.j(this.maxValueMoney, (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
            Boolean bool = this.required;
            return iJ + (bool != null ? bool.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lmf6/g$c;", "", "", "toString", "()Ljava/lang/String;", "", "Lmf6/g$d;", "a", "Ljava/util/List;", "()Ljava/util/List;", "items", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("items")
        @NotNull
        private final List<d> items;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getItems() {
            return this.items;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.items, ((c) obj2).items);
        }

        public final int hashCode() {
            return this.items.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\t\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Lmf6/g$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "d", "value", "Lmf6/g$b;", "Lmf6/g$b;", "()Lmf6/g$b;", "editableMoneyField", "Lmf6/g$a;", "Lmf6/g$a;", "()Lmf6/g$a;", "editableDateField", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final String value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("editableMoney")
        private final b editableMoneyField;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("editableDate")
        private final a editableDateField;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getEditableDateField() {
            return this.editableDateField;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getEditableMoneyField() {
            return this.editableMoneyField;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.title, dVar.title) && Intrinsics.f(this.value, dVar.value) && Intrinsics.f(this.editableMoneyField, dVar.editableMoneyField) && Intrinsics.f(this.editableDateField, dVar.editableDateField);
        }

        public final int hashCode() {
            int iC = p.a.c(this.title.hashCode() * 31, 31, this.value);
            b bVar = this.editableMoneyField;
            int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
            a aVar = this.editableDateField;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lmf6/g$e;", "", "", "toString", "()Ljava/lang/String;", "", "Lmf6/g$c;", "a", "Ljava/util/List;", "()Ljava/util/List;", "groups", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("groups")
        @NotNull
        private final List<c> groups;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getGroups() {
            return this.groups;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof e) && Intrinsics.f(this.groups, ((e) obj2).groups);
        }

        public final int hashCode() {
            return this.groups.hashCode();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getConsentId() {
        return this.consentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFooterMessage() {
        return this.footerMessage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFromPocketId() {
        return this.fromPocketId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getPaymentAmount() {
        return this.paymentAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPaymentDescription() {
        return this.paymentDescription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.consentId, gVar.consentId) && Intrinsics.f(this.type, gVar.type) && Intrinsics.f(this.title, gVar.title) && Intrinsics.f(this.paymentDescription, gVar.paymentDescription) && Intrinsics.f(this.fromPocketId, gVar.fromPocketId) && Intrinsics.f(this.paymentAmount, gVar.paymentAmount) && Intrinsics.f(this.paymentInformation, gVar.paymentInformation) && Intrinsics.f(this.pixAutomaticoExpirationDate, gVar.pixAutomaticoExpirationDate) && Intrinsics.f(this.thirdParty, gVar.thirdParty) && Intrinsics.f(this.footerMessage, gVar.footerMessage);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e getPaymentInformation() {
        return this.paymentInformation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getPixAutomaticoExpirationDate() {
        return this.pixAutomaticoExpirationDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final s getThirdParty() {
        return this.thirdParty;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.consentId.hashCode() * 31, 31, this.type), 31, this.title), 31, this.paymentDescription);
        String str = this.fromPocketId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        jo3.a aVar = this.paymentAmount;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        e eVar = this.paymentInformation;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Long l2 = this.pixAutomaticoExpirationDate;
        int iHashCode4 = (this.thirdParty.hashCode() + ((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31;
        String str2 = this.footerMessage;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
