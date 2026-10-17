package ac5;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"Lac5/t;", "Lac5/w;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "paymentType", "", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "disallows", "c", "g", "requires", "d", "accountNumberFormat", "bankCountry", "", "I", "()I", "daysInAdvance", "allowedDay", "h", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "statementDueDay", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentType")
    @NotNull
    private final String paymentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("disallows")
    @NotNull
    private final List<String> disallows;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("requires")
    @NotNull
    private final List<String> requires;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("accountNumberFormat")
    @NotNull
    private final String accountNumberFormat;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("bankCountry")
    @NotNull
    private final String bankCountry;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("daysInAdvance")
    private final int daysInAdvance;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowedDay")
    @NotNull
    private final List<String> allowedDay;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("statementDueDay")
    private final Integer statementDueDay;

    public t(String paymentType, ArrayList disallows, ArrayList requires, String accountNumberFormat, String bankCountry, int i, ArrayList allowedDay, Integer num) {
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Intrinsics.checkNotNullParameter(disallows, "disallows");
        Intrinsics.checkNotNullParameter(requires, "requires");
        Intrinsics.checkNotNullParameter(accountNumberFormat, "accountNumberFormat");
        Intrinsics.checkNotNullParameter(bankCountry, "bankCountry");
        Intrinsics.checkNotNullParameter(allowedDay, "allowedDay");
        this.paymentType = paymentType;
        this.disallows = disallows;
        this.requires = requires;
        this.accountNumberFormat = accountNumberFormat;
        this.bankCountry = bankCountry;
        this.daysInAdvance = i;
        this.allowedDay = allowedDay;
        this.statementDueDay = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountNumberFormat() {
        return this.accountNumberFormat;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getAllowedDay() {
        return this.allowedDay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBankCountry() {
        return this.bankCountry;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getDaysInAdvance() {
        return this.daysInAdvance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getDisallows() {
        return this.disallows;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.paymentType, tVar.paymentType) && Intrinsics.f(this.disallows, tVar.disallows) && Intrinsics.f(this.requires, tVar.requires) && Intrinsics.f(this.accountNumberFormat, tVar.accountNumberFormat) && Intrinsics.f(this.bankCountry, tVar.bankCountry) && this.daysInAdvance == tVar.daysInAdvance && Intrinsics.f(this.allowedDay, tVar.allowedDay) && Intrinsics.f(this.statementDueDay, tVar.statementDueDay);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPaymentType() {
        return this.paymentType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getRequires() {
        return this.requires;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getStatementDueDay() {
        return this.statementDueDay;
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.b(this.daysInAdvance, p.a.c(p.a.c(p.a.d(p.a.d(this.paymentType.hashCode() * 31, 31, this.disallows), 31, this.requires), 31, this.accountNumberFormat), 31, this.bankCountry), 31), 31, this.allowedDay);
        Integer num = this.statementDueDay;
        return iD + (num == null ? 0 : num.hashCode());
    }
}
