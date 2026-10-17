package mqa;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010 \u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\u0004R\u001c\u00102\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u00109\u001a\b\u0012\u0004\u0012\u000204038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\u0004¨\u0006="}, d2 = {"Lmqa/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCardToken", "cardToken", "b", "getMaskedPan", "maskedPan", "Lmqa/l;", "c", "Lmqa/l;", "getEntryMode", "()Lmqa/l;", "entryMode", "d", "getCountry", "country", "e", "getIssuerName", "issuerName", "f", "getScheme", "scheme", "Llqa/g;", "g", "Llqa/g;", "getType", "()Llqa/g;", "type", "h", "getFirstName", "firstName", "i", "getLastName", "lastName", "j", "getEmail", "email", "k", "getCity", "city", "Lno3/b;", "l", "Lno3/b;", "getAddress", "()Lno3/b;", "address", "", "Lmqa/d;", "m", "Ljava/util/List;", "getAdditionalFields", "()Ljava/util/List;", "additionalFields", "n", "getPaymentWidgetId", "paymentWidgetId", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardToken")
    @NotNull
    private final String cardToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("maskedPan")
    @NotNull
    private final String maskedPan;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("entryMode")
    @NotNull
    private final l entryMode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("country")
    @NotNull
    private final String country;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("issuerName")
    @NotNull
    private final String issuerName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("scheme")
    @NotNull
    private final String scheme;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final lqa.g type;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("lastName")
    private final String lastName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("email")
    private final String email;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("city")
    private final String city;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("address")
    private final no3.b address;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalFields")
    @NotNull
    private final List<d> additionalFields;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentWidgetId")
    private final String paymentWidgetId;

    public e(String cardToken, String maskedPan, l entryMode, String country, String issuerName, String scheme, lqa.g type, String str, String str2, no3.b bVar, ArrayList additionalFields, String str3) {
        Intrinsics.checkNotNullParameter(cardToken, "cardToken");
        Intrinsics.checkNotNullParameter(maskedPan, "maskedPan");
        Intrinsics.checkNotNullParameter(entryMode, "entryMode");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(issuerName, "issuerName");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(additionalFields, "additionalFields");
        this.cardToken = cardToken;
        this.maskedPan = maskedPan;
        this.entryMode = entryMode;
        this.country = country;
        this.issuerName = issuerName;
        this.scheme = scheme;
        this.type = type;
        this.firstName = str;
        this.lastName = str2;
        this.email = null;
        this.city = null;
        this.address = bVar;
        this.additionalFields = additionalFields;
        this.paymentWidgetId = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.cardToken, eVar.cardToken) && Intrinsics.f(this.maskedPan, eVar.maskedPan) && this.entryMode == eVar.entryMode && Intrinsics.f(this.country, eVar.country) && Intrinsics.f(this.issuerName, eVar.issuerName) && Intrinsics.f(this.scheme, eVar.scheme) && this.type == eVar.type && Intrinsics.f(this.firstName, eVar.firstName) && Intrinsics.f(this.lastName, eVar.lastName) && Intrinsics.f(this.email, eVar.email) && Intrinsics.f(this.city, eVar.city) && Intrinsics.f(this.address, eVar.address) && Intrinsics.f(this.additionalFields, eVar.additionalFields) && Intrinsics.f(this.paymentWidgetId, eVar.paymentWidgetId);
    }

    public final int hashCode() {
        int iHashCode = (this.type.hashCode() + p.a.c(p.a.c(p.a.c((this.entryMode.hashCode() + p.a.c(this.cardToken.hashCode() * 31, 31, this.maskedPan)) * 31, 31, this.country), 31, this.issuerName), 31, this.scheme)) * 31;
        String str = this.firstName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        no3.b bVar = this.address;
        int iD = p.a.d((iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.additionalFields);
        String str5 = this.paymentWidgetId;
        return iD + (str5 != null ? str5.hashCode() : 0);
    }
}
