package nx4;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u00028\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001c\u0010!\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0010\u0010 R\u001a\u0010&\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001e\u0010%R\u001a\u0010'\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010(\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010,\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\u0004R\u001a\u0010-\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\"\u00103\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b#\u00102R\u001c\u00107\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b*\u00106¨\u00069"}, d2 = {"Lnx4/x;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "k", "parameterKey", "b", "n", "title", "c", "o", "titleValue", "Lnx4/c;", "d", "Lnx4/c;", "p", "()Lnx4/c;", "titleValueAction", "", "e", "J", "j", "()J", "minAmount", "f", "i", "maxAmount", "g", "Ljava/lang/Long;", "()Ljava/lang/Long;", "defaultAmount", "", "h", "I", "()I", "increment", "buttonTitle", "errorMin", "errorMax", "l", "m", "roundingTemplate", "amountType", "currency", "", "Lnx4/x$a;", "Ljava/util/List;", "()Ljava/util/List;", "infoRanges", "Lnx4/n;", "Lnx4/n;", "()Lnx4/n;", "primaryButtonAction", "nx4/w", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("parameterKey")
    @NotNull
    private final String parameterKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("titleValue")
    private final String titleValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("titleValueAction")
    private final c titleValueAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("minAmount")
    private final long minAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("maxAmount")
    private final long maxAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultAmount")
    private final Long defaultAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("increment")
    private final int increment;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("buttonTitle")
    @NotNull
    private final String buttonTitle;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("errorMin")
    @NotNull
    private final String errorMin;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("errorMax")
    @NotNull
    private final String errorMax;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("roundingTemplate")
    @NotNull
    private final String roundingTemplate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountType")
    @NotNull
    private final String amountType;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    private final String currency;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("infoRanges")
    private final List<a> infoRanges;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("primaryButtonAction")
    private final n primaryButtonAction;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, d2 = {"Lnx4/x$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "c", "()J", "minInclusive", "b", "maxInclusive", "Ljava/lang/String;", "e", "text", "d", "style", "Lnx4/s1;", "Lnx4/s1;", "()Lnx4/s1;", "info", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("minInclusive")
        private final long minInclusive;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("maxInclusive")
        private final long maxInclusive;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("text")
        @NotNull
        private final String text;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("style")
        private final String style;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("info")
        private final s1 info;

        public a(long j2, long j3, String text, String str, s1 s1Var) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.minInclusive = j2;
            this.maxInclusive = j3;
            this.text = text;
            this.style = str;
            this.info = s1Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final s1 getInfo() {
            return this.info;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getMaxInclusive() {
            return this.maxInclusive;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getMinInclusive() {
            return this.minInclusive;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.minInclusive == aVar.minInclusive && this.maxInclusive == aVar.maxInclusive && Intrinsics.f(this.text, aVar.text) && Intrinsics.f(this.style, aVar.style) && Intrinsics.f(this.info, aVar.info);
        }

        public final int hashCode() {
            int iC = p.a.c(a0.d.c(Long.hashCode(this.minInclusive) * 31, 31, this.maxInclusive), 31, this.text);
            String str = this.style;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            s1 s1Var = this.info;
            return iHashCode + (s1Var != null ? s1Var.hashCode() : 0);
        }
    }

    public x(String parameterKey, String title, String str, c cVar, long j2, long j3, Long l2, int i, String buttonTitle, String errorMin, String errorMax, String roundingTemplate, String amountType, String str2, ArrayList arrayList, c cVar2) {
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(errorMin, "errorMin");
        Intrinsics.checkNotNullParameter(errorMax, "errorMax");
        Intrinsics.checkNotNullParameter(roundingTemplate, "roundingTemplate");
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        this.parameterKey = parameterKey;
        this.title = title;
        this.titleValue = str;
        this.titleValueAction = cVar;
        this.minAmount = j2;
        this.maxAmount = j3;
        this.defaultAmount = l2;
        this.increment = i;
        this.buttonTitle = buttonTitle;
        this.errorMin = errorMin;
        this.errorMax = errorMax;
        this.roundingTemplate = roundingTemplate;
        this.amountType = amountType;
        this.currency = str2;
        this.infoRanges = arrayList;
        this.primaryButtonAction = cVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAmountType() {
        return this.amountType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getDefaultAmount() {
        return this.defaultAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getErrorMax() {
        return this.errorMax;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.parameterKey, xVar.parameterKey) && Intrinsics.f(this.title, xVar.title) && Intrinsics.f(this.titleValue, xVar.titleValue) && Intrinsics.f(this.titleValueAction, xVar.titleValueAction) && this.minAmount == xVar.minAmount && this.maxAmount == xVar.maxAmount && Intrinsics.f(this.defaultAmount, xVar.defaultAmount) && this.increment == xVar.increment && Intrinsics.f(this.buttonTitle, xVar.buttonTitle) && Intrinsics.f(this.errorMin, xVar.errorMin) && Intrinsics.f(this.errorMax, xVar.errorMax) && Intrinsics.f(this.roundingTemplate, xVar.roundingTemplate) && Intrinsics.f(this.amountType, xVar.amountType) && Intrinsics.f(this.currency, xVar.currency) && Intrinsics.f(this.infoRanges, xVar.infoRanges) && Intrinsics.f(this.primaryButtonAction, xVar.primaryButtonAction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getErrorMin() {
        return this.errorMin;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getIncrement() {
        return this.increment;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getInfoRanges() {
        return this.infoRanges;
    }

    public final int hashCode() {
        int iC = p.a.c(this.parameterKey.hashCode() * 31, 31, this.title);
        String str = this.titleValue;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.titleValueAction;
        int iC2 = a0.d.c(a0.d.c((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.minAmount), 31, this.maxAmount);
        Long l2 = this.defaultAmount;
        int iC3 = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(j6.a.b(this.increment, (iC2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31), 31, this.buttonTitle), 31, this.errorMin), 31, this.errorMax), 31, this.roundingTemplate), 31, this.amountType);
        String str2 = this.currency;
        int iHashCode2 = (iC3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<a> list = this.infoRanges;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        n nVar = this.primaryButtonAction;
        return iHashCode3 + (nVar != null ? nVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getMaxAmount() {
        return this.maxAmount;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getMinAmount() {
        return this.minAmount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getParameterKey() {
        return this.parameterKey;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final n getPrimaryButtonAction() {
        return this.primaryButtonAction;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getRoundingTemplate() {
        return this.roundingTemplate;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getTitleValue() {
        return this.titleValue;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final c getTitleValueAction() {
        return this.titleValueAction;
    }
}
