package hcl;

import java.math.BigDecimal;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\t\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\f\u0010\u001b¨\u0006\u001d"}, d2 = {"Lhcl/p2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "type", "b", "d", "placeholder", "c", "f", "style", "e", "stringValue", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "decimalValue", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "dateValue", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "moneyValue", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("placeholder")
    @NotNull
    private final String placeholder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("style")
    private final String style;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("string_value")
    private final String stringValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("decimal_value")
    private final BigDecimal decimalValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("date_value")
    private final LocalDate dateValue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("money_value")
    private final jo3.b moneyValue;

    public p2(String type, String placeholder, String str, String str2, BigDecimal bigDecimal, LocalDate localDate, jo3.b bVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        this.type = type;
        this.placeholder = placeholder;
        this.style = str;
        this.stringValue = str2;
        this.decimalValue = bigDecimal;
        this.dateValue = localDate;
        this.moneyValue = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getDateValue() {
        return this.dateValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getDecimalValue() {
        return this.decimalValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getMoneyValue() {
        return this.moneyValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStringValue() {
        return this.stringValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj2;
        return Intrinsics.f(this.type, p2Var.type) && Intrinsics.f(this.placeholder, p2Var.placeholder) && Intrinsics.f(this.style, p2Var.style) && Intrinsics.f(this.stringValue, p2Var.stringValue) && Intrinsics.f(this.decimalValue, p2Var.decimalValue) && Intrinsics.f(this.dateValue, p2Var.dateValue) && Intrinsics.f(this.moneyValue, p2Var.moneyValue);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iC = p.a.c(this.type.hashCode() * 31, 31, this.placeholder);
        String str = this.style;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stringValue;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.decimalValue;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        LocalDate localDate = this.dateValue;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        jo3.b bVar = this.moneyValue;
        return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
    }
}
