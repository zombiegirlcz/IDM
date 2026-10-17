package bxh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010(\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010+\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b*\u0010\f¨\u0006,"}, d2 = {"Lbxh/c;", "", "Lbxh/b;", "a", "Lbxh/b;", "getType", "()Lbxh/b;", "type", "", "b", "Ljava/lang/String;", "getNumber", "()Ljava/lang/String;", "number", "", "c", "Ljava/lang/Integer;", "getExpiryMonth", "()Ljava/lang/Integer;", "expiryMonth", "d", "getExpiryYear", "expiryYear", "e", "getCvv", "cvv", "f", "getId", "id", "Lbxh/a;", "g", "Lbxh/a;", "getBillingAddress", "()Lbxh/a;", "billingAddress", "Lcxh/a;", "h", "Lcxh/a;", "getEnvironment", "()Lcxh/a;", "environment", "i", "getSaveFor", "saveFor", "feature_cpg_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final b type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("number")
    private final String number;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiry_month")
    private final Integer expiryMonth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expiry_year")
    private final Integer expiryYear;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cvv")
    private final String cvv;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("id")
    private final String id;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("billing_address")
    private final a billingAddress;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("environment")
    @NotNull
    private final cxh.a environment;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("save_for")
    @NotNull
    private final String saveFor;

    public c(b type, String str, Integer num, Integer num2, String str2, String str3, a aVar, cxh.a environment, int i) {
        str = (i & 2) != 0 ? null : str;
        num = (i & 4) != 0 ? null : num;
        num2 = (i & 8) != 0 ? null : num2;
        str3 = (i & 32) != 0 ? null : str3;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter("merchant", "saveFor");
        this.type = type;
        this.number = str;
        this.expiryMonth = num;
        this.expiryYear = num2;
        this.cvv = str2;
        this.id = str3;
        this.billingAddress = aVar;
        this.environment = environment;
        this.saveFor = "merchant";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.type == cVar.type && Intrinsics.f(this.number, cVar.number) && Intrinsics.f(this.expiryMonth, cVar.expiryMonth) && Intrinsics.f(this.expiryYear, cVar.expiryYear) && Intrinsics.f(this.cvv, cVar.cvv) && Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.billingAddress, cVar.billingAddress) && Intrinsics.f(this.environment, cVar.environment) && Intrinsics.f(this.saveFor, cVar.saveFor);
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.number;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.expiryMonth;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.expiryYear;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.cvv;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.id;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        a aVar = this.billingAddress;
        return this.saveFor.hashCode() + ((this.environment.hashCode() + ((iHashCode6 + (aVar != null ? aVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("PaymentMethod(");
        sb6.append("type=" + this.type + ", ");
        if (this.number != null) {
            sb6.append("number=****, ");
        }
        if (this.expiryMonth != null) {
            sb6.append("expiryMonth=**, ");
        }
        if (this.expiryYear != null) {
            sb6.append("expiryYear=**, ");
        }
        if (this.cvv != null) {
            sb6.append("cvv=***, ");
        }
        a10.b.z(sb6, "id=", this.id, ", ");
        a aVar = this.billingAddress;
        a10.b.z(sb6, "billingAddress=", aVar != null ? p.a.p("BillingAddress(postcode=", aVar.getPostcode(), ")") : null, ", ");
        cxh.a aVar2 = this.environment;
        int screenWidth = aVar2.getScreenWidth();
        int screenHeight = aVar2.getScreenHeight();
        String type = aVar2.getType();
        int timeZoneUtcOffset = aVar2.getTimeZoneUtcOffset();
        int colorDepth = aVar2.getColorDepth();
        boolean javaEnabled = aVar2.getJavaEnabled();
        StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("Environment(screenWidth=", screenWidth, screenHeight, ", screenHeight=", ", type=");
        sbW.append(type);
        sbW.append(", timeZoneUtcOffset=");
        sbW.append(timeZoneUtcOffset);
        sbW.append(", colorDepth=");
        sbW.append(colorDepth);
        sbW.append(", javaEnabled=");
        sbW.append(javaEnabled);
        sbW.append(")");
        a10.b.z(sb6, "environment=", sbW.toString(), ", ");
        sb6.append("saveFor=" + this.saveFor);
        sb6.append(")");
        return sb6.toString();
    }
}
