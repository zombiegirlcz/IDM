package nx4;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001?J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b\u0018\u0010$R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b&\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\u0004R\u001c\u00102\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u001a\u00103\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u00108\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b0\u00107R\u001a\u00109\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b-\u0010\u0004R\"\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010;\u001a\u0004\b\t\u0010<R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b5\u0010\u0004¨\u0006@"}, d2 = {"Lnx4/p2;", "Lnx4/m0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "l", "name", "b", "o", "title", "", "c", "J", "j", "()J", "minAmount", "d", "h", "maxAmount", "e", "defaultAmount", "", "f", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "increment", "k", "minAmountLabel", "i", "maxAmountLabel", "currentAmountTemplate", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "enabled", "r", "titleIcon", "Lnx4/n;", "Lnx4/n;", "p", "()Lnx4/n;", "titleAction", "m", "t", "valueIcon", "n", "s", "valueAction", "amountType", "currency", "q", "Ljava/lang/Long;", "()Ljava/lang/Long;", "referenceAmount", "parameterKey", "", "Ljava/util/List;", "()Ljava/util/List;", "checkpoints", "titleGravity", "nx4/o2", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p2 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("minAmount")
    private final long minAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("maxAmount")
    private final long maxAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("defaultAmount")
    private final long defaultAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("increment")
    private final Integer increment;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("minAmountLabel")
    private final String minAmountLabel;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxAmountLabel")
    private final String maxAmountLabel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("currentAmountTemplate")
    private final String currentAmountTemplate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("enabled")
    private final Boolean enabled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("titleIcon")
    private final String titleIcon;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("titleAction")
    private final n titleAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("valueIcon")
    private final String valueIcon;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("valueAction")
    private final n valueAction;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("amountType")
    @NotNull
    private final String amountType;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    private final String currency;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("referenceAmount")
    private final Long referenceAmount;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("parameterKey")
    @NotNull
    private final String parameterKey;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkpoints")
    private final List<Integer> checkpoints;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("titleGravity")
    private final String titleGravity;

    public p2(String name, String title, long j2, long j3, long j5, Integer num, String str, String str2, String str3, Boolean bool, String str4, n nVar, String str5, n nVar2, String amountType, String str6, Long l2, String parameterKey, List list, String str7) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        this.name = name;
        this.title = title;
        this.minAmount = j2;
        this.maxAmount = j3;
        this.defaultAmount = j5;
        this.increment = num;
        this.minAmountLabel = str;
        this.maxAmountLabel = str2;
        this.currentAmountTemplate = str3;
        this.enabled = bool;
        this.titleIcon = str4;
        this.titleAction = nVar;
        this.valueIcon = str5;
        this.valueAction = nVar2;
        this.amountType = amountType;
        this.currency = str6;
        this.referenceAmount = l2;
        this.parameterKey = parameterKey;
        this.checkpoints = list;
        this.titleGravity = str7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAmountType() {
        return this.amountType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getCheckpoints() {
        return this.checkpoints;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCurrentAmountTemplate() {
        return this.currentAmountTemplate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getDefaultAmount() {
        return this.defaultAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj2;
        return Intrinsics.f(this.name, p2Var.name) && Intrinsics.f(this.title, p2Var.title) && this.minAmount == p2Var.minAmount && this.maxAmount == p2Var.maxAmount && this.defaultAmount == p2Var.defaultAmount && Intrinsics.f(this.increment, p2Var.increment) && Intrinsics.f(this.minAmountLabel, p2Var.minAmountLabel) && Intrinsics.f(this.maxAmountLabel, p2Var.maxAmountLabel) && Intrinsics.f(this.currentAmountTemplate, p2Var.currentAmountTemplate) && Intrinsics.f(this.enabled, p2Var.enabled) && Intrinsics.f(this.titleIcon, p2Var.titleIcon) && Intrinsics.f(this.titleAction, p2Var.titleAction) && Intrinsics.f(this.valueIcon, p2Var.valueIcon) && Intrinsics.f(this.valueAction, p2Var.valueAction) && Intrinsics.f(this.amountType, p2Var.amountType) && Intrinsics.f(this.currency, p2Var.currency) && Intrinsics.f(this.referenceAmount, p2Var.referenceAmount) && Intrinsics.f(this.parameterKey, p2Var.parameterKey) && Intrinsics.f(this.checkpoints, p2Var.checkpoints) && Intrinsics.f(this.titleGravity, p2Var.titleGravity);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getIncrement() {
        return this.increment;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getMaxAmount() {
        return this.maxAmount;
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(a0.d.c(p.a.c(this.name.hashCode() * 31, 31, this.title), 31, this.minAmount), 31, this.maxAmount), 31, this.defaultAmount);
        Integer num = this.increment;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.minAmountLabel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.maxAmountLabel;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currentAmountTemplate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.enabled;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.titleIcon;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        n nVar = this.titleAction;
        int iHashCode7 = (iHashCode6 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str5 = this.valueIcon;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        n nVar2 = this.valueAction;
        int iC2 = p.a.c((iHashCode8 + (nVar2 == null ? 0 : nVar2.hashCode())) * 31, 31, this.amountType);
        String str6 = this.currency;
        int iHashCode9 = (iC2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l2 = this.referenceAmount;
        int iC3 = p.a.c((iHashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.parameterKey);
        List<Integer> list = this.checkpoints;
        int iHashCode10 = (iC3 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.titleGravity;
        return iHashCode10 + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getMaxAmountLabel() {
        return this.maxAmountLabel;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getMinAmount() {
        return this.minAmount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getMinAmountLabel() {
        return this.minAmountLabel;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getParameterKey() {
        return this.parameterKey;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Long getReferenceAmount() {
        return this.referenceAmount;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final n getTitleAction() {
        return this.titleAction;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getTitleGravity() {
        return this.titleGravity;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getTitleIcon() {
        return this.titleIcon;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final n getValueAction() {
        return this.valueAction;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getValueIcon() {
        return this.valueIcon;
    }
}
