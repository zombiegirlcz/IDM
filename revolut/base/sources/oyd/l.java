package oyd;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\u0004R\u001a\u00100\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&R\u001a\u00103\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\u0004¨\u00064"}, d2 = {"Loyd/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getStart", "start", "b", "getEnd", "end", "c", "getStatementPeriodType", "statementPeriodType", "", "d", "Ljava/util/Set;", "getProductTypes", "()Ljava/util/Set;", "productTypes", "e", "getTransactionDirections", "transactionDirections", "f", "getTransactionCategories", "transactionCategories", "", "Loyd/l$a;", "g", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "elements", "", "h", "Z", "getHideBalances", "()Z", "hideBalances", "i", "getBaseLanguage", "baseLanguage", "j", "getBaseCurrency", "baseCurrency", "k", "getEmailNotification", "emailNotification", "l", "getFormat", "format", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("start")
    @NotNull
    private final String start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("end")
    @NotNull
    private final String end;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("statementPeriodType")
    @NotNull
    private final String statementPeriodType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("productTypes")
    @NotNull
    private final Set<String> productTypes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("transactionDirections")
    @NotNull
    private final Set<String> transactionDirections;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("transactionCategories")
    @NotNull
    private final Set<String> transactionCategories;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("elements")
    @NotNull
    private final List<a> elements;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("hideBalances")
    private final boolean hideBalances;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("baseLanguage")
    private final String baseLanguage;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("baseCurrency")
    private final String baseCurrency;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("emailNotification")
    private final boolean emailNotification;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("format")
    @NotNull
    private final String format;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Loyd/l$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "getId", "id", "c", "getCurrency", "currency", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        private final String currency;

        public a(String type, String id10, String str) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(id10, "id");
            this.type = type;
            this.id = id10;
            this.currency = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.currency, aVar.currency);
        }

        public final int hashCode() {
            int iC = p.a.c(this.type.hashCode() * 31, 31, this.id);
            String str = this.currency;
            return iC + (str == null ? 0 : str.hashCode());
        }
    }

    public l(String start, String end2, String statementPeriodType, Set productTypes, Set transactionDirections, Set transactionCategories, List elements, boolean z, String str, String str2, boolean z3, String format) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(statementPeriodType, "statementPeriodType");
        Intrinsics.checkNotNullParameter(productTypes, "productTypes");
        Intrinsics.checkNotNullParameter(transactionDirections, "transactionDirections");
        Intrinsics.checkNotNullParameter(transactionCategories, "transactionCategories");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(format, "format");
        this.start = start;
        this.end = end2;
        this.statementPeriodType = statementPeriodType;
        this.productTypes = productTypes;
        this.transactionDirections = transactionDirections;
        this.transactionCategories = transactionCategories;
        this.elements = elements;
        this.hideBalances = z;
        this.baseLanguage = str;
        this.baseCurrency = str2;
        this.emailNotification = z3;
        this.format = format;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.start, lVar.start) && Intrinsics.f(this.end, lVar.end) && Intrinsics.f(this.statementPeriodType, lVar.statementPeriodType) && Intrinsics.f(this.productTypes, lVar.productTypes) && Intrinsics.f(this.transactionDirections, lVar.transactionDirections) && Intrinsics.f(this.transactionCategories, lVar.transactionCategories) && Intrinsics.f(this.elements, lVar.elements) && this.hideBalances == lVar.hideBalances && Intrinsics.f(this.baseLanguage, lVar.baseLanguage) && Intrinsics.f(this.baseCurrency, lVar.baseCurrency) && this.emailNotification == lVar.emailNotification && Intrinsics.f(this.format, lVar.format);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.d(p.a.f(p.a.f(p.a.f(p.a.c(p.a.c(this.start.hashCode() * 31, 31, this.end), 31, this.statementPeriodType), 31, this.productTypes), 31, this.transactionDirections), 31, this.transactionCategories), 31, this.elements), 31, this.hideBalances);
        String str = this.baseLanguage;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.baseCurrency;
        return this.format.hashCode() + j6.a.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.emailNotification);
    }
}
